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

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import otras_operaciones.ConexionBD;
import java.sql.Statement;

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_salidas {

    ConexionBD conexion = new ConexionBD();

    public int salidaInsumo(String area, String inicialA, double cantidad, String IDinsu) {
        String sentencia = "UPDATE tbl_stock" + area + " SET existencia" + inicialA + "=existencia" + inicialA + "-" + cantidad + " WHERE ID_insumo" + inicialA + "= '" + IDinsu + "'";
        try {
            Statement actualizar = conexion.crearSentencia();
            return actualizar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int devolucionInsumo(String area, String inicialA, double cantidad, String IDinsu) {
        String sentencia = "UPDATE tbl_stock" + area + " SET existencia" + inicialA + "=existencia" + inicialA + "+" + cantidad + " WHERE ID_insumo" + inicialA + "= '" + IDinsu + "'";
        try {
            Statement actualizar = conexion.crearSentencia();
            return actualizar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public ResultSet cargaRegInsu(String IDinsu, String area, String inicialA) {
        String sentencia = "SELECT tbl_insumo.ID_insumo, tbl_insumo.nombre_insumo, tbl_stock" + area + ".existencia" + inicialA + ""
               + " FROM tbl_insumo, tbl_stock" + area + ""
               + " WHERE tbl_insumo.ID_insumo = tbl_stock" + area + ".ID_insumo" + inicialA + " and tbl_insumo.ID_insumo = '" + IDinsu + "'";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet cargaIDunidad(String IDinsu, String area, String inicialA) {
        String sentencia = "SELECT tbl_stock" + area + ".ID_unidadM" + inicialA + ", tbl_unidadm.tipo_unidadM, tbl_unidadm.nombre_unidadM, tbl_unidadm.abrev_unidadM"
               + " FROM tbl_stock" + area + ",tbl_unidadm"
               + " WHERE tbl_stock" + area + ".ID_unidadM" + inicialA + " = tbl_unidadm.ID_unidadM AND tbl_stock" + area + ".ID_insumo" + inicialA + " = '" + IDinsu + "'";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet cargaExistNInsu(String IDinsu, String area, String inicialA) {
        String sentencia = "SELECT tbl_insumo.ID_insumo, tbl_insumo.nombre_insumo, tbl_stock" + area + ".existencia" + inicialA + ", tbl_stock" + area + ".ID_unidadM" + inicialA + ""
               + " FROM tbl_insumo, tbl_stock" + area + ""
               + " WHERE tbl_insumo.ID_insumo = tbl_stock" + area + ".ID_insumo" + inicialA + " and tbl_insumo.ID_insumo = '" + IDinsu + "'";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
}
