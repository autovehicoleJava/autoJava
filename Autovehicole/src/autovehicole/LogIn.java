/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;


public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        
        jLabel_user_wrong.setVisible(false);
        jLabel_password_wrong.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton_logare = new javax.swing.JButton();
        jTextField_user = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel_user_wrong = new javax.swing.JLabel();
        jLabel_password_wrong = new javax.swing.JLabel();
        jPasswordField_password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 0));
        setPreferredSize(new java.awt.Dimension(480, 390));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Autentificare user:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(98, 35, 292, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("User :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(180, 120, 47, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Parola :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(180, 170, 60, 30);

        jButton_logare.setBackground(new java.awt.Color(204, 204, 204));
        jButton_logare.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_logare.setText("Logare");
        jButton_logare.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_logare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_logareActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_logare);
        jButton_logare.setBounds(210, 240, 220, 47);

        jTextField_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jTextField_user);
        jTextField_user.setBounds(250, 120, 180, 30);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(50, 97, 380, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(50, 303, 380, 10);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 255));
        jLabel4.setText("Click aici pentru a crea un utilizator (user) nou.");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        getContentPane().add(jLabel4);
        jLabel4.setBounds(103, 319, 281, 17);

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/user-security.png"))); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(480, 360));
        jLabel5.setMinimumSize(new java.awt.Dimension(480, 360));
        jLabel5.setPreferredSize(new java.awt.Dimension(480, 360));
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 80, 170, 230);

        jLabel_user_wrong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_user_wrong.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        getContentPane().add(jLabel_user_wrong);
        jLabel_user_wrong.setBounds(434, 120, 30, 30);

        jLabel_password_wrong.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_password_wrong.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        getContentPane().add(jLabel_password_wrong);
        jLabel_password_wrong.setBounds(434, 170, 30, 30);

        jPasswordField_password.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        getContentPane().add(jPasswordField_password);
        jPasswordField_password.setBounds(250, 170, 180, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_logareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_logareActionPerformed
        // TODO add your handling code here:

        String user = jTextField_user.getText();
        String password = jPasswordField_password.getText();
        
        if( user.equals("") ){
            jLabel_user_wrong.setVisible(true); 
        }else{
            jLabel_user_wrong.setVisible(false);
        }
        if( password.equals("")){
            jLabel_password_wrong.setVisible(true);
        }else{
            jLabel_password_wrong.setVisible(false);
        }
        if( !user.equals("") && !password.equals("") ){
            this.setVisible(false);
            Menu window = new Menu();
            window.setVisible(true);
        }
        

    }//GEN-LAST:event_jButton_logareActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        CreateAcount window = new CreateAcount();
        window.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_logare;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_password_wrong;
    private javax.swing.JLabel jLabel_user_wrong;
    private javax.swing.JPasswordField jPasswordField_password;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField_user;
    // End of variables declaration//GEN-END:variables
}
