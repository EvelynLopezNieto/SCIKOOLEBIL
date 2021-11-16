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
package existencias;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import otras_operaciones.ConexionBD;

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_existencias {
    ConexionBD conexion = new ConexionBD();
    
    //A REPORTE
    public ResultSet cargaRegExistencias(String area) {
        String sentencia = "SELECT * FROM tbl_stock"+area;

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet busquedaIDexist(String area,String IDexist, String iniArea) {
        String sentencia = "SELECT * FROM tbl_stock"+area+" WHERE ID_insumo"+iniArea+" = '" + IDexist+"'";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    //A REPORTE
    public ResultSet busquedaStockMinExist(String area,String iniArea) {
        String sentencia = "SELECT * FROM tbl_stock"+area+" WHERE existencia"+iniArea+" = stock_minimo"+iniArea+"";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    //A REPORTE
    public ResultSet busquedaExistActiva(String area,String iniArea) {
        String sentencia = "SELECT * FROM tbl_stock"+area+" WHERE existencia"+iniArea+" > stock_minimo"+iniArea+"";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet searchInfoInsuExist(String IDexist) {
        String sentencia = "SELECT nombre_insumo,tipo_insumo,descripcion,comentarios FROM tbl_insumo WHERE ID_insumo = '" + IDexist+"'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
}
