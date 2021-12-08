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

    private Connection conexionLocal;
    private Connection conexionRemota;
    private Connection conexionLocal2;
    private Connection conexionRemota2;

    Icon errorFuncion = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon connectionValida = new ImageIcon(getClass().getResource("/recursos_graficos/5.png"));

    public Statement crearSentencia() {
        try {
            //return conexionLocal.createStatement();
            return conexionRemota.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection obConexion() {
        try {
            //conexionLocal = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BDIKOOLEBIL", "root", "lone990104");
            conexionRemota = (Connection) DriverManager.getConnection("jdbc:mysql://p3plzcpnl489474.prod.phx3.secureserver.net/BDIKOOLEBIL", "cmlv20sztqr4", "roma1975R");
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
            System.exit(0);
        }
        //return conexionLocal;
        return conexionRemota;
    }

    public Statement crearSentencia2() {
        try {
            //return conexionLocal2.createStatement();
            return conexionRemota2.createStatement();
        } catch (SQLException e) {
            return null;
        }
    }

    public Connection obConexion2() {
        try {
            //conexionLocal2 = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/BDIKOOLEBIL", "root", "lone990104");
            conexionRemota2 = (Connection) DriverManager.getConnection("jdbc:mysql://p3plzcpnl489474.prod.phx3.secureserver.net/BDIKOOLEBIL", "cmlv20sztqr4", "roma1975R");
            JOptionPane.showMessageDialog(null, "Conexion establecida a la base de datos", "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, connectionValida);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
            System.exit(0);
        }
        //return conexionLocal2;
        return conexionRemota2;
    }

    public void cerrarConexion() {
        try {

            /*if (conexionLocal != null) {
                conexionLocal.close();
            }*/
            if (conexionRemota != null) {
                conexionRemota.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
        }
    }

    public void cerrarConexion2() {
        try {
            /*if (conexionLocal2 != null) {
                conexionLocal2.close();
                //JOptionPane.showMessageDialog(null, "Se cerró la conexión");
            }*/
            if (conexionRemota2 != null) {
                conexionRemota2.close();
                //JOptionPane.showMessageDialog(null, "Se cerró la conexión");
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cerrar la conexión..." + e, "Enlace a base de datos", JOptionPane.PLAIN_MESSAGE, errorFuncion);
        }
    }
}
