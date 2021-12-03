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
package existencias;

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

/**
 *
 * @author Evelyn López Nieto
 */
public class Panel_existencias {

    ConexionBD conexion = new ConexionBD();
    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));
    String columnas6[] = {"ID stock", "ID insumo", "Existencia", "Stock mínimo", "ID unidad medida"};
    String columnas7[] = {"ID stock", "ID insumo", "Existencia", "Stock mínimo", "ID unidad medida", "Porciones"};
    String columnas8[] = {"Nombre de insumo", "Tipo de insumo", "Descripción", "Comentarios"};
    String datos[][] = {};

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    //A REPORTE
    public void cargaRegExistencias(String area, JTable tablaPorciones, JTable tablaSinPor, JComboBox comboArea) {
        String sentencia = "SELECT * FROM tbl_stock" + area;
        DefaultTableModel tablaExist = new DefaultTableModel(datos, columnas6) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        DefaultTableModel tablaExistPorci = new DefaultTableModel(datos, columnas7) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        int areaIndice = comboArea.getSelectedIndex();
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            if (areaIndice == 1 || areaIndice == 4) {
                tablaPorciones.setModel(tablaExistPorci);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExistPorci.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            } else {
                tablaSinPor.setModel(tablaExist);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExist.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la información a la tabla..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    public void busquedaIDexist(String area, String IDexist, String iniArea, JTable tablaPorciones,
           JTable tablaSinPor, JComboBox comboArea) {
        String sentencia = "SELECT * FROM tbl_stock" + area + " WHERE ID_insumo" + iniArea + " = '" + IDexist + "'";
        DefaultTableModel tablaExist = new DefaultTableModel(datos, columnas6) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        DefaultTableModel tablaExistPorci = new DefaultTableModel(datos, columnas7) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        int areaIndice = comboArea.getSelectedIndex();
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            if ((areaIndice == 1) || (areaIndice == 4)) {
                tablaPorciones.setModel(tablaExistPorci);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExistPorci.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            } else {
                tablaSinPor.setModel(tablaExist);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExist.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo cargar la información a la tabla..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //A REPORTE
    public void busquedaStockMinExist(String area, String iniArea, JTable tablaPorciones,
           JTable tablaSinPor, JComboBox comboArea) {
        String sentencia = "SELECT * FROM tbl_stock" + area + " WHERE existencia" + iniArea + " = stock_minimo" + iniArea + "";
        DefaultTableModel tablaExist = new DefaultTableModel(datos, columnas6) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        DefaultTableModel tablaExistPorci = new DefaultTableModel(datos, columnas7) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        int areaIndice = comboArea.getSelectedIndex();
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            if ((areaIndice == 1) || (areaIndice == 4)) {
                tablaPorciones.setModel(tablaExistPorci);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExistPorci.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            } else {
                tablaSinPor.setModel(tablaExist);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExist.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación al visualizar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    //A REPORTE
    public void busquedaExistActiva(String area, String iniArea, JTable tablaPorciones,
           JTable tablaSinPor, JComboBox comboArea) {
        String sentencia = "SELECT * FROM tbl_stock" + area + " WHERE existencia" + iniArea + " > stock_minimo" + iniArea + "";
        DefaultTableModel tablaExist = new DefaultTableModel(datos, columnas6) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 5) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        DefaultTableModel tablaExistPorci = new DefaultTableModel(datos, columnas7) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 6) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        int areaIndice = comboArea.getSelectedIndex();
        try {
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            if ((areaIndice == 1) || (areaIndice == 4)) {
                tablaPorciones.setModel(tablaExistPorci);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExistPorci.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            } else {
                tablaSinPor.setModel(tablaExist);
                re = verBusqueda.executeQuery(sentencia);
                rM = (ResultSetMetaData) re.getMetaData();
                nColumnas = rM.getColumnCount();
                datosTabla = new Object[nColumnas];
                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaExist.addRow(datosTabla);
                }
                conexion.cerrarConexion();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación al visualizar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }

    public void searchInfoInsuExist(String IDexist, JTable tablaInf) {
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
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación al visualizar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
    
    public void actualizarExistenciaGeneral(String area, String iniArea, String idInsumo, Double existencia, Double stockMin, int IDunidad) {
        try {
            String sentencia = "UPDATE tbl_stock"+area+" SET existencia" + iniArea + "= "+existencia+","
                   + "stock_minimo" + iniArea + "= "+stockMin+", ID_unidadM" + iniArea + "= "+IDunidad+" WHERE ID_insumo" + iniArea + "='"+idInsumo+"'";
            Connection con = conexion.obConexion();
            Statement actualizar = conexion.crearSentencia();
            actualizar.executeUpdate(sentencia);
            conexion.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error con la aplicación al actualizar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }
}
