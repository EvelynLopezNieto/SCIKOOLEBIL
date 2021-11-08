package interfaces_principales;

import com.mysql.jdbc.ResultSetMetaData;
import ds.desktop.notify.DesktopNotify;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import perecederos.Panel_perecederos;
import rojerusan.RSPanelsSlider;
import salidas.Panel_salidas;
import suministros.Ingreso_suministros;
import suministros.Panel_suministros;

/*
 * @author Evelyn López Nieto
 */
public class Principal extends javax.swing.JFrame {

    Panel_suministros sumi = new Panel_suministros();
    Panel_perecederos pere = new Panel_perecederos();
    Panel_salidas salidas = new Panel_salidas();

    Icon error = new ImageIcon(getClass().getResource("/recursos_graficos/6.png"));
    Icon valido = new ImageIcon(getClass().getResource("/recursos_graficos/1.png"));

    String columnas1[] = {"ID suministro", "ID insumo", "Nombre", "Tipo insumo", "Descripción", "$ unitario", "$ total",
        "Cant. Entregada", "Pérdidas", "Cant. Final", "Unidad medida", "Fecha entrega", "Comentario"};
    String columnas2[] = {"ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega", "Fecha caducidad"};
    String columnas3[] = {"ID insumo", "Nombre", "Existencia actual"};
    String columnas4[] = {"ID unidad", "Tipo unidad", "Nombre unidad", "Abrev. unidad"};
    String columnas5[] = {"ID insumo", "Nombre", "Nueva existencia", "Unidad medida"};
    String datos[][] = {};
    
