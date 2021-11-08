package perecederos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Panel_perecederos {

    ConexionBD conexion = new ConexionBD();

    //CARGA TOTAL DE REGISTROS DE PERECEDEROS
    public ResultSet cargaPerecederos() {
        String sentencia = "select ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad from tbl_insumo";
        try {
            Connection con = conexion.obConexion();
            Statement verR = conexion.crearSentencia();
            return verR.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet notifyCaducadosDias() {
        String sentencia = "SELECT COUNT(*) AS 'Notificados_caducar' FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL 1 MONTH);";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA CANTIDAD DE DÍAS
    public ResultSet caducadosDias(int diaPositivo) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY);";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA CANTIDAD DE DÍAS
    public ResultSet caducadosDiasXarea(int diaPositivo, String iArea) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY) AND ID_insumo LIKE '%" + iArea + "'";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //VISUALIZACIÓN DE LA FECHA COMPLETA DE ACUERDO A LA CANTIDAD DE DÍAS INGRESADOS
    public ResultSet infoDias(int diaPositivo) {
        String sentencia = "SELECT ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY) AS 'Fecha';";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA CANTIDAD DE MESES
    public ResultSet caducadosMeses(int mesPositivo) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH);";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA CANTIDAD DE MESES
    public ResultSet caducadosMesesXarea(int mesPositivo, String iArea) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH) AND ID_insumo LIKE '%" + iArea + "'";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //VISUALIZACIÓN DE LA FECHA COMPLETA DE ACUERDO A LA CANTIDAD DE MESES INGRESADOS
    public ResultSet infoMeses(int mesPositivo) {
        String sentencia = "SELECT ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH) AS 'Fecha';";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA FECHA ESPECÍFICA
    public ResultSet caducadosFechaEspecific(String fechaEspecific) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and '" + fechaEspecific + "'";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA FECHA INGRESADA
    public ResultSet caducadosFechaEspecificXarea(String fechaEspecific, String iArea) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and '" + fechaEspecific + "' AND ID_insumo LIKE '%" + iArea + "'";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //VISUALIZACIÓN DE LA CANTIDAD DE DÍAS QUE LE QUEDAN AL INSUMO ENTRE LA FECHA ACTUAL Y LA FECHA INGRESADA
    public ResultSet infoFecha(String fecha) {
        String sentencia = "SELECT DATEDIFF('" + fecha + "',CURDATE()) AS 'Fecha'";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet eliminarCaducos(int mesNegativo) {
        String sentencia = "SELECT * FROM tbl_insumo WHERE fecha_caducidad BETWEEN ADDDATE(CURDATE(),INTERVAL -" + mesNegativo + " MONTH) and CURDATE()";

        try {
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //PARA VALIDAR EL INGRESO DE DATOS NUMÉRICOS EN LOS CAMPOS DE TEXTO
    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }
}
