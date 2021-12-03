/*
 * Copyright (C) 2021 Evelyn López Nieto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package suministros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import otras_operaciones.ConexionBD;

/**
 *
 * @author Evelyn López Nieto
 */

//CLASE DESCARTADA
public class Form_adicionSumiExistentes {
    ConexionBD conexion = new ConexionBD();
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));
    
    public void agregarInsumoExistenteStock(String area, String inicialA, double cantidadN, String IDinsu) {
        String sentencia = "UPDATE tbl_stock" + area + " SET existencia" + inicialA + "=existencia" + inicialA + "+" + cantidadN + " WHERE ID_insumo" + inicialA + "= '" + IDinsu + "'";
        try {
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la información del insumo..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
    //implementar la actualización de descripcion, comentarios y nueva fecha de caducidad
    //para aquellos insumos existentes donde se agregan nuevas existencias por el ingreso de requisiciones
    
    //implementar también el almacenamiento del insumo existente a la tabla de suministros
    //para poder sacar las estadísticas de uso
    public void registroTablaSuministroExistente(String IDinsumo, String nombreInsumo, String tipoInsumo,
           String descripcion, Double precioInsUnitario, Double precioInsTotal, Double cantEntreg, Double perdidas, Double cantFinal,
           int IDunidadM, String comentarios) {

        String sentencia = "INSERT INTO tbl_suministros VALUES (NULL,'" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
               + "" + precioInsTotal + "," + cantEntreg + "," + perdidas + ", " + cantFinal + "," + IDunidadM + ",(SELECT curdate()),'" + comentarios + "')";

        try {
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar la información del insumo..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
    
    //implementar la visualización del registro del insumo existente en los campos del formulario
    //combinando consultas de las 3 tablas que conforman el registro de ingreso de suministro:
    //insumo, stock y unidad de medida
    public ResultSet cargaInsumoForm() {
        String sentencia = "select * from tbl_";
        try {
            Connection con = conexion.obConexion();
            Statement verR = conexion.crearSentencia();
            return verR.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    //REGISTRO DE MOVIMIENTO DEL USUARIO
    public void registroTablaAccesosP(int IDpersonal) {

        String sentencia = "INSERT INTO tbl_accesosP VALUES (NULL," + IDpersonal + ",(SELECT CURDATE()),(SELECT CURTIME()),'Ingreso datos nuevos a insumo existente');";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del movimiento..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
}
