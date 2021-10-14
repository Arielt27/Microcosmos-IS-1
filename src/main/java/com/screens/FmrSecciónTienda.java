/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.SeccionTienda;
import com.dao.SeccionTiendaJpaController;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class FmrSecciónTienda extends javax.swing.JFrame{
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    
    SeccionTiendaJpaController daoSeccionTienda = new SeccionTiendaJpaController();
    SeccionTienda objSeccionTienda = new SeccionTienda();
    
    Icon icono = new ImageIcon(getClass().getResource("/imagenes/guardar.png"));

    /**
     * Creates new form SecciónTienda
     */
    
    public FmrSecciónTienda(){
        initComponents();
        this.setLocationRelativeTo(null);
        
        //ÍCONO
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon); 
        
        //INICIALIZAR PANTALLA
        ActualizarSeccion();
        Txt_Activo.setVisible(false);
        Btn_Actualizar.setEnabled(false);
        Btn_Activar.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        JTable_Sección = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_IdSección = new javax.swing.JTextField();
        Txt_NombreSección = new javax.swing.JTextField();
        Txt_DescripcionSecciónTienda = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sección de Tienda - Microcosmos");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);

        JTable_Sección.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Sección en Tienda", "Descripción", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTable_Sección.getTableHeader().setReorderingAllowed(false);
        JTable_Sección.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JTable_SecciónMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(JTable_Sección);
        if (JTable_Sección.getColumnModel().getColumnCount() > 0) {
            JTable_Sección.getColumnModel().getColumn(0).setResizable(false);
            JTable_Sección.getColumnModel().getColumn(1).setResizable(false);
            JTable_Sección.getColumnModel().getColumn(2).setResizable(false);
            JTable_Sección.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 230));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 230));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Datos");
        jLabel5.setMaximumSize(new java.awt.Dimension(299, 41));
        jLabel5.setPreferredSize(new java.awt.Dimension(299, 41));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("ID de Sección");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Sección de Tienda");
        jLabel3.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Descripción");
        jLabel4.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel4.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel4.setPreferredSize(new java.awt.Dimension(120, 20));

        Txt_IdSección.setEditable(false);
        Txt_IdSección.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdSecciónKeyTyped(evt);
            }
        });

        Txt_NombreSección.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreSecciónKeyTyped(evt);
            }
        });

        Txt_DescripcionSecciónTienda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DescripcionSecciónTiendaKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Txt_DescripcionSecciónTienda, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_IdSección, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreSección, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_IdSección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_NombreSección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_DescripcionSecciónTienda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 130));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 130));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 130));

        Btn_Añadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/anadir.png"))); // NOI18N
        Btn_Añadir.setText(" Añadir");
        Btn_Añadir.setToolTipText("Añade una nueva sección en tienda si los campos están correctamente rellenos.");
        Btn_Añadir.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Añadir.setFocusPainted(false);
        Btn_Añadir.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Añadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_AñadirActionPerformed(evt);
            }
        });

        Btn_Actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/actualizar.png"))); // NOI18N
        Btn_Actualizar.setText(" Actualizar");
        Btn_Actualizar.setToolTipText("Actualiza los datos de una sección ya registrada en el sistema.");
        Btn_Actualizar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Actualizar.setFocusPainted(false);
        Btn_Actualizar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActualizarActionPerformed(evt);
            }
        });

        Btn_Activar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/estado.png"))); // NOI18N
        Btn_Activar.setText(" Desactivar");
        Btn_Activar.setToolTipText("Activa o desactiva la sección seleccionada.");
        Btn_Activar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Activar.setFocusPainted(false);
        Btn_Activar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Activar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Activar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Activar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_ActivarActionPerformed(evt);
            }
        });

        Btn_Limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/limpiar.png"))); // NOI18N
        Btn_Limpiar.setText(" Limpiar");
        Btn_Limpiar.setToolTipText("Limpia los campos de ingreso de datos.");
        Btn_Limpiar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Limpiar.setFocusPainted(false);
        Btn_Limpiar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_LimpiarActionPerformed(evt);
            }
        });

        Btn_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/regresar.png"))); // NOI18N
        Btn_Regresar.setText(" Regresar");
        Btn_Regresar.setToolTipText("Regresa a la pantalla de Menú Principal.");
        Btn_Regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Regresar.setFocusPainted(false);
        Btn_Regresar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_RegresarActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Acciones");
        jLabel11.setMaximumSize(new java.awt.Dimension(265, 25));
        jLabel11.setMinimumSize(new java.awt.Dimension(265, 25));
        jLabel11.setPreferredSize(new java.awt.Dimension(265, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(Btn_Actualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Btn_Activar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(260, 260, 260))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn_Actualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Activar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VALIDACIONES CAMPOS
    private void Txt_IdSecciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdSecciónKeyTyped
          
    }//GEN-LAST:event_Txt_IdSecciónKeyTyped

    private void Txt_NombreSecciónKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreSecciónKeyTyped
       
        char l = evt.getKeyChar();                        
        String Texto = Txt_NombreSección.getText();        
        
        // Primera letra mayúscula
        if (Txt_NombreSección.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_NombreSección.setText(Texto);
        }
        
        // Bloquear carácteres especiales menos espacio
        if (!Character.isLetter(l) && l != KeyEvent.VK_SPACE)
        {
            evt.consume();            
        }
        
        // Maximo de carácteres permitidos
        if (Txt_NombreSección.getText().length() >= 20)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        } 
        
        if (Txt_NombreSección.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_NombreSección.setText(Texto);
        }    
    }//GEN-LAST:event_Txt_NombreSecciónKeyTyped

    private void Txt_DescripcionSecciónTiendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DescripcionSecciónTiendaKeyTyped
        char l = evt.getKeyChar();                
        String Texto = Txt_DescripcionSecciónTienda.getText();

        // Primera letra mayúscula
        if (Txt_DescripcionSecciónTienda.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_DescripcionSecciónTienda.setText(Texto);
        }
        
        // Bloquear carácteres especiales menos espacio
        if (!Character.isLetter(l) && l != KeyEvent.VK_SPACE)
        {
            evt.consume();            
        }
        
        // Maximo de carácteres permitidos
        if (Txt_DescripcionSecciónTienda.getText().length() >= 40)
        {
            evt.consume();     
            Toolkit.getDefaultToolkit().beep();
        } 
        
        if (Txt_DescripcionSecciónTienda.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_DescripcionSecciónTienda.setText(Texto);
        }    
    }//GEN-LAST:event_Txt_DescripcionSecciónTiendaKeyTyped

    //FUNCIONES BOTONES
    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
        
        LlenarSeccion();
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed
        
        int fila = JTable_Sección.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarSeccion();
            LimpiarSeccion();            
        }
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed
        
        int fila = JTable_Sección.getSelectedRow();

        if(fila != -1){

            Activar_Desactivar();

        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila");

        }
    }//GEN-LAST:event_Btn_ActivarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        
        LimpiarSeccion();
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed
        
        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void JTable_SecciónMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JTable_SecciónMouseClicked
        
        int fila = JTable_Sección.getSelectedRow();
        if(fila == -1)
        {
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");            
        }else{
            Btn_Añadir.setEnabled(false);
            Btn_Limpiar.setEnabled(true);
            Btn_Actualizar.setEnabled(true);
            Btn_Activar.setEnabled(true);
            
            String Id = JTable_Sección.getValueAt(fila, 0).toString();
            String Nombre = JTable_Sección.getValueAt(fila, 1).toString();
            String Descripcion = JTable_Sección.getValueAt(fila, 2).toString();
            String Activo = JTable_Sección.getValueAt(fila, 3).toString();
            
            Txt_IdSección.setText(Id);
            Txt_NombreSección.setText(Nombre);
            Txt_DescripcionSecciónTienda.setText(Descripcion);
            Txt_Activo.setText(Activo);
            
            if(Activo == "Activado")
            {
                Btn_Activar.setText("Desactivar");
            }else{
                Btn_Activar.setText("Activar");
            }
        }        
    }//GEN-LAST:event_JTable_SecciónMouseClicked

        
    //FUNCIONES 
    private void LlenarSeccion()
    {
        if(Txt_NombreSección.getText().length() < 4)
        {            
            JOptionPane.showMessageDialog(null, "El nombre tiene que contener al menos 4 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionDeRepetidos(Txt_NombreSección.getText()) == true){                       
            JOptionPane.showMessageDialog(null, "Este elemento ya existe.","Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_NombreSección.getText()) == true){                    
            JOptionPane.showMessageDialog(null, "El nombre no puede contener letras consecutivas repetidas","Error", JOptionPane.ERROR_MESSAGE);
        }else if(Txt_DescripcionSecciónTienda.getText().length() < 8){                    
            JOptionPane.showMessageDialog(null, "La descripción debe contener al menos 8 letras.","Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_DescripcionSecciónTienda.getText()) == true){                    
            JOptionPane.showMessageDialog(null, "La descripción no puede contener letras consecutivas repetidas","Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            objSeccionTienda.setNombreSeccionTienda(Txt_NombreSección.getText());
            objSeccionTienda.setDescripcionSeccionTienda(Txt_DescripcionSecciónTienda.getText());
            objSeccionTienda.setActivoSeccionTienda(true);
            
            try{
                daoSeccionTienda.create(objSeccionTienda);
                ActualizarSeccion();
                LimpiarSeccion();
                JOptionPane.showMessageDialog(null, "Datos guardados correctamente.", "Sección Tienda", 0, icono);                
        } catch (Exception ex) {
            Logger.getLogger(FmrSecciónTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
    }
    
    private void EditarSeccion()
    {
        if(Txt_NombreSección.getText().length() < 4)
        {            
            JOptionPane.showMessageDialog(null, "El nombre tiene que contener al menos 4 letras.","!Error¡", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_NombreSección.getText()) == true){                    
            JOptionPane.showMessageDialog(null, "El nombre no puede contener letras consecutivas repetidas","Error", JOptionPane.ERROR_MESSAGE);
        }else if(Txt_DescripcionSecciónTienda.getText().length() < 8){                    
            JOptionPane.showMessageDialog(null, "La descripción debe contener al menos 8 letras.","Error", JOptionPane.ERROR_MESSAGE);
        }else if(ValidacionTresLetras(Txt_DescripcionSecciónTienda.getText()) == true){                    
            JOptionPane.showMessageDialog(null, "La descripción no puede contener letras consecutivas repetidas","Error", JOptionPane.ERROR_MESSAGE);
        }else{
            
            objSeccionTienda.setIdSeccionTienda(Integer.parseInt(Txt_IdSección.getText()));
            objSeccionTienda.setNombreSeccionTienda(Txt_NombreSección.getText());
            objSeccionTienda.setDescripcionSeccionTienda(Txt_DescripcionSecciónTienda.getText());       
       
       try{
           daoSeccionTienda.edit(objSeccionTienda);
           ActualizarSeccion();
           JOptionPane.showMessageDialog(null, "Se actualizó correctamente.", "Sección Tienda", 0, icono);                
        }catch(Exception ex){
            Logger.getLogger(FmrSecciónTienda.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
    
    private void ActualizarSeccion()
    {
        DefaultTableModel t = (DefaultTableModel)JTable_Sección.getModel();
        t.setRowCount(0);              
        JTable_Sección.setModel(t);        
        
        List<SeccionTienda> seccion = this.daoSeccionTienda.findSeccionTiendaEntities();
        
        String s;
        for(SeccionTienda Seccion : seccion)
        {                         
            if(Seccion.isActivoSeccionTienda() == true)
            {
                s = "Activado";
            }else{
                s = "Desactivado";
            }
            
            t.addRow(
                    new Object[]{
                        Seccion.getIdSeccionTienda(),
                        Seccion.getNombreSeccionTienda(),
                        Seccion.getDescripcionSeccionTienda(),
                        s
                    });
            }        
        
        Btn_Añadir.setEnabled(true);
        Btn_Limpiar.setEnabled(false);
    }
    
    private void LimpiarSeccion()
    {
        Btn_Actualizar.setEnabled(false);
        Btn_Activar.setEnabled(false);
        Txt_IdSección.setText("");
        Txt_NombreSección.setText("");
        Txt_DescripcionSecciónTienda.setText("");  
        Btn_Añadir.setEnabled(true);
    }
    
    private void Activar_Desactivar()
    {
        int fila = JTable_Sección.getSelectedRow();
        
        String a = Txt_Activo.getText();
       
        if(a.equals("Activado")){
        
        objSeccionTienda.setIdSeccionTienda(Integer.parseInt(Txt_IdSección.getText()));
        objSeccionTienda.setNombreSeccionTienda(JTable_Sección.getValueAt(fila, 1).toString());
        objSeccionTienda.setDescripcionSeccionTienda(JTable_Sección.getValueAt(fila, 2).toString());
        objSeccionTienda.setActivoSeccionTienda(false);
        
        
        try {
            daoSeccionTienda.edit(objSeccionTienda);
            ActualizarSeccion();
            Btn_Activar.setText("Activar");
            JOptionPane.showMessageDialog(this, "Se desactivó correctamente.");
        } catch (Exception ex) {
            Logger.getLogger(FmrSecciónTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        LimpiarSeccion();
        Btn_Limpiar.setEnabled(false);
        Btn_Añadir.setEnabled(true);
        
        }else{
        
        objSeccionTienda.setIdSeccionTienda(Integer.parseInt(Txt_IdSección.getText()));
        objSeccionTienda.setNombreSeccionTienda(JTable_Sección.getValueAt(fila, 1).toString());
        objSeccionTienda.setDescripcionSeccionTienda(JTable_Sección.getValueAt(fila, 2).toString());
        objSeccionTienda.setActivoSeccionTienda(true);
        
        try {
            daoSeccionTienda.edit(objSeccionTienda);
            ActualizarSeccion();
            Btn_Activar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "Se activó correctamente.");
        } catch (Exception ex) {
            Logger.getLogger(FmrSecciónTienda.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarSeccion();    
        Btn_Limpiar.setEnabled(false);
        Btn_Añadir.setEnabled(true);
        }        
    }
    
    public static boolean ValidacionDeRepetidos(String Nombre)
    {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT idSeccionTienda FROM SeccionTienda WHERE nombreSeccionTienda  = '"+Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }        
    }
    
    public boolean ValidacionTresLetras(String Nombre)
    {
        String patron = "^(\\d|(([A-Za-zñÑ\\s])\\3?(?!\\3)))+$";
        Pattern patt = Pattern.compile(patron);
        Matcher comparador = patt.matcher(Nombre);
        if(comparador.matches())
        {
            return false;
        }else{
            return true;
        }
    }
    
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
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrAreaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FmrSecciónTienda().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar;
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable JTable_Sección;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionSecciónTienda;
    private javax.swing.JTextField Txt_IdSección;
    private javax.swing.JTextField Txt_NombreSección;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
