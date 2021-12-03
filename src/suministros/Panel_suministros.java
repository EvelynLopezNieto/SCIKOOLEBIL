package suministros;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Panel_suministros {

    ConexionBD conexion = new ConexionBD();
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));
    String columnas1[] = {"ID suministro", "ID insumo", "Nombre", "Tipo insumo", "Descripción", "$ unitario", "$ total",
        "Cant. Entregada", "Pérdidas", "Cant. Final", "Unidad medida", "Fecha entrega", "Comentario"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    //CARGA DE REGISTROS A LA TABLA DEL PANEL SUMINISTROS
    //A REPORTE
    public void cargaSuministros(JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros order by nombre_insumoN asc";

        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verR = conexion.crearSentencia();
            re = verR.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar suministros..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL ID DE SUMINISTRO
    public void busquedaIDsumi(int IDsumi, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE ID_suministro = " + IDsumi;

        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL ID DE INSUMO
    public void busquedaIDinsu(String IDinsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE ID_insumoN = '" + IDinsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL NOMBRE DE INSUMO
    public void busquedaNinsu(String nombreInsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE nombre_insumoN = '" + nombreInsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR EL TIPO DE INSUMO
    //A REPORTE
    public void busquedaTinsu(String tipoInsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE tipo_insumoN = '" + tipoInsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA CON FILTRO DE BÚSQUEDA POR LA FECHA DE ENTREGA
    //A REPORTE
    public void busquedaFechaEntinsu(String fechaInsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE fecha_entregaN = '" + fechaInsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //CARGA DE REGISTROS A LA TABLA QUE INVOLUCRA DOS FILTROS DE BÚSQUEDA: NOMBRE DE INSUMO Y FECHA DE ENTREGA
    //A REPORTE
    public void busqueda2FILTROnomFECH(String nInsu, String fInsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE nombre_insumoN = '" + nInsu + "' AND fecha_entregaN = '" + fInsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

//CARGA DE REGISTROS A LA TABLA QUE INVOLUCRA DOS FILTROS DE BÚSQUEDA: TIPO DE INSUMO Y FECHA DE ENTREGA
//A REPORTE
    public void busqueda2FILTROtipoFECH(String tInsu, String fInsu, JTable tablaSuministros) {
        String sentencia = "SELECT * FROM tbl_suministros WHERE tipo_insumoN = '" + tInsu + "' AND fecha_entregaN = '" + fInsu + "'";
        DefaultTableModel tablaSumi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 13) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaSuministros.setModel(tablaSumi);
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    public boolean validarNumeros(String dato) {
        return dato.matches("[0-9]*");
    }

}
