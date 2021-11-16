package Usuarios_sistema;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Operaciones_usuarios {

    ConexionBD conexion = new ConexionBD();

    public ResultSet consultaUserLogin(String nombreU) {
        String sentencia = "select usuario,password from tbl_personal where nombre_personal = '" + nombreU + "' ";
        try {
            Statement consulta = conexion.crearSentencia2();
            return consulta.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public void cargaUsuarioLogin(JComboBox comboU) {
        String sentencia = "SELECT nombre_personal FROM tbl_personal";

        try {
            Connection con = conexion.obConexion2();
            Statement cargar = conexion.crearSentencia2();
            ResultSet rs = cargar.executeQuery(sentencia);
            comboU.addItem("Seleccione nombre");
            while (rs.next()) {
                comboU.addItem(rs.getString("nombre_personal"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public int agregarPerfiles(String nombre, String paterno, String materno, String telefono, String puesto,
           String turno, String privilegios, String usuario, String password) {

        String sentencia = "INSERT INTO tbl_personal VALUES(NULL, '" + nombre + "','" + paterno + "','" + materno + "','" + telefono + "','" + puesto + "',"
               + "'" + turno + "','" + privilegios + "','" + usuario + "','" + password + "')";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public ResultSet verPerfiles() {
        String sentencia = "SELECT ID_personal, nombre_personal, cargo_personal, turno_personal FROM tbl_personal";
        try {
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            return consulta.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }
    
    public ResultSet cargaPerfil(int IDusuario) {
        String sentencia = "SELECT * FROM tbl_personal WHERE ID_personal = "+IDusuario+"";
        try {
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            return consulta.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public int editarPerfil(int ID, String nombre, String paterno, String materno, String telefono, String puesto,
           String turno, String privilegios, String usuario, String password) {
        String sentencia = "UPDATE tbl_personal SET nombre_personal = '" + nombre + "',apePat_personal = '" + paterno + "',"
               + "apeMat_personal = '" + materno + "',telefono_personal = '" + telefono + "',cargo_personal = '" + puesto + "',"
               + "turno_personal = '" + turno + "',permiso_sis = '" + privilegios + "',usuario = '" + usuario + "',password = '" + password + "'"
               + " WHERE ID_personal = "+ID+"";

        try {
            Statement actualizar = conexion.crearSentencia();
            return actualizar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }

    }

    public int eliminarPerfiles(int IDuser) {
        String sentencia = "DELETE FROM tbl_personal WHERE ID_personal = " + IDuser + "";

        try {
            Statement eliminar = conexion.crearSentencia();
            return eliminar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

}
