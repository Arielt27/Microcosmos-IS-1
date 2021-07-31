/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.Estado;
import com.dao.EstadoJpaController;
import static com.screens.FmrTalla.ValidacionDeRepetidos;
import java.awt.Image;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author david
 */
public class FmrEstado extends javax.swing.JFrame {
EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");

EstadoJpaController daoEstado = new EstadoJpaController();  
Estado objEstado = new Estado();
    /**
     * Creates new form Estado
     */
    public FmrEstado() {
        initComponents();
        this.setLocationRelativeTo(null);
         Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
  
       Txt_Activo.setVisible(false);
       Btn_Actualizar.setEnabled(false);
       Btn_Activar.setEnabled(false);
        ActualizarEstado();
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
        Tbl_Estado = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Txt_DescripcionEstado = new javax.swing.JTextField();
        Txt_NombreEstado = new javax.swing.JTextField();
        Txt_IdEstado = new javax.swing.JTextField();
        Txt_Activo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        Btn_Añadir = new javax.swing.JButton();
        Btn_Actualizar = new javax.swing.JButton();
        Btn_Activar = new javax.swing.JButton();
        Btn_Limpiar = new javax.swing.JButton();
        Btn_Regresar = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Estados - Microcosmos");
        setMaximumSize(new java.awt.Dimension(800, 600));
        setMinimumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        setSize(new java.awt.Dimension(800, 600));

        Tbl_Estado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Estado", "Descripción"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Tbl_Estado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tbl_EstadoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tbl_Estado);
        if (Tbl_Estado.getColumnModel().getColumnCount() > 0) {
            Tbl_Estado.getColumnModel().getColumn(0).setResizable(false);
            Tbl_Estado.getColumnModel().getColumn(1).setResizable(false);
            Tbl_Estado.getColumnModel().getColumn(2).setResizable(false);
        }

        jPanel1.setBackground(new java.awt.Color(49, 49, 49));
        jPanel1.setMaximumSize(new java.awt.Dimension(800, 100));
        jPanel1.setMinimumSize(new java.awt.Dimension(800, 100));

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
        jLabel2.setText("ID de Estado");
        jLabel2.setMaximumSize(new java.awt.Dimension(120, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(120, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(120, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Estado");
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

        Txt_DescripcionEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_DescripcionEstadoKeyTyped(evt);
            }
        });

        Txt_NombreEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_NombreEstadoKeyTyped(evt);
            }
        });

        Txt_IdEstado.setEditable(false);
        Txt_IdEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Txt_IdEstadoKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
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
                            .addComponent(Txt_DescripcionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_IdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(196, 196, 196))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_IdEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_NombreEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Txt_DescripcionEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Txt_Activo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(60, 63, 65));
        jPanel3.setMaximumSize(new java.awt.Dimension(800, 130));
        jPanel3.setMinimumSize(new java.awt.Dimension(800, 130));

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

        Btn_Actualizar.setText("Actualizar");
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

        Btn_Activar.setText("Desactivar");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_NombreEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_NombreEstadoKeyTyped

        char c = evt.getKeyChar();
        String Texto = Txt_NombreEstado.getText();

        if((c < 'A' || c > 'Z') && (c < 'a' || c > 'z')){

            evt.consume();

        }

        if (Txt_NombreEstado.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_NombreEstado.setText(Texto);
            
            

        }
         if((evt.getKeyChar() == 22)){
        
            Txt_NombreEstado.setText(Texto.substring(0, 25));
                    
        }
        
        if (Txt_NombreEstado.getText().length() >= 25){
        
        evt.consume();
        
        }

    }//GEN-LAST:event_Txt_NombreEstadoKeyTyped

    private void Txt_IdEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_IdEstadoKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IdEstadoKeyTyped

    private void Btn_AñadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_AñadirActionPerformed
       LlenarEstado();
        
        
    }//GEN-LAST:event_Btn_AñadirActionPerformed

    private void Btn_ActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActualizarActionPerformed
       int fila = Tbl_Estado.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarEstado();
            LimpiarEstado();
        }
     
    }//GEN-LAST:event_Btn_ActualizarActionPerformed

    private void Btn_ActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_ActivarActionPerformed
         int fila = Tbl_Estado.getSelectedRow();
        if(fila == -1){

            JOptionPane.showMessageDialog(this, "Debe seleccionar el elemento a actualizar en la Fila");

        }else{

            EditarEstado();
            LimpiarEstado();
        }
        
    }//GEN-LAST:event_Btn_ActivarActionPerformed

    private void Btn_LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_LimpiarActionPerformed

        LimpiarEstado();
    }//GEN-LAST:event_Btn_LimpiarActionPerformed

    private void Btn_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_RegresarActionPerformed

        FmrConfiguraciones conf = new FmrConfiguraciones();
        conf.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Btn_RegresarActionPerformed

    private void Tbl_EstadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tbl_EstadoMouseClicked

            
        int fila = Tbl_Estado.getSelectedRow();
        if(fila == -1){
        
            JOptionPane.showMessageDialog(this, "Debe seleccionar una Fila");
        
        }else{
        Btn_Actualizar.setEnabled(true);
        Btn_Activar.setEnabled(true);
        String Id = Tbl_Estado.getValueAt(fila, 0).toString();
        String Nombre = Tbl_Estado.getValueAt(fila, 1).toString();
        String Descripcion = Tbl_Estado.getValueAt(fila, 2).toString();
        String Activo = Tbl_Estado.getValueAt(fila, 3).toString();
        Txt_IdEstado.setText(Id);
        Txt_NombreEstado.setText(Nombre);
        Txt_DescripcionEstado.setText(Descripcion);
        Txt_Activo.setText(Activo);
        
        if(Activo == "Activado"){
        Btn_Activar.setText("Desactivar");
        }else{
        
             Btn_Activar.setText("Activar");
        
        }
        }
    }//GEN-LAST:event_Tbl_EstadoMouseClicked

    private void Txt_DescripcionEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_DescripcionEstadoKeyTyped

         char c = evt.getKeyChar();
        String Texto = Txt_DescripcionEstado.getText();
        
        
        if((evt.getKeyChar() == 40)){
        
             Txt_DescripcionEstado.setText(Texto.substring(0, 45));
                    
        }
        
        if ( Txt_DescripcionEstado.getText().length() >= 45){
        
        evt.consume();
        
        }
        
        if ( Txt_DescripcionEstado.getText().length() == 1){

            char mayuscula = Texto.charAt(0);
            Texto = Character.toUpperCase(mayuscula)+ Texto.substring(1,Texto.length());
            Txt_DescripcionEstado.setText(Texto);

        }
    }//GEN-LAST:event_Txt_DescripcionEstadoKeyTyped

    private void LimpiarEstado(){
       Btn_Actualizar.setEnabled(false);
       Btn_Activar.setEnabled(false);
    
       Txt_IdEstado.setText("");
       Txt_NombreEstado.setText("");
       Txt_DescripcionEstado.setText("");
       }
      private void ActualizarEstado(){
          DefaultTableModel t = new DefaultTableModel();
            Tbl_Estado.setModel(t);
            t.addColumn("Id");
            t.addColumn("Nombre");
            t.addColumn("Descripción");
            t.addColumn("Estado");
                        
            List<Estado> estado = this.daoEstado.findEstadoEntities();
               String s;
                   for(Estado Estado : estado){
                
                if(Estado.isActivoEstado() == true){
                s = "Activado";
                }else{
                s = "Desactivado";
                }
                t.addRow(
                    new Object[]{
                        Estado.getIdEstado(),
                        Estado.getNombreEstado(),
                        Estado.getDescripcionEstado(),
                        s
                    });
            }

      }
      
       private void Activar_Desactivar(){
            int fila = Tbl_Estado.getSelectedRow();
        
              String a = Txt_Activo.getText().toString();
               if(a.equals("Activado")){
        objEstado.setIdEstado(Integer.parseInt(Txt_IdEstado.getText()));
        objEstado.setNombreEstado((Tbl_Estado.getValueAt(fila, 1).toString()));
        objEstado.setDescripcionEstado(Tbl_Estado.getValueAt(fila, 2).toString());
        objEstado.setActivoEstado(false);
       try {
            daoEstado.edit(objEstado);
             ActualizarEstado();
            Btn_Activar.setText("Activar");
            JOptionPane.showMessageDialog(this, "Se desactivó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
         LimpiarEstado();
          }else{  
         objEstado.setIdEstado(Integer.parseInt(Txt_IdEstado.getText()));
        objEstado.setNombreEstado((Tbl_Estado.getValueAt(fila, 1).toString()));
        objEstado.setDescripcionEstado(Tbl_Estado.getValueAt(fila, 2).toString());
        objEstado.setActivoEstado(true);
        try {
            daoEstado.edit(objEstado);
             ActualizarEstado();
            Btn_Activar.setText("Desactivar");
            JOptionPane.showMessageDialog(this, "Se activó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        LimpiarEstado();
        
        }
         
               
       
       }
        private void EditarEstado(){
                  
           
        if(Txt_NombreEstado.getText().length() < 5){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos 5 letra");
        
        }else if(ValidacionDeRepetidos(Txt_NombreEstado.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe");
        
        }else if(ValidacionTresLetras(Txt_NombreEstado.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No se pueden repetir 3 letras seguidas");
        
        }else if(Txt_DescripcionEstado.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 3 letras");
        
        }
        else{
         objEstado.setIdEstado(Integer.parseInt(Txt_IdEstado.getText()));
         objEstado.setNombreEstado(Txt_NombreEstado.getText());
         objEstado.setDescripcionEstado(Txt_DescripcionEstado.getText());
       
        try {
            daoEstado.edit(objEstado);
             ActualizarEstado();
            JOptionPane.showMessageDialog(this, "Se actualizó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
       }
           
           private void LlenarEstado(){
        
       if(Txt_NombreEstado.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "El nombre tiene que contener al menos 3 letra");
        
        }else if(ValidacionTresLetras(Txt_NombreEstado.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "No se pueden repetir 3 letras seguidas");
        
        }else if(Txt_DescripcionEstado.getText().length() < 3){
        
        JOptionPane.showMessageDialog(this, "La descripción tiene que contener al menos 3 letras");
        
        }else if(ValidacionDeRepetidos(Txt_NombreEstado.getText()) == true){
        
        JOptionPane.showMessageDialog(this, "Este elemento ya existe");
        
        }
       else{
       
         objEstado.setNombreEstado(Txt_NombreEstado.getText());
         objEstado.setDescripcionEstado(Txt_DescripcionEstado.getText());
         objEstado.setActivoEstado(true);
        
        try {
            daoEstado.edit(objEstado);
             ActualizarEstado();
             LimpiarEstado();
            JOptionPane.showMessageDialog(this, "se guardó correctamente");
        } catch (Exception ex) {
            Logger.getLogger(FmrTipoPago.class.getName()).log(Level.SEVERE, null, ex);
        }
       }   
       }  
       
           public static boolean ValidacionDeRepetidos(String Nombre){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             String select = "SELECT  idEstado FROM Estado WHERE nombreEstado = '"+Nombre+ "'";
   
             Query query = em.createQuery(select);
       
             if(query.getResultList().size() == 0){
             
             return false;
             
             }else{
             
             return true;
                
             }
             
        }
        
        private static boolean ValidacionTresLetras(String Nombre){
        
            
        if(Nombre.length() >= 3){
        String Letra1 = Nombre.substring(0, 1);
        String Letra2 = Nombre.substring(1, 2);
        String Letra3 = Nombre.substring(2, 3);
        
        
        if(Letra1.equalsIgnoreCase(Letra2) && Letra2.equalsIgnoreCase(Letra3)){
        
        return true;
         
        }else{
        
        return false;
              
        }
        }else{
        
            return false;
        
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
            java.util.logging.Logger.getLogger(FmrEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FmrEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FmrEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrEstado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FmrEstado().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Activar;
    private javax.swing.JButton Btn_Actualizar;
    private javax.swing.JButton Btn_Añadir;
    private javax.swing.JButton Btn_Limpiar;
    private javax.swing.JButton Btn_Regresar;
    private javax.swing.JTable Tbl_Estado;
    private javax.swing.JTextField Txt_Activo;
    private javax.swing.JTextField Txt_DescripcionEstado;
    private javax.swing.JTextField Txt_IdEstado;
    private javax.swing.JTextField Txt_NombreEstado;
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
