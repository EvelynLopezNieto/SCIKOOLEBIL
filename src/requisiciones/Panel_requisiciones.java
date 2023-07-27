/*
 * Copyright (C) 2021 Evelyn López Nieto
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package requisiciones;

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

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_requisiciones {

    ConexionBD conexion = new ConexionBD();

    String columnas[] = {"ID insumo", "ID unidad de medida"};
    String columnas1[] = {"ID requisición", "ID insumo", "Cantidad solicitada", "ID unidad medida", "ID personal que solicita", "Fecha solicitud"};
    String columnas8[] = {"Nombre de insumo", "Tipo de insumo", "Descripción", "Comentarios"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    public void mostrarRequiTodos(String area, String iniArea, JTable tablaRequisicion) {
        String sentencia = "SELECT * FROM tbl_requisiciones_" + area + " ORDER BY fecha_solicitudR"+iniArea+" desc";
        DefaultTableModel tablaRequi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaRequisicion.setModel(tablaRequi);

        try {
            Connection con = conexion.obConexion();
            Statement verRequi = conexion.crearSentencia();
            re = verRequi.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaRequi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al mostrar el historial de requisiciones..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void mostrarInsuRequisicion(String area, String iniArea, JTable tablaRequisicion) {
        String sentencia = "SELECT ID_insumo" + iniArea + ",ID_unidadM" + iniArea + " FROM tbl_stock" + area + " WHERE existencia" + iniArea + " <= stock_minimo" + iniArea + "";
        DefaultTableModel tablaRequi = new DefaultTableModel(datos, columnas) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 2) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaRequisicion.setModel(tablaRequi);

        try {
            Connection con = conexion.obConexion();
            Statement verRequi = conexion.crearSentencia();
            re = verRequi.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaRequi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al cargar los insumos..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiServicio(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_servicio VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiRestaurante(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_restaurante VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiPersonal(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_personal VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiBar(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_bar VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiHabitacion(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_habitaciones VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiMantenimiento(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_mantenimiento VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiRecepcion(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_recepcion VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarRequiOtros(String idInsumo, Double cantidadSoli, int IDunidad, int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "INSERT INTO tbl_requisiciones_otros VALUES(NULL,'" + idInsumo + "'," + cantidadSoli + "," + IDunidad + ","
                   + "" + IDperson + ",'" + fechaSolicitud + "')";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición registrada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al registrar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void actualizarRequiArea(String area, String iniArea, int idRequi, String idInsumo, Double cantidadSoli, int IDunidad,
           int IDperson, String fechaSolicitud) {
        try {
            String sentencia = "UPDATE tbl_requisiciones_"+area+" SET ID_insumoR"+iniArea+"='" + idInsumo + "',"
                   + "cant_solicitadaR"+iniArea+"=" + cantidadSoli + ",ID_unidadMR"+iniArea+"=" + IDunidad + ","
                   + "ID_personalR"+iniArea+"="+ IDperson + ",fecha_solicitudR"+iniArea+"='" + fechaSolicitud + "'"
                   + " WHERE ID_requisicionR"+iniArea+"="+idRequi+"";

            Connection con = conexion.obConexion();
            Statement regRequi = conexion.crearSentencia();
            regRequi.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición actualizada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al actualizar la requisición..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminarRequiArea(String area, String iniArea, String idInsumo) {
        try {

            String sentencia = "DELETE FROM tbl_requisiciones_"+area+" WHERE ID_insumoR"+iniArea+" = '" + idInsumo+"'";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Requisición eliminada correctamente", "Mensaje del sistema", JOptionPane.PLAIN_MESSAGE);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema con el sistema..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrarInfInsumo(String IDexist, JTable tablaInf) {
        String sentencia = "SELECT nombre_insumo,tipo_insumo,descripcion,comentarios FROM tbl_insumo WHERE ID_insumo = '" + IDexist + "'";
        DefaultTableModel tablaInfInsumo = new DefaultTableModel(datos, columnas8) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaInf.setModel(tablaInfInsumo);
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
                tablaInfInsumo.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación al visualizar la información..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void busquedaFechaRequi (String fecha, String area, String iniArea, JTable tablaRequisicion) {
        String sentencia = "SELECT * FROM tbl_requisiciones_" + area + " WHERE fecha_solicitudR"+iniArea+" = '"+fecha+"' ";
        
        DefaultTableModel tablaRequi = new DefaultTableModel(datos, columnas1) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        tablaRequisicion.setModel(tablaRequi);

        try {
            Connection con = conexion.obConexion();
            Statement verRequi = conexion.crearSentencia();
            re = verRequi.executeQuery(sentencia);
            rM = (ResultSetMetaData) re.getMetaData();
            nColumnas = rM.getColumnCount();
            datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaRequi.addRow(datosTabla);
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema al mostrar el historial de requisiciones..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
        
    }

    public boolean validarNumerosRequi(String dato) {
        return dato.matches("[0-9]*");
    }
}
