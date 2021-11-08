package suministros;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Panel_suministros {

    ConexionBD conexion = new ConexionBD();

    //CARGA DE REGISTROS A LA TABLA DEL PANEL SUMINISTROS
    public ResultSet cargaSuministros() {
        String sentencia = "select * from tbl_suministros";
        try {
            Connection con = conexion.obConexion();
            Statement verR = conexion.crearSentencia();
            return verR.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL ID DE SUMINISTRO
    public ResultSet busquedaIDsumi(int IDsumi) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE ID_suministro = " + IDsumi;

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL ID DE INSUMO
    public ResultSet busquedaIDinsu(String IDinsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE ID_insumoN = '" + IDinsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL NOMBRE DE INSUMO
    public ResultSet busquedaNinsu(String nombreInsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE nombre_insumoN = '" + nombreInsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL TIPO DE INSUMO
    public ResultSet busquedaTinsu(String tipoInsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE tipo_insumoN = '" + tipoInsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR LA FECHA DE ENTREGA
    public ResultSet busquedaFechaEntinsu(String fechaInsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE fecha_entregaN = '" + fechaInsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA QUE INVOLUCRA DOS FILTROS DE BÚSQUEDA: NOMBRE DE INSUMO Y FECHA DE ENTREGA
    public ResultSet busqued2FILTROnomFECH(String nInsu, String fInsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE nombre_insumoN = '" + nInsu + "' AND fecha_entregaN = '" + fInsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA QUE INVOLUCRA DOS FILTROS DE BÚSQUEDA: TIPO DE INSUMO Y FECHA DE ENTREGA
    public ResultSet busqueda2FILTROtipoFECH(String tInsu, String fInsu) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE tipo_insumoN = '" + tInsu + "' AND fecha_entregaN = '" + fInsu + "'";

        try {
            //Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            return verBusqueda.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }

}
