
package paquete;

import java.awt.Color;

/**
 *
 * @author PC-ELLA
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
        rsscalelabel.RSScaleLabel.setScaleLabel(LogoRipleyBig,"src/images/Logo_Ripley.png");
        rsscalelabel.RSScaleLabel.setScaleLabel(logoRipleymini,"src/images/Ripley logo2.png");
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
        logoRipleymini = new javax.swing.JLabel();
        ripley = new javax.swing.JLabel();
        LogoRipleyBig = new javax.swing.JLabel();
        iniciarsesion = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        USUARIO = new javax.swing.JLabel();
        USUARIO1 = new javax.swing.JLabel();
        Nusuario = new javax.swing.JTextField();
        IContraseña = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        IngresarBtn = new javax.swing.JPanel();
        Ingresar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoRipleymini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoRipleymini.setToolTipText("");
        jPanel1.add(logoRipleymini, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, 30));

        ripley.setFont(new java.awt.Font("Roboto Slab SemiBold", 1, 50)); // NOI18N
        ripley.setForeground(new java.awt.Color(255, 255, 255));
        ripley.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ripley.setText("RIPLEY");
        jPanel1.add(ripley, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 340, 60));

        LogoRipleyBig.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(LogoRipleyBig, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 130, 180, 80));

        iniciarsesion.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        iniciarsesion.setText("INICIAR SESIÓN");
        jPanel1.add(iniciarsesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, 190, 30));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 350, 500));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        USUARIO.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        USUARIO.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        USUARIO.setText("CONTRASEÑA");
        USUARIO.setToolTipText("");

        USUARIO1.setFont(new java.awt.Font("Roboto Light", 1, 16)); // NOI18N
        USUARIO1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        USUARIO1.setText("USUARIO");
        USUARIO1.setToolTipText("");

        Nusuario.setFont(new java.awt.Font("Raleway SemiBold", 1, 12)); // NOI18N
        Nusuario.setForeground(new java.awt.Color(204, 204, 204));
        Nusuario.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        Nusuario.setText("Ingrese su nombre de usuario");
        Nusuario.setBorder(null);
        Nusuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                NusuarioMousePressed(evt);
            }
        });
        Nusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NusuarioActionPerformed(evt);
            }
        });

        IContraseña.setForeground(new java.awt.Color(204, 204, 204));
        IContraseña.setText("********");
        IContraseña.setToolTipText("");
        IContraseña.setBorder(null);
        IContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                IContraseñaMousePressed(evt);
            }
        });
        IContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IContraseñaActionPerformed(evt);
            }
        });

        IngresarBtn.setBackground(new java.awt.Color(0, 0, 0));
        IngresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBtnMouseClicked(evt);
            }
        });

        Ingresar.setBackground(new java.awt.Color(0, 0, 0));
        Ingresar.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
        Ingresar.setForeground(new java.awt.Color(255, 255, 255));
        Ingresar.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ingresar.setText("INGRESAR");
        Ingresar.setToolTipText("");
        Ingresar.setBorder(null);
        Ingresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IngresarMouseExited(evt);
            }
        });
        Ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout IngresarBtnLayout = new javax.swing.GroupLayout(IngresarBtn);
        IngresarBtn.setLayout(IngresarBtnLayout);
        IngresarBtnLayout.setHorizontalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Ingresar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        IngresarBtnLayout.setVerticalGroup(
            IngresarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, IngresarBtnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Ingresar, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSeparator2)
                    .addComponent(Nusuario, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addComponent(IContraseña, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1)
                    .addComponent(USUARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USUARIO1, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(199, Short.MAX_VALUE)
                .addComponent(USUARIO1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Nusuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(USUARIO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(IngresarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NusuarioActionPerformed

    private void IngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarActionPerformed

    private void IngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseEntered
        IngresarBtn.setBackground(Color.gray);
        Ingresar.setBackground(Color.gray);// TODO add your handling code here:
    }//GEN-LAST:event_IngresarMouseEntered

    private void IngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarMouseExited
        IngresarBtn.setBackground(Color.black);
        Ingresar.setBackground(Color.black);// TODO add your handling code here:
    }//GEN-LAST:event_IngresarMouseExited

    private void NusuarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NusuarioMousePressed
        if (Nusuario.getText().equals("Ingrese su nombre de usuario")){
            Nusuario.setText("");
            Nusuario.setForeground(Color.black);
        }
        if (String.valueOf(IContraseña.getPassword()).isEmpty()){
            IContraseña.setText("********");
            IContraseña.setForeground(Color.gray);
        }
    }//GEN-LAST:event_NusuarioMousePressed

    private void IContraseñaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IContraseñaMousePressed
        if (String.valueOf(IContraseña.getPassword()).equals("********")){
           IContraseña.setText("");
           IContraseña.setForeground(Color.black);
        }
        if (Nusuario.getText().isEmpty()) {
            Nusuario.setText("Ingrese su nombre de usuario");
            Nusuario.setForeground(Color.gray);
        }
    }//GEN-LAST:event_IContraseñaMousePressed

    private void IngresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnMouseClicked
        javax.swing.JOptionPane.showMessageDialog(this, "Ha ingresado con los datos:\nUsuario: " + Nusuario.getText()+ "\nContraseña: " + String.valueOf(IContraseña.getPassword()), "LOGIN", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_IngresarBtnMouseClicked

    private void IContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IContraseñaActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField IContraseña;
    private javax.swing.JTextField Ingresar;
    private javax.swing.JPanel IngresarBtn;
    private javax.swing.JLabel LogoRipleyBig;
    private javax.swing.JTextField Nusuario;
    private javax.swing.JLabel USUARIO;
    private javax.swing.JLabel USUARIO1;
    private javax.swing.JLabel iniciarsesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoRipleymini;
    private javax.swing.JLabel ripley;
    // End of variables declaration//GEN-END:variables
}
