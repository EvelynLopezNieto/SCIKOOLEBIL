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
package salidas;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import otras_operaciones.ConexionBD;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_salidas {

    ConexionBD conexion = new ConexionBD();
    
    String columnas2[] = {"ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega", "Fecha caducidad"};
    String columnas3[] = {"ID insumo", "Nombre", "Existencia actual"};
    String columnas4[] = {"ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"};
    String columnas5[] = {"ID insumo", "Nombre", "Nueva existencia", "Unidad medida"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;
    
    DefaultTableModel tablaExistsNuevo = new DefaultTableModel(datos, columnas5) {
        @Override
        public boolean isCellEditable(int filas, int columnas) {
            if (columnas == 4) {
                return true;
            } else {
                return false;
            }
        }
    };

    public void salidaInsumo(String area, String inicialA, double cantidad, String IDinsu) {
        String sentencia = "UPDATE tbl_stock" + area + " SET existencia" + inicialA + "=existencia" + inicialA + "-" + cantidad + " WHERE ID_insumo" + inicialA + "= '" + IDinsu + "'";
        try {
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo ejecutar la salida del insumo..."+e, "¡ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void devolucionInsumo(String area, String inicialA, double cantidad, String IDinsu) {
        String sentencia = "UPDATE tbl_stock" + area + " SET existencia" + inicialA + "=existencia" + inicialA + "+" + cantidad + " WHERE ID_insumo" + inicialA + "= '" + IDinsu + "'";
        try {
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo ejecutar la devolución del insumo..."+e, "¡ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargaRegInsu(String IDinsu, String area, String inicialA, JTable tablaExistenciaActual) {
        String sentencia = "SELECT tbl_insumo.ID_insumo, tbl_insumo.nombre_insumo, tbl_stock" + area + ".existencia" + inicialA + ""
               + " FROM tbl_insumo, tbl_stock" + area + ""
               + " WHERE tbl_insumo.ID_insumo = tbl_stock" + area + ".ID_insumo" + inicialA + " and tbl_insumo.ID_insumo = '" + IDinsu + "'";
        DefaultTableModel tablaExistActual = new DefaultTableModel(datos, columnas3) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaExistenciaActual.setModel(tablaExistActual);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaExistActual.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo visualizar la existencia actual del insumo..."+e, "¡ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargaIDunidad(String IDinsu, String area, String inicialA, JTable unidadMedida) {
        String sentencia = "SELECT tbl_stock" + area + ".ID_unidadM" + inicialA + ", tbl_unidadM.tipo_unidadM, tbl_unidadM.nombre_unidadM, tbl_unidadM.abrev_unidadM"
               + " FROM tbl_stock" + area + ",tbl_unidadM"
               + " WHERE tbl_stock" + area + ".ID_unidadM" + inicialA + " = tbl_unidadM.ID_unidadM AND tbl_stock" + area + ".ID_insumo" + inicialA + " = '" + IDinsu + "'";
        DefaultTableModel tablaUnidadM = new DefaultTableModel(datos, columnas4) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        unidadMedida.setModel(tablaUnidadM);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            ResultSet re2 = verBusqueda.executeQuery(sentencia);
            ResultSetMetaData rM2 = (ResultSetMetaData) re2.getMetaData();
            int nColumnas2 = rM2.getColumnCount();
            Object[] datosTabla2 = new Object[nColumnas2];
            while (re2.next()) {
                for (int j = 0; j < nColumnas2; j++) {
                    datosTabla2[j] = re2.getObject(j + 1);
                }
                tablaUnidadM.addRow(datosTabla2);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo visualizar los datos de la unidad de medida..."+e, "¡ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargaExistNInsu(String IDinsu, String area, String inicialA, JTable tablaExistenciaNueva) {
        String sentencia = "SELECT tbl_insumo.ID_insumo, tbl_insumo.nombre_insumo, tbl_stock" + area + ".existencia" + inicialA + ", tbl_stock" + area + ".ID_unidadM" + inicialA + ""
               + " FROM tbl_insumo, tbl_stock" + area + ""
               + " WHERE tbl_insumo.ID_insumo = tbl_stock" + area + ".ID_insumo" + inicialA + " and tbl_insumo.ID_insumo = '" + IDinsu + "'";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            tablaExistenciaNueva.setModel(tablaExistsNuevo);
            re = verBusqueda.executeQuery(sentencia);
            
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaExistsNuevo.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"No se pudo visualizar la nueva existencia del insumo..."+e, "¡ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
