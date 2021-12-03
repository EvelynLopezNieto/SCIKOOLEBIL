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

    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));

    ResultSet re = null;
    ResultSetMetaData rM = null;
    int nColumnas = 0;
    Object[] datosTabla;

    public Panel_principal() {
        initComponents();
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
        txtFiltro1Sumi = new RSMaterialComponent.RSTextFieldOne();
        txtFiltro2Sumi = new RSMaterialComponent.RSTextFieldOne();
        btnSearchF1Sumi = new RSMaterialComponent.RSButtonIconOne();
        btnSearchF2Sumi2 = new RSMaterialComponent.RSButtonIconOne();
        cbFiltro1Sumi = new RSMaterialComponent.RSComboBox();
        cbFiltro2Sumi = new RSMaterialComponent.RSComboBox();
        btnReporteSumi = new RSMaterialComponent.RSButtonFormaIcon();
        btnIngresarSumi = new RSMaterialComponent.RSButtonFormaIcon();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        pnlCaducidades = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_caducidades = new javax.swing.JTable();
        txtCaducosDias = new RSMaterialComponent.RSTextFieldOne();
        btnSearchCaducos = new RSMaterialComponent.RSButtonIconOne();
        jLabel5 = new javax.swing.JLabel();
        txtCaducosMeses = new RSMaterialComponent.RSTextFieldOne();
        btnGenerarRepCaducos = new RSMaterialComponent.RSButtonFormaIcon();
        txtFechaDisCaduco = new RSMaterialComponent.RSTextFieldOne();
        lblInfoBusqueda1 = new javax.swing.JLabel();
        lblInfoBusqueda2 = new javax.swing.JLabel();
        lblInfoBusqueda3 = new javax.swing.JLabel();
        cbBusquedaIniPere = new RSMaterialComponent.RSComboBox();
        jLabel7 = new javax.swing.JLabel();
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
        cbAreaRequi = new RSMaterialComponent.RSComboBox();
        btnMostrarInsu_requi = new rojeru_san.rsbutton.RSButtonForma();
        jLabel6 = new javax.swing.JLabel();
        rSTextFieldOne1 = new RSMaterialComponent.RSTextFieldOne();
        rSButtonIconOne1 = new RSMaterialComponent.RSButtonIconOne();
        jLabel14 = new javax.swing.JLabel();
        pnlInsumos = new javax.swing.JPanel();
        jScrollPane10 = new javax.swing.JScrollPane();
        tbl_insumo = new javax.swing.JTable();
        btnGenerarReporteInsumo = new RSMaterialComponent.RSButtonFormaIcon();
        txtNombreInsumo = new RSMaterialComponent.RSTextFieldOne();
        btnBuscarIDinsumo = new RSMaterialComponent.RSButtonIconOne();
        jLabel1 = new javax.swing.JLabel();
        cbAreaInsumo = new RSMaterialComponent.RSComboBox();
        jLabel15 = new javax.swing.JLabel();
        lblCantRegistrosInsumos = new javax.swing.JLabel();
        btnUpdateMasivaInsumo = new RSMaterialComponent.RSButtonFormaIcon();
        pnlExistencias = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblExistencias = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        cbAreaExistencias = new RSMaterialComponent.RSComboBox();
        txtSearchIDinsuExist = new RSMaterialComponent.RSTextFieldOne();
        cbBuscarStock = new RSMaterialComponent.RSComboBox();
        jScrollPane7 = new javax.swing.JScrollPane();
        tblInfoInsumoExistencia = new javax.swing.JTable();
        btnGenerarRepExist = new RSMaterialComponent.RSButtonFormaIcon();
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
        pnlSalidas = new javax.swing.JPanel();
        cbAreaSalidas = new RSMaterialComponent.RSComboBox();
        txtCodigoSalidas = new RSMaterialComponent.RSTextFieldOne();
        txtCantidadSalidas = new RSMaterialComponent.RSTextFieldOne();
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
        jPanel2 = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnInsumos = new RSMaterialComponent.RSButtonFormaIcon();
        btnExistencias = new RSMaterialComponent.RSButtonFormaIcon();
        btnCaducidades = new RSMaterialComponent.RSButtonFormaIcon();
        btnRequisiciones = new RSMaterialComponent.RSButtonFormaIcon();
        btnSuministros = new RSMaterialComponent.RSButtonFormaIcon();
        btnSalidas = new RSMaterialComponent.RSButtonFormaIcon();
        lblImageLogo = new necesario.RSLabelImage();
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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel2.setText("Historial de suministros");
        pnlSuministros.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 2, -1, -1));

        txtFiltro1Sumi.setForeground(new java.awt.Color(0, 0, 0));
        txtFiltro1Sumi.setBorderColor(new java.awt.Color(153, 204, 0));
        txtFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro1Sumi.setPlaceholder("Ingrese dato a buscar");
        txtFiltro1Sumi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltro1SumiCaretUpdate(evt);
            }
        });
        pnlSuministros.add(txtFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 250, 30));

        txtFiltro2Sumi.setForeground(new java.awt.Color(0, 0, 0));
        txtFiltro2Sumi.setBorderColor(new java.awt.Color(153, 204, 0));
        txtFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro2Sumi.setPlaceholder("yyyy-MM-dd");
        pnlSuministros.add(txtFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 188, 250, 30));

        btnSearchF1Sumi.setBackground(new java.awt.Color(153, 204, 0));
        btnSearchF1Sumi.setBackgroundHover(new java.awt.Color(0, 102, 255));
        btnSearchF1Sumi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnSearchF1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, 35, 35));

        btnSearchF2Sumi2.setBackground(new java.awt.Color(153, 204, 0));
        btnSearchF2Sumi2.setBackgroundHover(new java.awt.Color(0, 102, 204));
        btnSearchF2Sumi2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnSearchF2Sumi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF2Sumi2ActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF2Sumi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 185, 35, 35));

        cbFiltro1Sumi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione filtro", "ID suministro", "ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega" }));
        cbFiltro1Sumi.setColorArrow(new java.awt.Color(153, 204, 0));
        cbFiltro1Sumi.setColorFondo(new java.awt.Color(153, 204, 0));
        cbFiltro1Sumi.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbFiltro1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltro1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(cbFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cbFiltro2Sumi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione filtro", "Fecha entrega" }));
        cbFiltro2Sumi.setColorArrow(new java.awt.Color(153, 204, 0));
        cbFiltro2Sumi.setColorFondo(new java.awt.Color(153, 204, 0));
        cbFiltro2Sumi.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pnlSuministros.add(cbFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        btnReporteSumi.setBackground(new java.awt.Color(153, 204, 0));
        btnReporteSumi.setText("Generar reporte");
        btnReporteSumi.setBackgroundHover(new java.awt.Color(0, 102, 204));
        btnReporteSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReporteSumi.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnReporteSumi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReporteSumi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteSumi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        btnReporteSumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteSumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnReporteSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 185, 200, 35));

        btnIngresarSumi.setBackground(new java.awt.Color(153, 204, 0));
        btnIngresarSumi.setText("Ingresar suministros");
        btnIngresarSumi.setBackgroundHover(new java.awt.Color(0, 102, 204));
        btnIngresarSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnIngresarSumi.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnIngresarSumi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnIngresarSumi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnIngresarSumi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.ARCHIVE);
        btnIngresarSumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarSumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnIngresarSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 140, 200, 35));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro de búsqueda #1");
        pnlSuministros.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtro de búsqueda #2 (búsqueda avanzada)");
        pnlSuministros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

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

        txtCaducosDias.setForeground(new java.awt.Color(0, 0, 0));
        txtCaducosDias.setBorderColor(new java.awt.Color(153, 204, 0));
        txtCaducosDias.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosDias.setPlaceholder("Tiempo D en días");
        txtCaducosDias.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosDiasCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 145, -1));

        btnSearchCaducos.setBackground(new java.awt.Color(153, 204, 0));
        btnSearchCaducos.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnSearchCaducos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnSearchCaducos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchCaducosActionPerformed(evt);
            }
        });
        pnlCaducidades.add(btnSearchCaducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Manejo de perecederos");
        pnlCaducidades.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 2, -1, -1));

        txtCaducosMeses.setForeground(new java.awt.Color(0, 0, 0));
        txtCaducosMeses.setBorderColor(new java.awt.Color(153, 204, 0));
        txtCaducosMeses.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosMeses.setPlaceholder("Tiempo D en meses");
        txtCaducosMeses.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosMesesCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 145, -1));

        btnGenerarRepCaducos.setBackground(new java.awt.Color(153, 204, 0));
        btnGenerarRepCaducos.setText("Generar reporte");
        btnGenerarRepCaducos.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnGenerarRepCaducos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarRepCaducos.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnGenerarRepCaducos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerarRepCaducos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerarRepCaducos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        btnGenerarRepCaducos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRepCaducosActionPerformed(evt);
            }
        });
        pnlCaducidades.add(btnGenerarRepCaducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 185, -1, 35));

        txtFechaDisCaduco.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaDisCaduco.setBorderColor(new java.awt.Color(153, 204, 0));
        txtFechaDisCaduco.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtFechaDisCaduco.setPlaceholder("yyyy-MM-dd");
        txtFechaDisCaduco.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFechaDisCaducoCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtFechaDisCaduco, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 145, -1));

        lblInfoBusqueda1.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda1.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda1.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 83, 300, 35));

        lblInfoBusqueda2.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda2.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda2.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 133, 350, 35));

        lblInfoBusqueda3.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        lblInfoBusqueda3.setForeground(new java.awt.Color(255, 255, 255));
        lblInfoBusqueda3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/arrow_left_15605.png"))); // NOI18N
        lblInfoBusqueda3.setText("Información adicional");
        pnlCaducidades.add(lblInfoBusqueda3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 183, 300, 35));

        cbBusquedaIniPere.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione inicial", "S", "R", "P", "B", "H", "M", "RE", "O" }));
        cbBusquedaIniPere.setColorArrow(new java.awt.Color(153, 204, 0));
        cbBusquedaIniPere.setColorFondo(new java.awt.Color(153, 204, 0));
        cbBusquedaIniPere.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbBusquedaIniPere.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pnlCaducidades.add(cbBusquedaIniPere, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 190, -1, -1));

        jLabel7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Filtrar por área:");
        pnlCaducidades.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 160, -1, -1));

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

        cbAreaRequi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaRequi.setColorArrow(new java.awt.Color(0, 51, 204));
        cbAreaRequi.setColorBorde(new java.awt.Color(0, 51, 204));
        cbAreaRequi.setColorFondo(new java.awt.Color(0, 51, 204));
        cbAreaRequi.setColorSeleccion(new java.awt.Color(0, 51, 204));
        cbAreaRequi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaRequi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaRequiActionPerformed(evt);
            }
        });
        pnlRequisiciones.add(cbAreaRequi, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 45, -1, -1));

        btnMostrarInsu_requi.setBackground(new java.awt.Color(0, 51, 204));
        btnMostrarInsu_requi.setText("Insumos a requisición");
        btnMostrarInsu_requi.setColorHover(new java.awt.Color(0, 153, 204));
        btnMostrarInsu_requi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnMostrarInsu_requi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarInsu_requiActionPerformed(evt);
            }
        });
        pnlRequisiciones.add(btnMostrarInsu_requi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 150, 180, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("<html>Unidades de medida:\n<p>ID\t Nombre\n<p>1\t kilogramo</p>\n<p>2\t gramo</p>\n<p>3\t litro</p>\n<p>4\t mililitro</p>\n<p>5\t pieza</p></html>");
        jLabel6.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnlRequisiciones.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 10, 180, 130));

        rSTextFieldOne1.setForeground(new java.awt.Color(0, 0, 0));
        rSTextFieldOne1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        rSTextFieldOne1.setPlaceholder("Ingrese fecha (yyyy-MM-dd)");
        pnlRequisiciones.add(rSTextFieldOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        rSButtonIconOne1.setBackground(new java.awt.Color(0, 51, 204));
        rSButtonIconOne1.setBackgroundHover(new java.awt.Color(0, 153, 204));
        rSButtonIconOne1.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        pnlRequisiciones.add(rSButtonIconOne1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, -1, -1));

        jLabel14.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Solicitud de requisiciones");
        pnlRequisiciones.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 2, -1, -1));

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

        btnGenerarReporteInsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnGenerarReporteInsumo.setText("Generar reporte");
        btnGenerarReporteInsumo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnGenerarReporteInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarReporteInsumo.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnGenerarReporteInsumo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        btnGenerarReporteInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarReporteInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnGenerarReporteInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 180, -1, -1));

        txtNombreInsumo.setBorderColor(new java.awt.Color(0, 51, 204));
        txtNombreInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtNombreInsumo.setPlaceholder("");
        txtNombreInsumo.setThemeTooltip(necesario.Global.THEMETOOLTIP.LIGHT);
        txtNombreInsumo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtNombreInsumoCaretUpdate(evt);
            }
        });
        pnlInsumos.add(txtNombreInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));

        btnBuscarIDinsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnBuscarIDinsumo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnBuscarIDinsumo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnBuscarIDinsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarIDinsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnBuscarIDinsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Inventario general de insumos");
        pnlInsumos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 5, -1, -1));

        cbAreaInsumo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitaciones", "Mantenimiento", "Recepción", "Otros" }));
        cbAreaInsumo.setColorArrow(new java.awt.Color(0, 51, 204));
        cbAreaInsumo.setColorBorde(new java.awt.Color(0, 51, 204));
        cbAreaInsumo.setColorFondo(new java.awt.Color(0, 51, 204));
        cbAreaInsumo.setColorSeleccion(new java.awt.Color(0, 51, 204));
        cbAreaInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(cbAreaInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Filtrar por área:");
        pnlInsumos.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 165, -1, -1));

        lblCantRegistrosInsumos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblCantRegistrosInsumos.setForeground(new java.awt.Color(255, 255, 255));
        lblCantRegistrosInsumos.setText("Registros:");
        pnlInsumos.add(lblCantRegistrosInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, 280, -1));

        btnUpdateMasivaInsumo.setBackground(new java.awt.Color(0, 51, 204));
        btnUpdateMasivaInsumo.setText("Actualización masiva");
        btnUpdateMasivaInsumo.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnUpdateMasivaInsumo.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnUpdateMasivaInsumo.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnUpdateMasivaInsumo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnUpdateMasivaInsumo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateMasivaInsumoActionPerformed(evt);
            }
        });
        pnlInsumos.add(btnUpdateMasivaInsumo, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 130, -1, -1));

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

        cbAreaExistencias.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaExistencias.setColorArrow(new java.awt.Color(153, 204, 0));
        cbAreaExistencias.setColorBorde(new java.awt.Color(153, 204, 0));
        cbAreaExistencias.setColorFondo(new java.awt.Color(153, 204, 0));
        cbAreaExistencias.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbAreaExistencias.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaExistencias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaExistenciasActionPerformed(evt);
            }
        });
        pnlExistencias.add(cbAreaExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, -1, -1));

        txtSearchIDinsuExist.setForeground(new java.awt.Color(0, 0, 0));
        txtSearchIDinsuExist.setBorderColor(new java.awt.Color(153, 204, 0));
        txtSearchIDinsuExist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtSearchIDinsuExist.setPlaceholder("Ingrese ID de insumo");
        txtSearchIDinsuExist.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtSearchIDinsuExistCaretUpdate(evt);
            }
        });
        pnlExistencias.add(txtSearchIDinsuExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        cbBuscarStock.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione opción", "Existencia mínima", "Existencia activa" }));
        cbBuscarStock.setColorArrow(new java.awt.Color(153, 204, 0));
        cbBuscarStock.setColorFondo(new java.awt.Color(153, 204, 0));
        cbBuscarStock.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbBuscarStock.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbBuscarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarStockActionPerformed(evt);
            }
        });
        pnlExistencias.add(cbBuscarStock, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, -1));

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

        btnGenerarRepExist.setBackground(new java.awt.Color(153, 204, 0));
        btnGenerarRepExist.setText("Generar reporte");
        btnGenerarRepExist.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarRepExist.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnGenerarRepExist.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        btnGenerarRepExist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRepExistActionPerformed(evt);
            }
        });
        pnlExistencias.add(btnGenerarRepExist, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 185, -1, 35));

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

        btnUpdateExistencia.setBackground(new java.awt.Color(153, 204, 0));
        btnUpdateExistencia.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.UPDATE);
        btnUpdateExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateExistenciaActionPerformed(evt);
            }
        });
        pnlUpdateExistencia.add(btnUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 215, -1, -1));

        btnCerrarUpdateExistencia.setBackground(new java.awt.Color(153, 204, 0));
        btnCerrarUpdateExistencia.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CLOSE);
        btnCerrarUpdateExistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarUpdateExistenciaActionPerformed(evt);
            }
        });
        pnlUpdateExistencia.add(btnCerrarUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 215, -1, -1));

        pnlExistencias.add(pnlUpdateExistencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 230, 250, 260));

        rSPanelsSlider1.add(pnlExistencias, "card4");

        pnlSalidas.setBackground(new java.awt.Color(0, 0, 51));
        pnlSalidas.setName("pnlSalidas"); // NOI18N
        pnlSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbAreaSalidas.setBackground(new java.awt.Color(255, 51, 0));
        cbAreaSalidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione área", "Servicio", "Restaurante", "Personal", "Bar", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaSalidas.setColorArrow(new java.awt.Color(153, 204, 0));
        cbAreaSalidas.setColorFondo(new java.awt.Color(153, 204, 0));
        cbAreaSalidas.setColorSeleccion(new java.awt.Color(153, 204, 0));
        cbAreaSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaSalidasActionPerformed(evt);
            }
        });
        pnlSalidas.add(cbAreaSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        txtCodigoSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoSalidas.setBorderColor(new java.awt.Color(153, 204, 0));
        txtCodigoSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCodigoSalidas.setPhColor(new java.awt.Color(0, 0, 0));
        txtCodigoSalidas.setPlaceholder("");
        txtCodigoSalidas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCodigoSalidasCaretUpdate(evt);
            }
        });
        pnlSalidas.add(txtCodigoSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        txtCantidadSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadSalidas.setBorderColor(new java.awt.Color(153, 204, 0));
        txtCantidadSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCantidadSalidas.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidadSalidas.setPlaceholder("Cantidad");
        pnlSalidas.add(txtCantidadSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 140, -1));

        btnGuardarSalidas.setBackground(new java.awt.Color(153, 204, 0));
        btnGuardarSalidas.setText("Salida");
        btnGuardarSalidas.setColorHover(new java.awt.Color(0, 102, 204));
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

        btnDevolver.setBackground(new java.awt.Color(153, 204, 0));
        btnDevolver.setText("Devolver");
        btnDevolver.setColorHover(new java.awt.Color(0, 102, 204));
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

        rSPanelsSlider1.add(pnlSalidas, "card8");

        getContentPane().add(rSPanelsSlider1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1090, 670));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlBotones.setBackground(new java.awt.Color(153, 204, 0));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        pnlBotones.add(btnInsumos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 210, 70));

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
        pnlBotones.add(btnExistencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 210, 70));

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
        pnlBotones.add(btnCaducidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 210, 70));

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
        pnlBotones.add(btnRequisiciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 210, 70));

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
        pnlBotones.add(btnSuministros, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 440, 210, 70));

        btnSalidas.setBackground(new java.awt.Color(153, 204, 0));
        btnSalidas.setText("Registrar salidas");
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
        pnlBotones.add(btnSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 510, 210, 70));

        lblImageLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil_redimensionado.png"))); // NOI18N
        lblImageLogo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblImageLogoMouseClicked(evt);
            }
        });
        pnlBotones.add(lblImageLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 35, 90, 90));

        jPanel2.add(pnlBotones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 670));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnIngresarSumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSumiActionPerformed
        Ingreso_suministros ingreso = new Ingreso_suministros(new javax.swing.JFrame(), true);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnIngresarSumiActionPerformed

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
            JOptionPane.showMessageDialog(this, "NO ha seleccionado una opción de filtro #2", "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchF2Sumi2ActionPerformed

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
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnSearchCaducosActionPerformed

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

    private void txtFiltro1SumiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltro1SumiCaretUpdate

        if (this.txtFiltro1Sumi.getText().isEmpty()) {
            sumi.cargaSuministros(tbl_sumi);
        }
    }//GEN-LAST:event_txtFiltro1SumiCaretUpdate

    private void txtCodigoSalidasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCodigoSalidasCaretUpdate
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
    }//GEN-LAST:event_txtCodigoSalidasCaretUpdate

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
            JOptionPane.showMessageDialog(this, "Ocurrio un error con la aplicación..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_cbAreaSalidasActionPerformed

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
        salidas.salidaInsumo(area, inicialA, cantSalida, IDinsu);
        salidas.cargaExistNInsu(IDinsu, area, inicialA, tblNuevaExist);
        this.txtCodigoSalidas.setText("");
        this.txtCantidadSalidas.setText("");
    }//GEN-LAST:event_btnGuardarSalidasActionPerformed

    private void cbAreaExistenciasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaExistenciasActionPerformed
        int area = this.cbAreaExistencias.getSelectedIndex();
        String nomArea = this.cbAreaExistencias.getSelectedItem().toString();

        if (!(area == 0)) {
            this.txtSearchIDinsuExist.setEnabled(true);
            this.cbBuscarStock.setEnabled(true);
            this.tblExistencias.setEnabled(true);

            existencia.cargaRegExistencias(nomArea, tblExistencias, tblExistencias, cbAreaExistencias);
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

    private void txtSearchIDinsuExistCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtSearchIDinsuExistCaretUpdate
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

    }//GEN-LAST:event_txtSearchIDinsuExistCaretUpdate

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
                Connection con = conexion.obConexion2();
                JasperReport jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_perecederos\\TodoReg_perecederos.jasper");
                JasperPrint jp = JasperFillManager.fillReport(jr, null, con);
                JasperViewer view = new JasperViewer(jp, false);
                view.setVisible(true);
                conexion.cerrarConexion2();
            }

        } catch (NumberFormatException | JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnGenerarRepCaducosActionPerformed

    private void btnGenerarRepExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRepExistActionPerformed

        try {
            Connection con;
            JasperReport jr;
            JasperPrint jp;
            JasperViewer view;
            int area = this.cbAreaExistencias.getSelectedIndex();
            int stock = this.cbBuscarStock.getSelectedIndex();

            switch (area) {
                case 1:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_servicio.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_servicio.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_servicio.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 2:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_restaurante.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_restaurante.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_restaurante.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 3:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_personal.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_personal.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_personal.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 4:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_bar.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_bar.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_bar.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 5:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_habitaciones.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_habitaciones.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_habitaciones.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 6:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_mantenimiento.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_mantenimiento.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_mantenimiento.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 7:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_recepcion.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_recepcion.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_recepcion.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
                case 8:
                    switch (stock) {
                        case 0:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\Exist_otros.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 1:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockMin_otros.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                        case 2:
                            con = conexion.obConexion2();
                            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_existencias\\StockAct_otros.jasper");
                            jp = JasperFillManager.fillReport(jr, null, con);
                            view = new JasperViewer(jp, false);
                            view.setVisible(true);
                            conexion.cerrarConexion2();
                            break;
                    }
                    break;
            }
            if (area == 0) {
                JOptionPane.showMessageDialog(this, "No ha seleccionado un área", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación al visualizar la información..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnGenerarRepExistActionPerformed

    private void mbmiAdminUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiAdminUserActionPerformed
        Administracion_usuarios admin = new Administracion_usuarios(new javax.swing.JFrame(), true);
        admin.setVisible(true);
    }//GEN-LAST:event_mbmiAdminUserActionPerformed

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
                    con = conexion.obConexion2();
                    jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_suministros\\TodoSumi.jasper");
                    jp = JasperFillManager.fillReport(jr, null, con);
                    view = new JasperViewer(jp, false);
                    view.setVisible(true);
                    conexion.cerrarConexion2();
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

    private void btnMostrarInsu_requiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarInsu_requiActionPerformed
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

    }//GEN-LAST:event_btnMostrarInsu_requiActionPerformed

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

    private void cbAreaRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAreaRequiActionPerformed
        int area = this.cbAreaRequi.getSelectedIndex();
        String nombreArea = null;
        String iniArea = null;

        if (area == 0) {
            this.pnlFormEditRequi.setVisible(false);
            this.mipmEditarRequi.setEnabled(false);
            this.mipmEliminarRequi.setEnabled(false);
            this.mipmPrepararRequi.setEnabled(false);
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
        }
    }//GEN-LAST:event_cbAreaRequiActionPerformed

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
            Connection con;
            JasperReport jr;
            JasperPrint jp;
            JasperViewer view;
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
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_servicio.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 2:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_restaurante.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 3:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_personal.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 4:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_bar.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 5:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_habitaciones.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 6:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_mantenimiento.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 7:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_recepcion.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                    case 8:
                        con = conexion.obConexion2();
                        jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_requisiciones\\Requisicion_otros.jasper");
                        jp = JasperFillManager.fillReport(jr, parametros, con);
                        view = new JasperViewer(jp, false);
                        view.setVisible(true);
                        conexion.cerrarConexion2();
                        break;
                }
            }
        } catch (JRException e) {
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

    private void txtNombreInsumoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtNombreInsumoCaretUpdate

        if (!this.txtNombreInsumo.getText().isEmpty()) {
            String nInsumo = this.txtNombreInsumo.getText();
            insumo.searchXnombre(nInsumo, tbl_insumo, lblCantRegistrosInsumos);
        } else {
            insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
        }
    }//GEN-LAST:event_txtNombreInsumoCaretUpdate

    private void btnBuscarIDinsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarIDinsumoActionPerformed
        if (!this.txtNombreInsumo.getText().isEmpty()) {
            String idInsumo = this.txtNombreInsumo.getText();
            insumo.searchXid(idInsumo, tbl_insumo, lblCantRegistrosInsumos);
        } else {
            insumo.cargarTodosInsumos(tbl_insumo, lblCantRegistrosInsumos);
        }

    }//GEN-LAST:event_btnBuscarIDinsumoActionPerformed

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

    private void mipmEliminar_insumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mipmEliminar_insumoActionPerformed
        int fila = this.tbl_insumo.getSelectedRow();
        String idInsumo = this.tbl_insumo.getValueAt(fila, 0).toString();
        int valor = JOptionPane.showConfirmDialog(null, " ¿Está seguro de eliminar el insumo?\n\n"
               + "Al eliminar el insumo del inventario general,\n"
               + "también será eliminado de la tabla de existencias\n"
               + "del área donde pertenece.", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (valor == JOptionPane.YES_OPTION) {
            insumo.eliminarInsumo(idInsumo);
            JOptionPane.showMessageDialog(this, "EL insumo se ha eliminado con éxito", "Mensaje", JOptionPane.PLAIN_MESSAGE, valido);
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

    private void btnUpdateMasivaInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateMasivaInsumoActionPerformed
        Edicion_insumos edicion = new Edicion_insumos(new javax.swing.JFrame(), true);
        edicion.txtIDinsumoEdit.setEnabled(true);
        edicion.btnUpdateInsuEditDerecho.setVisible(false);
        edicion.btnUpdateInsumoIzquierda.setVisible(true);
        edicion.lblEncabezado.setText("Actualización masiva de datos");
        edicion.setTitle("Actualización masiva");
        edicion.setVisible(true);
    }//GEN-LAST:event_btnUpdateMasivaInsumoActionPerformed

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
            JOptionPane.showMessageDialog(this, "EL insumo se ha actualizado con éxito", "Mensaje", JOptionPane.PLAIN_MESSAGE, valido);
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

    private void btnGenerarReporteInsumoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarReporteInsumoActionPerformed
        try {
            Connection con;
            JasperReport jr;
            JasperPrint jp;
            JasperViewer view;

            con = conexion.obConexion2();
            jr = (JasperReport) JRLoader.loadObjectFromFile("src\\reportes_insumos\\Inventario_general.jasper");
            jp = JasperFillManager.fillReport(jr, null, con);
            view = new JasperViewer(jp, false);
            view.setVisible(true);
            conexion.cerrarConexion2();
        } catch (JRException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error al generar el reporte..." + e, "¡ERROR!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarReporteInsumoActionPerformed

    private void mbmiEnvioRequiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbmiEnvioRequiActionPerformed
        Envio_requisicion envio = new Envio_requisicion(new javax.swing.JFrame(), true);
        envio.setVisible(true);
    }//GEN-LAST:event_mbmiEnvioRequiActionPerformed

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
    private RSMaterialComponent.RSButtonIconOne btnBuscarIDinsumo;
    public RSMaterialComponent.RSButtonFormaIcon btnCaducidades;
    private RSMaterialComponent.RSButtonIconOne btnCancel_requi;
    private RSMaterialComponent.RSButtonIconOne btnCerrarUpdateExistencia;
    private rojeru_san.rsbutton.RSButtonForma btnDevolver;
    public RSMaterialComponent.RSButtonFormaIcon btnExistencias;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarDocu_requi;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarRepCaducos;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarRepExist;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarReporteInsumo;
    private rojeru_san.rsbutton.RSButtonForma btnGuardarSalidas;
    private RSMaterialComponent.RSButtonFormaIcon btnIngresarSumi;
    public RSMaterialComponent.RSButtonFormaIcon btnInsumos;
    private rojeru_san.rsbutton.RSButtonForma btnMostrarInsu_requi;
    private RSMaterialComponent.RSButtonFormaIcon btnReporteSumi;
    private RSMaterialComponent.RSButtonFormaIcon btnRequisiciones;
    private RSMaterialComponent.RSButtonFormaIcon btnSalidas;
    private RSMaterialComponent.RSButtonIconOne btnSearchCaducos;
    private RSMaterialComponent.RSButtonIconOne btnSearchF1Sumi;
    private RSMaterialComponent.RSButtonIconOne btnSearchF2Sumi2;
    public RSMaterialComponent.RSButtonFormaIcon btnSolicitarRequi_requi;
    public RSMaterialComponent.RSButtonFormaIcon btnSuministros;
    private RSMaterialComponent.RSButtonIconOne btnUpdateExistencia;
    private RSMaterialComponent.RSButtonFormaIcon btnUpdateMasivaInsumo;
    private RSMaterialComponent.RSButtonIconOne btnUpdateRequi;
    private RSMaterialComponent.RSButtonIconOne btnValidar_requi;
    private RSMaterialComponent.RSComboBox cbAreaExistencias;
    private RSMaterialComponent.RSComboBox cbAreaInsumo;
    private RSMaterialComponent.RSComboBox cbAreaRequi;
    private RSMaterialComponent.RSComboBox cbAreaSalidas;
    private RSMaterialComponent.RSComboBox cbBuscarStock;
    private RSMaterialComponent.RSComboBox cbBusquedaIniPere;
    private RSMaterialComponent.RSComboBox cbFiltro1Sumi;
    private RSMaterialComponent.RSComboBox cbFiltro2Sumi;
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
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
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
    private RSMaterialComponent.RSButtonIconOne rSButtonIconOne1;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private RSMaterialComponent.RSTextFieldOne rSTextFieldOne1;
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
    private RSMaterialComponent.RSTextFieldOne txtCaducosDias;
    private RSMaterialComponent.RSTextFieldOne txtCaducosMeses;
    private RSMaterialComponent.RSTextFieldOne txtCantidadSalidas;
    private javax.swing.JTextField txtCantidad_requi;
    private RSMaterialComponent.RSTextFieldOne txtCodigoSalidas;
    private javax.swing.JTextField txtExistencia;
    private RSMaterialComponent.RSTextFieldOne txtFechaDisCaduco;
    private RSMaterialComponent.RSTextFieldOne txtFiltro1Sumi;
    private RSMaterialComponent.RSTextFieldOne txtFiltro2Sumi;
    private javax.swing.JTextField txtIDPersonal_requi;
    private javax.swing.JTextField txtIDinsumo_requi;
    private javax.swing.JTextField txtIDunidadM_requi;
    private RSMaterialComponent.RSTextFieldOne txtNombreInsumo;
    private RSMaterialComponent.RSTextFieldOne txtSearchIDinsuExist;
    private javax.swing.JTextField txtStockMin;
    private javax.swing.JTextField txtUnidadM;
    // End of variables declaration//GEN-END:variables
}
