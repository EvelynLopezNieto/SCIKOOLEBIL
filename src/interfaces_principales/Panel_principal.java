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
package interfaces_principales;

import requisiciones.Envio_requisicion;
import Usuarios_sistema.Administracion_usuarios;
import Usuarios_sistema.Operaciones_usuarios;
import com.mysql.jdbc.ResultSetMetaData;
import existencias.Panel_existencias;
import insumos.Edicion_insumos;
import insumos.Panel_insumos;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import otras_operaciones.ConexionBD;
import perecederos.Panel_perecederos;
import requisiciones.Panel_requisiciones;
import rojerusan.RSPanelsSlider;
import salidas.Panel_salidas;
import suministros.Ingreso_suministros;
import suministros.Panel_suministros;

/*
 * @author Evelyn López Nieto
 */
public class Panel_principal extends javax.swing.JFrame {

    ConexionBD conexion = new ConexionBD();

    Panel_insumos insumo = new Panel_insumos();
    Panel_suministros sumi = new Panel_suministros();
    Panel_perecederos pere = new Panel_perecederos();
    Panel_salidas salidas = new Panel_salidas();
    Panel_existencias existencia = new Panel_existencias();
    Panel_requisiciones requi = new Panel_requisiciones();
    Operaciones_usuarios usuarios = new Operaciones_usuarios();

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    public Panel_principal() {
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        this.setLocationRelativeTo(null);
        this.setIconImage(new ImageIcon(getClass().getResource("/recursos_graficos/icono_scikoolebil_2.png")).getImage());
        this.pnlWelcome.setVisible(true);
        notificadosCaducar();
        cerrarPrincipal();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pmTbl_requi = new javax.swing.JPopupMenu();
        mipmPrepararRequi = new javax.swing.JMenuItem();
        mipmEditarRequi = new javax.swing.JMenuItem();
        mipmEliminarRequi = new javax.swing.JMenuItem();
        pmTbl_insumo = new javax.swing.JPopupMenu();
        mipmEditarInsumo = new javax.swing.JMenuItem();
        mipmEliminar_insumo = new javax.swing.JMenuItem();
        pmTbl_existencias = new javax.swing.JPopupMenu();
        mipmActualizarExistencia = new javax.swing.JMenuItem();
        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnlWelcome = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        pnlSuministros = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_sumi = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbFiltro1Sumi = new javax.swing.JComboBox<>();
        cbFiltro2Sumi = new javax.swing.JComboBox<>();
        txtFiltro2Sumi = new javax.swing.JTextField();
        txtFiltro1Sumi = new javax.swing.JTextField();
        btnSearchF1Sumi = new javax.swing.JButton();
        btnSearchF2Sumi2 = new javax.swing.JButton();
        btnIngresarSumi = new javax.swing.JButton();
        btnReporteSumi = new javax.swing.JButton();
        pnlCaducidades = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_caducidades = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        lblInfoBusqueda1 = new javax.swing.JLabel();
        lblInfoBusqueda2 = new javax.swing.JLabel();
        lblInfoBusqueda3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnSearchCaducos = new javax.swing.JButton();
        txtCaducosDias = new javax.swing.JTextField();
        txtCaducosMeses = new javax.swing.JTextField();
        txtFechaDisCaduco = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        cbBusquedaIniPere = new javax.swing.JComboBox<>();
        btnGenerarRepCaducos = new javax.swing.JButton();
        pnlRequisiciones = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        tbl_requisiciones = new javax.swing.JTable();
        jScrollPane9 = new javax.swing.JScrollPane();
        tbl_infInsuRequi = new javax.swing.JTable();
        pnlFormEditRequi = new javax.swing.JPanel();
        lblIDinsu_requi = new javax.swing.JLabel();
        txtIDinsumo_requi = new javax.swing.JTextField();
        lblCantidad_requi = new javax.swing.JLabel();
        txtCantidad_requi = new javax.swing.JTextField();
        lblIDunidadM_requi = new javax.swing.JLabel();
        txtIDunidadM_requi = new javax.swing.JTextField();
        lblIDpersonal_requi = new javax.swing.JLabel();
        txtIDPersonal_requi = new javax.swing.JTextField();
        lblFechaSolicitud_requi = new javax.swing.JLabel();
        btnValidar_requi = new RSMaterialComponent.RSButtonIconOne();
        btnCancel_requi = new RSMaterialComponent.RSButtonIconOne();
        btnGenerarDocu_requi = new RSMaterialComponent.RSButtonFormaIcon();
        btnSolicitarRequi_requi = new RSMaterialComponent.RSButtonFormaIcon();
        btnUpdateRequi = new RSMaterialComponent.RSButtonIconOne();
        dateSolicitud_requi = new com.toedter.calendar.JDateChooser();
        lblIDrequi = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        txtSearchFechaRequi = new javax.swing.JTextField();
        btnSearchRequi = new javax.swing.JButton();
        cbAreaRequi = new javax.swing.JComboBox<>();
        btnMostarInsu_requi = new javax.swing.JButton();
        pnlInsumos = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_insumo = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        lblCantRegistrosInsumos = new javax.swing.JLabel();
        btnActualizarTblInsumos = new javax.swing.JButton();
        btnBuscarInsumo = new javax.swing.JButton();
        cbAreaInsumo = new javax.swing.JComboBox<>();
        txtNombreInsumo = new javax.swing.JTextField();
        btnUpdateMasivaInsumo = new javax.swing.JButton();
        btnGenerarReporteInsumo = new javax.swing.JButton();
        pnlExistencias = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblExistencias = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblInfoInsumoExistencia = new javax.swing.JTable();
        jLabel16 = new javax.swing.JLabel();
        pnlUpdateExistencia = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        lblID = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        txtExistencia = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtStockMin = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtUnidadM = new javax.swing.JTextField();
        btnUpdateExistencia = new RSMaterialComponent.RSButtonIconOne();
        btnCerrarUpdateExistencia = new RSMaterialComponent.RSButtonIconOne();
        cbAreaExistencias = new javax.swing.JComboBox<>();
        txtSearchIDinsuExist = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        cbBuscarStock = new javax.swing.JComboBox<>();
        btnGenerarRepExist = new javax.swing.JButton();
        pnlSalidas = new javax.swing.JPanel();
        btnGuardarSalidas = new rojeru_san.rsbutton.RSButtonForma();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblUnidadSalidas = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblExistActual = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnDevolver = new rojeru_san.rsbutton.RSButtonForma();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblNuevaExist = new javax.swing.JTable();
        cbAreaSalidas = new javax.swing.JComboBox<>();
        txtCodigoSalidas = new javax.swing.JTextField();
        txtCantidadSalidas = new javax.swing.JTextField();
        btnBuscarIDSalida = new javax.swing.JButton();
        pnlBotones = new javax.swing.JPanel();
        lblImageLogo = new necesario.RSLabelImage();
        btnInsumos = new RSMaterialComponent.RSButtonFormaIcon();
        btnExistencias = new RSMaterialComponent.RSButtonFormaIcon();
        btnCaducidades = new RSMaterialComponent.RSButtonFormaIcon();
        btnRequisiciones = new RSMaterialComponent.RSButtonFormaIcon();
        btnSuministros = new RSMaterialComponent.RSButtonFormaIcon();
        btnSalidas = new RSMaterialComponent.RSButtonFormaIcon();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mbmiCambiarUser = new javax.swing.JMenuItem();
        mbmiSalir = new javax.swing.JMenuItem();
        mbMainHerramientas = new javax.swing.JMenu();
        mbmiAdminUser = new javax.swing.JMenuItem();
        mbmiEnvioRequi = new javax.swing.JMenuItem();

        mipmPrepararRequi.setText("Preparar envío");
        mipmPrepararRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipmPrepararRequiActionPerformed(evt);
            }
        });
        pmTbl_requi.add(mipmPrepararRequi);

        mipmEditarRequi.setText("Editar");
        mipmEditarRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipmEditarRequiActionPerformed(evt);
            }
        });
        pmTbl_requi.add(mipmEditarRequi);

        mipmEliminarRequi.setText("Eliminar");
        pmTbl_requi.add(mipmEliminarRequi);

        mipmEditarInsumo.setText("Editar");
        mipmEditarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipmEditarInsumoActionPerformed(evt);
            }
        });
        pmTbl_insumo.add(mipmEditarInsumo);

        mipmEliminar_insumo.setText("Eliminar");
        mipmEliminar_insumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipmEliminar_insumoActionPerformed(evt);
            }
        });
        pmTbl_insumo.add(mipmEliminar_insumo);

        mipmActualizarExistencia.setText("Actualizar");
        mipmActualizarExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mipmActualizarExistenciaActionPerformed(evt);
            }
        });
        pmTbl_existencias.add(mipmActualizarExistencia);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal - SCIKo'olebil");
        setResizable(false);

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnlWelcome.setBackground(new java.awt.Color(0, 0, 51));
        pnlWelcome.setName("pnlWelcome"); // NOI18N
        pnlWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil.png"))); // NOI18N
        pnlWelcome.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 350, 350));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Sistema de control de inventarios");
        pnlWelcome.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Hotel Ko'olebil");
        pnlWelcome.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 540, 350, -1));

        rSPanelsSlider1.add(pnlWelcome, "card2");

        pnlSuministros.setBackground(new java.awt.Color(0, 0, 51));
        pnlSuministros.setName("pnlSuministros"); // NOI18N
        pnlSuministros.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_sumi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID suministro", "ID insumo", "Nombre", "Tipo insumo", "Descripción", "$ unitario", "$ total", "Cant. Entregada", "Pérdidas", "Cant. Final", "Unidad medida", "Fecha entrega", "Comentario"
            }
        ));
        jScrollPane1.setViewportView(tbl_sumi);

        pnlSuministros.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1070, -1));

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Historial de suministros");
        pnlSuministros.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro de búsqueda #1");
        pnlSuministros.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtro de búsqueda #2 (búsqueda avanzada)");
        pnlSuministros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        cbFiltro1Sumi.setBackground(new java.awt.Color(0, 51, 204));
        cbFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbFiltro1Sumi.setForeground(new java.awt.Color(255, 255, 255));
        cbFiltro1Sumi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione filtro", "ID suministro", "ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega" }));
        cbFiltro1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltro1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(cbFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 200, 30));

        cbFiltro2Sumi.setBackground(new java.awt.Color(0, 51, 204));
        cbFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbFiltro2Sumi.setForeground(new java.awt.Color(255, 255, 255));
        cbFiltro2Sumi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione filtro", "Fecha entrega" }));
        pnlSuministros.add(cbFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 200, 30));

        txtFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro2Sumi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        pnlSuministros.add(txtFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 185, 250, 40));

        txtFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro1Sumi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        txtFiltro1Sumi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltro1SumiCaretUpdate(evt);
            }
        });
        pnlSuministros.add(txtFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 185, 250, 40));

        btnSearchF1Sumi.setBackground(new java.awt.Color(0, 51, 204));
        btnSearchF1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSearchF1Sumi.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchF1Sumi.setText("Buscar");
        btnSearchF1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, -1, 40));

        btnSearchF2Sumi2.setBackground(new java.awt.Color(0, 51, 204));
        btnSearchF2Sumi2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSearchF2Sumi2.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchF2Sumi2.setText("Buscar");
        btnSearchF2Sumi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF2Sumi2ActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF2Sumi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 185, -1, 40));

        btnIngresarSumi.setBackground(new java.awt.Color(0, 51, 204));
        btnIngresarSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresarSumi.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresarSumi.setText("Ingresar suministros");
        btnIngresarSumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarSumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnIngresarSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 200, 40));

        btnReporteSumi.setBackground(new java.awt.Color(0, 51, 204));
        btnReporteSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReporteSumi.setForeground(new java.awt.Color(255, 255, 255));
        btnReporteSumi.setText("Generar reporte");
        btnReporteSumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteSumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnReporteSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 200, 40));

        rSPanelsSlider1.add(pnlSuministros, "card7");

        pnlCaducidades.setBackground(new java.awt.Color(0, 0, 51));
        pnlCaducidades.setName("pnlCaducidades"); // NOI18N
        pnlCaducidades.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_caducidades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega", "Fecha caducidad"
            }
        ));
        jScrollPane2.setViewportView(tbl_caducidades);

        pnlCaducidades.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1070, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manejo de perecederos");
        pnlCaducidades.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 2, -1, -1));

        lblInfoBusqueda1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda1.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 83, 300, 35));

        lblInfoBusqueda2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda2.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 130, 350, 35));

        lblInfoBusqueda3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda3.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 180, 300, 35));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtrar por área:");
        pnlCaducidades.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 110, -1, -1));

        btnSearchCaducos.setBackground(new java.awt.Color(0, 51, 204));
        btnSearchCaducos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSearchCaducos.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchCaducos.setText("Buscar");
        btnSearchCaducos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCaducosActionPerformed(evt);
            }
        });
        pnlCaducidades.add(btnSearchCaducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 40));

        txtCaducosDias.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosDias.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        txtCaducosDias.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosDiasCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 145, 40));

        txtCaducosMeses.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosMeses.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        txtCaducosMeses.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosMesesCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 130, 145, 40));

        txtFechaDisCaduco.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtFechaDisCaduco.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        txtFechaDisCaduco.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFechaDisCaducoCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtFechaDisCaduco, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 145, 40));

        jLabel22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Tiempo en días:");
        pnlCaducidades.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 90, -1, -1));

        jLabel23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Tiempo en meses:");
        pnlCaducidades.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 140, -1, -1));

        jLabel24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Fecha específica:");
        pnlCaducidades.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 175, -1, -1));

        jLabel25.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("AAAA-MM-dd");
        pnlCaducidades.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 200, 90, -1));

        cbBusquedaIniPere.setBackground(new java.awt.Color(0, 51, 204));
        cbBusquedaIniPere.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbBusquedaIniPere.setForeground(new java.awt.Color(255, 255, 255));
        cbBusquedaIniPere.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione inicial", "S", "R", "P", "B", "H", "M", "RE", "O" }));
        pnlCaducidades.add(cbBusquedaIniPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 140, 200, 30));

        btnGenerarRepCaducos.setBackground(new java.awt.Color(0, 51, 204));
        btnGenerarRepCaducos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarRepCaducos.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarRepCaducos.setText("Generar reporte");
        btnGenerarRepCaducos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRepCaducosActionPerformed(evt);
            }
        });
        pnlCaducidades.add(btnGenerarRepCaducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 180, 200, 40));

        rSPanelsSlider1.add(pnlCaducidades, "card5");

        pnlRequisiciones.setBackground(new java.awt.Color(0, 0, 51));
        pnlRequisiciones.setName("pnlRequisiciones"); // NOI18N
        pnlRequisiciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_requisiciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null}
            },
            new String [] {
                "--", "--", "--", "--", "--", "--"
            }
        ));
        tbl_requisiciones.setComponentPopupMenu(pmTbl_requi);
        tbl_requisiciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_requisicionesMouseClicked(evt);
            }
        });
        jScrollPane8.setViewportView(tbl_requisiciones);

        pnlRequisiciones.add(jScrollPane8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 730, 400));

        tbl_infInsuRequi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre insumo", "Tipo insumo", "Descripción", "Comentarios"
            }
        ));
        jScrollPane9.setViewportView(tbl_infInsuRequi);

        pnlRequisiciones.add(jScrollPane9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 730, 50));

        pnlFormEditRequi.setBackground(new java.awt.Color(0, 0, 51));
        pnlFormEditRequi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        pnlFormEditRequi.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblIDinsu_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblIDinsu_requi.setForeground(new java.awt.Color(255, 255, 255));
        lblIDinsu_requi.setText("ID insumo:");
        pnlFormEditRequi.add(lblIDinsu_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, -1, -1));

        txtIDinsumo_requi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlFormEditRequi.add(txtIDinsumo_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 240, 30));

        lblCantidad_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblCantidad_requi.setForeground(new java.awt.Color(255, 255, 255));
        lblCantidad_requi.setText("Cantidad solicitada:");
        pnlFormEditRequi.add(lblCantidad_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, -1, 20));

        txtCantidad_requi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlFormEditRequi.add(txtCantidad_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 180, 30));

        lblIDunidadM_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblIDunidadM_requi.setForeground(new java.awt.Color(255, 255, 255));
        lblIDunidadM_requi.setText("ID unidad medida:");
        pnlFormEditRequi.add(lblIDunidadM_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        txtIDunidadM_requi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlFormEditRequi.add(txtIDunidadM_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, 180, 30));

        lblIDpersonal_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblIDpersonal_requi.setForeground(new java.awt.Color(255, 255, 255));
        lblIDpersonal_requi.setText("ID personal solicitud:");
        pnlFormEditRequi.add(lblIDpersonal_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, -1, -1));

        txtIDPersonal_requi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlFormEditRequi.add(txtIDPersonal_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 30));

        lblFechaSolicitud_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        lblFechaSolicitud_requi.setForeground(new java.awt.Color(255, 255, 255));
        lblFechaSolicitud_requi.setText("<html><p>Fecha de solicitud</p>\n<p>(yyyy-MM-dd):</p></html>");
        pnlFormEditRequi.add(lblFechaSolicitud_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, -1));

        btnValidar_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnValidar_requi.setToolTipText("Validar requisición");
        btnValidar_requi.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnValidar_requi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CHECK);
        btnValidar_requi.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        btnValidar_requi.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnValidar_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidar_requiActionPerformed(evt);
            }
        });
        pnlFormEditRequi.add(btnValidar_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        btnCancel_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnCancel_requi.setToolTipText("Cancelar movimiento");
        btnCancel_requi.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnCancel_requi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CANCEL);
        btnCancel_requi.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        btnCancel_requi.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnCancel_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancel_requiActionPerformed(evt);
            }
        });
        pnlFormEditRequi.add(btnCancel_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));

        btnGenerarDocu_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnGenerarDocu_requi.setText("Generar documento");
        btnGenerarDocu_requi.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnGenerarDocu_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarDocu_requi.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnGenerarDocu_requi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        btnGenerarDocu_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarDocu_requiActionPerformed(evt);
            }
        });
        pnlFormEditRequi.add(btnGenerarDocu_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 190, -1));

        btnSolicitarRequi_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnSolicitarRequi_requi.setText("Solicitar requisición");
        btnSolicitarRequi_requi.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnSolicitarRequi_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSolicitarRequi_requi.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnSolicitarRequi_requi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.MAIL_OUTLINE);
        btnSolicitarRequi_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSolicitarRequi_requiActionPerformed(evt);
            }
        });
        pnlFormEditRequi.add(btnSolicitarRequi_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, -1));

        btnUpdateRequi.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdateRequi.setToolTipText("Actualizar datos");
        btnUpdateRequi.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnUpdateRequi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnUpdateRequi.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        btnUpdateRequi.setTypeBorder(RSMaterialComponent.RSButtonIconOne.TYPEBORDER.CIRCLE);
        btnUpdateRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateRequiActionPerformed(evt);
            }
        });
        pnlFormEditRequi.add(btnUpdateRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        dateSolicitud_requi.setDateFormatString("yyyy-MM-d");
        dateSolicitud_requi.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlFormEditRequi.add(dateSolicitud_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 180, 30));

        lblIDrequi.setFont(new java.awt.Font("Comic Sans MS", 0, 8)); // NOI18N
        lblIDrequi.setForeground(new java.awt.Color(255, 255, 255));
        lblIDrequi.setText("ID");
        pnlFormEditRequi.add(lblIDrequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 380, -1, -1));

        pnlRequisiciones.add(pnlFormEditRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 200, 330, 400));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>Unidades de medida:\n<p>ID\t Nombre\n<p>1\t kilogramo</p>\n<p>2\t gramo</p>\n<p>3\t litro</p>\n<p>4\t mililitro</p>\n<p>5\t pieza</p></html>");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlRequisiciones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 180, 130));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Solicitud de requisiciones");
        pnlRequisiciones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2, -1, -1));

        jLabel26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Ingrese fecha (yyyy-MM-dd):");
        pnlRequisiciones.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        txtSearchFechaRequi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtSearchFechaRequi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 45, 223), 2));
        pnlRequisiciones.add(txtSearchFechaRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 210, 40));

        btnSearchRequi.setBackground(new java.awt.Color(0, 51, 204));
        btnSearchRequi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSearchRequi.setForeground(new java.awt.Color(255, 255, 255));
        btnSearchRequi.setText("Buscar");
        btnSearchRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchRequiActionPerformed(evt);
            }
        });
        pnlRequisiciones.add(btnSearchRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, -1, 40));

        cbAreaRequi.setBackground(new java.awt.Color(0, 51, 204));
        cbAreaRequi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaRequi.setForeground(new java.awt.Color(255, 255, 255));
        cbAreaRequi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaRequiActionPerformed(evt);
            }
        });
        pnlRequisiciones.add(cbAreaRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 200, 30));

        btnMostarInsu_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnMostarInsu_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnMostarInsu_requi.setForeground(new java.awt.Color(255, 255, 255));
        btnMostarInsu_requi.setText("Insumos a requisición");
        btnMostarInsu_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostarInsu_requiActionPerformed(evt);
            }
        });
        pnlRequisiciones.add(btnMostarInsu_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 150, 200, 40));

        rSPanelsSlider1.add(pnlRequisiciones, "card6");

        pnlInsumos.setBackground(new java.awt.Color(0, 0, 51));
        pnlInsumos.setName("pnlInsumos"); // NOI18N
        pnlInsumos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbl_insumo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Tipo", "Descripción", "$ unitario", "$ total", "Comentarios", "Fecha entrega", "Fecha caducidad"
            }
        ));
        tbl_insumo.setComponentPopupMenu(pmTbl_insumo);
        jScrollPane10.setViewportView(tbl_insumo);

        pnlInsumos.add(jScrollPane10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 1070, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario general de insumos");
        pnlInsumos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 5, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar por área:");
        pnlInsumos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 165, -1, -1));

        lblCantRegistrosInsumos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCantRegistrosInsumos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantRegistrosInsumos.setText("Registros:");
        pnlInsumos.add(lblCantRegistrosInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 280, -1));

        btnActualizarTblInsumos.setBackground(new java.awt.Color(0, 51, 204));
        btnActualizarTblInsumos.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnActualizarTblInsumos.setForeground(new java.awt.Color(255, 255, 255));
        btnActualizarTblInsumos.setText("ACTUALIZAR");
        btnActualizarTblInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarTblInsumosActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnActualizarTblInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, -1, 40));

        btnBuscarInsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnBuscarInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        btnBuscarInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarInsumo.setText("BUSCAR");
        btnBuscarInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnBuscarInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 110, 40));

        cbAreaInsumo.setBackground(new java.awt.Color(0, 51, 204));
        cbAreaInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaInsumo.setForeground(new java.awt.Color(255, 255, 255));
        cbAreaInsumo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitaciones", "Mantenimiento", "Recepción", "Otros" }));
        cbAreaInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(cbAreaInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 180, 30));

        txtNombreInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtNombreInsumo.setForeground(new java.awt.Color(37, 45, 223));
        txtNombreInsumo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(37, 45, 223), 2));
        txtNombreInsumo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreInsumoKeyPressed(evt);
            }
        });
        pnlInsumos.add(txtNombreInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 250, 40));

        btnUpdateMasivaInsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdateMasivaInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnUpdateMasivaInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateMasivaInsumo.setText("Actualización masiva");
        btnUpdateMasivaInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMasivaInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnUpdateMasivaInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, 200, 40));

        btnGenerarReporteInsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnGenerarReporteInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarReporteInsumo.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarReporteInsumo.setText("Generar reporte");
        btnGenerarReporteInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnGenerarReporteInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 200, 40));

        rSPanelsSlider1.add(pnlInsumos, "card3");

        pnlExistencias.setBackground(new java.awt.Color(0, 0, 51));
        pnlExistencias.setName("pnlExistencias"); // NOI18N
        pnlExistencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblExistencias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "ID stock", "ID insumo", "Existencia", "Stock mínimo", "ID unidad medida"
            }
        ));
        tblExistencias.setComponentPopupMenu(pmTbl_existencias);
        tblExistencias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblExistenciasMouseClicked(evt);
            }
        });
        jScrollPane6.setViewportView(tblExistencias);

        pnlExistencias.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 810, 370));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Control de existencias");
        pnlExistencias.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, -1, -1));

        tblInfoInsumoExistencia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Nombre de insumo", "Tipo de insumo", "Descripción", "Comentarios"
            }
        ));
        jScrollPane7.setViewportView(tblInfoInsumoExistencia);

        pnlExistencias.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 610, 810, 50));

        jLabel16.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("<html>Unidades de medida: <p>ID\t Nombre <p>1\t kilogramo</p> <p>2\t gramo</p> <p>3\t litro</p> <p>4\t mililitro</p> <p>5\t pieza</p></html>");
        pnlExistencias.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 10, 170, 150));

        pnlUpdateExistencia.setBackground(new java.awt.Color(0, 0, 51));
        pnlUpdateExistencia.setForeground(new java.awt.Color(102, 102, 102));
        pnlUpdateExistencia.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("ID insumo:");
        pnlUpdateExistencia.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        lblID.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        lblID.setForeground(new java.awt.Color(255, 255, 255));
        lblID.setText("id");
        pnlUpdateExistencia.add(lblID, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 150, -1));

        jLabel19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Existencia:");
        pnlUpdateExistencia.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        txtExistencia.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pnlUpdateExistencia.add(txtExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 120, 30));

        jLabel20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Stock mínimo:");
        pnlUpdateExistencia.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        txtStockMin.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        pnlUpdateExistencia.add(txtStockMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 120, 30));

        jLabel21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("ID unidad medida:");
        pnlUpdateExistencia.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        txtUnidadM.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
        pnlUpdateExistencia.add(txtUnidadM, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 120, 30));

        btnUpdateExistencia.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdateExistencia.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnUpdateExistencia.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnUpdateExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateExistenciaActionPerformed(evt);
            }
        });
        pnlUpdateExistencia.add(btnUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, -1, -1));

        btnCerrarUpdateExistencia.setBackground(new java.awt.Color(0, 51, 204));
        btnCerrarUpdateExistencia.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnCerrarUpdateExistencia.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrarUpdateExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarUpdateExistenciaActionPerformed(evt);
            }
        });
        pnlUpdateExistencia.add(btnCerrarUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        pnlExistencias.add(pnlUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 250, 260));

        cbAreaExistencias.setBackground(new java.awt.Color(0, 51, 204));
        cbAreaExistencias.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaExistencias.setForeground(new java.awt.Color(255, 255, 255));
        cbAreaExistencias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaExistenciasActionPerformed(evt);
            }
        });
        pnlExistencias.add(cbAreaExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 200, 30));

        txtSearchIDinsuExist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtSearchIDinsuExist.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        txtSearchIDinsuExist.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchIDinsuExistKeyPressed(evt);
            }
        });
        pnlExistencias.add(txtSearchIDinsuExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 250, 40));

        jLabel18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Ingrese ID del insumo:");
        pnlExistencias.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        cbBuscarStock.setBackground(new java.awt.Color(0, 51, 204));
        cbBuscarStock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbBuscarStock.setForeground(new java.awt.Color(255, 255, 255));
        cbBuscarStock.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione opción", "Existencia mínima", "Existencia activa" }));
        cbBuscarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarStockActionPerformed(evt);
            }
        });
        pnlExistencias.add(cbBuscarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 200, 30));

        btnGenerarRepExist.setBackground(new java.awt.Color(0, 51, 204));
        btnGenerarRepExist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarRepExist.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarRepExist.setText("Generar reporte");
        btnGenerarRepExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRepExistActionPerformed(evt);
            }
        });
        pnlExistencias.add(btnGenerarRepExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, 180, 40));

        rSPanelsSlider1.add(pnlExistencias, "card4");

        pnlSalidas.setBackground(new java.awt.Color(0, 0, 51));
        pnlSalidas.setName("pnlSalidas"); // NOI18N
        pnlSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGuardarSalidas.setBackground(new java.awt.Color(0, 51, 204));
        btnGuardarSalidas.setText("Salida");
        btnGuardarSalidas.setColorHover(new java.awt.Color(0, 153, 204));
        btnGuardarSalidas.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnGuardarSalidas.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        btnGuardarSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarSalidasActionPerformed(evt);
            }
        });
        pnlSalidas.add(btnGuardarSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 290, 130, -1));

        tblUnidadSalidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"
            }
        ));
        jScrollPane3.setViewportView(tblUnidadSalidas);

        pnlSalidas.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 80, 370, 45));

        tblExistActual.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null}
            },
            new String [] {
                "ID insumo", "Nombre", "Existencia actual"
            }
        ));
        jScrollPane4.setViewportView(tblExistActual);

        pnlSalidas.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 780, 60));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID insumo:");
        pnlSalidas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad a utilizar o devolver:");
        pnlSalidas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 55, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unidad de medida del insumo:");
        pnlSalidas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 55, -1, -1));

        btnDevolver.setBackground(new java.awt.Color(0, 51, 204));
        btnDevolver.setText("Devolver");
        btnDevolver.setColorHover(new java.awt.Color(0, 153, 204));
        btnDevolver.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnDevolver.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        btnDevolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDevolverActionPerformed(evt);
            }
        });
        pnlSalidas.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, -1));

        tblNuevaExist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "ID insumo", "Nombre", "Nueva existencia", "Unidad medida"
            }
        ));
        jScrollPane5.setViewportView(tblNuevaExist);

        pnlSalidas.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, 780, 320));

        cbAreaSalidas.setBackground(new java.awt.Color(0, 51, 204));
        cbAreaSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaSalidas.setForeground(new java.awt.Color(255, 255, 255));
        cbAreaSalidas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaSalidasActionPerformed(evt);
            }
        });
        pnlSalidas.add(cbAreaSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 190, 30));

        txtCodigoSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCodigoSalidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        pnlSalidas.add(txtCodigoSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 250, 40));

        txtCantidadSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCantidadSalidas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 204), 2));
        pnlSalidas.add(txtCantidadSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 140, 40));

        btnBuscarIDSalida.setBackground(new java.awt.Color(37, 45, 223));
        btnBuscarIDSalida.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnBuscarIDSalida.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarIDSalida.setText("Buscar");
        btnBuscarIDSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDSalidaActionPerformed(evt);
            }
        });
        pnlSalidas.add(btnBuscarIDSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, 40));

        rSPanelsSlider1.add(pnlSalidas, "card8");

        getContentPane().add(rSPanelsSlider1, java.awt.BorderLayout.CENTER);

        pnlBotones.setBackground(new java.awt.Color(153, 204, 0));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblImageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil_redimensionado.png"))); // NOI18N
        lblImageLogo.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblImageLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageLogoMouseClicked(evt);
            }
        });
        pnlBotones.add(lblImageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 2, 100, 95));

        btnInsumos.setBackground(new java.awt.Color(153, 204, 0));
        btnInsumos.setText("Insumos");
        btnInsumos.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnInsumos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsumos.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnInsumos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnInsumos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnInsumos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.APPS);
        btnInsumos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsumosActionPerformed(evt);
            }
        });
        pnlBotones.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 97, -1, 95));

        btnExistencias.setBackground(new java.awt.Color(153, 204, 0));
        btnExistencias.setText("Existencias");
        btnExistencias.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnExistencias.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnExistencias.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnExistencias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnExistencias.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnExistencias.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.VIEW_LIST);
        btnExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExistenciasActionPerformed(evt);
            }
        });
        pnlBotones.add(btnExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 192, -1, 95));

        btnCaducidades.setBackground(new java.awt.Color(153, 204, 0));
        btnCaducidades.setText("Perecederos");
        btnCaducidades.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnCaducidades.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCaducidades.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnCaducidades.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnCaducidades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCaducidades.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.EVENT);
        btnCaducidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCaducidadesActionPerformed(evt);
            }
        });
        pnlBotones.add(btnCaducidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 287, -1, 95));

        btnRequisiciones.setBackground(new java.awt.Color(153, 204, 0));
        btnRequisiciones.setText("Requisiciones");
        btnRequisiciones.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnRequisiciones.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRequisiciones.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnRequisiciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnRequisiciones.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnRequisiciones.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SHOPPING_CART);
        btnRequisiciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequisicionesActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRequisiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 382, -1, 95));

        btnSuministros.setBackground(new java.awt.Color(153, 204, 0));
        btnSuministros.setText("Suministros");
        btnSuministros.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnSuministros.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSuministros.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnSuministros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSuministros.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSuministros.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.INPUT);
        btnSuministros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuministrosActionPerformed(evt);
            }
        });
        pnlBotones.add(btnSuministros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 477, -1, 95));

        btnSalidas.setBackground(new java.awt.Color(153, 204, 0));
        btnSalidas.setText("Salidas");
        btnSalidas.setBackgroundHover(new java.awt.Color(51, 153, 0));
        btnSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalidas.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.RECT);
        btnSalidas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnSalidas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalidas.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARROW_BACK);
        btnSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalidasActionPerformed(evt);
            }
        });
        pnlBotones.add(btnSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 572, -1, 95));

        getContentPane().add(pnlBotones, java.awt.BorderLayout.WEST);

        jMenu1.setText("Archivo");

        mbmiCambiarUser.setText("Cambiar de usuario");
        mbmiCambiarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbmiCambiarUserActionPerformed(evt);
            }
        });
        jMenu1.add(mbmiCambiarUser);

        mbmiSalir.setText("Salir");
        mbmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbmiSalirActionPerformed(evt);
            }
        });
        jMenu1.add(mbmiSalir);

        jMenuBar1.add(jMenu1);

        mbMainHerramientas.setText("Herramientas");

        mbmiAdminUser.setText("Administración de usuarios");
        mbmiAdminUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbmiAdminUserActionPerformed(evt);
            }
        });
        mbMainHerramientas.add(mbmiAdminUser);

        mbmiEnvioRequi.setText("Envío de requisiciones");
        mbmiEnvioRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbmiEnvioRequiActionPerformed(evt);
            }
        });
        mbMainHerramientas.add(mbmiEnvioRequi);

        jMenuBar1.add(mbMainHerramientas);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void notificadosCaducar() {
        pere.notifyCaducadosDias();
    }

    public void cerrarPrincipal() {
        try {
            this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent we) {
                    confirmSalida();
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void confirmSalida() {
        int valor = JOptionPane.showConfirmDialog(null, " ¿Está seguro de cerrar el programa?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            regSalidaUser();
            System.exit(0);
        }
    }

    public void regSalidaUser() {
        try {
            String tituloFrame = this.getTitle();
            if (tituloFrame.length() > 24) {
                String nombreUser = tituloFrame.substring(44);
                String sentencia = "SELECT ID_personal FROM tbl_personal WHERE nombre_personal = '" + nombreUser + "'";

                Connection con = conexion.obConexion();
                Statement consultaID = conexion.crearSentencia();
                ResultSet res = consultaID.executeQuery(sentencia);
                int IDperson = 0;
                while (res.next()) {
                    IDperson = res.getInt("ID_personal");
                }
                usuarios.regSalidaSistema(IDperson);
                conexion.cerrarConexion();
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Registro de salida fallido..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void generarReportesSinParams(String ubicacion) {
        try {
            Connection con;
            JasperReport jr;
            JasperPrint jp;
            JasperViewer view;

            con = conexion.obConexion2();
            jr = (JasperReport) JRLoader.loadObjectFromFile(ubicacion);
            jp = JasperFillManager.fillReport(jr, null, con);
            view = new JasperViewer(jp, false);
            view.setVisible(true);
            conexion.cerrarConexion2();
        } catch (JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void lblImageLogoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblImageLogoMouseClicked
        this.rSPanelsSlider1.slidPanel(20, pnlWelcome, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(false);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(true);
    }//GEN-LAST:event_lblImageLogoMouseClicked

    private void btnInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsumosActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlInsumos, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(false);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(true);

        if (this.cbAreaInsumo.getSelectedIndex() == 0) {
            insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
        }

    }//GEN-LAST:event_btnInsumosActionPerformed

    private void btnExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExistenciasActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlExistencias, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(false);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(true);
        this.pnlUpdateExistencia.setVisible(false);

        if (this.cbAreaExistencias.getSelectedIndex() == 0) {
            this.txtSearchIDinsuExist.setEnabled(false);
            this.cbBuscarStock.setEnabled(false);
            this.tblExistencias.setEnabled(false);
        }
    }//GEN-LAST:event_btnExistenciasActionPerformed

    private void btnCaducidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCaducidadesActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlCaducidades, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(false);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(true);

        pere.cargaPerecederos(tbl_caducidades);
    }//GEN-LAST:event_btnCaducidadesActionPerformed

    private void btnRequisicionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequisicionesActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlRequisiciones, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(false);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(true);
        if (this.cbAreaRequi.getSelectedIndex() == 0) {
            this.pnlFormEditRequi.setVisible(false);
            this.txtSearchFechaRequi.setEnabled(false);
            this.btnSearchRequi.setEnabled(false);
        }

    }//GEN-LAST:event_btnRequisicionesActionPerformed

    private void btnSuministrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuministrosActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlSuministros, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(false);
        this.btnSalidas.setEnabled(true);

        if (this.cbFiltro1Sumi.getSelectedIndex() == 0) {
            this.btnSearchF2Sumi2.setEnabled(false);
            this.btnSearchF1Sumi.setEnabled(false);
            this.txtFiltro1Sumi.setEnabled(false);
            this.cbFiltro2Sumi.setEnabled(false);
            this.txtFiltro2Sumi.setEnabled(false);
        }
        sumi.cargaSuministros(tbl_sumi);
    }//GEN-LAST:event_btnSuministrosActionPerformed

    private void btnSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalidasActionPerformed
        this.rSPanelsSlider1.slidPanel(20, pnlSalidas, RSPanelsSlider.direct.Right);
        this.lblImageLogo.setEnabled(true);
        this.btnInsumos.setEnabled(true);
        this.btnExistencias.setEnabled(true);
        this.btnCaducidades.setEnabled(true);
        this.btnRequisiciones.setEnabled(true);
        this.btnSuministros.setEnabled(true);
        this.btnSalidas.setEnabled(false);

        if (this.cbAreaSalidas.getSelectedIndex() == 0) {
            this.txtCodigoSalidas.setEnabled(false);
            this.txtCantidadSalidas.setEnabled(false);
            this.btnDevolver.setEnabled(false);
            this.btnGuardarSalidas.setEnabled(false);
        }

    }//GEN-LAST:event_btnSalidasActionPerformed

    private void btnGuardarSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarSalidasActionPerformed
        String area = this.cbAreaSalidas.getSelectedItem().toString();
        int area2 = this.cbAreaSalidas.getSelectedIndex();
        String inicialA = null;
        String IDinsu = this.txtCodigoSalidas.getText();
        Double cantSalida = Double.parseDouble(this.txtCantidadSalidas.getText());

        switch (area2) {
            case 1:
                inicialA = "S";
                break;
            case 2:
                inicialA = "R";
                break;
            case 3:
                inicialA = "P";
                break;
            case 4:
                inicialA = "B";
                break;
            case 5:
                inicialA = "H";
                break;
            case 6:
                inicialA = "M";
                break;
            case 7:
                inicialA = "Re";
                break;
            case 8:
                inicialA = "O";
                break;
        }

        try {
            String sentencia = "SELECT ID_insumo" + inicialA + " , existencia" + inicialA + "  FROM tbl_stock" + area + " WHERE ID_insumo" + inicialA + "  = '" + IDinsu + "'";
            double cantidad = 0;
            Connection con = conexion.obConexion();
            Statement verBusqueda = conexion.crearSentencia();
            ResultSet re = verBusqueda.executeQuery(sentencia);
            if (re.next()) {
                cantidad = re.getDouble("existencia" + inicialA);
            }

            if (cantidad == 0.0) {
                JOptionPane.showMessageDialog(this, "Ya no hay existencia del insumo", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                salidas.salidaInsumo(area, inicialA, cantSalida, IDinsu);
                salidas.cargaExistNInsu(IDinsu, area, inicialA, tblNuevaExist);
                this.txtCodigoSalidas.setText("");
                this.txtCantidadSalidas.setText("");
            }
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnGuardarSalidasActionPerformed

    private void tblExistenciasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblExistenciasMouseClicked
        int fila = this.tblExistencias.getSelectedRow();
        String IDinsumoCelda = this.tblExistencias.getValueAt(fila, 1).toString();

        if (IDinsumoCelda.isEmpty()) {
            JOptionPane.showMessageDialog(this, "La celda que ha seleccionado está vacía.\n"
                   + " No se mostrará información de ningún\n"
                   + " registro en la tabla inferior.", "Información", JOptionPane.INFORMATION_MESSAGE);
        } else {
            existencia.searchInfoInsuExist(IDinsumoCelda, tblInfoInsumoExistencia);
        }
    }//GEN-LAST:event_tblExistenciasMouseClicked

    private void mbmiAdminUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiAdminUserActionPerformed
        Administracion_usuarios admin = new Administracion_usuarios(new javax.swing.JFrame(), true);
        admin.setVisible(true);
    }//GEN-LAST:event_mbmiAdminUserActionPerformed

    private void mbmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiSalirActionPerformed

        int valor = JOptionPane.showConfirmDialog(null, " ¿Está seguro de cerrar el programa?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            regSalidaUser();
            System.exit(0);
        }
    }//GEN-LAST:event_mbmiSalirActionPerformed

    private void btnDevolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDevolverActionPerformed
        String area = this.cbAreaSalidas.getSelectedItem().toString();
        int area2 = this.cbAreaSalidas.getSelectedIndex();
        String inicialA = null;
        String IDinsu = this.txtCodigoSalidas.getText();
        Double cantDevuelta = Double.parseDouble(this.txtCantidadSalidas.getText());

        switch (area2) {
            case 1:
                inicialA = "S";
                break;
            case 2:
                inicialA = "R";
                break;
            case 3:
                inicialA = "P";
                break;
            case 4:
                inicialA = "B";
                break;
            case 5:
                inicialA = "H";
                break;
            case 6:
                inicialA = "M";
                break;
            case 7:
                inicialA = "Re";
                break;
            case 8:
                inicialA = "O";
                break;
        }
        salidas.devolucionInsumo(area, inicialA, cantDevuelta, IDinsu);
        salidas.cargaExistNInsu(IDinsu, area, inicialA, tblNuevaExist);
        this.txtCodigoSalidas.setText("");
        this.txtCantidadSalidas.setText("");
    }//GEN-LAST:event_btnDevolverActionPerformed

    private void mbmiCambiarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiCambiarUserActionPerformed
        LOGIN login = new LOGIN();
        this.dispose();
        login.setVisible(true);
    }//GEN-LAST:event_mbmiCambiarUserActionPerformed

    private void mipmPrepararRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmPrepararRequiActionPerformed
        try {
            int filas = this.tbl_requisiciones.getSelectedRow();
            String idInsumo = this.tbl_requisiciones.getValueAt(filas, 0).toString();
            String idUnidad = this.tbl_requisiciones.getValueAt(filas, 1).toString();

            if (!idInsumo.isEmpty()) {
                this.txtIDinsumo_requi.setText(idInsumo);
                this.txtIDunidadM_requi.setText(idUnidad);
                this.btnValidar_requi.setVisible(true);
                this.btnUpdateRequi.setVisible(false);
            } else {
                JOptionPane.showMessageDialog(this, "La fila no contiene datos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mipmPrepararRequiActionPerformed

    private void btnValidar_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidar_requiActionPerformed
        String area = this.cbAreaRequi.getSelectedItem().toString();

        if (this.txtIDinsumo_requi.getText().isEmpty() || this.txtCantidad_requi.getText().isEmpty() || this.txtIDunidadM_requi.getText().isEmpty()
               || this.txtIDPersonal_requi.getText().isEmpty() || this.dateSolicitud_requi.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Existen campos vacíos. Los datos son obligatorios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (requi.validarNumerosRequi(txtIDunidadM_requi.getText()) && requi.validarNumerosRequi(txtIDPersonal_requi.getText())) {
                String idInsu = this.txtIDinsumo_requi.getText();
                Date fecha = this.dateSolicitud_requi.getDate();
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fechaSolicitud = formato.format(fecha);
                Double cantidad = Double.parseDouble(this.txtCantidad_requi.getText());
                int idUnidad = Integer.parseInt(this.txtIDunidadM_requi.getText());
                int idPerson = Integer.parseInt(this.txtIDPersonal_requi.getText());
                switch (area) {
                    case "Servicio":
                        requi.registrarRequiServicio(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Restaurante":
                        requi.registrarRequiRestaurante(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Personal":
                        requi.registrarRequiPersonal(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Bar":
                        requi.registrarRequiBar(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Habitacion":
                        requi.registrarRequiHabitacion(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Mantenimiento":
                        requi.registrarRequiMantenimiento(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Recepcion":
                        requi.registrarRequiRecepcion(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                    case "Otros":
                        requi.registrarRequiOtros(idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
                        vaciarCamposRequi();
                        break;
                }

            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnValidar_requiActionPerformed

    public void vaciarCamposRequi() {
        this.txtIDinsumo_requi.setText("");
        this.txtCantidad_requi.setText("");
        this.txtIDunidadM_requi.setText("");
        this.txtIDPersonal_requi.setText("");
    }

    private void btnCancel_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancel_requiActionPerformed
        this.txtIDinsumo_requi.setText("");
        this.txtCantidad_requi.setText("");
        this.txtIDunidadM_requi.setText("");

    }//GEN-LAST:event_btnCancel_requiActionPerformed

    private void mipmEditarRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmEditarRequiActionPerformed
        this.pnlFormEditRequi.setVisible(true);
        this.btnValidar_requi.setVisible(false);

        try {
            int filas = this.tbl_requisiciones.getSelectedRow();
            String idRequi = this.tbl_requisiciones.getValueAt(filas, 0).toString();
            String idInsumo = this.tbl_requisiciones.getValueAt(filas, 1).toString();
            String cantidad = this.tbl_requisiciones.getValueAt(filas, 2).toString();
            String idUnidad = this.tbl_requisiciones.getValueAt(filas, 3).toString();
            String idPersonal = this.tbl_requisiciones.getValueAt(filas, 4).toString();
            //Date fecha = this.tbl_requisiciones.getValueAt(filas, 5);

            if (!idInsumo.isEmpty()) {
                this.lblIDrequi.setText(idRequi);
                this.txtIDinsumo_requi.setText(idInsumo);
                this.txtCantidad_requi.setText(cantidad);
                this.txtIDunidadM_requi.setText(idUnidad);
                this.txtIDPersonal_requi.setText(idPersonal);
                //this.dateSolicitud_requi.setDate(fecha);
                this.btnUpdateRequi.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "La fila no contiene datos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado ninguna fila", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_mipmEditarRequiActionPerformed

    private void btnUpdateRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateRequiActionPerformed
        String nombreArea = null;
        String iniArea = null;
        int area = this.cbAreaRequi.getSelectedIndex();

        if (this.txtIDinsumo_requi.getText().isEmpty() || this.txtCantidad_requi.getText().isEmpty() || this.txtIDunidadM_requi.getText().isEmpty()
               || this.txtIDPersonal_requi.getText().isEmpty() || this.dateSolicitud_requi.getDate().equals("")) {
            JOptionPane.showMessageDialog(this, "Existen campos vacíos. Los datos son obligatorios.", "Advertencia", JOptionPane.WARNING_MESSAGE);
        } else {
            if (requi.validarNumerosRequi(txtIDunidadM_requi.getText()) && requi.validarNumerosRequi(txtIDPersonal_requi.getText())) {
                int idRequi = Integer.parseInt(this.lblIDrequi.getText());
                String idInsu = this.txtIDinsumo_requi.getText();
                Date fecha = this.dateSolicitud_requi.getDate();
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fechaSolicitud = formato.format(fecha);
                Double cantidad = Double.parseDouble(this.txtCantidad_requi.getText());
                int idUnidad = Integer.parseInt(this.txtIDunidadM_requi.getText());
                int idPerson = Integer.parseInt(this.txtIDPersonal_requi.getText());

                switch (area) {
                    case 1:
                        nombreArea = "servicio";
                        iniArea = "S";
                        break;
                    case 2:
                        nombreArea = "restaurante";
                        iniArea = "R";
                        break;
                    case 3:
                        nombreArea = "personal";
                        iniArea = "P";
                        break;
                    case 4:
                        nombreArea = "bar";
                        iniArea = "B";
                        break;
                    case 5:
                        nombreArea = "habitaciones";
                        iniArea = "H";
                        break;
                    case 6:
                        nombreArea = "mantenimiento";
                        iniArea = "M";
                        break;
                    case 7:
                        nombreArea = "recepcion";
                        iniArea = "RE";
                        break;
                    case 8:
                        nombreArea = "otros";
                        iniArea = "O";
                        break;
                }
                requi.actualizarRequiArea(nombreArea, iniArea, idRequi, idInsu, cantidad, idUnidad, idPerson, fechaSolicitud);
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnUpdateRequiActionPerformed

    private void btnSolicitarRequi_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSolicitarRequi_requiActionPerformed
        Envio_requisicion envioRequi = new Envio_requisicion(new javax.swing.JFrame(), true);
        envioRequi.setVisible(true);

    }//GEN-LAST:event_btnSolicitarRequi_requiActionPerformed

    private void btnGenerarDocu_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarDocu_requiActionPerformed
        try {

            int indexArea = this.cbAreaRequi.getSelectedIndex();
            if (this.dateSolicitud_requi.getDate() == null) {
                JOptionPane.showMessageDialog(this, "Para generar el documento de requisición,\n"
                       + "necesita especificar la fecha en que registró\n"
                       + "requisiciones nuevas.\n\n"
                       + "Especifique la fecha en el campo 'Fecha de Solicitud',\n"
                       + "después dé clic en Generar documento.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            } else {
                Date fecha1 = this.dateSolicitud_requi.getDate();
                DateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                String fecha = formato.format(fecha1);
                Map parametros = new HashMap();
                parametros.put("fechaSolicitud", fecha);
                switch (indexArea) {
                    case 1:
                        String direccion1 = "src\\reportes_requisiciones\\Requisicion_servicio.jasper";
                        generarReportesSinParams(direccion1);
                        break;
                    case 2:
                        String direccion2 = "src\\reportes_requisiciones\\Requisicion_restaurante.jasper";
                        generarReportesSinParams(direccion2);
                        break;
                    case 3:
                        String direccion3 = "src\\reportes_requisiciones\\Requisicion_personal.jasper";
                        generarReportesSinParams(direccion3);
                        break;
                    case 4:
                        String direccion4 = "src\\reportes_requisiciones\\Requisicion_bar.jasper";
                        generarReportesSinParams(direccion4);
                        break;
                    case 5:
                        String direccion5 = "src\\reportes_requisiciones\\Requisicion_habitaciones.jasper";
                        generarReportesSinParams(direccion5);
                        break;
                    case 6:
                        String direccion6 = "src\\reportes_requisiciones\\Requisicion_mantenimiento.jasper";
                        generarReportesSinParams(direccion6);
                        break;
                    case 7:
                        String direccion7 = "src\\reportes_requisiciones\\Requisicion_recepcion.jasper";
                        generarReportesSinParams(direccion7);
                        break;
                    case 8:
                        String direccion8 = "src\\reportes_requisiciones\\Requisicion_otros.jasper";
                        generarReportesSinParams(direccion8);
                        break;
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarDocu_requiActionPerformed

    private void tbl_requisicionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_requisicionesMouseClicked
        int fila = this.tbl_requisiciones.getSelectedRow();
        String IDinsumoCelda = null;

        if (this.tbl_requisiciones.getColumnCount() == 6) {
            IDinsumoCelda = this.tbl_requisiciones.getValueAt(fila, 1).toString();
            if (IDinsumoCelda.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La celda que ha seleccionado está vacía.\n"
                       + " No se mostrará información de ningún\n"
                       + " registro en la tabla inferior.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                requi.mostrarInfInsumo(IDinsumoCelda, tbl_infInsuRequi);
            }
        } else if (this.tbl_requisiciones.getColumnCount() == 2) {
            IDinsumoCelda = this.tbl_requisiciones.getValueAt(fila, 0).toString();
            if (IDinsumoCelda.isEmpty()) {
                JOptionPane.showMessageDialog(this, "La celda que ha seleccionado está vacía.\n"
                       + " No se mostrará información de ningún\n"
                       + " registro en la tabla inferior.", "Información", JOptionPane.INFORMATION_MESSAGE);
            } else {
                requi.mostrarInfInsumo(IDinsumoCelda, tbl_infInsuRequi);
            }
        }
    }//GEN-LAST:event_tbl_requisicionesMouseClicked

    private void mipmEliminar_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmEliminar_insumoActionPerformed
        int fila = this.tbl_insumo.getSelectedRow();
        String idInsumo = this.tbl_insumo.getValueAt(fila, 0).toString();
        int valor = JOptionPane.showConfirmDialog(null, " ¿Está seguro de eliminar el insumo?\n\n"
               + "Al eliminar el insumo del inventario general,\n"
               + "también será eliminado de la tabla de existencias\n"
               + "del área donde pertenece.", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            insumo.eliminarInsumo(idInsumo);
            JOptionPane.showMessageDialog(this, "EL insumo se ha eliminado con éxito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_mipmEliminar_insumoActionPerformed

    private void mipmEditarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmEditarInsumoActionPerformed
        Edicion_insumos edicion = new Edicion_insumos(new javax.swing.JFrame(), true);
        insumo.cargarInsumoEdicionTabla(tbl_insumo, edicion.txtIDinsumoEdit, edicion.txtNombreInsuEdit, edicion.cbTipoInsuEdit,
               edicion.txtaDescripInsuEdit, edicion.txtUnitInsuEdit, edicion.txtTotalInsuEdit, edicion.txtaComentInsuEdit);
        edicion.txtIDinsumoEdit.setEnabled(false);
        edicion.btnUpdateInsumoIzquierda.setVisible(false);
        edicion.btnUpdateInsuEditDerecho.setVisible(true);
        edicion.lblEncabezado.setText("Actualización de datos de insumo");
        edicion.setTitle("Actualización de insumo");
        edicion.setVisible(true);
    }//GEN-LAST:event_mipmEditarInsumoActionPerformed

    private void mipmActualizarExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmActualizarExistenciaActionPerformed
        this.pnlUpdateExistencia.setVisible(true);
        int filas = this.tblExistencias.getSelectedRow();
        String id = this.tblExistencias.getValueAt(filas, 1).toString();
        String existencias = this.tblExistencias.getValueAt(filas, 2).toString();
        String stock = this.tblExistencias.getValueAt(filas, 3).toString();
        String idUnidad = this.tblExistencias.getValueAt(filas, 4).toString();

        this.lblID.setText(id);
        this.txtExistencia.setText(existencias);
        this.txtStockMin.setText(stock);
        this.txtUnidadM.setText(idUnidad);
    }//GEN-LAST:event_mipmActualizarExistenciaActionPerformed

    private void btnUpdateExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateExistenciaActionPerformed
        if (this.txtExistencia.getText().isEmpty() || this.txtStockMin.getText().isEmpty() || this.txtUnidadM.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            String idInsu = this.lblID.getText();
            Double existenciaN = Double.parseDouble(this.txtExistencia.getText());
            Double stockN = Double.parseDouble(this.txtStockMin.getText());
            int idUnidad = Integer.parseInt(this.txtUnidadM.getText());

            int area = this.cbAreaExistencias.getSelectedIndex();
            String nomArea = this.cbAreaExistencias.getSelectedItem().toString();
            String iniArea = null;

            switch (area) {
                case 1:
                    iniArea = "S";
                    break;
                case 2:
                    iniArea = "R";
                    break;
                case 3:
                    iniArea = "P";
                    break;
                case 4:
                    iniArea = "B";
                    break;
                case 5:
                    iniArea = "H";
                    break;
                case 6:
                    iniArea = "M";
                    break;
                case 7:
                    iniArea = "Re";
                    break;
                case 8:
                    iniArea = "O";
                    break;
            }
            existencia.actualizarExistenciaGeneral(nomArea, iniArea, idInsu, existenciaN, stockN, idUnidad);
            JOptionPane.showMessageDialog(this, "EL insumo se ha actualizado con éxito", "Mensaje", JOptionPane.PLAIN_MESSAGE);
            this.pnlUpdateExistencia.setVisible(false);
        }
    }//GEN-LAST:event_btnUpdateExistenciaActionPerformed

    private void btnCerrarUpdateExistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarUpdateExistenciaActionPerformed
        this.lblID.setText("");
        this.txtExistencia.setText("");
        this.txtStockMin.setText("");
        this.txtUnidadM.setText("");
        this.pnlUpdateExistencia.setVisible(false);
    }//GEN-LAST:event_btnCerrarUpdateExistenciaActionPerformed

    private void mbmiEnvioRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiEnvioRequiActionPerformed
        Envio_requisicion envio = new Envio_requisicion(new javax.swing.JFrame(), true);
        envio.setVisible(true);
    }//GEN-LAST:event_mbmiEnvioRequiActionPerformed

    private void btnActualizarTblInsumosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarTblInsumosActionPerformed
        this.cbAreaInsumo.setSelectedIndex(0);
        insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
    }//GEN-LAST:event_btnActualizarTblInsumosActionPerformed

    private void btnBuscarInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarInsumoActionPerformed
        if (!this.txtNombreInsumo.getText().isEmpty()) {
            String idInsumo = this.txtNombreInsumo.getText();
            insumo.searchXid(idInsumo, tbl_insumo, lblCantRegistrosInsumos);
        } else {
            insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
        }
    }//GEN-LAST:event_btnBuscarInsumoActionPerformed

    private void cbAreaInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaInsumoActionPerformed
        String area = this.cbAreaInsumo.getSelectedItem().toString();
        String iArea = null;

        if (area.equals("Seleccione área")) {
            insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
        } else {
            switch (area) {
                case "Servicio":
                    iArea = "S";
                    break;
                case "Restaurante":
                    iArea = "R";
                    break;
                case "Personal":
                    iArea = "P";
                    break;
                case "Bar":
                    iArea = "B";
                    break;
                case "Habitaciones":
                    iArea = "H";
                    break;
                case "Mantenimiento":
                    iArea = "M";
                    break;
                case "Recepción":
                    iArea = "RE";
                    break;
                case "Otros":
                    iArea = "O";
                    break;
            }
            insumo.filtroArea(iArea, tbl_insumo, lblCantRegistrosInsumos);
        }

    }//GEN-LAST:event_cbAreaInsumoActionPerformed

    private void btnUpdateMasivaInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMasivaInsumoActionPerformed
        Edicion_insumos edicion = new Edicion_insumos(new javax.swing.JFrame(), true);
        edicion.txtIDinsumoEdit.setEnabled(true);
        edicion.btnUpdateInsuEditDerecho.setVisible(false);
        edicion.btnUpdateInsumoIzquierda.setVisible(true);
        edicion.lblEncabezado.setText("Actualización masiva de datos");
        edicion.setTitle("Actualización masiva");
        edicion.setVisible(true);
    }//GEN-LAST:event_btnUpdateMasivaInsumoActionPerformed

    private void btnGenerarReporteInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteInsumoActionPerformed
        String direccion = "src\\reportes_insumos\\Inventario_general.jasper";
        generarReportesSinParams(direccion);

    }//GEN-LAST:event_btnGenerarReporteInsumoActionPerformed

    private void txtNombreInsumoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreInsumoKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (!this.txtNombreInsumo.getText().isEmpty()) {
                String nInsumo = this.txtNombreInsumo.getText();
                insumo.searchXnombre(nInsumo, tbl_insumo, lblCantRegistrosInsumos);
            } else {
                insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
            }
        }
    }//GEN-LAST:event_txtNombreInsumoKeyPressed

    private void cbAreaExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaExistenciasActionPerformed
        int area = this.cbAreaExistencias.getSelectedIndex();
        String nomArea = this.cbAreaExistencias.getSelectedItem().toString();
        String iniArea = null;

        if (!(area == 0)) {
            this.txtSearchIDinsuExist.setEnabled(true);
            this.cbBuscarStock.setEnabled(true);
            this.tblExistencias.setEnabled(true);

            switch (area) {
                case 1:
                    iniArea = "S";
                    break;
                case 2:
                    iniArea = "R";
                    break;
                case 3:
                    iniArea = "P";
                    break;
                case 4:
                    iniArea = "B";
                    break;
                case 5:
                    iniArea = "H";
                    break;
                case 6:
                    iniArea = "M";
                    break;
                case 7:
                    iniArea = "Re";
                    break;
                case 8:
                    iniArea = "O";
                    break;
            }
            existencia.cargaRegExistencias(nomArea, iniArea, tblExistencias, tblExistencias, cbAreaExistencias);
        } else {
            this.txtSearchIDinsuExist.setEnabled(false);
            this.cbBuscarStock.setEnabled(false);
            this.tblExistencias.setEnabled(false);
            String columnas[] = {"--", "--", "--", "--", "--"};
            String columna[] = {"--", "--", "--", "--"};
            String datos[][] = {};
            DefaultTableModel tablaExis = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 6) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            this.tblExistencias.setModel(tablaExis);
            DefaultTableModel tablaInfInsumo = new DefaultTableModel(datos, columna) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 4) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            this.tblInfoInsumoExistencia.setModel(tablaInfInsumo);
        }

    }//GEN-LAST:event_cbAreaExistenciasActionPerformed

    private void txtSearchIDinsuExistKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchIDinsuExistKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String IDinsu = this.txtSearchIDinsuExist.getText();
            String nomArea = this.cbAreaExistencias.getSelectedItem().toString();
            int area = this.cbAreaExistencias.getSelectedIndex();
            String iniArea = null;

            switch (area) {
                case 1:
                    iniArea = "S";
                    break;
                case 2:
                    iniArea = "R";
                    break;
                case 3:
                    iniArea = "P";
                    break;
                case 4:
                    iniArea = "B";
                    break;
                case 5:
                    iniArea = "H";
                    break;
                case 6:
                    iniArea = "M";
                    break;
                case 7:
                    iniArea = "Re";
                    break;
                case 8:
                    iniArea = "O";
                    break;
            }
            existencia.busquedaIDexist(nomArea, IDinsu, iniArea, tblExistencias, tblExistencias, cbAreaExistencias);

        }

    }//GEN-LAST:event_txtSearchIDinsuExistKeyPressed

    private void cbBuscarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarStockActionPerformed
        int stock = this.cbBuscarStock.getSelectedIndex();
        String nomArea = this.cbAreaExistencias.getSelectedItem().toString();
        int area = this.cbAreaExistencias.getSelectedIndex();
        String iniArea = null;

        switch (area) {
            case 1:
                iniArea = "S";
                break;
            case 2:
                iniArea = "R";
                break;
            case 3:
                iniArea = "P";
                break;
            case 4:
                iniArea = "B";
                break;
            case 5:
                iniArea = "H";
                break;
            case 6:
                iniArea = "M";
                break;
            case 7:
                iniArea = "Re";
                break;
            case 8:
                iniArea = "O";
                break;
        }
        switch (stock) {
            case 0:
                this.txtSearchIDinsuExist.setEnabled(true);
                break;

            case 1:
                this.txtSearchIDinsuExist.setEnabled(false);
                existencia.busquedaStockMinExist(nomArea, iniArea, tblExistencias, tblExistencias, cbAreaExistencias);
                break;

            case 2:
                this.txtSearchIDinsuExist.setEnabled(false);
                existencia.busquedaExistActiva(nomArea, iniArea, tblExistencias, tblExistencias, cbAreaExistencias);
                break;
        }
    }//GEN-LAST:event_cbBuscarStockActionPerformed

    private void btnGenerarRepExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRepExistActionPerformed

        int area = this.cbAreaExistencias.getSelectedIndex();
        int stock = this.cbBuscarStock.getSelectedIndex();
        switch (area) {
            case 1:
                switch (stock) {
                    case 0:
                        String d10 = "src\\reportes_existencias\\Exist_servicio.jasper";
                        generarReportesSinParams(d10);
                        break;
                    case 1:
                        String d11 = "src\\reportes_existencias\\StockMin_servicio.jasper";
                        generarReportesSinParams(d11);
                        break;
                    case 2:
                        String d12 = "src\\reportes_existencias\\StockAct_servicio.jasper";
                        generarReportesSinParams(d12);
                        break;
                }
                break;
            case 2:
                switch (stock) {
                    case 0:
                        String d20 = "src\\reportes_existencias\\Exist_restaurante.jasper";
                        generarReportesSinParams(d20);
                        break;
                    case 1:
                        String d21 = "src\\reportes_existencias\\StockMin_restaurante.jasper";
                        generarReportesSinParams(d21);
                        break;
                    case 2:
                        String d22 = "src\\reportes_existencias\\StockAct_restaurante.jasper";
                        generarReportesSinParams(d22);
                        break;
                }
                break;
            case 3:
                switch (stock) {
                    case 0:
                        String d30 = "src\\reportes_existencias\\Exist_personal.jasper";
                        generarReportesSinParams(d30);
                        break;
                    case 1:
                        String d31 = "src\\reportes_existencias\\StockMin_personal.jasper";
                        generarReportesSinParams(d31);
                        break;
                    case 2:
                        String d32 = "src\\reportes_existencias\\StockAct_personal.jasper";
                        generarReportesSinParams(d32);
                        break;
                }
                break;
            case 4:
                switch (stock) {
                    case 0:
                        String d40 = "src\\reportes_existencias\\Exist_bar.jasper";
                        generarReportesSinParams(d40);
                        break;
                    case 1:
                        String d41 = "src\\reportes_existencias\\StockMin_bar.jasper";
                        generarReportesSinParams(d41);
                        break;
                    case 2:
                        String d42 = "src\\reportes_existencias\\StockAct_bar.jasper";
                        generarReportesSinParams(d42);
                        break;
                }
                break;
            case 5:
                switch (stock) {
                    case 0:
                        String d50 = "src\\reportes_existencias\\Exist_habitaciones.jasper";
                        generarReportesSinParams(d50);
                        break;
                    case 1:
                        String d51 = "src\\reportes_existencias\\StockMin_habitaciones.jasper";
                        generarReportesSinParams(d51);
                        break;
                    case 2:
                        String d52 = "src\\reportes_existencias\\StockAct_habitaciones.jasper";
                        generarReportesSinParams(d52);
                        break;
                }
                break;
            case 6:
                switch (stock) {
                    case 0:
                        String d60 = "src\\reportes_existencias\\Exist_mantenimiento.jasper";
                        generarReportesSinParams(d60);
                        break;
                    case 1:
                        String d61 = "src\\reportes_existencias\\StockMin_mantenimiento.jasper";
                        generarReportesSinParams(d61);
                        break;
                    case 2:
                        String d62 = "src\\reportes_existencias\\StockAct_mantenimiento.jasper";
                        generarReportesSinParams(d62);
                        break;
                }
                break;
            case 7:
                switch (stock) {
                    case 0:
                        String d70 = "src\\reportes_existencias\\Exist_recepcion.jasper";
                        generarReportesSinParams(d70);
                        break;
                    case 1:
                        String d71 = "src\\reportes_existencias\\StockMin_recepcion.jasper";
                        generarReportesSinParams(d71);
                        break;
                    case 2:
                        String d72 = "src\\reportes_existencias\\StockAct_recepcion.jasper";
                        generarReportesSinParams(d72);
                        break;
                }
                break;
            case 8:
                switch (stock) {
                    case 0:
                        String d80 = "src\\reportes_existencias\\Exist_otros.jasper";
                        generarReportesSinParams(d80);
                        break;
                    case 1:
                        String d81 = "src\\reportes_existencias\\StockMin_otros.jasper";
                        generarReportesSinParams(d81);
                        break;
                    case 2:
                        String d82 = "src\\reportes_existencias\\StockAct_otros.jasper";
                        generarReportesSinParams(d82);
                        break;
                }
                break;
        }
        if (area == 0) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un área", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarRepExistActionPerformed

    private void txtCaducosDiasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaducosDiasCaretUpdate
        if (this.txtCaducosDias.getText().isEmpty()) {
            this.txtCaducosMeses.setEnabled(true);
            this.txtFechaDisCaduco.setEnabled(true);
            pere.cargaPerecederos(tbl_caducidades);
        } else {
            this.txtCaducosMeses.setEnabled(false);
            this.txtFechaDisCaduco.setEnabled(false);
        }
    }//GEN-LAST:event_txtCaducosDiasCaretUpdate

    private void txtCaducosMesesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaducosMesesCaretUpdate
        if (this.txtCaducosMeses.getText().isEmpty()) {
            this.txtCaducosDias.setEnabled(true);
            this.txtFechaDisCaduco.setEnabled(true);
            pere.cargaPerecederos(tbl_caducidades);
        } else {
            this.txtCaducosDias.setEnabled(false);
            this.txtFechaDisCaduco.setEnabled(false);
        }
    }//GEN-LAST:event_txtCaducosMesesCaretUpdate

    private void txtFechaDisCaducoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFechaDisCaducoCaretUpdate
        if (this.txtFechaDisCaduco.getText().isEmpty()) {
            this.txtCaducosDias.setEnabled(true);
            this.txtCaducosMeses.setEnabled(true);
            pere.cargaPerecederos(tbl_caducidades);
        } else {
            this.txtCaducosDias.setEnabled(false);
            this.txtCaducosMeses.setEnabled(false);
        }
    }//GEN-LAST:event_txtFechaDisCaducoCaretUpdate

    private void btnSearchCaducosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCaducosActionPerformed
        String dias = this.txtCaducosDias.getText();
        String meses = this.txtCaducosMeses.getText();
        String fechaEspecifica = this.txtFechaDisCaduco.getText();
        String iArea = this.cbBusquedaIniPere.getSelectedItem().toString();

        try {
            if (!(this.txtCaducosDias.getText().isEmpty())) {
                if (pere.validarNumeros(dias)) {
                    int intDias = Integer.parseInt(dias);
                    if (iArea.equals("Seleccione inicial")) {
                        pere.caducadosDias(intDias, tbl_caducidades);
                    } else {
                        pere.caducadosDiasXarea(intDias, iArea, tbl_caducidades);
                    }
                    pere.infoDias(intDias, lblInfoBusqueda1);
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (!(this.txtCaducosMeses.getText().isEmpty())) {
                if (pere.validarNumeros(meses)) {
                    int intMeses = Integer.parseInt(meses);
                    if (iArea.equals("Seleccione inicial")) {
                        pere.caducadosMeses(intMeses, tbl_caducidades);
                    } else {
                        pere.caducadosMesesXarea(intMeses, iArea, tbl_caducidades);
                    }
                    pere.infoMeses(intMeses, lblInfoBusqueda2);
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (!(this.txtFechaDisCaduco.getText().isEmpty())) {
                if (iArea.equals("Seleccione inicial")) {
                    pere.caducadosFechaEspecific(fechaEspecifica, tbl_caducidades);
                } else {
                    pere.caducadosFechaEspecificXarea(fechaEspecifica, iArea, tbl_caducidades);
                }
                pere.infoFecha(fechaEspecifica, lblInfoBusqueda3);
            } else if ((this.txtCaducosDias.getText().isEmpty()) && (this.txtCaducosMeses.getText().isEmpty())
                   && (this.txtFechaDisCaduco.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "No ha ingresado valor en ninguno\n"
                       + "de los campos de búsqueda", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchCaducosActionPerformed

    private void btnGenerarRepCaducosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRepCaducosActionPerformed

        try {

            if (!(this.txtCaducosDias.getText().isEmpty())) {
                int dia = Integer.parseInt(this.txtCaducosDias.getText());
                Connection con = conexion.obConexion2();
                Map parametroDia = new HashMap();
                parametroDia.put("dia", dia);
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_perecederos\\CaducadosDias.jasper");
                JasperPrint jp = JasperFillManager.fillReport(jr, parametroDia, con);
                JasperViewer view = new JasperViewer(jp, false);
                view.setVisible(true);
                conexion.cerrarConexion2();
            } else if ((!this.txtCaducosMeses.getText().isEmpty())) {
                int mesPositivo = Integer.parseInt(this.txtCaducosMeses.getText());
                Connection con = conexion.obConexion2();
                Map parametroMes = new HashMap();
                parametroMes.put("mesPositivo", mesPositivo);
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_perecederos\\CaducadosMeses.jasper");
                JasperPrint jp = JasperFillManager.fillReport(jr, parametroMes, con);
                JasperViewer view = new JasperViewer(jp, false);
                view.setVisible(true);
                conexion.cerrarConexion2();
            } else if (!(this.txtFechaDisCaduco.getText().isEmpty())) {
                String fecha = this.txtFechaDisCaduco.getText();
                Connection con = conexion.obConexion2();
                Map parametroFecha = new HashMap();
                parametroFecha.put("fecha", fecha);
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_perecederos\\Caducados_fecha.jasper");
                JasperPrint jp = JasperFillManager.fillReport(jr, parametroFecha, con);
                JasperViewer view = new JasperViewer(jp, false);
                view.setVisible(true);
                conexion.cerrarConexion2();
            } else {
                String direccion = "src\\reportes_perecederos\\TodoReg_perecederos.jasper";
                generarReportesSinParams(direccion);
            }

        } catch (NumberFormatException | JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGenerarRepCaducosActionPerformed

    private void cbAreaRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaRequiActionPerformed
        int area = this.cbAreaRequi.getSelectedIndex();
        String nombreArea = null;
        String iniArea = null;

        if (area == 0) {
            this.pnlFormEditRequi.setVisible(false);
            this.mipmEditarRequi.setEnabled(false);
            this.mipmEliminarRequi.setEnabled(false);
            this.mipmPrepararRequi.setEnabled(false);
            this.txtSearchFechaRequi.setEnabled(false);
            this.btnSearchRequi.setEnabled(false);
            String columnas[] = {"--", "--", "--", "--", "--", "--"};
            String columnas1[] = {"--", "--", "--", "--"};
            String datos[][] = {};
            DefaultTableModel tablaRequi = new DefaultTableModel(datos, columnas) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 6) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            this.tbl_requisiciones.setModel(tablaRequi);
            DefaultTableModel tablaInfInsumo = new DefaultTableModel(datos, columnas1) {
                @Override
                public boolean isCellEditable(int filas, int columnas) {
                    if (columnas == 4) {
                        return true;
                    } else {
                        return false;
                    }
                }
            };
            this.tbl_infInsuRequi.setModel(tablaInfInsumo);
        } else if (area == 1 || area == 2 || area == 3 || area == 4 || area == 5 || area == 6 || area == 7 || area == 8) {
            switch (area) {
                case 1:
                    nombreArea = "servicio";
                    iniArea = "S";
                    break;
                case 2:
                    nombreArea = "restaurante";
                    iniArea = "R";
                    break;
                case 3:
                    nombreArea = "personal";
                    iniArea = "P";
                    break;
                case 4:
                    nombreArea = "bar";
                    iniArea = "B";
                    break;
                case 5:
                    nombreArea = "habitaciones";
                    iniArea = "H";
                    break;
                case 6:
                    nombreArea = "mantenimiento";
                    iniArea = "M";
                    break;
                case 7:
                    nombreArea = "recepcion";
                    iniArea = "RE";
                    break;
                case 8:
                    nombreArea = "otros";
                    iniArea = "O";
                    break;
            }
            requi.mostrarRequiTodos(nombreArea, iniArea, tbl_requisiciones);
            this.pnlFormEditRequi.setVisible(false);
            this.mipmEditarRequi.setEnabled(true);
            this.mipmEliminarRequi.setEnabled(true);
            this.mipmPrepararRequi.setEnabled(false);
            this.txtSearchFechaRequi.setEnabled(true);
            this.btnSearchRequi.setEnabled(true);
        }
    }//GEN-LAST:event_cbAreaRequiActionPerformed

    private void btnSearchRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchRequiActionPerformed
        String fecha = this.txtSearchFechaRequi.getText();
        int area = this.cbAreaRequi.getSelectedIndex();
        String nombreArea = null;
        String iniArea = null;

        switch (area) {
            case 1:
                nombreArea = "servicio";
                iniArea = "S";
                break;
            case 2:
                nombreArea = "restaurante";
                iniArea = "R";
                break;
            case 3:
                nombreArea = "personal";
                iniArea = "P";
                break;
            case 4:
                nombreArea = "bar";
                iniArea = "B";
                break;
            case 5:
                nombreArea = "habitaciones";
                iniArea = "H";
                break;
            case 6:
                nombreArea = "mantenimiento";
                iniArea = "M";
                break;
            case 7:
                nombreArea = "recepcion";
                iniArea = "RE";
                break;
            case 8:
                nombreArea = "otros";
                iniArea = "O";
                break;
        }
        requi.busquedaFechaRequi(fecha, nombreArea, iniArea, tbl_requisiciones);
    }//GEN-LAST:event_btnSearchRequiActionPerformed

    private void btnMostarInsu_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostarInsu_requiActionPerformed
        String area = this.cbAreaRequi.getSelectedItem().toString();
        String iniArea = null;

        switch (area) {
            case "Servicio":
                iniArea = "S";
                break;
            case "Restaurante":
                iniArea = "R";
                break;
            case "Personal":
                iniArea = "P";
                break;
            case "Bar":
                iniArea = "B";
                break;
            case "Habitacion":
                iniArea = "H";
                break;
            case "Mantenimiento":
                iniArea = "M";
                break;
            case "Recepcion":
                iniArea = "Re";
                break;
            case "Otros":
                iniArea = "O";
                break;
        }

        if (area.equals("Seleccione área")) {
            JOptionPane.showMessageDialog(this, "No ha seleccionado un área", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
        } else {
            requi.mostrarInsuRequisicion(area, iniArea, tbl_requisiciones);
            this.mipmPrepararRequi.setEnabled(true);
            this.mipmEditarRequi.setEnabled(false);
            this.mipmEliminarRequi.setEnabled(false);
            this.pnlFormEditRequi.setVisible(true);
            this.btnUpdateRequi.setVisible(false);
        }

    }//GEN-LAST:event_btnMostarInsu_requiActionPerformed

    private void cbFiltro1SumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbFiltro1SumiActionPerformed
        int opcion = this.cbFiltro1Sumi.getSelectedIndex();

        switch (opcion) {
            case 0:
                this.btnSearchF2Sumi2.setEnabled(false);
                this.btnSearchF1Sumi.setEnabled(false);
                this.txtFiltro1Sumi.setEnabled(false);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnReporteSumi.setEnabled(false);
                break;
            case 1:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                this.btnReporteSumi.setEnabled(false);
                break;
            case 2:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                this.btnReporteSumi.setEnabled(false);
                break;
            case 3:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(true);
                this.txtFiltro2Sumi.setEnabled(true);
                this.btnSearchF2Sumi2.setEnabled(true);
                this.btnReporteSumi.setEnabled(true);
                break;
            case 4:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(true);
                this.txtFiltro2Sumi.setEnabled(true);
                this.btnSearchF2Sumi2.setEnabled(true);
                this.btnReporteSumi.setEnabled(true);
                break;
            case 5:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                this.btnReporteSumi.setEnabled(true);
                break;
        }
    }//GEN-LAST:event_cbFiltro1SumiActionPerformed

    private void txtFiltro1SumiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltro1SumiCaretUpdate

        if (this.txtFiltro1Sumi.getText().isEmpty()) {
            sumi.cargaSuministros(tbl_sumi);
        }
    }//GEN-LAST:event_txtFiltro1SumiCaretUpdate

    private void btnSearchF1SumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchF1SumiActionPerformed
        int opcionCB = this.cbFiltro1Sumi.getSelectedIndex();
        String datoTXT = this.txtFiltro1Sumi.getText();

        switch (opcionCB) {
            case 1:
                if (sumi.validarNumeros(datoTXT)) {
                    int idSumi = Integer.parseInt(datoTXT);
                    sumi.busquedaIDsumi(idSumi, tbl_sumi);
                } else {
                    JOptionPane.showMessageDialog(this, "La selección del filtro sólo permite\n"
                           + "números por el tipo de dato.\n"
                           + "Por favor, ingrese dato numérico.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
                break;
            case 2:
                sumi.busquedaIDinsu(datoTXT, tbl_sumi);
                break;
            case 3:
                sumi.busquedaNinsu(datoTXT, tbl_sumi);
                break;
            case 4:
                sumi.busquedaTinsu(datoTXT, tbl_sumi);
                break;
            case 5:
                sumi.busquedaFechaEntinsu(datoTXT, tbl_sumi);
                break;
        }
    }//GEN-LAST:event_btnSearchF1SumiActionPerformed

    private void btnSearchF2Sumi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchF2Sumi2ActionPerformed
        String datoTXT = this.txtFiltro1Sumi.getText();
        int opcionCB2 = this.cbFiltro2Sumi.getSelectedIndex();
        String datoTXT2 = this.txtFiltro2Sumi.getText();
        if (opcionCB2 == 1) {

            if (this.cbFiltro1Sumi.getSelectedIndex() == 3) {
                sumi.busqueda2FILTROnomFECH(datoTXT, datoTXT2, tbl_sumi);
            } else if (this.cbFiltro1Sumi.getSelectedIndex() == 4) {
                sumi.busqueda2FILTROtipoFECH(datoTXT, datoTXT2, tbl_sumi);
            }
        } else {
            JOptionPane.showMessageDialog(this, "No ha seleccionado una opción de filtro #2", "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchF2Sumi2ActionPerformed

    private void btnIngresarSumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSumiActionPerformed
        Ingreso_suministros ingreso = new Ingreso_suministros(new javax.swing.JFrame(), true);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnIngresarSumiActionPerformed

    private void btnReporteSumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteSumiActionPerformed
        try {
            Connection con;
            JasperReport jr;
            JasperPrint jp;
            JasperViewer view;
            int filtro1 = this.cbFiltro1Sumi.getSelectedIndex();
            int filtro2 = this.cbFiltro2Sumi.getSelectedIndex();
            String txtFiltro2 = this.txtFiltro2Sumi.getText();
            String txtFiltro1 = this.txtFiltro1Sumi.getText();

            switch (filtro1) {
                case 0:
                    String direccion = "src\\reportes_suministros\\TodoSumi.jasper";
                    generarReportesSinParams(direccion);
                    break;
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    if (!(filtro2 == 0 && txtFiltro2.isEmpty())) {
                        con = conexion.obConexion2();
                        Map<String, Object> parametros = new HashMap<String, Object>();
                        parametros.put("nombreInsu", txtFiltro1);
                        parametros.put("fechaEntre", txtFiltro2);

                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_suministros\\NombreFechaInsu.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                    } else {
                        JOptionPane.showMessageDialog(this, "No ha seleccionado opción de búsqueda\n"
                               + "en el filtro #2 y el campo de texto del\n"
                               + "filtro #2 está vacío. No es permitido generar\n"
                               + "reporte sólo por el nombre de insumo.\n"
                               + "Para generar reporte con este dato, necesita\n"
                               + "seleccionar una opción de búsqueda en filtro #2\n"
                               + "e ingresar el valor solicitado en el campo del filtro #2.", "Advertencia", JOptionPane.WARNING_MESSAGE);
                    }
                    break;
                case 4:
                    if ((filtro2 == 0 || filtro2 == 1) && txtFiltro2.isEmpty()) {
                        con = conexion.obConexion2();
                        Map parametroTipo = new HashMap();
                        parametroTipo.put("tipoInsumo", txtFiltro1);
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_suministros\\TipoSumi.jasper");
                        jp = JasperFillManager.fillReport(jr, parametroTipo, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                    } else if (filtro2 == 1 && txtFiltro2.length() > 0) {
                        con = conexion.obConexion2();
                        Map<String, Object> parametros = new HashMap<String, Object>();
                        parametros.put("tipoInsumo", txtFiltro1);
                        parametros.put("dateEntrega", txtFiltro2);
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_suministros\\TipoFechaInsu.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                    }
                    break;
                case 5:
                    con = conexion.obConexion2();
                    Map parametroFecha = new HashMap();
                    parametroFecha.put("fechaEntrega", txtFiltro1);
                    jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_suministros\\FechaSumi.jasper");
                    jp = JasperFillManager.fillReport(jr, parametroFecha, con);
                    view = new JasperViewer(jp, false);
                    view.setVisible(true);
                    conexion.cerrarConexion2();
                    break;
            }
        } catch (HeadlessException | JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnReporteSumiActionPerformed

    private void cbAreaSalidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaSalidasActionPerformed
        int area = this.cbAreaSalidas.getSelectedIndex();

        try {
            if (!(area == 0)) {
                this.txtCodigoSalidas.setEnabled(true);
                this.txtCantidadSalidas.setEnabled(true);
                this.btnDevolver.setEnabled(true);
                this.btnGuardarSalidas.setEnabled(true);
            } else {
                this.txtCodigoSalidas.setEnabled(false);
                this.txtCantidadSalidas.setEnabled(false);
                this.btnDevolver.setEnabled(false);
                this.btnGuardarSalidas.setEnabled(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error con la aplicación..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_cbAreaSalidasActionPerformed

    private void btnBuscarIDSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDSalidaActionPerformed
        String area = this.cbAreaSalidas.getSelectedItem().toString();
        int area2 = this.cbAreaSalidas.getSelectedIndex();
        String inicialA = null;
        String IDinsu = this.txtCodigoSalidas.getText();

        switch (area2) {
            case 1:
                inicialA = "S";
                break;
            case 2:
                inicialA = "R";
                break;
            case 3:
                inicialA = "P";
                break;
            case 4:
                inicialA = "B";
                break;
            case 5:
                inicialA = "H";
                break;
            case 6:
                inicialA = "M";
                break;
            case 7:
                inicialA = "Re";
                break;
            case 8:
                inicialA = "O";
                break;
        }
        salidas.cargaRegInsu(IDinsu, area, inicialA, tblExistActual);
        salidas.cargaIDunidad(IDinsu, area, inicialA, tblUnidadSalidas);
    }//GEN-LAST:event_btnBuscarIDSalidaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Panel_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Panel_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarTblInsumos;
    private javax.swing.JButton btnBuscarIDSalida;
    private javax.swing.JButton btnBuscarInsumo;
    public RSMaterialComponent.RSButtonFormaIcon btnCaducidades;
    private RSMaterialComponent.RSButtonIconOne btnCancel_requi;
    private RSMaterialComponent.RSButtonIconOne btnCerrarUpdateExistencia;
    private rojeru_san.rsbutton.RSButtonForma btnDevolver;
    public RSMaterialComponent.RSButtonFormaIcon btnExistencias;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarDocu_requi;
    private javax.swing.JButton btnGenerarRepCaducos;
    private javax.swing.JButton btnGenerarRepExist;
    private javax.swing.JButton btnGenerarReporteInsumo;
    private rojeru_san.rsbutton.RSButtonForma btnGuardarSalidas;
    private javax.swing.JButton btnIngresarSumi;
    public RSMaterialComponent.RSButtonFormaIcon btnInsumos;
    private javax.swing.JButton btnMostarInsu_requi;
    private javax.swing.JButton btnReporteSumi;
    private RSMaterialComponent.RSButtonFormaIcon btnRequisiciones;
    private RSMaterialComponent.RSButtonFormaIcon btnSalidas;
    private javax.swing.JButton btnSearchCaducos;
    private javax.swing.JButton btnSearchF1Sumi;
    private javax.swing.JButton btnSearchF2Sumi2;
    private javax.swing.JButton btnSearchRequi;
    public RSMaterialComponent.RSButtonFormaIcon btnSolicitarRequi_requi;
    public RSMaterialComponent.RSButtonFormaIcon btnSuministros;
    private RSMaterialComponent.RSButtonIconOne btnUpdateExistencia;
    private javax.swing.JButton btnUpdateMasivaInsumo;
    private RSMaterialComponent.RSButtonIconOne btnUpdateRequi;
    private RSMaterialComponent.RSButtonIconOne btnValidar_requi;
    private javax.swing.JComboBox<String> cbAreaExistencias;
    private javax.swing.JComboBox<String> cbAreaInsumo;
    private javax.swing.JComboBox<String> cbAreaRequi;
    private javax.swing.JComboBox<String> cbAreaSalidas;
    private javax.swing.JComboBox<String> cbBuscarStock;
    private javax.swing.JComboBox<String> cbBusquedaIniPere;
    private javax.swing.JComboBox<String> cbFiltro1Sumi;
    private javax.swing.JComboBox<String> cbFiltro2Sumi;
    private com.toedter.calendar.JDateChooser dateSolicitud_requi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JLabel lblCantRegistrosInsumos;
    private javax.swing.JLabel lblCantidad_requi;
    private javax.swing.JLabel lblFechaSolicitud_requi;
    private javax.swing.JLabel lblID;
    private javax.swing.JLabel lblIDinsu_requi;
    private javax.swing.JLabel lblIDpersonal_requi;
    private javax.swing.JLabel lblIDrequi;
    private javax.swing.JLabel lblIDunidadM_requi;
    private necesario.RSLabelImage lblImageLogo;
    private javax.swing.JLabel lblInfoBusqueda1;
    private javax.swing.JLabel lblInfoBusqueda2;
    private javax.swing.JLabel lblInfoBusqueda3;
    private javax.swing.JMenu mbMainHerramientas;
    public javax.swing.JMenuItem mbmiAdminUser;
    private javax.swing.JMenuItem mbmiCambiarUser;
    public javax.swing.JMenuItem mbmiEnvioRequi;
    private javax.swing.JMenuItem mbmiSalir;
    private javax.swing.JMenuItem mipmActualizarExistencia;
    private javax.swing.JMenuItem mipmEditarInsumo;
    private javax.swing.JMenuItem mipmEditarRequi;
    private javax.swing.JMenuItem mipmEliminarRequi;
    private javax.swing.JMenuItem mipmEliminar_insumo;
    private javax.swing.JMenuItem mipmPrepararRequi;
    private javax.swing.JPopupMenu pmTbl_existencias;
    private javax.swing.JPopupMenu pmTbl_insumo;
    private javax.swing.JPopupMenu pmTbl_requi;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCaducidades;
    private javax.swing.JPanel pnlExistencias;
    private javax.swing.JPanel pnlFormEditRequi;
    private javax.swing.JPanel pnlInsumos;
    private javax.swing.JPanel pnlRequisiciones;
    private javax.swing.JPanel pnlSalidas;
    private javax.swing.JPanel pnlSuministros;
    private javax.swing.JPanel pnlUpdateExistencia;
    private javax.swing.JPanel pnlWelcome;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTable tblExistActual;
    private javax.swing.JTable tblExistencias;
    private javax.swing.JTable tblInfoInsumoExistencia;
    private javax.swing.JTable tblNuevaExist;
    private javax.swing.JTable tblUnidadSalidas;
    private javax.swing.JTable tbl_caducidades;
    private javax.swing.JTable tbl_infInsuRequi;
    private javax.swing.JTable tbl_insumo;
    private javax.swing.JTable tbl_requisiciones;
    private javax.swing.JTable tbl_sumi;
    private javax.swing.JTextField txtCaducosDias;
    private javax.swing.JTextField txtCaducosMeses;
    private javax.swing.JTextField txtCantidadSalidas;
    private javax.swing.JTextField txtCantidad_requi;
    private javax.swing.JTextField txtCodigoSalidas;
    private javax.swing.JTextField txtExistencia;
    private javax.swing.JTextField txtFechaDisCaduco;
    private javax.swing.JTextField txtFiltro1Sumi;
    private javax.swing.JTextField txtFiltro2Sumi;
    private javax.swing.JTextField txtIDPersonal_requi;
    private javax.swing.JTextField txtIDinsumo_requi;
    private javax.swing.JTextField txtIDunidadM_requi;
    private javax.swing.JTextField txtNombreInsumo;
    private javax.swing.JTextField txtSearchFechaRequi;
    private javax.swing.JTextField txtSearchIDinsuExist;
    private javax.swing.JTextField txtStockMin;
    private javax.swing.JTextField txtUnidadM;
    // End of variables declaration//GEN-END:variables
}
