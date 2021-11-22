package Usuarios_sistema;

import com.mysql.jdbc.ResultSetMetaData;
import interfaces_principales.LOGIN;
import interfaces_principales.Panel_principal;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Operaciones_usuarios {

    Icon denegado = new ImageIcon(getClass().getResource("/recursos_graficos/2.png"));
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    ConexionBD conexion = new ConexionBD();
    String columnas1[] = {"ID", "Nombre", "Cargo", "Turno"};
    String columnas2[] = {"ID acceso", "ID personal", "Fecha acceso", "Hora acceso", "Movimiento"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

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
            conexion.cerrarConexion2();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void agregarPerfiles(String nombre, String paterno, String materno, String telefono, String puesto,
           String turno, String privilegios, String usuario, String password) {

        String sentencia = "INSERT INTO tbl_personal VALUES(NULL, '" + nombre + "','" + paterno + "','" + materno + "','" + telefono + "','" + puesto + "',"
               + "'" + turno + "','" + privilegios + "','" + usuario + "','" + password + "')";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo agregar el registro..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verPerfiles(JTable tabla) {
        DefaultTableModel tablaPerfiles = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tabla.setModel(tablaPerfiles);
        String sentencia = "SELECT ID_personal, nombre_personal, cargo_personal, turno_personal FROM tbl_personal";
        try {
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            re = consulta.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaPerfiles.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargaPerf(int IDusuario, JLabel idUs, JTextField nombreUs, JTextField paterno, JTextField materno, JTextField tel,
           JTextField puesto, JRadioButton matutino, JRadioButton vespertino, JRadioButton admin, JRadioButton user, JTextField usuario,
           JTextField password) {
        String sentencia = "SELECT * FROM tbl_personal WHERE ID_personal = " + IDusuario + "";
        try {
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            re = consulta.executeQuery(sentencia);

            if (re.next()) {
                idUs.setText(re.getString("ID_personal"));
                nombreUs.setText(re.getString("nombre_personal"));
                paterno.setText(re.getString("apePat_personal"));
                materno.setText(re.getString("apeMat_personal"));
                tel.setText(re.getString("telefono_personal"));
                puesto.setText(re.getString("cargo_personal"));
                if (re.getString("turno_personal").equals("Matutino")) {
                    matutino.setSelected(true);
                } else if (re.getString("turno_personal").equals("Vespertino")) {
                    vespertino.setSelected(true);
                }
                if (re.getString("permiso_sis").equals("Administrador")) {
                    admin.setSelected(true);
                } else if (re.getString("permiso_sis").equals("Usuario")) {
                    user.setSelected(true);
                }
                usuario.setText(re.getString("usuario"));
                password.setText(re.getString("password"));
            }
            conexion.cerrarConexion();
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema con el sistema..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarPerfil(int ID, String nombre, String paterno, String materno, String telefono, String puesto,
           String turno, String privilegios, String usuario, String password) {
        String sentencia = "UPDATE tbl_personal SET nombre_personal = '" + nombre + "',apePat_personal = '" + paterno + "',"
               + "apeMat_personal = '" + materno + "',telefono_personal = '" + telefono + "',cargo_personal = '" + puesto + "',"
               + "turno_personal = '" + turno + "',permiso_sis = '" + privilegios + "',usuario = '" + usuario + "',password = '" + password + "'"
               + " WHERE ID_personal = " + ID + "";

        try {
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }

    }

    public void eliminarPerfiles(int IDuser) {
        String sentencia = "DELETE FROM tbl_personal WHERE ID_personal = " + IDuser + "";

        try {
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema con el sistema..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void historialUser(int IDuser, JTable tabla) {
        String sentencia = "SELECT * FROM tbl_accesosP WHERE ID_personal = " + IDuser + "";
        DefaultTableModel tablaHistorial = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tabla.setModel(tablaHistorial);
        try {
            Connection con = conexion.obConexion();
            Statement historial = conexion.crearSentencia();
            re = historial.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaHistorial.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar el historial del usuario especificado..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void regAccesosIngresoSumiNuevo (int idPersonal) {
        String sentencia = "INSERT INTO tbl_accesosP VALUES (NULL," + idPersonal + ",(SELECT CURDATE()),(SELECT CURTIME()),'Ingreso de suministro');";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            
        }
    }
    
    public void regAccesosIngresoSumiExist(int IDpersonal) {

        String sentencia = "INSERT INTO tbl_accesosP VALUES (NULL," + IDpersonal + ",(SELECT CURDATE()),(SELECT CURTIME()),'Ingreso datos nuevos a insumo existente');";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            
        }
    }
}
