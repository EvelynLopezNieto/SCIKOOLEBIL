package otras_operaciones;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * @author Evelyn López Nieto
 */
public class ConexionBD {

    private Connection conexion;
    private Connection conexion2;

    Icon errorFuncion = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon connectionValida = new ImageIcon(getClass().getResource("/recursos_graficos/5.png"));

    public Statement crearSentencia() {
        try {
            return conexion.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection obConexion() {
        try {
            conexion = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BDIKOOLEBIL", "root", "lone990104");
            //JOptionPane.showMessageDialog(null, "Conexion establecida a la base de datos", "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE,connectionValida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
        }
        return conexion;
    }

    public Statement crearSentencia2() {
        try {
            return conexion2.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection obConexion2() {
        try {
            conexion2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BDIKOOLEBIL", "root", "lone990104");
            JOptionPane.showMessageDialog(null, "Conexion establecida a la base de datos", "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, connectionValida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
        }
        return conexion2;
    }

    public void cerrarConexion() {
        try {

            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
        }
    }

    public void cerrarConexion2() {
        try {
            if (conexion2 != null) {
                conexion2.close();
                //JOptionPane.showMessageDialog(null, "Se cerró la conexión");
            }
        } catch (HeadlessException | SQLException e) {
        }
    }
}
