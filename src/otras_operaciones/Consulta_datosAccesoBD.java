
package otras_operaciones;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/*
 * @author Evelyn López Nieto
 */
public class Consulta_datosAccesoBD {
    ConexionBD conexion = new ConexionBD();
    
        public ResultSet consultaUser(String nombreU){
            String sentencia = "select usuario,password from tbl_personal where nombre_personal = '"+nombreU+"' ";
            try {
            Statement consulta=conexion.crearSentencia2();
            return consulta.executeQuery(sentencia);
            } catch (SQLException e) {
                return null;
            }
    }
        public void cargaUsuario (JComboBox comboU) {
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
        
        
}
