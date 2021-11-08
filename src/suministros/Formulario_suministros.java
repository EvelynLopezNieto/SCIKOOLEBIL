package suministros;

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
public class Formulario_suministros {

    ConexionBD conexion = new ConexionBD();

    //ENVÍO DE REGISTROS DE INSUMOS AL INVENTARIO GENERAL
    public int registroTablaInsumo(String IDdia, String IDmes, String IDnombre, String IDinicial, String nombreInsumo, String tipoInsumo,
           String descripcion, Double precioInsUnitario, Double precioInsTotal, String comentarios, String fechaCaducidad) {

        String IDinsumo = IDdia + IDmes + IDnombre + IDinicial;
        String sentencia = "INSERT INTO tbl_insumo VALUES ('" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
               + "" + precioInsTotal + ",'" + comentarios + "',(SELECT curdate()),'" + fechaCaducidad + "')";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    //ENVÍO DE REGISTROS DE INSUMOS AL HISTORIAL DE SUMINISTROS
    public int registroTablaSuministro(String IDdia, String IDmes, String IDnombre, String IDinicial, String nombreInsumo, String tipoInsumo,
           String descripcion, Double precioInsUnitario, Double precioInsTotal, Double cantEntreg, Double perdidas, Double cantFinal,
           int IDunidadM, String comentarios) {

        String IDinsumo = IDdia + IDmes + IDnombre + IDinicial;
        //completar cadena de la sentencia
        String sentencia = "INSERT INTO tbl_suministros VALUES (NULL,'" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
               + "" + precioInsTotal + "," + cantEntreg + "," + perdidas + ", " + cantFinal + "," + IDunidadM + ",(SELECT curdate()),'" + comentarios + "')";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    //ENVÍO DE REGISTROS DE INSUMOS A LOS STOCKS DE LAS ÁREAS
    public int registroTablaStockServicio(String IDdiaS, String IDmesS, String IDnombreS, String IDinicialS, Double cantFinalS,
           int IDunidadMS, Double porcionS) {

        String IDinsumoS = IDdiaS + IDmesS + IDnombreS + IDinicialS;

        try {
            Statement insertar = conexion.crearSentencia();
            String sentencia = "INSERT INTO tbl_stockServicio VALUES (NULL,'" + IDinsumoS + "'," + cantFinalS + "," + IDunidadMS + "," + porcionS + ");";
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockRestaurante(String IDdiaR, String IDmesR, String IDnombreR, String IDinicialR,
           Double cantFinalR, int IDunidadMR) {

        String IDinsumoR = IDdiaR + IDmesR + IDnombreR + IDinicialR;
        String sentencia = "INSERT INTO tbl_stockRestaurante VALUES (NULL,'" + IDinsumoR + "'," + cantFinalR + "," + IDunidadMR + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockPersonal(String IDdiaP, String IDmesP, String IDnombreP, String IDinicialP,
           Double cantFinalP, int IDunidadMP) {

        String IDinsumoP = IDdiaP + IDmesP + IDnombreP + IDinicialP;
        String sentencia = "INSERT INTO tbl_stockPersonal VALUES (NULL,'" + IDinsumoP + "'," + cantFinalP + "," + IDunidadMP + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockBar(String IDdiaB, String IDmesB, String IDnombreB, String IDinicialB, Double cantFinalB,
           int IDunidadMB, Double porcionB) {

        String IDinsumoB = IDdiaB + IDmesB + IDnombreB + IDinicialB;
        String sentencia = "INSERT INTO tbl_stockBar VALUES (NULL,'" + IDinsumoB + "'," + cantFinalB + "," + IDunidadMB + "," + porcionB + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockHabitacion(String IDdiaH, String IDmesH, String IDnombreH, String IDinicialH,
           Double cantFinalH, int IDunidadMH) {

        String IDinsumoH = IDdiaH + IDmesH + IDnombreH + IDinicialH;
        String sentencia = "INSERT INTO tbl_stockHabitacion VALUES (NULL,'" + IDinsumoH + "'," + cantFinalH + "," + IDunidadMH + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockMantenimiento(String IDdiaM, String IDmesM, String IDnombreM, String IDinicialM,
           Double cantFinalM, int IDunidadMM) {

        String IDinsumoM = IDdiaM + IDmesM + IDnombreM + IDinicialM;
        String sentencia = "INSERT INTO tbl_stockMantenimiento VALUES (NULL,'" + IDinsumoM + "'," + cantFinalM + "," + IDunidadMM + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockRecepcion(String IDdiaRE, String IDmesRE, String IDnombreRE, String IDinicialRE,
           Double cantFinalRE, int IDunidadMRE) {

        String IDinsumoRE = IDdiaRE + IDmesRE + IDnombreRE + IDinicialRE;
        String sentencia = "INSERT INTO tbl_stockRecepcion VALUES (NULL,'" + IDinsumoRE + "'," + cantFinalRE + "," + IDunidadMRE + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    public int registroTablaStockOtros(String IDdiaO, String IDmesO, String IDnombreO, String IDinicialO,
           Double cantFinalO, int IDunidadMO) {

        String IDinsumoO = IDdiaO + IDmesO + IDnombreO + IDinicialO;
        String sentencia = "INSERT INTO tbl_stockOtros VALUES (NULL,'" + IDinsumoO + "'," + cantFinalO + "," + IDunidadMO + ");";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    //REGISTRO DE MOVIMIENTO DEL USUARIO
    public int registroTablaAccesosP(int IDpersonal) {

        String sentencia = "INSERT INTO tbl_accesosP VALUES (NULL," + IDpersonal + ",(SELECT CURDATE()),(SELECT CURTIME()),'Ingreso de suministro');";

        try {
            Statement insertar = conexion.crearSentencia();
            return insertar.executeUpdate(sentencia);
        } catch (SQLException e) {
            return -1;
        }
    }

    //CARGA DE DATOS A LOS COMBO BOX
    public void cargarcbUM(JComboBox combo) {
        String sentencia = "SELECT ID_unidadM FROM tbl_unidadM";

        try {
            Connection con = conexion.obConexion();
            Statement cargar = conexion.crearSentencia();
            ResultSet rs = cargar.executeQuery(sentencia);
            combo.removeAllItems();
            combo.addItem("Seleccione ID");
            while (rs.next()) {
                combo.addItem(rs.getString("ID_unidadM"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void cargarIDper(JComboBox combo2) {
        String sentencia = "SELECT ID_personal FROM tbl_personal";

        try {
            Connection con = conexion.obConexion();
            Statement cargar = conexion.crearSentencia();
            ResultSet rs = cargar.executeQuery(sentencia);
            combo2.removeAllItems();
            combo2.addItem("Seleccione ID personal");
            while (rs.next()) {
                combo2.addItem(rs.getString("ID_personal"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //VISUALIZACIÓN DE LOS REGISTROS EN TABLA UNIDADES Y PERSONAL
    public ResultSet verIDum(int IDu) {
        String sentencia = "select * from tbl_unidadM where ID_unidadM = '" + IDu + "'";
        try {
            Statement ver = conexion.crearSentencia();
            return ver.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    public ResultSet verIDper(int IDp) {
        String sentencia = "select nombre_personal,apePat_personal,cargo_personal,turno_personal from tbl_personal where ID_personal = '" + IDp + "'";
        try {
            Statement ver = conexion.crearSentencia();
            return ver.executeQuery(sentencia);
        } catch (SQLException e) {
            return null;
        }
    }

    //CARGA DE REGISTROS A LA TABLA SUMINISTROS
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
}
