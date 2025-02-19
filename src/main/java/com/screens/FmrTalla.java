/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Talla;
import com.dao.TallaJpaController;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ariel
 */
public class FmrTalla extends javax.swing.JFrame {

    
    //Se crea el Entity manager factory
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    //Se declaran los controladores de cada una de las tablas
    TallaJpaController daoTalla = new TallaJpaController();
    //Objeto global
    Talla objTalla = new Talla();
    
    public FmrTalla() {
        initComponents();
        this.setLocationRelativeTo(null);
        //Icono
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ActualizarTalla();
        Txt_Activo.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Txt_IdTalla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Txt_NombreTalla = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Txt_DescripcionTalla = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tbl_Talla = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        Btn_Regresar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Activar_Desactivar = new javax.swing.JButton();
        Btn_Editar = new javax.swing.JButton();
        Btn_Añadir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tallas - Microcosmos");
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        jPanel2.setBackground(new java.awt.Color(60, 63, 65));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setMaximumSize(new java.awt.Dimension(800, 230));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 230));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 230));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setVerifyInputWhenFocusTarget(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("ID Talla");
        jLabel1.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_IdTalla.setEditable(false);
        Txt_IdTalla.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_IdTallaFocusLost(evt);
            }
        });
        Txt_IdTalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IdTallaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Nombre Talla");
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_NombreTalla.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreTallaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Descripción");
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_Activo.setMinimumSize(new java.awt.Dimension(0, 0));
        Txt_Activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_ActivoActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Ingresar Datos");
        jLabel5.setMaximumSize(new java.awt.Dimension(299, 41));
        jLabel5.setMinimumSize(new java.awt.Dimension(299, 41));
        jLabel5.setPreferredSize(new java.awt.Dimension(299, 41));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(253, 253, 253))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(Txt_NombreTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(235, 235, 235)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_DescripcionTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(288, 288, 288)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Txt_IdTalla, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(211, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_IdTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DescripcionTalla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))))
        );

        Tbl_Talla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Nombre de Talla", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Talla.setPreferredSize(new java.awt.Dimension(225, 95));
        Tbl_Talla.getTableHeader().setReorderingAllowed(false);
        Tbl_Talla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_TallaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(Tbl_Talla);

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 130));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 130));
        jPanel3.setPreferredSize(new java.awt.Dimension(800, 130));

        Btn_Regresar.setText("Regresar");
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

        Btn_Limpiar.setText("Limpiar");
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

        Btn_Activar_Desactivar.setText("Desactivar");
        Btn_Activar_Desactivar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Activar_Desactivar.setFocusPainted(false);
        Btn_Activar_Desactivar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Activar_Desactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_Activar_DesactivarActionPerformed(evt);
            }
        });

        Btn_Editar.setText("Actualizar");
        Btn_Editar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 153, 255)));
        Btn_Editar.setFocusPainted(false);
        Btn_Editar.setMaximumSize(new java.awt.Dimension(120, 50));
        Btn_Editar.setMinimumSize(new java.awt.Dimension(120, 50));
        Btn_Editar.setPreferredSize(new java.awt.Dimension(120, 50));
        Btn_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_EditarActionPerformed(evt);
            }
        });

        Btn_Añadir.setText("Añadir");
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Acciones");
        jLabel7.setMaximumSize(new java.awt.Dimension(265, 25));
        jLabel7.setMinimumSize(new java.awt.Dimension(265, 25));
        jLabel7.setPreferredSize(new java.awt.Dimension(265, 25));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(Btn_Activar_Desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(261, 261, 261))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Añadir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Editar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Activar_Desactivar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        jPanel4.setBackground(new java.awt.Color(49, 49, 49));
        jPanel4.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel4.setMinimumSize(new java.awt.Dimension(800, 100));
        jPanel4.setPreferredSize(new java.awt.Dimension(800, 100));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 800, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_IdTallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IdTallaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdTallaActionPerformed

    private void Txt_IdTallaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_IdTallaFocusLost
        
        
        
        
    }//GEN-LAST:event_Txt_IdTallaFocusLost

    private void Tbl_TallaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_TallaMouseClicked
       
        
        int fila = Tbl_Talla.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        
        }else{
        
        String Id = Tbl_Talla.getValueAt(fila, 0).toString();
        String Nombre = Tbl_Talla.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_Talla.getValueAt(fila, 2).toString();
        String Activo = Tbl_Talla.getValueAt(fila, 3).toString();
        Txt_IdTalla.setText(Id);
        Txt_NombreTalla.setText(Nombre);
        Txt_DescripcionTalla.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "Activado"){
        Btn_Activar_Desactivar.setText("Desactivar");
        }else{
        
             Btn_Activar_Desactivar.setText("Activar");
        
        }
        }
        
        
    }//GEN-LAST:event_Tbl_TallaMouseClicked

    private void Txt_NombreTallaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreTallaKeyTyped
              
    }//GEN-LAST:event_Txt_NombreTallaKeyTyped

    private void Txt_ActivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_ActivoActionPerformed
        
    }//GEN-LAST:event_Txt_ActivoActionPerformed

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
        LlenarTalla();
        LimpiarTalla();
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_EditarActionPerformed

        int fila = Tbl_Talla.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarTalla();
            LimpiarTalla();
        }
    }//GEN-LAST:event_Btn_EditarActionPerformed

    private void Btn_Activar_DesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_Activar_DesactivarActionPerformed

        int fila = Tbl_Talla.getSelectedRow();

        if(fila != -1){

            Activar_Desactivar();

        }else{

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a Activar o Desactivar en la Fila");

        }

    }//GEN-LAST:event_Btn_Activar_DesactivarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed
        LimpiarTalla();
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_Btn_RegresarActionPerformed

       private void LimpiarTalla(){
       
       Txt_IdTalla.setText("");
       Txt_NombreTalla.setText("");
       Txt_DescripcionTalla.setText("");
       }
       
       private void ActualizarTalla(){
       
            DefaultTableModel t = new DefaultTableModel();
            Tbl_Talla.setModel(t);
            t.addColumn("Id");
            t.addColumn("Nombre");
            t.addColumn("Descripción");
            t.addColumn("Estado");
        
            List<Talla> talla = this.daoTalla.findTallaEntities();
        
            String s;
            for(Talla Talla : talla){
                
                if(Talla.isActivoTalla() == true){
                s = "Activado";
                }else{
                s = "Desactivado";
                }
                t.addRow(
                    new Object[]{
                        Talla.getIdTalla(),
                        Talla.getNombreTalla(),
                        Talla.getDescripcionTalla(),
                        s
                    });
            }
       
       
       }
       
       private void LlenarTalla(){
        
        if(Txt_NombreTalla.getText().length() < 1){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos una letra");
        
        }else{
       objTalla.setNombreTalla(Txt_NombreTalla.getText());
       objTalla.setDescripcionTalla(Txt_DescripcionTalla.getText());
       objTalla.setActivoTalla(true);
        
        try {
            daoTalla.create(objTalla);
            ActualizarTalla();
            JOptionPane.showMessageDialog(this, "se guardó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
       }   
       }
    
       private void EditarTalla(){
                  
           
        if(Txt_NombreTalla.getText().length() < 1){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos una letra");
        
        }else{
       objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
       objTalla.setNombreTalla(Txt_NombreTalla.getText());
       objTalla.setDescripcionTalla(Txt_DescripcionTalla.getText());
       
       
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            JOptionPane.showMessageDialog(this, "se actualizó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
       
       
       
        private void Activar_Desactivar(){
        
        int fila = Tbl_Talla.getSelectedRow();
        
        String a = Txt_Activo.getText().toString();
       
        if(a.equals("Activado")){
        
        objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
        objTalla.setNombreTalla(Tbl_Talla.getValueAt(fila, 1).toString());
        objTalla.setDescripcionTalla(Tbl_Talla.getValueAt(fila, 2).toString());
        objTalla.setActivoTalla(false);
        
        
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            Btn_Activar_Desactivar.setText("Activar");
            JOptionPane.showMessageDialog(this, "se desactivó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        LimpiarTalla();
        
        }else{
        
        objTalla.setIdTalla(Integer.parseInt(Txt_IdTalla.getText()));
        objTalla.setNombreTalla(Tbl_Talla.getValueAt(fila, 1).toString());
        objTalla.setDescripcionTalla(Tbl_Talla.getValueAt(fila, 2).toString());
        objTalla.setActivoTalla(true);
        
        try {
            daoTalla.edit(objTalla);
            ActualizarTalla();
            Btn_Activar_Desactivar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "se activó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTalla.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarTalla();
        
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
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrTalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrTalla().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar_Desactivar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Editar;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_Talla;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionTalla;
    private javax.swing.JTextField Txt_IdTalla;
    private javax.swing.JTextField Txt_NombreTalla;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