    DefaultTableModel tablaExistsNuevo = new DefaultTableModel(datos, columnas5) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };

    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.pnlWelcome.setVisible(true);
        notificadosCaducar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rSPanelsSlider1 = new rojerusan.RSPanelsSlider();
        pnlWelcome = new javax.swing.JPanel();
        rSPanelImage1 = new rojerusan.RSPanelImage();
        jLabel1 = new javax.swing.JLabel();
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
        cbReporte = new RSMaterialComponent.RSComboBox();
        jLabel6 = new javax.swing.JLabel();
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
        pnlInsumos = new javax.swing.JPanel();
        pnlExistencias = new javax.swing.JPanel();
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
        btnEscanerCodigo = new RSMaterialComponent.RSButtonIconOne();
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
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Principal - SCIKo'olebil");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelsSlider1.setBackground(new java.awt.Color(255, 255, 255));

        pnlWelcome.setBackground(new java.awt.Color(0, 0, 51));
        pnlWelcome.setName("pnlWelcome"); // NOI18N
        pnlWelcome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSPanelImage1.setImagen(new javax.swing.ImageIcon(getClass().getResource("/recursos_graficos/rediseno_logoKoolebil.png"))); // NOI18N
        pnlWelcome.add(rSPanelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 100, 350, 350));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Berlin Sans FB", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("¡BIENVENIDO!");
        pnlWelcome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(385, 520, -1, -1));

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
        txtFiltro1Sumi.setBorderColor(new java.awt.Color(255, 0, 102));
        txtFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro1Sumi.setPlaceholder("Ingrese dato a buscar");
        txtFiltro1Sumi.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtFiltro1SumiCaretUpdate(evt);
            }
        });
        pnlSuministros.add(txtFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 188, 250, 30));

        txtFiltro2Sumi.setForeground(new java.awt.Color(0, 0, 0));
        txtFiltro2Sumi.setBorderColor(new java.awt.Color(255, 0, 102));
        txtFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtFiltro2Sumi.setPlaceholder("yyyy-MM-dd");
        pnlSuministros.add(txtFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 188, 250, 30));

        btnSearchF1Sumi.setBackground(new java.awt.Color(255, 0, 102));
        btnSearchF1Sumi.setBackgroundHover(new java.awt.Color(0, 204, 0));
        btnSearchF1Sumi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnSearchF1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 185, 35, 35));

        btnSearchF2Sumi2.setBackground(new java.awt.Color(255, 0, 102));
        btnSearchF2Sumi2.setBackgroundHover(new java.awt.Color(0, 204, 0));
        btnSearchF2Sumi2.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.SEARCH);
        btnSearchF2Sumi2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchF2Sumi2ActionPerformed(evt);
            }
        });
        pnlSuministros.add(btnSearchF2Sumi2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 185, 35, 35));

        cbFiltro1Sumi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione filtro", "ID suministro", "ID insumo", "Nombre insumo", "Tipo insumo", "Fecha entrega" }));
        cbFiltro1Sumi.setColorArrow(new java.awt.Color(255, 0, 102));
        cbFiltro1Sumi.setColorFondo(new java.awt.Color(255, 0, 102));
        cbFiltro1Sumi.setColorSeleccion(new java.awt.Color(255, 0, 102));
        cbFiltro1Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbFiltro1Sumi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbFiltro1SumiActionPerformed(evt);
            }
        });
        pnlSuministros.add(cbFiltro1Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, -1, -1));

        cbFiltro2Sumi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione filtro", "Fecha entrega" }));
        cbFiltro2Sumi.setColorArrow(new java.awt.Color(255, 0, 102));
        cbFiltro2Sumi.setColorFondo(new java.awt.Color(255, 0, 102));
        cbFiltro2Sumi.setColorSeleccion(new java.awt.Color(255, 0, 102));
        cbFiltro2Sumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        pnlSuministros.add(cbFiltro2Sumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, -1, -1));

        btnReporteSumi.setBackground(new java.awt.Color(255, 0, 102));
        btnReporteSumi.setText("Generar reporte");
        btnReporteSumi.setBackgroundHover(new java.awt.Color(0, 204, 0));
        btnReporteSumi.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnReporteSumi.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnReporteSumi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnReporteSumi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnReporteSumi.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        pnlSuministros.add(btnReporteSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 185, 200, 35));

        btnIngresarSumi.setBackground(new java.awt.Color(255, 0, 102));
        btnIngresarSumi.setText("Ingresar suministros");
        btnIngresarSumi.setBackgroundHover(new java.awt.Color(0, 204, 0));
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
        pnlSuministros.add(btnIngresarSumi, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 80, 200, 35));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Filtro de búsqueda #1");
        pnlSuministros.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Filtro de búsqueda #2 (búsqueda avanzada)");
        pnlSuministros.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, -1, -1));

        cbReporte.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione opción", "Todos los registros", "Búsqueda filtro #1", "Búsqueda filtro #1+#2" }));
        cbReporte.setColorArrow(new java.awt.Color(255, 0, 102));
        cbReporte.setColorFondo(new java.awt.Color(255, 0, 102));
        cbReporte.setColorSeleccion(new java.awt.Color(255, 0, 102));
        pnlSuministros.add(cbReporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 145, -1, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Opciones de reporte:");
        pnlSuministros.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 120, -1, -1));

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
        txtCaducosDias.setBorderColor(new java.awt.Color(0, 153, 0));
        txtCaducosDias.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosDias.setPlaceholder("Tiempo D en días");
        txtCaducosDias.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosDiasCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 145, -1));

        btnSearchCaducos.setBackground(new java.awt.Color(0, 153, 0));
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
        txtCaducosMeses.setBorderColor(new java.awt.Color(0, 153, 0));
        txtCaducosMeses.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        txtCaducosMeses.setPlaceholder("Tiempo D en meses");
        txtCaducosMeses.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCaducosMesesCaretUpdate(evt);
            }
        });
        pnlCaducidades.add(txtCaducosMeses, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 145, -1));

        btnGenerarRepCaducos.setBackground(new java.awt.Color(0, 153, 0));
        btnGenerarRepCaducos.setText("Generar reporte");
        btnGenerarRepCaducos.setBackgroundHover(new java.awt.Color(0, 153, 204));
        btnGenerarRepCaducos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnGenerarRepCaducos.setForma(RSMaterialComponent.RSButtonFormaIcon.FORMA.ROUND);
        btnGenerarRepCaducos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGenerarRepCaducos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnGenerarRepCaducos.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.FOLDER);
        pnlCaducidades.add(btnGenerarRepCaducos, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 185, -1, 35));

        txtFechaDisCaduco.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaDisCaduco.setBorderColor(new java.awt.Color(0, 153, 0));
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
        cbBusquedaIniPere.setColorArrow(new java.awt.Color(0, 153, 0));
        cbBusquedaIniPere.setColorFondo(new java.awt.Color(0, 153, 0));
        cbBusquedaIniPere.setColorSeleccion(new java.awt.Color(0, 153, 0));
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
        rSPanelsSlider1.add(pnlRequisiciones, "card6");

        pnlInsumos.setBackground(new java.awt.Color(0, 0, 51));
        pnlInsumos.setName("pnlInsumos"); // NOI18N
        pnlInsumos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rSPanelsSlider1.add(pnlInsumos, "card3");

        pnlExistencias.setBackground(new java.awt.Color(0, 0, 51));
        pnlExistencias.setName("pnlExistencias"); // NOI18N
        pnlExistencias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        rSPanelsSlider1.add(pnlExistencias, "card4");

        pnlSalidas.setBackground(new java.awt.Color(0, 0, 51));
        pnlSalidas.setName("pnlSalidas"); // NOI18N
        pnlSalidas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbAreaSalidas.setBackground(new java.awt.Color(255, 51, 0));
        cbAreaSalidas.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione área", "Personal", "Habitacion", "Mantenimiento", "Recepcion", "Otros" }));
        cbAreaSalidas.setColorArrow(new java.awt.Color(255, 51, 0));
        cbAreaSalidas.setColorFondo(new java.awt.Color(255, 51, 0));
        cbAreaSalidas.setColorSeleccion(new java.awt.Color(255, 51, 0));
        cbAreaSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        cbAreaSalidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAreaSalidasActionPerformed(evt);
            }
        });
        pnlSalidas.add(cbAreaSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 10, -1, -1));

        txtCodigoSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigoSalidas.setBorderColor(new java.awt.Color(0, 0, 0));
        txtCodigoSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCodigoSalidas.setPhColor(new java.awt.Color(0, 0, 0));
        txtCodigoSalidas.setPlaceholder("Ingresar código");
        txtCodigoSalidas.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtCodigoSalidasCaretUpdate(evt);
            }
        });
        pnlSalidas.add(txtCodigoSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, -1, -1));

        txtCantidadSalidas.setForeground(new java.awt.Color(0, 0, 0));
        txtCantidadSalidas.setBorderColor(new java.awt.Color(0, 0, 0));
        txtCantidadSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtCantidadSalidas.setPhColor(new java.awt.Color(0, 0, 0));
        txtCantidadSalidas.setPlaceholder("Cantidad");
        pnlSalidas.add(txtCantidadSalidas, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 140, -1));

        btnGuardarSalidas.setBackground(new java.awt.Color(255, 51, 0));
        btnGuardarSalidas.setText("Salida");
        btnGuardarSalidas.setColorHover(new java.awt.Color(255, 153, 0));
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
        jLabel8.setText("Código del insumo:");
        pnlSalidas.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 55, -1, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Cantidad a utilizar o devolver:");
        pnlSalidas.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 55, -1, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unidad de medida del insumo:");
        pnlSalidas.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 55, -1, -1));

        btnDevolver.setBackground(new java.awt.Color(255, 51, 0));
        btnDevolver.setText("Devolver");
        btnDevolver.setColorHover(new java.awt.Color(255, 153, 0));
        btnDevolver.setFont(new java.awt.Font("Comic Sans MS", 0, 16)); // NOI18N
        btnDevolver.setForma(rojeru_san.rsbutton.RSButtonForma.FORMA.ROUND);
        pnlSalidas.add(btnDevolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 290, 130, -1));

        btnEscanerCodigo.setBackground(new java.awt.Color(255, 51, 0));
        btnEscanerCodigo.setToolTipText("");
        btnEscanerCodigo.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnEscanerCodigo.setIcons(rojeru_san.efectos.ValoresEnum.ICONS.CAMERA_ALT);
        pnlSalidas.add(btnEscanerCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 80, -1, -1));

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

        pnlBotones.setBackground(new java.awt.Color(255, 255, 0));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInsumos.setBackground(new java.awt.Color(255, 255, 0));
        btnInsumos.setForeground(new java.awt.Color(0, 0, 0));
        btnInsumos.setText("Insumos");
        btnInsumos.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnInsumos.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnInsumos.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnInsumos.setForegroundText(new java.awt.Color(0, 0, 0));
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

        btnExistencias.setBackground(new java.awt.Color(255, 255, 0));
        btnExistencias.setText("Existencias");
        btnExistencias.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnExistencias.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnExistencias.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnExistencias.setForegroundText(new java.awt.Color(0, 0, 0));
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

        btnCaducidades.setBackground(new java.awt.Color(255, 255, 0));
        btnCaducidades.setText("Perecederos");
        btnCaducidades.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnCaducidades.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnCaducidades.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnCaducidades.setForegroundText(new java.awt.Color(0, 0, 0));
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

        btnRequisiciones.setBackground(new java.awt.Color(255, 255, 0));
        btnRequisiciones.setText("Requisiciones");
        btnRequisiciones.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnRequisiciones.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnRequisiciones.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnRequisiciones.setForegroundText(new java.awt.Color(0, 0, 0));
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

        btnSuministros.setBackground(new java.awt.Color(255, 255, 0));
        btnSuministros.setText("Suministros");
        btnSuministros.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnSuministros.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSuministros.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnSuministros.setForegroundText(new java.awt.Color(0, 0, 0));
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

        btnSalidas.setBackground(new java.awt.Color(255, 255, 0));
        btnSalidas.setText("Registrar salidas");
        btnSalidas.setBackgroundHover(new java.awt.Color(255, 153, 0));
        btnSalidas.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        btnSalidas.setForegroundIcon(new java.awt.Color(0, 0, 0));
        btnSalidas.setForegroundText(new java.awt.Color(0, 0, 0));
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

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void notificadosCaducar() {
        try {
            ResultSet res = pere.notifyCaducadosDias();
            String numCaducados = null;
            while (res.next()) {
                numCaducados = (res.getString("Notificados_caducar"));
            }
            DesktopNotify.showDesktopMessage("Notificación de caducados", "Según la revisión de inventarios, existen " + numCaducados + ""
                   + " insumos perecederos totales que están por caducar entre hoy y las próximas 4 semanas. Para ver cuáles son,"
                   + " vaya a la pestaña de perecederos y realice la búsqueda.", DesktopNotify.INFORMATION);

        } catch (SQLException e) {
            DesktopNotify.showDesktopMessage("Error de consulta de perecederos", "Ocurrió un error con la apliación, por lo tanto,"
                   + " no se puede mostrar el total de caducados de los próximos 15 días..." + e, DesktopNotify.ERROR);
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
        this.tbl_caducidades.setModel(tablaPere);

        try {
            ResultSet re = pere.cargaPerecederos();
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();

            Object[] datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaPere.addRow(datosTabla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
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
        this.tbl_sumi.setModel(tablaSumi);

        try {

            ResultSet re = sumi.cargaSuministros();
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();

            Object[] datosTabla = new Object[nColumnas];

            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaSumi.addRow(datosTabla);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar suministros..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnSuministrosActionPerformed

    private void btnIngresarSumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarSumiActionPerformed
        Ingreso_suministros ingreso = new Ingreso_suministros(new javax.swing.JFrame(), true);
        ingreso.setVisible(true);
    }//GEN-LAST:event_btnIngresarSumiActionPerformed

    private void btnSearchF1SumiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchF1SumiActionPerformed
        int opcionCB = this.cbFiltro1Sumi.getSelectedIndex();
        String datoTXT = this.txtFiltro1Sumi.getText();

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
        this.tbl_sumi.setModel(tablaSumi);

        try {
            ResultSet re = null;
            ResultSetMetaData rS = null;
            int nColumnas = 0;
            Object[] datosTabla = null;

            switch (opcionCB) {
                case 1:
                    if (sumi.validarNumeros(datoTXT)) {
                        int idSumi = Integer.parseInt(datoTXT);
                        re = sumi.busquedaIDsumi(idSumi);
                        rS = (ResultSetMetaData) re.getMetaData();
                        nColumnas = rS.getColumnCount();
                        datosTabla = new Object[nColumnas];
                        while (re.next()) {
                            for (int i = 0; i < nColumnas; i++) {
                                datosTabla[i] = re.getObject(i + 1);
                            }
                            tablaSumi.addRow(datosTabla);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "La selección del filtro sólo permite\n"
                               + "números por el tipo de dato.\n"
                               + "Por favor, ingrese dato numérico.", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                    }
                    break;

                case 2:
                    re = sumi.busquedaIDinsu(datoTXT);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                    break;
                case 3:
                    re = sumi.busquedaNinsu(datoTXT);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                    break;
                case 4:
                    re = sumi.busquedaTinsu(datoTXT);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                    break;
                case 5:
                    re = sumi.busquedaFechaEntinsu(datoTXT);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                    break;
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnSearchF1SumiActionPerformed

    private void btnSearchF2Sumi2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchF2Sumi2ActionPerformed
        String datoTXT = this.txtFiltro1Sumi.getText();
        int opcionCB2 = this.cbFiltro2Sumi.getSelectedIndex();
        String datoTXT2 = this.txtFiltro2Sumi.getText();

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
        this.tbl_sumi.setModel(tablaSumi);

        try {
            ResultSet re = null;
            ResultSetMetaData rS = null;
            int nColumnas = 0;
            Object[] datosTabla = null;

            if (opcionCB2 == 1) {

                if (this.cbFiltro1Sumi.getSelectedIndex() == 3) {
                    re = sumi.busqued2FILTROnomFECH(datoTXT, datoTXT2);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                } else if (this.cbFiltro1Sumi.getSelectedIndex() == 4) {
                    re = sumi.busqueda2FILTROtipoFECH(datoTXT, datoTXT2);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaSumi.addRow(datosTabla);
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
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
                break;
            case 1:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                break;
            case 2:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                break;
            case 3:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(true);
                this.txtFiltro2Sumi.setEnabled(true);
                this.btnSearchF2Sumi2.setEnabled(true);
                break;
            case 4:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(true);
                this.txtFiltro2Sumi.setEnabled(true);
                this.btnSearchF2Sumi2.setEnabled(true);
                break;
            case 5:
                this.btnSearchF1Sumi.setEnabled(true);
                this.txtFiltro1Sumi.setEnabled(true);
                this.cbFiltro2Sumi.setEnabled(false);
                this.txtFiltro2Sumi.setEnabled(false);
                this.btnSearchF2Sumi2.setEnabled(false);
                break;
        }
    }//GEN-LAST:event_cbFiltro1SumiActionPerformed

    private void btnSearchCaducosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchCaducosActionPerformed
        String dias = this.txtCaducosDias.getText();
        String meses = this.txtCaducosMeses.getText();
        String fechaEspecifica = this.txtFechaDisCaduco.getText();
        String iArea = this.cbBusquedaIniPere.getSelectedItem().toString();

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
        this.tbl_caducidades.setModel(tablaPere);

        try {
            ResultSet re = null;
            ResultSet re2 = null;
            ResultSetMetaData rS = null;
            int nColumnas = 0;
            Object[] datosTabla = null;
            String fecha = null;

            if (!(this.txtCaducosDias.getText().isEmpty())) {
                if (pere.validarNumeros(dias)) {
                    int intDias = Integer.parseInt(dias);
                    if (iArea.equals("Seleccione inicial")) {
                        re = pere.caducadosDias(intDias);
                        rS = (ResultSetMetaData) re.getMetaData();
                        nColumnas = rS.getColumnCount();
                        datosTabla = new Object[nColumnas];
                        while (re.next()) {
                            for (int i = 0; i < nColumnas; i++) {
                                datosTabla[i] = re.getObject(i + 1);
                            }
                            tablaPere.addRow(datosTabla);
                        }
                    } else {
                        re = pere.caducadosDiasXarea(intDias, iArea);
                        rS = (ResultSetMetaData) re.getMetaData();
                        nColumnas = rS.getColumnCount();
                        datosTabla = new Object[nColumnas];
                        while (re.next()) {
                            for (int i = 0; i < nColumnas; i++) {
                                datosTabla[i] = re.getObject(i + 1);
                            }
                            tablaPere.addRow(datosTabla);
                        }
                    }
                    re2 = pere.infoDias(intDias);
                    while (re2.next()) {
                        fecha = (re2.getString("Fecha"));
                    }
                    this.lblInfoBusqueda1.setText("<html><p>Prontos a caducar están entre las fechas "
                           + "de hoy y " + fecha + " según la cantidad de días ingresados</p></html>");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (!(this.txtCaducosMeses.getText().isEmpty())) {
                if (pere.validarNumeros(meses)) {
                    int intMeses = Integer.parseInt(meses);
                    if (iArea.equals("Seleccione inicial")) {
                        re = pere.caducadosMeses(intMeses);
                        rS = (ResultSetMetaData) re.getMetaData();
                        nColumnas = rS.getColumnCount();
                        datosTabla = new Object[nColumnas];
                        while (re.next()) {
                            for (int i = 0; i < nColumnas; i++) {
                                datosTabla[i] = re.getObject(i + 1);
                            }
                            tablaPere.addRow(datosTabla);
                        }
                    } else {
                        re = pere.caducadosMesesXarea(intMeses, iArea);
                        rS = (ResultSetMetaData) re.getMetaData();
                        nColumnas = rS.getColumnCount();
                        datosTabla = new Object[nColumnas];
                        while (re.next()) {
                            for (int i = 0; i < nColumnas; i++) {
                                datosTabla[i] = re.getObject(i + 1);
                            }
                            tablaPere.addRow(datosTabla);
                        }
                    }
                    re2 = pere.infoMeses(intMeses);
                    while (re2.next()) {
                        fecha = (re2.getString("Fecha"));
                    }
                    this.lblInfoBusqueda2.setText("<html><p>Prontos a caducar están entre las fechas "
                           + "de hoy y " + fecha + " según la cantidad de meses ingresados</p></html>");
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese dato numérico, no letras", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
                }
            } else if (!(this.txtFechaDisCaduco.getText().isEmpty())) {
                if (iArea.equals("Seleccione inicial")) {
                    re = pere.caducadosFechaEspecific(fechaEspecifica);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaPere.addRow(datosTabla);
                    }
                } else {
                    re = pere.caducadosFechaEspecificXarea(fechaEspecifica, iArea);
                    rS = (ResultSetMetaData) re.getMetaData();
                    nColumnas = rS.getColumnCount();
                    datosTabla = new Object[nColumnas];
                    while (re.next()) {
                        for (int i = 0; i < nColumnas; i++) {
                            datosTabla[i] = re.getObject(i + 1);
                        }
                        tablaPere.addRow(datosTabla);
                    }
                }
                re2 = pere.infoFecha(fechaEspecifica);
                while (re2.next()) {
                    fecha = (re2.getString("Fecha"));
                }
                this.lblInfoBusqueda3.setText("<html><p>Prontos a caducar están en el rango de " + fecha + " días\n"
                       + "de la fecha especificada</p></html>");
            } else if ((this.txtCaducosDias.getText().isEmpty()) && (this.txtCaducosMeses.getText().isEmpty())
                   && (this.txtFechaDisCaduco.getText().isEmpty())) {
                JOptionPane.showMessageDialog(this, "No ha ingresado valor en ninguno\n"
                       + "de los campos de búsqueda", "Advertencia", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (HeadlessException | NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un error con la aplicación..." + e, "¡¡ERROR!!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnSearchCaducosActionPerformed

    private void txtCaducosDiasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaducosDiasCaretUpdate
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
        this.tbl_caducidades.setModel(tablaPere);
        if (this.txtCaducosDias.getText().isEmpty()) {
            this.txtCaducosMeses.setEnabled(true);
            this.txtFechaDisCaduco.setEnabled(true);
            try {
                ResultSet re = pere.cargaPerecederos();
                ResultSetMetaData rS = (ResultSetMetaData) re.getMetaData();
                int nColumnas = rS.getColumnCount();
                Object[] datosTabla = new Object[nColumnas];

                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaPere.addRow(datosTabla);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
            }
        } else {
            this.txtCaducosMeses.setEnabled(false);
            this.txtFechaDisCaduco.setEnabled(false);
        }
    }//GEN-LAST:event_txtCaducosDiasCaretUpdate

    private void txtCaducosMesesCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCaducosMesesCaretUpdate
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
        this.tbl_caducidades.setModel(tablaPere);
        if (this.txtCaducosMeses.getText().isEmpty()) {
            this.txtCaducosDias.setEnabled(true);
            this.txtFechaDisCaduco.setEnabled(true);
            try {
                ResultSet re = pere.cargaPerecederos();
                ResultSetMetaData rS = (ResultSetMetaData) re.getMetaData();
                int nColumnas = rS.getColumnCount();
                Object[] datosTabla = new Object[nColumnas];

                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaPere.addRow(datosTabla);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
            }
        } else {
            this.txtCaducosDias.setEnabled(false);
            this.txtFechaDisCaduco.setEnabled(false);
        }
    }//GEN-LAST:event_txtCaducosMesesCaretUpdate

    private void txtFechaDisCaducoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFechaDisCaducoCaretUpdate
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
        this.tbl_caducidades.setModel(tablaPere);
        if (this.txtFechaDisCaduco.getText().isEmpty()) {
            this.txtCaducosDias.setEnabled(true);
            this.txtCaducosMeses.setEnabled(true);
            try {
                ResultSet re = pere.cargaPerecederos();
                ResultSetMetaData rS = (ResultSetMetaData) re.getMetaData();
                int nColumnas = rS.getColumnCount();
                Object[] datosTabla = new Object[nColumnas];

                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaPere.addRow(datosTabla);
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar perecederos..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
            }
        } else {
            this.txtCaducosDias.setEnabled(false);
            this.txtCaducosMeses.setEnabled(false);
        }
    }//GEN-LAST:event_txtFechaDisCaducoCaretUpdate

    private void txtFiltro1SumiCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtFiltro1SumiCaretUpdate
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
        this.tbl_sumi.setModel(tablaSumi);
        try {
            if (this.txtFiltro1Sumi.getText().isEmpty()) {
                ResultSet re = sumi.cargaSuministros();
                ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
                int nColumnas = rM.getColumnCount();

                Object[] datosTabla = new Object[nColumnas];

                while (re.next()) {
                    for (int i = 0; i < nColumnas; i++) {
                        datosTabla[i] = re.getObject(i + 1);
                    }
                    tablaSumi.addRow(datosTabla);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrió un problema al cargar suministros..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_txtFiltro1SumiCaretUpdate

    private void txtCodigoSalidasCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtCodigoSalidasCaretUpdate
        DefaultTableModel tablaExistActual = new DefaultTableModel(datos, columnas3) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 3) {
                    return true;
                } else {
                    return false;
                }
            }
        };

        DefaultTableModel tablaUnidadM = new DefaultTableModel(datos, columnas4) {
            @Override
            public boolean isCellEditable(int filas, int columnas) {
                if (columnas == 4) {
                    return true;
                } else {
                    return false;
                }
            }
        };
        this.tblExistActual.setModel(tablaExistActual);
        this.tblUnidadSalidas.setModel(tablaUnidadM);

        String area = this.cbAreaSalidas.getSelectedItem().toString();
        String inicialA = null;
        String IDinsu = this.txtCodigoSalidas.getText();

        try {
            if (area.equals("Personal")) {
                inicialA = "P";
            } else if (area.equals("Habitacion")) {
                inicialA = "H";
            } else if (area.equals("Mantenimiento")) {
                inicialA = "M";
            } else if (area.equals("Recepcion")) {
                inicialA = "Re";
            } else if (area.equals("Otros")) {
                inicialA = "O";
            }
            ResultSet re = salidas.cargaRegInsu(IDinsu, area, inicialA);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();

            Object[] datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaExistActual.addRow(datosTabla);
            }

            ResultSet re2 = salidas.cargaIDunidad(IDinsu, area, inicialA);
            ResultSetMetaData rM2 = (ResultSetMetaData) re2.getMetaData();
            int nColumnas2 = rM2.getColumnCount();

            Object[] datosTabla2 = new Object[nColumnas2];

            while (re2.next()) {
                for (int j = 0; j < nColumnas2; j++) {
                    datosTabla2[j] = re2.getObject(j + 1);
                }
                tablaUnidadM.addRow(datosTabla2);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ocurrio un error con la aplicación..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
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
            this.btnEscanerCodigo.setEnabled(false);
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
                this.btnEscanerCodigo.setEnabled(true);
                this.txtCantidadSalidas.setEnabled(true);
                this.btnDevolver.setEnabled(true);
                this.btnGuardarSalidas.setEnabled(true);
            } else {
                this.txtCodigoSalidas.setEnabled(false);
                this.btnEscanerCodigo.setEnabled(false);
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
        String inicialA = null;
        String IDinsu = this.txtCodigoSalidas.getText();
        Double cantSalida = Double.parseDouble(this.txtCantidadSalidas.getText());

        try {
            if (area.equals("Personal")) {
                inicialA = "P";
            } else if (area.equals("Habitacion")) {
                inicialA = "H";
            } else if (area.equals("Mantenimiento")) {
                inicialA = "M";
            } else if (area.equals("Recepcion")) {
                inicialA = "Re";
            } else if (area.equals("Otros")) {
                inicialA = "O";
            }

            salidas.salidaInsumo(area, inicialA, cantSalida, IDinsu);
            
            this.tblNuevaExist.setModel(tablaExistsNuevo);
            ResultSet re = salidas.cargaExistNInsu(IDinsu, area, inicialA);
            ResultSetMetaData rM = (ResultSetMetaData) re.getMetaData();
            int nColumnas = rM.getColumnCount();
            Object[] datosTabla = new Object[nColumnas];
            while (re.next()) {
                for (int i = 0; i < nColumnas; i++) {
                    datosTabla[i] = re.getObject(i + 1);
                }
                tablaExistsNuevo.addRow(datosTabla);
            }
            
            this.txtCodigoSalidas.setText("");
            this.txtCantidadSalidas.setText("");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "No se pudo realizar la salida del insumo..." + e, "¡ERROR!", JOptionPane.PLAIN_MESSAGE, error);
        }
    }//GEN-LAST:event_btnGuardarSalidasActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private RSMaterialComponent.RSButtonFormaIcon btnCaducidades;
    private rojeru_san.rsbutton.RSButtonForma btnDevolver;
    private RSMaterialComponent.RSButtonIconOne btnEscanerCodigo;
    private RSMaterialComponent.RSButtonFormaIcon btnExistencias;
    private RSMaterialComponent.RSButtonFormaIcon btnGenerarRepCaducos;
    private rojeru_san.rsbutton.RSButtonForma btnGuardarSalidas;
    private RSMaterialComponent.RSButtonFormaIcon btnIngresarSumi;
    private RSMaterialComponent.RSButtonFormaIcon btnInsumos;
    private RSMaterialComponent.RSButtonFormaIcon btnReporteSumi;
    private RSMaterialComponent.RSButtonFormaIcon btnRequisiciones;
    private RSMaterialComponent.RSButtonFormaIcon btnSalidas;
    private RSMaterialComponent.RSButtonIconOne btnSearchCaducos;
    private RSMaterialComponent.RSButtonIconOne btnSearchF1Sumi;
    private RSMaterialComponent.RSButtonIconOne btnSearchF2Sumi2;
    private RSMaterialComponent.RSButtonFormaIcon btnSuministros;
    private RSMaterialComponent.RSComboBox cbAreaSalidas;
    private RSMaterialComponent.RSComboBox cbBusquedaIniPere;
    private RSMaterialComponent.RSComboBox cbFiltro1Sumi;
    private RSMaterialComponent.RSComboBox cbFiltro2Sumi;
    private RSMaterialComponent.RSComboBox cbReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private necesario.RSLabelImage lblImageLogo;
    private javax.swing.JLabel lblInfoBusqueda1;
    private javax.swing.JLabel lblInfoBusqueda2;
    private javax.swing.JLabel lblInfoBusqueda3;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlCaducidades;
    private javax.swing.JPanel pnlExistencias;
    private javax.swing.JPanel pnlInsumos;
    private javax.swing.JPanel pnlRequisiciones;
    private javax.swing.JPanel pnlSalidas;
    private javax.swing.JPanel pnlSuministros;
    private javax.swing.JPanel pnlWelcome;
    private rojerusan.RSPanelImage rSPanelImage1;
    private rojerusan.RSPanelsSlider rSPanelsSlider1;
    private javax.swing.JTable tblExistActual;
    private javax.swing.JTable tblNuevaExist;
    private javax.swing.JTable tblUnidadSalidas;
    private javax.swing.JTable tbl_caducidades;
    private javax.swing.JTable tbl_sumi;
    private RSMaterialComponent.RSTextFieldOne txtCaducosDias;
    private RSMaterialComponent.RSTextFieldOne txtCaducosMeses;
    private RSMaterialComponent.RSTextFieldOne txtCantidadSalidas;
    private RSMaterialComponent.RSTextFieldOne txtCodigoSalidas;
    private RSMaterialComponent.RSTextFieldOne txtFechaDisCaduco;
    private RSMaterialComponent.RSTextFieldOne txtFiltro1Sumi;
    private RSMaterialComponent.RSTextFieldOne txtFiltro2Sumi;
    // End of variables declaration//GEN-END:variables
}
