/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import Classes.EnsambladoresJ;
import Classes.GerenteJ;
import Classes.JefeJ;
import static Classes.Main.ensamblador;
import static Classes.Main.gerenteJ;
import static Classes.Main.jefeJ;
import static Classes.Main.producBotonesJ;
import static Classes.Main.producCamsJ;
import static Classes.Main.producNumBotonesJ;
import static Classes.Main.producNumCamsJ;
import static Classes.Main.producNumPantJ;
import static Classes.Main.producNumPinesJ;
import static Classes.Main.producPantJ;
import static Classes.Main.producPins;
import Classes.ProductoresBotonesJ;
import Classes.ProductoresCamarasJ;
import Classes.ProductoresPantallasJ;
import Classes.ProductoresPinesJ;
import com.sun.tools.javac.Main;
import Classes.EnsambladoresM;
import Classes.GerenteM;
import Classes.JefeM;
import static Classes.Main.ThreadBotones;
import static Classes.Main.ThreadCamaras;
import static Classes.Main.ThreadEnsamblador;
import static Classes.Main.ThreadGerenteM;
import static Classes.Main.ThreadJefeM;
import static Classes.Main.ThreadPantallas;
import static Classes.Main.ThreadPines;
import static Classes.Main.almacenBotonesM;
import static Classes.Main.almacenCamarasM;
import static Classes.Main.almacenPantallasM;
import static Classes.Main.almacenTelefonosM;

import static Classes.Main.almacenPinesM;
import static Classes.Main.numEnsambladoresM;
import static Classes.Main.numJefeM;
import static Classes.Main.numGerenteM;
import static Classes.Main.numProductoresBotones;
import static Classes.Main.numProductoresCamaras;
import static Classes.Main.numProductoresPantallas;
import static Classes.Main.numProductoresPines;
import Classes.ProductoresBotonesM;
import Classes.ProductoresCamarasM;
import Classes.ProductoresPantallasM;
import Classes.ProductoresPinesM;
import Classes.EnsambladoresJ;
import Classes.GerenteJ;
import Classes.GetDatos;
import Classes.JefeJ;
import static Classes.Main.AlmacenInf;
import static Classes.Main.InterfazGrafica;
import static Classes.Main.contadorMassimo;
import static Classes.Main.countdownPlantaJ;
import static Classes.Main.ensamblador;
import static Classes.Main.gerenteJ;
import static Classes.Main.jefeJ;
import static Classes.Main.maxBotonesJ;
import static Classes.Main.maxCamsJ;
import static Classes.Main.maxPantJ;
import static Classes.Main.numEnsamblador;
import static Classes.Main.numPines;
import static Classes.Main.numeroMaximoEmpleadosJ;
import static Classes.Main.numeroMaximoEmpleadosM;
import static Classes.Main.pilaEnsambladoresJ;
import static Classes.Main.pilaEnsambladoresM;
import static Classes.Main.pilaProductoresBotonesJ;
import static Classes.Main.pilaProductoresBotonesM;
import static Classes.Main.pilaProductoresCamarasJ;
import static Classes.Main.pilaProductoresCamarasM;
import static Classes.Main.pilaProductoresPantallasJ;
import static Classes.Main.pilaProductoresPantallasM;
import static Classes.Main.pilaProductoresPinesJ;

import static Classes.Main.pilaProductoresPinesM;
import static Classes.Main.producBotonesJ;
import static Classes.Main.producCamsJ;
import static Classes.Main.producNumBotonesJ;
import static Classes.Main.producNumCamsJ;
import static Classes.Main.producNumPantJ;
import static Classes.Main.producNumPinesJ;
import static Classes.Main.producPantJ;

import static Classes.Main.numTelef;
import static Classes.Main.producPins;
import static Classes.Main.tiempoDia;
import Classes.ProductoresBotonesJ;
import Classes.ProductoresCamarasJ;
import Classes.ProductoresPantallasJ;
import Classes.ProductoresPinesJ;
import com.sun.tools.javac.Main;
import java.awt.Graphics;
import java.awt.Image;
import java.util.Stack;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Jose Rubin
 */
public class InterfazPlantas extends javax.swing.JFrame {

