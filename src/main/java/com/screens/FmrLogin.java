/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.screens;

import com.clases.SingletonUser;
import com.clases.Usuarios;
import java.awt.Image;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import org.apache.commons.codec.digest.DigestUtils;


/**
 *
 * @author Christian castro
 * Para Sprint 1
 */
import org.apache.commons.codec.digest.DigestUtils;
public class FmrLogin extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public FmrLogin() {
        initComponents();    
        this.setLocationRelativeTo(null);   
        Image icon = new ImageIcon(getClass().getResource("/imagenes/IconoMicrocosmos.png")).getImage();
        setIconImage(icon);
        ResetearTodo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_Usuario = new javax.swing.JTextField();
        Txt_Contraseña = new javax.swing.JPasswordField();
        Btn_IniciarSesión = new javax.swing.JButton();
        Btn_Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Microcosmos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocation(new java.awt.Point(0, 0));
        setMinimumSize(new java.awt.Dimension(560, 340));
        setResizable(false);
        setSize(new java.awt.Dimension(560, 340));

        jPanel2.setBackground(new java.awt.Color(49, 49, 49));

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LogoMicrocosmos.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(60, 63, 65));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setMaximumSize(new java.awt.Dimension(408, 234));
        jPanel1.setMinimumSize(new java.awt.Dimension(408, 234));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setLabelFor(Txt_Usuario);
        jLabel2.setText("Usuario");
        jLabel2.setToolTipText("Ingresa un nombre de usuario.");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel2.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel2.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel2.setPreferredSize(new java.awt.Dimension(80, 20));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setLabelFor(Txt_Contraseña);
        jLabel3.setText("Contraseña");
        jLabel3.setToolTipText("Ingresa una contraseña.");
        jLabel3.setMaximumSize(new java.awt.Dimension(80, 20));
        jLabel3.setMinimumSize(new java.awt.Dimension(80, 20));
        jLabel3.setPreferredSize(new java.awt.Dimension(80, 20));

        Txt_Usuario.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        Txt_Usuario.setForeground(new java.awt.Color(153, 153, 153));
        Txt_Usuario.setToolTipText("");
        Txt_Usuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Txt_Usuario.setMaximumSize(new java.awt.Dimension(160, 20));
        Txt_Usuario.setMinimumSize(new java.awt.Dimension(160, 20));
        Txt_Usuario.setName("user"); // NOI18N
        Txt_Usuario.setPreferredSize(new java.awt.Dimension(160, 20));
        Txt_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_UsuarioActionPerformed(evt);
            }
        });

        Txt_Contraseña.setName("password"); // NOI18N
        Txt_Contraseña.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                Txt_ContraseñaFocusLost(evt);
            }
        });

        Btn_IniciarSesión.setBackground(new java.awt.Color(204, 204, 204));
        Btn_IniciarSesión.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/iniciarsesion.png"))); // NOI18N
        Btn_IniciarSesión.setText("Iniciar Sesión");
        Btn_IniciarSesión.setToolTipText("Ingresa tus datos para iniciar sesión.");
        Btn_IniciarSesión.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        Btn_IniciarSesión.setFocusPainted(false);
        Btn_IniciarSesión.setMaximumSize(new java.awt.Dimension(110, 35));
        Btn_IniciarSesión.setMinimumSize(new java.awt.Dimension(110, 35));
        Btn_IniciarSesión.setPreferredSize(new java.awt.Dimension(110, 35));
        Btn_IniciarSesión.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_IniciarSesiónActionPerformed(evt);
            }
        });

        Btn_Salir.setBackground(new java.awt.Color(204, 204, 204));
        Btn_Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.png"))); // NOI18N
        Btn_Salir.setText(" Salir");
        Btn_Salir.setToolTipText("Presiona para cerrar el programa.");
        Btn_Salir.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 153, 255)));
        Btn_Salir.setFocusPainted(false);
        Btn_Salir.setMaximumSize(new java.awt.Dimension(110, 35));
        Btn_Salir.setMinimumSize(new java.awt.Dimension(110, 35));
        Btn_Salir.setPreferredSize(new java.awt.Dimension(110, 35));
        Btn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SalirActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Iniciar Sesión");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(Btn_IniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)))))
                .addGap(127, 127, 127))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_IniciarSesión, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_Salir, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_UsuarioActionPerformed

    private void Txt_ContraseñaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_Txt_ContraseñaFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_ContraseñaFocusLost

    private void Btn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SalirActionPerformed
       
        System.exit(0);
        
    }//GEN-LAST:event_Btn_SalirActionPerformed

    private void Btn_IniciarSesiónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_IniciarSesiónActionPerformed
        
        if(Txt_Usuario.getText().equals("")||Txt_Contraseña.getText().equals("")){
        
        JOptionPane.showMessageDialog(this, "Debe ingresar datos en las casillas de texto");            
        Limpiar();
        
        }else{
            
        String contraEncriptada = DigestUtils.md5Hex(Txt_Contraseña.getText());
        ValidarAcceso(Txt_Usuario.getText().toString(),contraEncriptada);
             
        }    
       
    }//GEN-LAST:event_Btn_IniciarSesiónActionPerformed

    
    public void ValidarAcceso(String Usuario, String Contraseña){
        
        
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
    EntityManager em = emf.createEntityManager();


    String select = "SELECT nombreUsuario, pass FROM Usuarios WHERE nombreUsuario = '"+ Usuario+ "' AND activoUsuario = true";
   
    Query query = em.createQuery(select);
      
      if(query.getResultList().size() == 0){
       
           JOptionPane.showMessageDialog(this, "El usuario no existe o está desactivado");
           Limpiar(); 
          
          
    }else{
          
          Resetear(Usuario);
          select = "SELECT nombreUsuario, pass FROM Usuarios WHERE nombreUsuario = '"+ Usuario+ "' AND pass = '" + Contraseña + "' AND activoUsuario = true"; 
          query = em.createQuery(select);
          
          if(query.getResultList().size() != 0){
             
        em.getTransaction().begin();
        select = "UPDATE Usuarios SET numeroDeIntentos = 0 WHERE nombreUsuario = '"+Usuario+ "'"; 
        String usuario1 = "From Usuarios E Where E.nombreUsuario = '"+Usuario+ "'"; 
        Query user = em.createQuery(usuario1);
        
        Usuarios userS = (Usuarios) user.getSingleResult();
        
        SingletonUser usuario = SingletonUser.getUsuario(userS);
        usuario.setUsuario(userS); 
        
        query = em.createQuery(select);
        query.executeUpdate();
        em.getTransaction().commit();
        em.close();                     
        
        FmrMenú m = new FmrMenú();
        m.setVisible(true);
        this.dispose();
                                 
        
       
       }else{
       
          select = "SELECT nombreUsuario FROM Usuarios WHERE numeroDeIntentos = 0 AND nombreUsuario = '"+Usuario+"'";
          query = em.createQuery(select);
          
          if(query.getResultList().size() != 0){    
              
                     
             em.getTransaction().begin();
             select = "UPDATE Usuarios SET numeroDeIntentos = (numeroDeIntentos + 1) WHERE nombreUsuario = '"+ Usuario+"'"; 
             query = em.createQuery(select);
             query.executeUpdate();
             em.getTransaction().commit();
             em.close();
             
             Limpiar();
             JOptionPane.showMessageDialog(this, "Le quedan 2 intentos");

        
       }else{
              
          select = "SELECT nombreUsuario FROM Usuarios WHERE numeroDeIntentos = 1 AND nombreUsuario = '"+Usuario+"'";
          query = em.createQuery(select);
          
          if(query.getResultList().size() != 0){ 
          
             em.getTransaction().begin();
             select = "UPDATE Usuarios SET numeroDeIntentos = (numeroDeIntentos + 1) WHERE nombreUsuario = '"+ Usuario+"'"; 
             query = em.createQuery(select);
             query.executeUpdate();
             em.getTransaction().commit();
             em.close();
             
             Limpiar();
             JOptionPane.showMessageDialog(this, "Le queda un intento");

          
          
          }else{
          
             em.getTransaction().begin();
             select = "UPDATE Usuarios SET numeroDeIntentos = (numeroDeIntentos + 1) WHERE nombreUsuario = '"+ Usuario+"'"; 
             query = em.createQuery(select);
             query.executeUpdate();
             em.getTransaction().commit();
             em.close();
          
             DesactivarUsuario(Usuario);
             Limpiar();
             JOptionPane.showMessageDialog(this, "Su usuario ha sido desactivado");

          }
          }
          }          
    } 
    }    
    
    public void DesactivarUsuario(String Usuario){
      
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
      EntityManager em = emf.createEntityManager();

      em.getTransaction().begin();
      String select = "UPDATE Usuarios SET activoUsuario = false WHERE nombreUsuario = '"+ Usuario+ "'";
      Query query = em.createQuery(select);
      query.executeUpdate();
      em.getTransaction().commit();
      em.close();
      }    
   
    public void Limpiar(){
     
    Txt_Usuario.setText("");
    Txt_Contraseña.setText("");
    
    }
    
    public void Resetear(String Usuario){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             em.getTransaction().begin();
             String select = "UPDATE Usuarios SET numeroDeIntentos = 0 WHERE nombreUsuario != '"+ Usuario+"'"; 
             Query query = em.createQuery(select);
             query.executeUpdate();
             em.getTransaction().commit();
             em.close();
       
       
       }
       
    public void ResetearTodo(){
       
         EntityManagerFactory emf = Persistence.createEntityManagerFactory("DB");
         EntityManager em = emf.createEntityManager();
      
             em.getTransaction().begin();
             String select = "UPDATE Usuarios SET numeroDeIntentos = 0 WHERE numeroDeIntentos < 3"; 
             Query query = em.createQuery(select);
             query.executeUpdate();
             em.getTransaction().commit();
             em.close();
       
       
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FmrLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FmrLogin().setVisible(true);
        });
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_IniciarSesión;
    private javax.swing.JButton Btn_Salir;
    private javax.swing.JPasswordField Txt_Contraseña;
    private javax.swing.JTextField Txt_Usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    
}
