package suministros;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Form_sumiNuevos {

    ConexionBD conexion = new ConexionBD();

    //ENVÍO DE REGISTROS DE INSUMOS AL INVENTARIO GENERAL
    public void registroTablaInsumo(String IDnombre, String IDinicial, String nombreInsumo, String tipoInsumo,
           String descripcion, Double precioInsUnitario, Double precioInsTotal, String comentarios, String fechaCaducidad) {

        String IDinsumo = IDnombre + IDinicial;
        String sentencia = "INSERT INTO tbl_insumo VALUES ('" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
               + "" + precioInsTotal + ",'" + comentarios + "',(SELECT curdate()),'" + fechaCaducidad + "')";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    //ENVÍO DE REGISTROS DE INSUMOS AL HISTORIAL DE SUMINISTROS
    public void registroTablaSuministro(String IDnombre, String IDinicial, String nombreInsumo, String tipoInsumo,
           String descripcion, Double precioInsUnitario, Double precioInsTotal, Double cantEntreg, Double perdidas, Double cantFinal,
           int IDunidadM, String comentarios) {

        String IDinsumo = IDnombre + IDinicial;
        String sentencia = "INSERT INTO tbl_suministros VALUES (NULL,'" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
               + "" + precioInsTotal + "," + cantEntreg + "," + perdidas + ", " + cantFinal + "," + IDunidadM + ",(SELECT curdate()),'" + comentarios + "')";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    //ENVÍO DE REGISTROS DE INSUMOS A LOS STOCKS DE LAS ÁREAS
    public void registroTablaStockServicio(String IDnombreS, String IDinicialS, Double cantFinalS,
           Double stockMinS, int IDunidadMS, Double porcionS) {

        String IDinsumoS = IDnombreS + IDinicialS;

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            String sentencia = "INSERT INTO tbl_stockServicio VALUES (NULL,'" + IDinsumoS + "'," + cantFinalS + ","+stockMinS+"," + IDunidadMS + "," + porcionS + ");";
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void registroTablaStockRestaurante(String IDnombreR, String IDinicialR,
           Double cantFinalR, Double stockMinR, int IDunidadMR) {

        String IDinsumoR = IDnombreR + IDinicialR;
        String sentencia = "INSERT INTO tbl_stockRestaurante VALUES (NULL,'" + IDinsumoR + "'," + cantFinalR + ","+stockMinR+"," + IDunidadMR + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockPersonal(String IDnombreP, String IDinicialP,
           Double cantFinalP, Double stockMinP, int IDunidadMP) {

        String IDinsumoP = IDnombreP + IDinicialP;
        String sentencia = "INSERT INTO tbl_stockPersonal VALUES (NULL,'" + IDinsumoP + "'," + cantFinalP + ","+stockMinP+"," + IDunidadMP + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockBar(String IDnombreB, String IDinicialB, Double cantFinalB,
           Double stockMinB, int IDunidadMB, Double porcionB) {

        String IDinsumoB = IDnombreB + IDinicialB;
        String sentencia = "INSERT INTO tbl_stockBar VALUES (NULL,'" + IDinsumoB + "'," + cantFinalB + ","+stockMinB+"," + IDunidadMB + "," + porcionB + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockHabitacion(String IDnombreH, String IDinicialH,
           Double cantFinalH, Double stockMinH, int IDunidadMH) {

        String IDinsumoH = IDnombreH + IDinicialH;
        String sentencia = "INSERT INTO tbl_stockHabitacion VALUES (NULL,'" + IDinsumoH + "'," + cantFinalH + ","+stockMinH+"," + IDunidadMH + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockMantenimiento(String IDnombreM, String IDinicialM,
           Double cantFinalM, Double stockMinM, int IDunidadMM) {

        String IDinsumoM = IDnombreM + IDinicialM;
        String sentencia = "INSERT INTO tbl_stockMantenimiento VALUES (NULL,'" + IDinsumoM + "'," + cantFinalM + ","+stockMinM+"," + IDunidadMM + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockRecepcion(String IDnombreRE, String IDinicialRE,
           Double cantFinalRE, Double stockMinRE, int IDunidadMRE) {

        String IDinsumoRE = IDnombreRE + IDinicialRE;
        String sentencia = "INSERT INTO tbl_stockRecepcion VALUES (NULL,'" + IDinsumoRE + "'," + cantFinalRE + ","+stockMinRE+"," + IDunidadMRE + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registroTablaStockOtros(String IDnombreO, String IDinicialO,
           Double cantFinalO, Double stockMinO, int IDunidadMO) {

        String IDinsumoO = IDnombreO + IDinicialO;
        String sentencia = "INSERT INTO tbl_stockOtros VALUES (NULL,'" + IDinsumoO + "'," + cantFinalO + ","+stockMinO+"," + IDunidadMO + ");";

        try {
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
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
            conexion.cerrarConexion();
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
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //VISUALIZACIÓN DE LOS REGISTROS EN TABLA UNIDADES Y PERSONAL
    public void verIDum(int IDu, JTable tablaUnidad) {
        String sentencia = "select * from tbl_unidadM where ID_unidadM = '" + IDu + "'";
        String columnas[] = {"ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"};
        String datos[][] = {};
        DefaultTableModel tablaUnidadM = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaUnidad.setModel(tablaUnidadM);
        try {
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();
            
            Object[] datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaUnidadM.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar la información..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void verIDper(int IDp, JTable tablaPersona) {
        String sentencia = "select nombre_personal,apePat_personal,cargo_personal,turno_personal from tbl_personal where ID_personal = '" + IDp + "'";
        String columnas[] = {"Nombre", "Apellido paterno", "Cargo", "Turno"};
        String datos[][] = {};
        DefaultTableModel tablaPersonal = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPersona.setModel(tablaPersonal);
        
        try {
            Connection con = conexion.obConexion();
            Statement ver = conexion.crearSentencia();
            ResultSet re = ver.executeQuery(sentencia);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();
            
            Object[] datosTabla = new Object[nColumnas];
            
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaPersonal.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar la información..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

}
