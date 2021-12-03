package perecederos;

import com.mysql.jdbc.ResultSetMetaData;
import ds.desktop.notify.DesktopNotify;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import otras_operaciones.ConexionBD;

/*
 * @author Evelyn López Nieto
 */
public class Panel_perecederos {

    ConexionBD conexion = new ConexionBD();
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));

    
    String columnas2[] = {"ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega", "Fecha caducidad"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    //CARGA TOTAL DE REGISTROS DE PERECEDEROS
    //A REPORTE
    public void cargaPerecederos(JTable tablaPerecederos) {
        String sentencia = "select ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad from tbl_insumo order by nombre_insumo asc";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    public void notifyCaducadosDias() {
        String sentencia = "SELECT COUNT(*) AS 'Notificados_caducar' FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL 15 DAY);";

        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            re = verBusqueda.executeQuery(sentencia);
            String numCaducados = null;
            while (re.next()) {
                numCaducados = (re.getString("Notificados_caducar"));
            }
            DesktopNotify.showDesktopMessage("Notificación de caducados", "Según la revisión de inventarios, existen " + numCaducados + ""
                   + " insumos perecederos totales que están por caducar entre hoy y los próximos 15 días. Para ver cuáles son,"
                   + " vaya a la pestaña de perecederos y realice la búsqueda.", DesktopNotify.INFORMATION);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error de consulta de perecederos", "Ocurrió un error con la apliación, por lo tanto,"
                   + " no se puede mostrar el total de caducados de los próximos 15 días..." + e, DesktopNotify.ERROR);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA CANTIDAD DE DÍAS
    //A REPORTE
    public void caducadosDias(int diaPositivo, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY);";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA CANTIDAD DE DÍAS
    //A REPORTE
    public void caducadosDiasXarea(int diaPositivo, String iArea, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY) AND ID_insumo LIKE '%" + iArea + "'";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //VISUALIZACIÓN DE LA FECHA COMPLETA DE ACUERDO A LA CANTIDAD DE DÍAS INGRESADOS
    public void infoDias(int diaPositivo, JLabel infoBusquedaDias) {
        String sentencia = "SELECT ADDDATE(CURDATE(),INTERVAL " + diaPositivo + " DAY) AS 'Fecha';";

        try {
            Connection con = conexion.obConexion();
            ResultSet re2 = null;
            String fecha = null;
            Statement verBusqueda = conexion.crearSentencia();
            re2 = verBusqueda.executeQuery(sentencia);
            while (re2.next()) {
                fecha = (re2.getString("Fecha"));
            }
            infoBusquedaDias.setText("<html><p>Prontos a caducar están entre las fechas "
                   + "de hoy y " + fecha + " según la cantidad de días ingresados</p></html>");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al mostrar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA CANTIDAD DE MESES
    //A REPORTE
    public void caducadosMeses(int mesPositivo, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH);";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA CANTIDAD DE MESES
    //A REPORTE
    public void caducadosMesesXarea(int mesPositivo, String iArea, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH) AND ID_insumo LIKE '%" + iArea + "'";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
    //VISUALIZACIÓN DE LA FECHA COMPLETA DE ACUERDO A LA CANTIDAD DE MESES INGRESADOS

    public void infoMeses(int mesPositivo, JLabel infoBusquedaMes) {
        String sentencia = "SELECT ADDDATE(CURDATE(),INTERVAL " + mesPositivo + " MONTH) AS 'Fecha';";

        try {
            Connection con = conexion.obConexion();
            ResultSet re2 = null;
            String fecha = null;
            Statement verBusqueda = conexion.crearSentencia();
            re2 = verBusqueda.executeQuery(sentencia);
            while (re2.next()) {
                fecha = (re2.getString("Fecha"));
            }
            infoBusquedaMes.setText("<html><p>Prontos a caducar están entre las fechas "
                   + "de hoy y " + fecha + " según la cantidad de meses ingresados</p></html>");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al mostrar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS EN UNA FECHA ESPECÍFICA
    //A REPORTE
    public void caducadosFechaEspecific(String fechaEspecific, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and '" + fechaEspecific + "'";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //FILTRO DE CARGA DE CADUCADOS POR ÁREA DE ACUERDO A LA FECHA INGRESADA
    //A REPORTE
    public void caducadosFechaEspecificXarea(String fechaEspecific, String iArea, JTable tablaPerecederos) {
        String sentencia = "SELECT ID_insumo,nombre_insumo,tipo_insumo,fecha_entrega,fecha_caducidad FROM tbl_insumo WHERE fecha_caducidad BETWEEN CURDATE() and '" + fechaEspecific + "' AND ID_insumo LIKE '%" + iArea + "'";
        DefaultTableModel tablaPere = new DefaultTableModel(datos, columnas2) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaPerecederos.setModel(tablaPere);
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
                tablaPere.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //VISUALIZACIÓN DE LA CANTIDAD DE DÍAS QUE LE QUEDAN AL INSUMO ENTRE LA FECHA ACTUAL Y LA FECHA INGRESADA
    public void infoFecha(String fecha, JLabel infBusquedaFecha) {
        String sentencia = "SELECT DATEDIFF('" + fecha + "',CURDATE()) AS 'Fecha'";

        try {
            Connection con = conexion.obConexion();
            ResultSet re2 = null;
            Statement verBusqueda = conexion.crearSentencia();
            re2 = verBusqueda.executeQuery(sentencia);
            while (re2.next()) {
                fecha = (re2.getString("Fecha"));
            }
            infBusquedaFecha.setText("<html><p>Prontos a caducar están en el rango de " + fecha + " días\n"
                   + "de la fecha especificada</p></html>");
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al mostrar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //corregir sentencia. Es para eliminar, no es consulta
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
