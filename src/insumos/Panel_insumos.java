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
package insumos;

import com.mysql.jdbc.ResultSetMetaData;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import otras_operaciones.ConexionBD;

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_insumos {

    ConexionBD conexion = new ConexionBD();
    String columnas[] = {"ID", "Nombre", "Tipo", "Descripción", "$ unitario", "$ total", "Comentarios", "Fecha entrega", "Fecha caducidad"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    public void cargarTodosInsumos(JTable tblInsumos, JLabel nRegistros) {
        try {
            DefaultTableModel tablaInsumos = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 9) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            tblInsumos.setModel(tablaInsumos);

            String sentencia = "SELECT * FROM tbl_insumo ORDER BY nombre_insumo ASC";
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
                tablaInsumos.addRow(datosTabla);
            }
            conexion.cerrarConexion();
            int cantFilas = 0;
            for (int j = 0; j < tablaInsumos.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            nRegistros.setText("Registros: " + cantFilas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void searchXnombre(String nombreInsumo, JTable tblInsumos, JLabel nRegistros) {
        try {
            DefaultTableModel tablaInsumos = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 9) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            tblInsumos.setModel(tablaInsumos);

            String sentencia = "SELECT * FROM tbl_insumo WHERE nombre_insumo = '" + nombreInsumo + "'";
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
                tablaInsumos.addRow(datosTabla);
            }
            conexion.cerrarConexion();
            int cantFilas = 0;
            for (int j = 0; j < tablaInsumos.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            nRegistros.setText("Registros: " + cantFilas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar el registro..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void searchXid(String idInsumo, JTable tblInsumos, JLabel nRegistros) {
        try {
            DefaultTableModel tablaInsumos = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 9) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            tblInsumos.setModel(tablaInsumos);

            String sentencia = "SELECT * FROM tbl_insumo WHERE ID_insumo = '" + idInsumo + "'";
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
                tablaInsumos.addRow(datosTabla);
            }
            conexion.cerrarConexion();
            int cantFilas = 0;
            for (int j = 0; j < tablaInsumos.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            nRegistros.setText("Registros: " + cantFilas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo mostrar el registro..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void filtroArea(String iArea, JTable tblInsumos, JLabel nRegistros) {
        try {
            DefaultTableModel tablaInsumos = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 9) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            tblInsumos.setModel(tablaInsumos);

            String sentencia = "SELECT * FROM tbl_insumo WHERE ID_insumo LIKE '%" + iArea + "'";
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
                tablaInsumos.addRow(datosTabla);
            }
            conexion.cerrarConexion();
            int cantFilas = 0;
            for (int j = 0; j < tablaInsumos.getRowCount(); j++) {
                cantFilas = j + 1;
            }
            nRegistros.setText("Registros: " + cantFilas);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudieron mostrar los registros..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void eliminarInsumo(String idInsumo) {
        try {

            String sentencia = "DELETE FROM tbl_insumo WHERE ID_insumo = '" + idInsumo + "'";
            Connection con = conexion.obConexion();
            Statement eliminar = conexion.crearSentencia();
            eliminar.executeUpdate(sentencia);
            conexion.cerrarConexion();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un problema con el sistema..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void editarInsumo(String idInsumo, String nombre, String tipo, String descripcion, double unitario, double total, String comentarios,
           String fechaEntrega, String fechaCadu) {
        try {
            String sentencia = "UPDATE tbl_insumo SET ID_insumo='" + idInsumo + "', nombre_insumo='" + nombre + "', tipo_insumo='" + tipo + "',"
                   + " descripcion='" + descripcion + "', precio_insumo_unitario=" + unitario + ", precio_insumo_total=" + total + ", comentarios='" + comentarios + "',"
                   + " fecha_entrega='" + fechaEntrega + "', fecha_caducidad='" + fechaCadu + "' WHERE ID_insumo = '" + idInsumo + "'";

            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void registrarSuministroEdicion(String IDinsumo, String nombreInsumo, String tipoInsumo, String descripcion,
           Double precioInsUnitario, Double precioInsTotal, String fechaEntrega, String comentarios) {
        try {
            String sentencia = "INSERT INTO tbl_suministros VALUES (NULL,'" + IDinsumo + "','" + nombreInsumo + "','" + tipoInsumo + "','" + descripcion + "'," + precioInsUnitario + ","
                   + "" + precioInsTotal + ",0,0,0,1,'"+fechaEntrega+"','" + comentarios + "')";
            Connection con = conexion.obConexion();
            Statement insertar = conexion.crearSentencia();
            insertar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo registrar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarInsumoEdicionTabla(JTable tablaInsu, JTextField txtID, JTextField txtNombre, JComboBox cbTipo, JTextArea txtaDescrip,
           JTextField txtUnit, JTextField txtTotal, JTextArea txtaComent) {
        try {
            int fila = tablaInsu.getSelectedRow();
            String id = tablaInsu.getValueAt(fila, 0).toString();
            String nombre = tablaInsu.getValueAt(fila, 1).toString();
            String tipo = tablaInsu.getValueAt(fila, 2).toString();
            String descripcion = tablaInsu.getValueAt(fila, 3).toString();
            String unitario = tablaInsu.getValueAt(fila, 4).toString();
            String total = tablaInsu.getValueAt(fila, 5).toString();
            String comentario = tablaInsu.getValueAt(fila, 6).toString();
            //String entrega = tablaInsu.getValueAt(fila, 7).toString();
            //String caducidad = tablaInsu.getValueAt(fila, 8).toString();

            txtID.setText(id);
            txtNombre.setText(nombre);
            cbTipo.setSelectedItem(tipo);
            txtaDescrip.setText(descripcion);
            txtUnit.setText(unitario);
            txtTotal.setText(total);
            txtaComent.setText(comentario);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la información del insumo..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void cargarInsEdicionMasivaBD(String IDinsumo, JTextField txtNombre, JComboBox cbTipo, JTextArea txtaDescrip,
           JTextField txtUnit, JTextField txtTotal, JTextArea txtaComent) {
        try {
            String sentencia = "SELECT nombre_insumo,tipo_insumo,descripcion,precio_insumo_unitario,precio_insumo_total,comentarios"
                   + " FROM tbl_insumo WHERE ID_insumo = '" + IDinsumo + "'";
            Connection con = conexion.obConexion();
            Statement consulta = conexion.crearSentencia();
            re = consulta.executeQuery(sentencia);
            if (re.next()) {
                txtNombre.setText(re.getString("nombre_insumo"));
                cbTipo.setSelectedItem(re.getString("tipo_insumo"));
                txtaDescrip.setText(re.getString("descripcion"));
                txtUnit.setText(re.getString("precio_insumo_unitario"));
                txtTotal.setText(re.getString("precio_insumo_total"));
                txtaComent.setText(re.getString("comentarios"));
            }
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la información del insumo..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }
}