    /**
     * Creates new form InterfazPlantas
     */
    FondoPanel fondo = new FondoPanel();
    public int tDia = tiempoDia;
    public int t = 0;
    
//    ARREGLAR VARIABLEKS GLOBALES
    public int countdown;
    public static GetDatos datum = new GetDatos();
    public static Dashboard InterfazDash= new Dashboard();
    public InterfazPlantas() {
        this.setContentPane(fondo);
        initComponents();
        this.setLocationRelativeTo(null);
        Ensambladores1.setEditable(false);
        ProductoresB1.setEditable(false);
        ProductoresPant1.setEditable(false);
        ProductoresCams1.setEditable(false);
        ProductoresPines1.setEditable(false);
        AlmacenBotonesP1.setEditable(false);
        
        this.countdown = 30;
        
        
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jTextField9 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTextField10 = new javax.swing.JTextField();
        TextGerentePlanta3 = new javax.swing.JTextField();
        TextJefePlanta3 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        countdownJOSE = new javax.swing.JTextField();
        TextGerentePlanta1 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        TextJefePlanta1 = new javax.swing.JTextField();
        TiempoDias = new javax.swing.JTextField();
        jLabel53 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        UltimoLote1 = new javax.swing.JTextField();
        jLabel57 = new javax.swing.JLabel();
        GastosSalario2 = new javax.swing.JTextField();
        jLabel58 = new javax.swing.JLabel();
        GananciasTotales1 = new javax.swing.JTextField();
        jLabel59 = new javax.swing.JLabel();
        GananciasTotales2 = new javax.swing.JTextField();
        GastosSalario1 = new javax.swing.JTextField();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        UltimoLote2 = new javax.swing.JTextField();
        start = new javax.swing.JToggleButton();
        stop = new javax.swing.JToggleButton();
        jLabel62 = new javax.swing.JLabel();
        countdownMASSIMO = new javax.swing.JTextField();
        JefePerdido2 = new javax.swing.JTextField();
        JefePerdido1 = new javax.swing.JTextField();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        Dashboard = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BotonSumBotones2 = new javax.swing.JButton();
        BotonSumCams2 = new javax.swing.JButton();
        BotonSumPant2 = new javax.swing.JButton();
        BotonMenosBotones2 = new javax.swing.JButton();
        BotonMenosPant2 = new javax.swing.JButton();
        BotonMenosCams2 = new javax.swing.JButton();
        ProductoresCams2 = new javax.swing.JTextField();
        ProductoresB2 = new javax.swing.JTextField();
        ProductoresPant2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProductoresPines2 = new javax.swing.JTextField();
        BotonSumPines2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        BotonMenosPines2 = new javax.swing.JButton();
        AlmacenCamsP2 = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        AlmacenBotonesP2 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        AlmacenPantallasP2 = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        AlmacenPinesP2 = new javax.swing.JTextField();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        TelefonosPlanta2 = new javax.swing.JTextField();
        BotonSumEnsam2 = new javax.swing.JButton();
        Ensambladores2 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        BotonMenosEnsam2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        BotonSumBotones1 = new javax.swing.JButton();
        BotonSumCams1 = new javax.swing.JButton();
        BotonSumPant1 = new javax.swing.JButton();
        BotonMenosBotones1 = new javax.swing.JButton();
        BotonMenosPant1 = new javax.swing.JButton();
        BotonMenosCams1 = new javax.swing.JButton();
        ProductoresCams1 = new javax.swing.JTextField();
        ProductoresB1 = new javax.swing.JTextField();
        ProductoresPant1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        ProductoresPines1 = new javax.swing.JTextField();
        BotonSumPines1 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        BotonMenosPines1 = new javax.swing.JButton();
        TelefonosPlanta1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        AlmacenPantallasP1 = new javax.swing.JTextField();
        AlmacenPinesP1 = new javax.swing.JTextField();
        AlmacenBotonesP1 = new javax.swing.JTextField();
        AlmacenCamsP1 = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        Ensambladores1 = new javax.swing.JTextField();
        BotonSumEnsam1 = new javax.swing.JButton();
        BotonMenosEnsam1 = new javax.swing.JButton();
        jLabel54 = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField9.setText("jTextField1");
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 250, 250, 30));
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField10.setText("jTextField1");
        jPanel2.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-380, 250, 250, 30));

        TextGerentePlanta3.setText("Durmiendo....");
        jPanel2.add(TextGerentePlanta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 780, 230, 30));

        TextJefePlanta3.setText("Durmiendo....");
        TextJefePlanta3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextJefePlanta3ActionPerformed(evt);
            }
        });
        jPanel2.add(TextJefePlanta3, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 720, 230, 30));
        jPanel2.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 630, -1, -1));

        jLabel48.setText("Jefe Planta 2");
        jPanel2.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 700, -1, -1));

        jLabel49.setText("Gerente Planta 2");
        jPanel2.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 760, -1, -1));

        jLabel50.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel50.setText("Countdown 2");
        jPanel2.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 110, -1));

        countdownJOSE.setText("1");
        countdownJOSE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countdownJOSEActionPerformed(evt);
            }
        });
        jPanel2.add(countdownJOSE, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 540, 100, 30));

        TextGerentePlanta1.setText("Durmiendo....");
        TextGerentePlanta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextGerentePlanta1ActionPerformed(evt);
            }
        });
        jPanel2.add(TextGerentePlanta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 660, 230, 30));

        jLabel51.setText("Gerente Planta 1");
        jPanel2.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 640, -1, -1));

        jLabel52.setText("Jefe Planta 1");
        jPanel2.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 580, -1, -1));

        TextJefePlanta1.setText("Durmiendo....");
        TextJefePlanta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextJefePlanta1ActionPerformed(evt);
            }
        });
        jPanel2.add(TextJefePlanta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 600, 230, 30));

        TiempoDias.setText("1");
        TiempoDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TiempoDiasActionPerformed(evt);
            }
        });
        jPanel2.add(TiempoDias, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 640, 100, 30));

        jLabel53.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel53.setText("Tiempo");
        jPanel2.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 640, 70, -1));

        jLabel56.setText("Telefonos Vendidos Ultimo Lote");
        jPanel2.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 460, -1, -1));

        UltimoLote1.setText("Money");
        UltimoLote1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoLote1ActionPerformed(evt);
            }
        });
        jPanel2.add(UltimoLote1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, 110, 30));

        jLabel57.setText("Gastos en Salarios Planta 2");
        jPanel2.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 640, -1, -1));

        GastosSalario2.setText("Money");
        GastosSalario2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastosSalario2ActionPerformed(evt);
            }
        });
        jPanel2.add(GastosSalario2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 660, 240, 30));

        jLabel58.setText("Ganancia Total Planta 1");
        jPanel2.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 700, -1, -1));

        GananciasTotales1.setText("Money");
        GananciasTotales1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciasTotales1ActionPerformed(evt);
            }
        });
        jPanel2.add(GananciasTotales1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 720, 240, 30));

        jLabel59.setText("Ganancia Total Planta 2");
        jPanel2.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 760, -1, -1));

        GananciasTotales2.setText("Money");
        GananciasTotales2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GananciasTotales2ActionPerformed(evt);
            }
        });
        jPanel2.add(GananciasTotales2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 780, 240, 30));

        GastosSalario1.setText("Money");
        GastosSalario1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GastosSalario1ActionPerformed(evt);
            }
        });
        jPanel2.add(GastosSalario1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 600, 240, 30));

        jLabel60.setText("Gastos en Salarios Planta 1");
        jPanel2.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 580, -1, -1));

        jLabel61.setText("Perdida Total Jefe 2");
        jPanel2.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 720, -1, -1));

        UltimoLote2.setText("Money");
        UltimoLote2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UltimoLote2ActionPerformed(evt);
            }
        });
        jPanel2.add(UltimoLote2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 480, 110, 30));

        start.setText("Start");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });
        jPanel2.add(start, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 710, 90, 90));

        stop.setText("Stop");
        stop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopActionPerformed(evt);
            }
        });
        jPanel2.add(stop, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 700, 90, 90));

        jLabel62.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel62.setText("Countdown 1");
        jPanel2.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 590, 110, -1));

        countdownMASSIMO.setText("1");
        countdownMASSIMO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countdownMASSIMOActionPerformed(evt);
            }
        });
        jPanel2.add(countdownMASSIMO, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 590, 100, 30));

        JefePerdido2.setText("1");
        JefePerdido2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefePerdido2ActionPerformed(evt);
            }
        });
        jPanel2.add(JefePerdido2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 750, 70, 30));

        JefePerdido1.setText("1");
        JefePerdido1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JefePerdido1ActionPerformed(evt);
            }
        });
        jPanel2.add(JefePerdido1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 640, 70, 30));

        jLabel64.setText("Telefonos Vendidos Ultimo Lote");
        jPanel2.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 460, -1, -1));

        jLabel63.setText("Perdida Total Jefe 1");
        jPanel2.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 610, -1, -1));

        Dashboard.setText("Dashboard");
        Dashboard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DashboardActionPerformed(evt);
            }
        });
        jPanel2.add(Dashboard, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 700, 90, 90));

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Planta 2");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        BotonSumBotones2.setText("+");
        BotonSumBotones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumBotones2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonSumBotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 60, 50));

        BotonSumCams2.setText("+");
        BotonSumCams2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumCams2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonSumCams2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 210, 60, 50));

        BotonSumPant2.setText("+");
        BotonSumPant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumPant2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonSumPant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 150, 60, 50));

        BotonMenosBotones2.setText("-");
        BotonMenosBotones2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosBotones2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonMenosBotones2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, 60, 50));

        BotonMenosPant2.setText("-");
        BotonMenosPant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosPant2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonMenosPant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 60, 50));

        BotonMenosCams2.setText("-");
        BotonMenosCams2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosCams2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonMenosCams2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 60, 50));

        ProductoresCams2.setText("1");
        ProductoresCams2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresCams2ActionPerformed(evt);
            }
        });
        jPanel3.add(ProductoresCams2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 250, 30));

        ProductoresB2.setText("1");
        ProductoresB2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresB2ActionPerformed(evt);
            }
        });
        jPanel3.add(ProductoresB2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 250, 30));

        ProductoresPant2.setText("1");
        ProductoresPant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresPant2ActionPerformed(evt);
            }
        });
        jPanel3.add(ProductoresPant2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 160, 250, 30));

        jLabel3.setText("Productores de Camaras");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 200, -1, -1));

        jLabel4.setText("Productores de Botones");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        jLabel5.setText("Productores de Pantallas");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 140, -1, -1));

        ProductoresPines2.setText("1");
        ProductoresPines2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresPines2ActionPerformed(evt);
            }
        });
        jPanel3.add(ProductoresPines2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 280, 250, 30));

        BotonSumPines2.setText("+");
        BotonSumPines2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumPines2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonSumPines2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 270, 60, 50));

        jLabel6.setText("Productores de Pines de Carga");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, -1, -1));

        BotonMenosPines2.setText("-");
        BotonMenosPines2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosPines2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonMenosPines2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 60, 50));

        AlmacenCamsP2.setText("1");
        AlmacenCamsP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenCamsP2ActionPerformed(evt);
            }
        });
        jPanel3.add(AlmacenCamsP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 30, 20));

        jLabel28.setText("Botones");
        jPanel3.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        AlmacenBotonesP2.setText("1");
        jPanel3.add(AlmacenBotonesP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 30, 20));

        jLabel29.setText("Pantallas");
        jPanel3.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        AlmacenPantallasP2.setText("1");
        AlmacenPantallasP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenPantallasP2ActionPerformed(evt);
            }
        });
        jPanel3.add(AlmacenPantallasP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 40, 20));

        jLabel30.setText("Pines Carga");
        jPanel3.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        AlmacenPinesP2.setText("1");
        AlmacenPinesP2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenPinesP2ActionPerformed(evt);
            }
        });
        jPanel3.add(AlmacenPinesP2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 30, 20));

        jLabel31.setText("Camaras");
        jPanel3.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel32.setText("Telefonos");
        jPanel3.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, -1, -1));

        TelefonosPlanta2.setText("1");
        TelefonosPlanta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonosPlanta2ActionPerformed(evt);
            }
        });
        jPanel3.add(TelefonosPlanta2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 70, 30));

        BotonSumEnsam2.setText("+");
        BotonSumEnsam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumEnsam2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonSumEnsam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 30, 60, 50));

        Ensambladores2.setText("1");
        Ensambladores2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ensambladores2ActionPerformed(evt);
            }
        });
        jPanel3.add(Ensambladores2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 250, 30));

        jLabel55.setText("Ensambladores");
        jPanel3.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        BotonMenosEnsam2.setText("-");
        BotonMenosEnsam2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosEnsam2ActionPerformed(evt);
            }
        });
        jPanel3.add(BotonMenosEnsam2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 60, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 570, 460));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setText("Planta 1");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, -1));

        BotonSumBotones1.setText("+");
        BotonSumBotones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumBotones1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonSumBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 90, 60, 50));

        BotonSumCams1.setText("+");
        BotonSumCams1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumCams1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonSumCams1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 60, 50));

        BotonSumPant1.setText("+");
        BotonSumPant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumPant1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonSumPant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 60, 50));

        BotonMenosBotones1.setText("-");
        BotonMenosBotones1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosBotones1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonMenosBotones1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 60, 50));

        BotonMenosPant1.setText("-");
        BotonMenosPant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosPant1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonMenosPant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 60, 50));

        BotonMenosCams1.setText("-");
        BotonMenosCams1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosCams1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonMenosCams1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 60, 50));

        ProductoresCams1.setText("1");
        jPanel4.add(ProductoresCams1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 250, 30));

        ProductoresB1.setText("1");
        ProductoresB1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresB1ActionPerformed(evt);
            }
        });
        jPanel4.add(ProductoresB1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 100, 250, 30));

        ProductoresPant1.setText("1");
        jPanel4.add(ProductoresPant1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 250, 30));

        jLabel12.setText("Productores de Camaras");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 200, -1, -1));

        jLabel13.setText("Pines Carga");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 410, -1, -1));

        jLabel14.setText("Productores de Pantallas");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, -1, -1));

        ProductoresPines1.setText("1");
        ProductoresPines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProductoresPines1ActionPerformed(evt);
            }
        });
        jPanel4.add(ProductoresPines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 280, 250, 30));

        BotonSumPines1.setText("+");
        BotonSumPines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumPines1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonSumPines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 270, 60, 50));

        jLabel15.setText("Productores de Pines de Carga");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 260, -1, -1));

        BotonMenosPines1.setText("-");
        BotonMenosPines1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosPines1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonMenosPines1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 60, 50));

        TelefonosPlanta1.setText("1");
        TelefonosPlanta1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonosPlanta1ActionPerformed(evt);
            }
        });
        jPanel4.add(TelefonosPlanta1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 70, 30));

        jLabel22.setText("Productores de Botones");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        AlmacenPantallasP1.setText("1");
        AlmacenPantallasP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenPantallasP1ActionPerformed(evt);
            }
        });
        jPanel4.add(AlmacenPantallasP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 350, 20, 20));

        AlmacenPinesP1.setText("1");
        jPanel4.add(AlmacenPinesP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 20, 20));

        AlmacenBotonesP1.setText("1");
        AlmacenBotonesP1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlmacenBotonesP1ActionPerformed(evt);
            }
        });
        jPanel4.add(AlmacenBotonesP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 20, 20));

        AlmacenCamsP1.setText("1");
        jPanel4.add(AlmacenCamsP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 410, 20, 20));

        jLabel24.setText("Telefonos");
        jPanel4.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, -1, -1));

        jLabel25.setText("Camaras");
        jPanel4.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, -1, -1));

        jLabel26.setText("Pantallas");
        jPanel4.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 350, -1, -1));

        jLabel27.setText("Botones");
        jPanel4.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, -1, -1));

        Ensambladores1.setText("1");
        Ensambladores1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Ensambladores1ActionPerformed(evt);
            }
        });
        jPanel4.add(Ensambladores1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, 250, 30));

        BotonSumEnsam1.setText("+");
        BotonSumEnsam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonSumEnsam1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonSumEnsam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 30, 60, 50));

        BotonMenosEnsam1.setText("-");
        BotonMenosEnsam1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonMenosEnsam1ActionPerformed(evt);
            }
        });
        jPanel4.add(BotonMenosEnsam1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 60, 50));

        jLabel54.setText("Ensambladores");
        jPanel4.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jPanel2.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 830));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 830));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1180, 830));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonMenosEnsam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosEnsam1ActionPerformed
        // Botones Menos
        if(numEnsamblador > 1){
            numEnsamblador--;
            Ensambladores1.setText(Integer.toString(numEnsamblador));
            if(countdownPlantaJ<30){
                pilaEnsambladoresJ.peek().stopToggle();
                pilaEnsambladoresJ.pop();
            }
        } else{
            TextGerentePlanta1.setText("Despedido bro fuera de aqui");
        }
    }//GEN-LAST:event_BotonMenosEnsam1ActionPerformed

    private void BotonSumEnsam1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumEnsam1ActionPerformed
        // TODO add your handling code here:
        if ((numEnsamblador+producNumBotonesJ+producNumCamsJ+producNumPantJ+producNumPinesJ)<numeroMaximoEmpleadosJ) {
            numEnsamblador++;
            Ensambladores1.setText(Integer.toString(numEnsamblador));
            
            if(countdownPlantaJ<30){
                ensamblador = new EnsambladoresJ(1);
                ensamblador.start();
                pilaEnsambladoresJ.push(ensamblador);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumEnsam1ActionPerformed

    private void Ensambladores1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ensambladores1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ensambladores1ActionPerformed

    private void AlmacenBotonesP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenBotonesP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenBotonesP1ActionPerformed

    private void AlmacenPantallasP1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenPantallasP1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenPantallasP1ActionPerformed

    private void TelefonosPlanta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonosPlanta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonosPlanta1ActionPerformed

    private void BotonMenosPines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosPines1ActionPerformed
        // TODO add your handling code here:
        if(producNumPinesJ > 1){
            producNumPinesJ--;
            ProductoresPines1.setText(Integer.toString(producNumPinesJ));
            if(countdownPlantaJ<30){
                pilaProductoresPinesJ.peek().stopToggle();
                pilaProductoresPinesJ.pop();
            }
        }

        else{
            TextGerentePlanta1.setText("Despedido bro fuera de aqui wtf");
        }
    }//GEN-LAST:event_BotonMenosPines1ActionPerformed

    private void BotonSumPines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumPines1ActionPerformed
        // TODO add your handling code here:
        if ((numEnsamblador+producNumBotonesJ+producNumCamsJ+producNumPantJ+producNumPinesJ)<numeroMaximoEmpleadosJ) {
            producNumPinesJ++;
            ProductoresPines1.setText(Integer.toString(producNumPinesJ));
            if(countdownPlantaJ<30){
                producPins = new ProductoresPinesJ(1);
                producPins.start();
                pilaProductoresPinesJ.push(producPins);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumPines1ActionPerformed

    private void ProductoresPines1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresPines1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoresPines1ActionPerformed

    private void ProductoresB1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresB1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_ProductoresB1ActionPerformed

    private void BotonMenosCams1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosCams1ActionPerformed
        // TODO add your handling code here:
        if(producNumCamsJ > 1){
            producNumCamsJ--;
            ProductoresCams1.setText(Integer.toString(producNumCamsJ));
            if(countdownPlantaJ<30){
                pilaProductoresCamarasJ.peek().stopToggle();
                pilaProductoresCamarasJ.pop();
            }
        }

        else{
            TextGerentePlanta1.setText("Despedido bro fuera de aqui wtf");
        }
    }//GEN-LAST:event_BotonMenosCams1ActionPerformed

    private void BotonMenosPant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosPant1ActionPerformed
        // TODO add your handling code here:
        if(producNumPantJ > 1){
            producNumPantJ--;
            ProductoresPant1.setText(Integer.toString(producNumPantJ));
            if(countdownPlantaJ<30){
                pilaProductoresPantallasJ.peek().stopToggle();
                pilaProductoresPantallasJ.pop();
            }
        }
        else{
            TextGerentePlanta1.setText("Despedido bro fuera de aqui wtf");
        }

    }//GEN-LAST:event_BotonMenosPant1ActionPerformed

    private void BotonMenosBotones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosBotones1ActionPerformed
        // TODO add your handling code here:
        if(producNumBotonesJ > 1){
            producNumBotonesJ--;
            ProductoresB1.setText(Integer.toString(producNumBotonesJ));
            if(countdownPlantaJ<30){
                pilaProductoresBotonesJ.peek().stopToggle();
                pilaProductoresBotonesJ.pop();
            }
        }

        else{
            TextGerentePlanta1.setText("Despedido bro fuera de aqui wtf");
        }
    }//GEN-LAST:event_BotonMenosBotones1ActionPerformed

    private void BotonSumPant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumPant1ActionPerformed
        // TODO add your handling code here:
        if ((numEnsamblador+producNumBotonesJ+producNumCamsJ+producNumPantJ+producNumPinesJ)<numeroMaximoEmpleadosJ) {
            producNumPantJ++;
            ProductoresPant1.setText(Integer.toString(producNumPantJ));
            if(countdownPlantaJ<30){
                producPantJ = new ProductoresPantallasJ(1);
                producPantJ .start();
                pilaProductoresPantallasJ.push(producPantJ);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumPant1ActionPerformed

    private void BotonSumCams1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumCams1ActionPerformed
        // TODO add your handling code here:
        
        if ((numEnsamblador+producNumBotonesJ+producNumCamsJ+producNumPantJ+producNumPinesJ)<numeroMaximoEmpleadosJ) {
            producNumCamsJ++;
            ProductoresCams1.setText(Integer.toString(producNumCamsJ));
            if(countdownPlantaJ<30){
                producPins = new ProductoresPinesJ(1);
                producPins.start(); 
                //Apilo cada thread a la pila  de productores botones
                pilaProductoresPinesJ.push(producPins);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumCams1ActionPerformed

    private void BotonSumBotones1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumBotones1ActionPerformed
        // TODO add your handling code here:
        if ((numEnsamblador+producNumBotonesJ+producNumCamsJ+producNumPantJ+producNumPinesJ)<numeroMaximoEmpleadosJ) {
            producNumBotonesJ++;
            ProductoresB1.setText(Integer.toString(producNumBotonesJ));
            
            if(countdownPlantaJ<30){
                producBotonesJ = new ProductoresBotonesJ(1);
                producBotonesJ.start();
                pilaProductoresBotonesJ.push(producBotonesJ);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumBotones1ActionPerformed

    private void UltimoLote2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoLote2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UltimoLote2ActionPerformed

    private void GastosSalario1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastosSalario1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GastosSalario1ActionPerformed

    private void GananciasTotales2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciasTotales2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GananciasTotales2ActionPerformed

    private void GananciasTotales1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GananciasTotales1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GananciasTotales1ActionPerformed

    private void GastosSalario2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GastosSalario2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GastosSalario2ActionPerformed

    private void UltimoLote1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UltimoLote1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UltimoLote1ActionPerformed

    private void TiempoDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TiempoDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TiempoDiasActionPerformed

    private void TextJefePlanta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextJefePlanta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextJefePlanta1ActionPerformed

    private void TextGerentePlanta1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextGerentePlanta1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextGerentePlanta1ActionPerformed

    private void countdownJOSEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countdownJOSEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countdownJOSEActionPerformed

    private void TextJefePlanta3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextJefePlanta3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextJefePlanta3ActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed
        // TODO add your handling code here:
        countdownPlantaJ = 30;
        
        contadorMassimo = 30;

            

        Classes.Main.semPantallas.release(almacenPantallasM);
        almacenPantallasM=0;     
        InterfazPlantas.AlmacenPantallasP2.setText(Integer.toString(Classes.Main.almacenPantallasM));
            
        
        Classes.Main.semBotones.release(almacenBotonesM);
        almacenBotonesM = 0;
       InterfazPlantas.AlmacenBotonesP2.setText(Integer.toString(Classes.Main.almacenBotonesM));
       
        Classes.Main.semCamaras.release(almacenCamarasM);
        almacenCamarasM = 0;
        InterfazPlantas.AlmacenCamsP2.setText(Integer.toString(Classes.Main.almacenCamarasM));
        
        Classes.Main.semPines.release(almacenPinesM);
        almacenPinesM = 0;
        InterfazPlantas.AlmacenPinesP2.setText(Integer.toString(Classes.Main.almacenPinesM));
        
        
        almacenTelefonosM = 0;
        InterfazPlantas.TelefonosPlanta2.setText(Integer.toString(Classes.Main.almacenTelefonosM));
        
        
        
        //REINICIALIZAR SEMAFOROS Y ALMACENES JOSE
        
        Classes.Main.semPantJ.release(maxPantJ);
        maxPantJ=0;     
        InterfazPlantas.AlmacenPantallasP1.setText(Integer.toString(Classes.Main.maxPantJ));
            
        
        Classes.Main.semBotonesJ.release(maxBotonesJ);
        maxBotonesJ = 0;
       InterfazPlantas.AlmacenBotonesP1.setText(Integer.toString(Classes.Main.maxBotonesJ));
       
        Classes.Main.semCamarasJ.release(maxCamsJ);
        maxCamsJ = 0;
        InterfazPlantas.AlmacenCamsP1.setText(Integer.toString(Classes.Main.maxCamsJ));
        
        Classes.Main.semPinesJ.release(numPines);
        numPines = 0;
        InterfazPlantas.AlmacenPinesP1.setText(Integer.toString(Classes.Main.numPines));
        
        
        numTelef = 0;
        InterfazPlantas.TelefonosPlanta1.setText(Integer.toString(Classes.Main.numTelef));
        
        
        tiempoDia =  Integer.parseInt(TiempoDias.getText()) ;
        
        for (int i = 0; i < numEnsambladoresM; i++) {
            ensamblador = new EnsambladoresJ(numEnsambladoresM);
            ensamblador.start();
            pilaEnsambladoresJ.push(ensamblador);
        }
        
        for (int i = 0; i < producNumBotonesJ; i++) {
            producBotonesJ = new ProductoresBotonesJ(i);
            producBotonesJ.start();
            pilaProductoresBotonesJ.push(producBotonesJ);
        }
        
        for (int i = 0; i < producNumPantJ; i++) {
            producPantJ = new ProductoresPantallasJ(i);
            producPantJ.start();
            pilaProductoresPantallasJ.push(producPantJ);
        }
        
        for (int i = 0; i < producNumCamsJ; i++) {
            producCamsJ = new ProductoresCamarasJ(i);
            producCamsJ.start();
            //Apilo cada thread a la pila  de productores botones
            pilaProductoresCamarasJ.push(producCamsJ);
        }
        
        for (int i = 0; i < producNumPinesJ; i++) {
            producPins = new ProductoresPinesJ(i);
            producPins.start();
            //Apilo cada thread a la pila  de productores botones
            pilaProductoresPinesJ.push(producPins);
        }
        
        gerenteJ = new GerenteJ();
        gerenteJ.start();
        jefeJ = new JefeJ(1);
        jefeJ.start();
        
        for (int i = 0; i < numProductoresBotones; i++) {
            
 
            ThreadBotones = new ProductoresBotonesM(i, almacenBotonesM);
            
            ThreadBotones.start();
            //Apilo cada thread a la pila  de productores botones
            pilaProductoresBotonesM.push(ThreadBotones);

            
        }
        
        for (int i = 0; i < numProductoresPantallas; i++) {
            
 
            ThreadPantallas = new ProductoresPantallasM(i, almacenPantallasM);
            ThreadPantallas.start();
            //Apilo cada thread a la pila  de productores pantallas
            pilaProductoresPantallasM.push(ThreadPantallas);
            
            

            
        }
        
        for (int i = 0; i < numProductoresCamaras; i++) {
            
 
            ThreadCamaras = new ProductoresCamarasM(i, almacenCamarasM);
            ThreadCamaras.start();
            //Apilo cada thread a la pila  de productores camaras
            pilaProductoresCamarasM.push(ThreadCamaras);

            
        }
        
        
        for (int i = 0; i < numProductoresPines; i++) {
            
 
            ThreadPines = new ProductoresPinesM(i, almacenPinesM);
            ThreadPines.start();
            //Apilo cada thread a la pila  de productores pines
            pilaProductoresPinesM.push(ThreadPines);
        }
        
        for (int i = 0; i < numEnsambladoresM; i++) {
            
 
            ThreadEnsamblador = new EnsambladoresM(i);
            ThreadEnsamblador.start();
             //Apilo cada thread a la pila  de ensambladores
            pilaEnsambladoresM.push(ThreadEnsamblador);

            
        }
        //Iniciando thread jefe massimo
        
        //for (int i = 0; i < numJefeM; i++) {
            
 
            ThreadJefeM = new JefeM(1);
            ThreadJefeM.start();

            
        //}

    
            
        //for (int i = 0; i < numGerenteM; i++) {
            
 
            ThreadGerenteM = new GerenteM(1);
            ThreadGerenteM.start();

            
        //}
    }//GEN-LAST:event_startActionPerformed

    private void stopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopActionPerformed
        // TODO add your handling code here:
        while(!pilaProductoresPantallasM.isEmpty()){
            pilaProductoresPantallasM.peek().stopToggle();
            pilaProductoresPantallasM.pop();
            
        }
        
        while(!pilaProductoresBotonesM.isEmpty()){
            pilaProductoresBotonesM.peek().stopToggle();
            pilaProductoresBotonesM.pop();
            
        }
        
        while(!pilaProductoresCamarasM.isEmpty()){
            pilaProductoresCamarasM.peek().stopToggle();
            pilaProductoresCamarasM.pop();
            
        }
        
        while(!pilaProductoresPinesM.isEmpty()){
            pilaProductoresPinesM.peek().stopToggle();
            pilaProductoresPinesM.pop();
            
        }   
        while(!pilaEnsambladoresM.isEmpty()){
            pilaEnsambladoresM.peek().stopToggle();
            pilaEnsambladoresM.pop();
            
        }  
        
        //SE MATAN TODOS LOS THREADS
        while(!pilaProductoresPantallasJ.isEmpty()){
            pilaProductoresPantallasJ.peek().stopToggle();
            pilaProductoresPantallasJ.pop();

        }

        while(!pilaProductoresBotonesJ.isEmpty()){
            pilaProductoresBotonesJ.peek().stopToggle();
            pilaProductoresBotonesJ.pop();

        }

        while(!pilaProductoresCamarasJ.isEmpty()){
            pilaProductoresCamarasJ.peek().stopToggle();
          pilaProductoresCamarasJ.pop();

        }

        while(!pilaProductoresPinesJ.isEmpty()){
           pilaProductoresPinesJ.peek().stopToggle();
           pilaProductoresPinesJ.pop();

        }   
        while(!pilaEnsambladoresJ.isEmpty()){
         pilaEnsambladoresJ.peek().stopToggle();
         pilaEnsambladoresJ.pop();

        }  
        //mato los threads gerente y jefe
        Classes.Main.ThreadGerenteM.stopToggle();
        Classes.Main.ThreadJefeM.stopToggle();
        Classes.Main.gerenteJ.stopToggle();
        Classes.Main.jefeJ.stopToggle();

    }//GEN-LAST:event_stopActionPerformed

    private void countdownMASSIMOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countdownMASSIMOActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countdownMASSIMOActionPerformed

    private void JefePerdido1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefePerdido1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JefePerdido1ActionPerformed

    private void JefePerdido2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JefePerdido2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JefePerdido2ActionPerformed

    private void DashboardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DashboardActionPerformed
        // TODO add your handling code here:
        datum.getDataforDashboard();

        InterfazDash.setVisible(true);
    }//GEN-LAST:event_DashboardActionPerformed

    private void BotonMenosEnsam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosEnsam2ActionPerformed
        // TODO add your handling code here:
        if(numEnsambladoresM > 1){
            numEnsambladoresM--;
            Ensambladores2.setText(Integer.toString(numEnsambladoresM));
            if(contadorMassimo<30){
                pilaEnsambladoresM.peek().stopToggle();
                pilaEnsambladoresM.pop();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Despedido el jefe");
        }
    }//GEN-LAST:event_BotonMenosEnsam2ActionPerformed

    private void Ensambladores2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Ensambladores2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Ensambladores2ActionPerformed

    private void BotonSumEnsam2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumEnsam2ActionPerformed
        // TODO add your handling code here:

        if ((numEnsambladoresM+numProductoresPantallas+numProductoresBotones+numProductoresCamaras+numProductoresPines)<numeroMaximoEmpleadosM) {
            numEnsambladoresM++;
            Ensambladores2.setText(Integer.toString(numEnsambladoresM));

            if(contadorMassimo<30){
                //System.out.println(contadorMassimo);
                //System.out.println("si se puedeeeeeedfvsddg");
                ThreadEnsamblador = new EnsambladoresM(1);
                ThreadEnsamblador.start();
                //Apilo cada thread a la pila  de ensambladores
                pilaEnsambladoresM.push(ThreadEnsamblador);

            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumEnsam2ActionPerformed

    private void TelefonosPlanta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonosPlanta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonosPlanta2ActionPerformed

    private void AlmacenPinesP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenPinesP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenPinesP2ActionPerformed

    private void AlmacenPantallasP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenPantallasP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenPantallasP2ActionPerformed

    private void AlmacenCamsP2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlmacenCamsP2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AlmacenCamsP2ActionPerformed

    private void BotonMenosPines2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosPines2ActionPerformed
        // TODO add your handling code here:
        if(numProductoresPines > 1){
            numProductoresPines--;
            ProductoresPines2.setText(Integer.toString(numProductoresPines));

            if(contadorMassimo<30){
                pilaProductoresPinesM.peek().stopToggle();
                pilaProductoresPinesM.pop();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Despedido el jefe");
        }
    }//GEN-LAST:event_BotonMenosPines2ActionPerformed

    private void BotonSumPines2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumPines2ActionPerformed
        // TODO add your handling code here:

        if ((numEnsambladoresM+numProductoresPantallas+numProductoresBotones+numProductoresCamaras+numProductoresPines)<numeroMaximoEmpleadosM) {
            numProductoresPines++;
            ProductoresPines2.setText(Integer.toString(numProductoresPines));

            if(contadorMassimo<30){
                //System.out.println(contadorMassimo);
                //System.out.println("si se puedeeeeeedfvsddg");
                ThreadPines = new ProductoresPinesM(1, almacenPinesM);
                ThreadPines.start();
                //Apilo cada thread a la pila  de ensambladores
                pilaProductoresPinesM.push(ThreadPines);

            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumPines2ActionPerformed

    private void ProductoresPines2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresPines2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoresPines2ActionPerformed

    private void ProductoresPant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresPant2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoresPant2ActionPerformed

    private void ProductoresB2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresB2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoresB2ActionPerformed

    private void ProductoresCams2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProductoresCams2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ProductoresCams2ActionPerformed

    private void BotonMenosCams2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosCams2ActionPerformed
        // TODO add your handling code here:
        if(numProductoresCamaras > 1){
            numProductoresCamaras--;
            ProductoresCams2.setText(Integer.toString(numProductoresCamaras));

            if(contadorMassimo<30){
                pilaProductoresCamarasM.peek().stopToggle();
                pilaProductoresCamarasM.pop();
            }
        }else{
            JOptionPane.showMessageDialog(null, "Despedido el jefe");
        }
    }//GEN-LAST:event_BotonMenosCams2ActionPerformed

    private void BotonMenosPant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosPant2ActionPerformed
        // TODO add your handling code here:
        if(numProductoresPantallas > 1){
            numProductoresPantallas--;
            ProductoresPant2.setText(Integer.toString(numProductoresPantallas));

            if(contadorMassimo<30){
                pilaProductoresPantallasM.peek().stopToggle();
                pilaProductoresPantallasM.pop();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Despedido el jefe");
        }
    }//GEN-LAST:event_BotonMenosPant2ActionPerformed

    private void BotonMenosBotones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonMenosBotones2ActionPerformed
        // TODO add your handling code here:

        if(numProductoresBotones > 1){
            numProductoresBotones--;
            ProductoresB2.setText(Integer.toString(numProductoresBotones));

            if(contadorMassimo<30){
                pilaProductoresBotonesM.peek().stopToggle();
                pilaProductoresBotonesM.pop();
            }

        }else{
            JOptionPane.showMessageDialog(null, "Despedido el jefe");
        }
    }//GEN-LAST:event_BotonMenosBotones2ActionPerformed

    private void BotonSumPant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumPant2ActionPerformed
        // TODO add your handling code here:

        if ((numEnsambladoresM+numProductoresPantallas+numProductoresBotones+numProductoresCamaras+numProductoresPines)<numeroMaximoEmpleadosM) {
            numProductoresPantallas++;
            ProductoresPant2.setText(Integer.toString(numProductoresPantallas));

            if(contadorMassimo<30){
                //System.out.println(contadorMassimo);
                //System.out.println("si se puedeeeeeedfvsddg");
                ThreadPantallas = new ProductoresPantallasM(1, almacenPantallasM);
                ThreadPantallas.start();
                //Apilo cada thread a la pila  de ensambladores
                pilaProductoresPantallasM.push(ThreadPantallas);

            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumPant2ActionPerformed

    private void BotonSumCams2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumCams2ActionPerformed
        // TODO add your handling code here:

        if ((numEnsambladoresM+numProductoresPantallas+numProductoresBotones+numProductoresCamaras+numProductoresPines)<numeroMaximoEmpleadosM) {
            numProductoresCamaras++;
            ProductoresCams2.setText(Integer.toString(numProductoresCamaras));

            if(contadorMassimo<30){
                //System.out.println(contadorMassimo);
                //System.out.println("si se puedeeeeeedfvsddg");
                ThreadCamaras = new ProductoresCamarasM(1, almacenCamarasM);
                ThreadCamaras.start();
                //Apilo cada thread a la pila  de ensambladores
                pilaProductoresCamarasM.push(ThreadCamaras);

            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }
    }//GEN-LAST:event_BotonSumCams2ActionPerformed

    private void BotonSumBotones2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonSumBotones2ActionPerformed
        // TODO add your handling code here:
        if ((numEnsambladoresM+numProductoresPantallas+numProductoresBotones+numProductoresCamaras+numProductoresPines)<numeroMaximoEmpleadosM) {
            numProductoresBotones++;
            ProductoresB2.setText(Integer.toString(numProductoresBotones));

            if(contadorMassimo<30){
                //System.out.println(contadorMassimo);
                //System.out.println("si se puedeeeeeedfvsddg");
                ThreadBotones = new ProductoresBotonesM(1, almacenBotonesM);
                ThreadBotones.start();
                //Apilo cada thread a la pila  de ensambladores
                pilaProductoresBotonesM.push(ThreadBotones);

            }
        }else{
            JOptionPane.showMessageDialog(null, "Excedio el numero maximo de empleados");
        }

    }//GEN-LAST:event_BotonSumBotones2ActionPerformed
                                   
                                             
                                          
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
            java.util.logging.Logger.getLogger(InterfazPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPlantas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazPlantas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTextField AlmacenBotonesP1;
    public static javax.swing.JTextField AlmacenBotonesP2;
    public static javax.swing.JTextField AlmacenCamsP1;
    public static javax.swing.JTextField AlmacenCamsP2;
    public static javax.swing.JTextField AlmacenPantallasP1;
    public static javax.swing.JTextField AlmacenPantallasP2;
    public static javax.swing.JTextField AlmacenPinesP1;
    public static javax.swing.JTextField AlmacenPinesP2;
    private javax.swing.JButton BotonMenosBotones1;
    private javax.swing.JButton BotonMenosBotones2;
    private javax.swing.JButton BotonMenosCams1;
    private javax.swing.JButton BotonMenosCams2;
    private javax.swing.JButton BotonMenosEnsam1;
    private javax.swing.JButton BotonMenosEnsam2;
    private javax.swing.JButton BotonMenosPant1;
    private javax.swing.JButton BotonMenosPant2;
    private javax.swing.JButton BotonMenosPines1;
    private javax.swing.JButton BotonMenosPines2;
    private javax.swing.JButton BotonSumBotones1;
    private javax.swing.JButton BotonSumBotones2;
    private javax.swing.JButton BotonSumCams1;
    private javax.swing.JButton BotonSumCams2;
    private javax.swing.JButton BotonSumEnsam1;
    private javax.swing.JButton BotonSumEnsam2;
    private javax.swing.JButton BotonSumPant1;
    private javax.swing.JButton BotonSumPant2;
    private javax.swing.JButton BotonSumPines1;
    private javax.swing.JButton BotonSumPines2;
    private javax.swing.JButton Dashboard;
    public static javax.swing.JTextField Ensambladores1;
    public static javax.swing.JTextField Ensambladores2;
    public static javax.swing.JTextField GananciasTotales1;
    public static javax.swing.JTextField GananciasTotales2;
    public static javax.swing.JTextField GastosSalario1;
    public static javax.swing.JTextField GastosSalario2;
    public static javax.swing.JTextField JefePerdido1;
    public static javax.swing.JTextField JefePerdido2;
    public static javax.swing.JTextField ProductoresB1;
    public static javax.swing.JTextField ProductoresB2;
    public static javax.swing.JTextField ProductoresCams1;
    public static javax.swing.JTextField ProductoresCams2;
    public static javax.swing.JTextField ProductoresPant1;
    public static javax.swing.JTextField ProductoresPant2;
    public static javax.swing.JTextField ProductoresPines1;
    public static javax.swing.JTextField ProductoresPines2;
    public static javax.swing.JTextField TelefonosPlanta1;
    public static javax.swing.JTextField TelefonosPlanta2;
    public static javax.swing.JTextField TextGerentePlanta1;
    public static javax.swing.JTextField TextGerentePlanta3;
    public static javax.swing.JTextField TextJefePlanta1;
    public static javax.swing.JTextField TextJefePlanta3;
    private javax.swing.JTextField TiempoDias;
    public static javax.swing.JTextField UltimoLote1;
    public static javax.swing.JTextField UltimoLote2;
    public static javax.swing.JTextField countdownJOSE;
    public static javax.swing.JTextField countdownMASSIMO;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton start;
    private javax.swing.JToggleButton stop;
    // End of variables declaration//GEN-END:variables

 class FondoPanel extends JPanel{
     private Image imagen;
     
     public void paint(Graphics g){
         imagen = new ImageIcon(getClass().getResource("/Imagenes/uno.jpeg")).getImage();
         
         g.drawImage(imagen, 0, 0,getWidth(), getHeight(),this);
         setOpaque(false);
         super.paint(g);
     }
 }

}
