package Paneles;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import juegogato.AccionesGato;
/**
 *
 * @author Adrian
 */
public class PanelIndividual extends JPanel implements Runnable {

    
    byte turno = 1;  //1 para jugador; 0 para máquina
    String jugador = "Jugador";  //alias del jugador
    char simboloJugador = 'O';
    char simboloMaquina = 'X';    

    int[][] partida = {
        {-1, -1, -1}, /*a1, a2, a3*/
        {-1, -1, -1}, /*b1, b2, b3*/
        {-1, -1, -1} /*c1, c2, c3*/};
     int[][] vsTablero;
    
    Thread th = null;              //para verificar turno
    AccionesGato ag;
    //mis botones
    JButton[] btns;

    public PanelIndividual() {
        initComponents();
        btns = new JButton[]{a1,a2,a3,b1,b2,b3,c1,c2,c3};
        th = new Thread(this);
        ag = new AccionesGato();
        vsTablero = ag.vsTablero();        
        jugador = JOptionPane.showInputDialog("¡Bienvenido al juego del gato!\nPara comenzar ingrese un Alias para distinguirlo");
        if (jugador.isEmpty()) 
            jugador = "Jugador";
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoMaquina = new javax.swing.ButtonGroup();
        grupoUser = new javax.swing.ButtonGroup();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        a1 = new javax.swing.JButton();
        b1 = new javax.swing.JButton();
        c1 = new javax.swing.JButton();
        a2 = new javax.swing.JButton();
        a3 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        c3 = new javax.swing.JButton();
        c2 = new javax.swing.JButton();
        lblStatus = new javax.swing.JLabel();
        lblResultado = new javax.swing.JLabel();
        btnSalir = new org.edisoncor.gui.button.ButtonAeroRound();
        btnReiniciar = new org.edisoncor.gui.button.ButtonAeroRound();
        btnIniciar = new org.edisoncor.gui.button.ButtonAeroRound();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblJugadorTurno = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        lblJugador = new javax.swing.JLabel();
        rdOU = new javax.swing.JRadioButton();
        rdXU = new javax.swing.JRadioButton();
        rdXM = new javax.swing.JRadioButton();
        rdOM = new javax.swing.JRadioButton();
        btnSorteo = new org.edisoncor.gui.button.ButtonAeroRound();

        setBackground(new java.awt.Color(255, 255, 255));

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/descarga.png"))); // NOI18N
        panelImage1.setOpaque(false);

        jPanel2.setBackground(new java.awt.Color(218, 254, 180));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED), "Juego individual", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.BELOW_TOP, new java.awt.Font("Gill Sans Ultra Bold", 1, 18), new java.awt.Color(36, 158, 0))); // NOI18N
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        a1.setBackground(new java.awt.Color(218, 254, 180));
        a1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        a1.setBorder(null);
        a1.setBorderPainted(false);
        a1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a1.setEnabled(false);
        a1.setFocusPainted(false);
        a1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a1ActionPerformed(evt);
            }
        });

        b1.setBackground(new java.awt.Color(218, 254, 180));
        b1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b1.setBorder(null);
        b1.setBorderPainted(false);
        b1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b1.setEnabled(false);
        b1.setFocusPainted(false);
        b1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });

        c1.setBackground(new java.awt.Color(218, 254, 180));
        c1.setFont(new java.awt.Font("Arial", 1, 17)); // NOI18N
        c1.setBorder(null);
        c1.setBorderPainted(false);
        c1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c1.setEnabled(false);
        c1.setFocusPainted(false);
        c1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        a2.setBackground(new java.awt.Color(218, 254, 180));
        a2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        a2.setBorder(null);
        a2.setBorderPainted(false);
        a2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a2.setEnabled(false);
        a2.setFocusPainted(false);
        a2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a2ActionPerformed(evt);
            }
        });

        a3.setBackground(new java.awt.Color(218, 254, 180));
        a3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        a3.setBorder(null);
        a3.setBorderPainted(false);
        a3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        a3.setEnabled(false);
        a3.setFocusPainted(false);
        a3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        a3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a3ActionPerformed(evt);
            }
        });

        b2.setBackground(new java.awt.Color(218, 254, 180));
        b2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b2.setBorder(null);
        b2.setBorderPainted(false);
        b2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b2.setEnabled(false);
        b2.setFocusPainted(false);
        b2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });

        b3.setBackground(new java.awt.Color(218, 254, 180));
        b3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        b3.setBorder(null);
        b3.setBorderPainted(false);
        b3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        b3.setEnabled(false);
        b3.setFocusPainted(false);
        b3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });

        c3.setBackground(new java.awt.Color(218, 254, 180));
        c3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        c3.setBorder(null);
        c3.setBorderPainted(false);
        c3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c3.setEnabled(false);
        c3.setFocusPainted(false);
        c3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c3ActionPerformed(evt);
            }
        });

        c2.setBackground(new java.awt.Color(218, 254, 180));
        c2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        c2.setBorder(null);
        c2.setBorderPainted(false);
        c2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        c2.setEnabled(false);
        c2.setFocusPainted(false);
        c2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        c2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(b1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(c2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(c3, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(c1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        lblStatus.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblStatus.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStatus.setText("-");

        lblResultado.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblResultado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblResultado.setText("-");

        btnSalir.setBackground(new java.awt.Color(36, 158, 0));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir(evt);
            }
        });

        btnReiniciar.setBackground(new java.awt.Color(36, 158, 0));
        btnReiniciar.setText("Reiniciar partida");
        btnReiniciar.setEnabled(false);
        btnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReiniciarActionPerformed(evt);
            }
        });

        btnIniciar.setBackground(new java.awt.Color(51, 51, 255));
        btnIniciar.setText("Iniciar");
        btnIniciar.setEnabled(false);
        btnIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(218, 254, 180));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Turno de:");

        lblJugadorTurno.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblJugadorTurno.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugadorTurno.setText("------");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblJugadorTurno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblJugadorTurno)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(218, 254, 180));
        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Máquina:");

        lblJugador.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        lblJugador.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblJugador.setText("Anónimo");

        grupoUser.add(rdOU);
        rdOU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rdOU.setForeground(new java.awt.Color(0, 0, 102));
        rdOU.setSelected(true);
        rdOU.setText("O");
        rdOU.setEnabled(false);
        rdOU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdOUActionPerformed(evt);
            }
        });

        grupoUser.add(rdXU);
        rdXU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rdXU.setForeground(new java.awt.Color(0, 0, 102));
        rdXU.setText("X");
        rdXU.setEnabled(false);
        rdXU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdXUActionPerformed(evt);
            }
        });

        grupoMaquina.add(rdXM);
        rdXM.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rdXM.setForeground(new java.awt.Color(0, 0, 153));
        rdXM.setSelected(true);
        rdXM.setText("X");
        rdXM.setEnabled(false);

        grupoMaquina.add(rdOM);
        rdOM.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        rdOM.setForeground(new java.awt.Color(0, 0, 153));
        rdOM.setText("O");
        rdOM.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(rdOU)
                        .addGap(18, 18, 18)
                        .addComponent(rdXU)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblJugador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(rdOM)
                                .addGap(18, 18, 18)
                                .addComponent(rdXM)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblJugador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdOU)
                    .addComponent(rdXU))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdOM)
                    .addComponent(rdXM))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnSorteo.setBackground(new java.awt.Color(255, 51, 51));
        btnSorteo.setText("Sorteo");
        btnSorteo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSorteoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblResultado, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblStatus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 10, Short.MAX_VALUE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSorteo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(89, Short.MAX_VALUE))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalir(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir
        System.exit(0);
    }//GEN-LAST:event_btnSalir

    private void btnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReiniciarActionPerformed
        reiniciar();
    }//GEN-LAST:event_btnReiniciarActionPerformed

    private void btnIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarActionPerformed
        iniciarPartida();
    }//GEN-LAST:event_btnIniciarActionPerformed

    private void rdOUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdOUActionPerformed
        rdXM.setSelected(true);
        simboloJugador = 'O';
        simboloMaquina = 'X';
    }//GEN-LAST:event_rdOUActionPerformed

    private void rdXUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdXUActionPerformed
        rdOM.setSelected(true);
        simboloJugador = 'X';
        simboloMaquina = 'O';
    }//GEN-LAST:event_rdXUActionPerformed

    private void btnSorteoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSorteoActionPerformed
        sorteo();
    }//GEN-LAST:event_btnSorteoActionPerformed

    private void a1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a1ActionPerformed
        escribir(a1, 0, 0);
    }//GEN-LAST:event_a1ActionPerformed

    private void a2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a2ActionPerformed
        escribir(a2, 0, 1);
    }//GEN-LAST:event_a2ActionPerformed

    private void a3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a3ActionPerformed
        escribir(a3, 0, 2);
    }//GEN-LAST:event_a3ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        escribir(b1, 1, 0);
    }//GEN-LAST:event_b1ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
        escribir(b2, 1, 1);
    }//GEN-LAST:event_b2ActionPerformed

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        escribir(b3, 1, 2);
    }//GEN-LAST:event_b3ActionPerformed

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        escribir(c1, 2, 0);
    }//GEN-LAST:event_c1ActionPerformed

    private void c2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c2ActionPerformed
        escribir(c2, 2, 1);
    }//GEN-LAST:event_c2ActionPerformed

    private void c3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c3ActionPerformed
        escribir(c3, 2, 2);
    }//GEN-LAST:event_c3ActionPerformed

    private void iniciarPartida() {
        bloquearBtn(true);
        rdOU.setEnabled(false);
        rdXU.setEnabled(false);
        btnIniciar.setEnabled(false);
        th.start();
    }

    private void escribir(JButton btn, int x, int y) {
        if (turno == 0) {
            btn.setText(String.valueOf(simboloMaquina));
            partida[x][y] = 0;
            turno = 1;
            lblJugadorTurno.setText(jugador);
        } else {
            btn.setText(String.valueOf(simboloJugador));
            partida[x][y] = 1;
            turno = 0;
            lblJugadorTurno.setText("Máquina");
        }
        btn.setEnabled(false);
    }

    private void sorteo() {
        turno = (byte) Math.floor(Math.random() * 2);
        btnIniciar.setEnabled(true);
        btnSorteo.setEnabled(false);
        btnReiniciar.setEnabled(true);
        rdOU.setEnabled(true);
        rdXU.setEnabled(true);
        lblJugadorTurno.setText((turno == 0)?"Máquina":jugador);                      
    }

    private void reiniciar() {
        th.stop();
        th = new Thread(this);
        vsTablero = ag.vsTablero();
        for (int[] partida1 : partida) {
            for (int j = 0; j < partida1.length; j++) 
                partida1[j] = -1;
        }
        btnSorteo.setEnabled(true);
        btnIniciar.setEnabled(false);
        rdOU.setEnabled(false);
        rdXU.setEnabled(false);
        rdOU.doClick();
        lblJugadorTurno.setText("------");
        lblStatus.setText("-");
        lblResultado.setText("-");
        bloquearBtn(false);
        limpiarBtn();
    }

    private void limpiarBtn() {        
        for (JButton btn : btns) 
            btn.setText("");
    }

    private void bloquearBtn(boolean status) {
        for (JButton btn : btns) 
            btn.setEnabled(status);        
    }

    private void clickBoton(int[] xy){
        if(xy[0] == 0 && xy[1] == 0)  a1.doClick();
        else if(xy[0] == 0 && xy[1] == 1)  a2.doClick();
        else if(xy[0] == 0 && xy[1] == 2)  a3.doClick();
        else if(xy[0] == 1 && xy[1] == 0)  b1.doClick();
        else if(xy[0] == 1 && xy[1] == 1)  b2.doClick();
        else if(xy[0] == 1 && xy[1] == 2)  b3.doClick();
        else if(xy[0] == 2 && xy[1] == 0)  c1.doClick();
        else if(xy[0] == 2 && xy[1] == 1)  c2.doClick();
        else if(xy[0] == 2 && xy[1] == 2)  c3.doClick();
    }
    
    private void mostrarResultado(String t1, String t2){
        lblStatus.setText(t1);
        lblResultado.setText(t2);
        bloquearBtn(false);
        th.stop();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton a1;
    private javax.swing.JButton a2;
    private javax.swing.JButton a3;
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private org.edisoncor.gui.button.ButtonAeroRound btnIniciar;
    private org.edisoncor.gui.button.ButtonAeroRound btnReiniciar;
    private org.edisoncor.gui.button.ButtonAeroRound btnSalir;
    private org.edisoncor.gui.button.ButtonAeroRound btnSorteo;
    private javax.swing.JButton c1;
    private javax.swing.JButton c2;
    private javax.swing.JButton c3;
    private javax.swing.ButtonGroup grupoMaquina;
    private javax.swing.ButtonGroup grupoUser;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lblJugador;
    private javax.swing.JLabel lblJugadorTurno;
    private javax.swing.JLabel lblResultado;
    private javax.swing.JLabel lblStatus;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JRadioButton rdOM;
    private javax.swing.JRadioButton rdOU;
    private javax.swing.JRadioButton rdXM;
    private javax.swing.JRadioButton rdXU;
    // End of variables declaration//GEN-END:variables

    @Override
    public void run() {
        try {            
            int cont = 0;
            while (true) {
                Thread.sleep(500); 
                
                if (ag.verificarEjes(partida, 1)) 
                    mostrarResultado("¡Felicidades!", jugador+" eres el ganador.");                                        
                else if (ag.verificarEjes(partida, 0)) 
                    mostrarResultado("¡Lo siento!", jugador+" has perdido.");
                else if (ag.verificarEmpate(partida)) 
                    mostrarResultado("Esto es un", "¡Empate!");
                                
                if (turno == 0) {                    
                    int[] xy = ag.bloquearJuego(partida, 1, 0);
                    int[] xy2 = ag.bloquearJuego(partida, 0, 1);
                    int[] raya = ag.existeRaya(partida);
                    if (xy2 != null) {
                        System.out.println("ENTRE A GANAR");
                        clickBoton(xy2);
                    }else if(xy != null){
                        System.out.println("ENTRE A BLOQUEAR");
                        clickBoton(xy);
                    } else if(raya != null && cont == 9){
                        System.out.println("ENTRE A TERMINAR");
                        clickBoton(raya);
                    }else if(cont < 9) {
                        System.out.println("ENTRE A ESTRATEGIA "+ cont);
                        cont = 0;
                        boolean estrategia = true;
                        while (estrategia) {                            
                            for (int i = 0; i < vsTablero.length; i++) {
                                int j = (int) Math.floor(Math.random()*3);
                                    if (vsTablero[i][j] == 0 && partida[i][j] == -1) {
                                        clickBoton(new int[]{i,j});
                                        vsTablero[i][j]=-1;
                                        estrategia = false; 
                                        break;
                                    } else{
                                        vsTablero[i][j]=-1;
                                    }
                                    if(vsTablero[i][j] == -1){                                        
                                        cont++;                                 
                                        System.out.println("Contador = "+cont);
                                    }
                            }
                            if (cont >= 9) 
                                estrategia = false;                            
                         }                                                                                               
                    }                                    
                }
            }
        } catch (Exception ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}