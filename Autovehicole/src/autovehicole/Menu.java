/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;



/**
 *
 * @author Calin-Alex
 */
public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public Menu() {
        initComponents();
        
        jButton_AddEdit_User.setEnabled(false);
        jButton_AddEdit.setEnabled(false);
        
        GetCurrentDate date = new GetCurrentDate();
        jLabel_currentDate.setText(date.CurrentDate());
        
        getPermission();
       
        this.setLocationRelativeTo(null);
    }
    
    
    
    // set permission acces for users
    public void getPermission(){
        ReadFromFile user = new ReadFromFile();
        ReadFromFile function = new ReadFromFile();
          
        jLabel_userName.setText(user.getUser());
        
        String func = function.getFunction();

        if( func.equals("Administrator")){
            jButton_AddEdit_User.setEnabled(true);
            jButton_AddEdit.setEnabled(true);
        }
        if(func.equals("Inspector")){
            jButton_AddEdit.setEnabled(true);
        }
    }

    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton_ListSerch = new javax.swing.JButton();
        jButton_AddEdit_User = new javax.swing.JButton();
        jButton_AddEdit = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton_LogOut = new javax.swing.JButton();
        jLabel_currentDate = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(4, 4, 630, 400));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(630, 400));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(null);

        jPanel2.setLayout(null);

        jButton_ListSerch.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_ListSerch.setForeground(new java.awt.Color(0, 0, 204));
        jButton_ListSerch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_list-information_43866.png"))); // NOI18N
        jButton_ListSerch.setText("Afiseaza toate autovehicolele inmatriculate");
        jButton_ListSerch.setToolTipText("Afiseaza autovehicolele in functie de filtrele setate.");
        jButton_ListSerch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_ListSerch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ListSerchActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_ListSerch);
        jButton_ListSerch.setBounds(70, 40, 460, 50);

        jButton_AddEdit_User.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AddEdit_User.setForeground(new java.awt.Color(0, 0, 204));
        jButton_AddEdit_User.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_preferences-contact-list_24249.png"))); // NOI18N
        jButton_AddEdit_User.setText("Administrare useri");
        jButton_AddEdit_User.setToolTipText("Editarea/Adaugarea unor modificari aduse unu-i autovehicol inmatriculat in circulatie.");
        jButton_AddEdit_User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddEdit_User.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEdit_UserActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_AddEdit_User);
        jButton_AddEdit_User.setBounds(70, 180, 460, 50);

        jButton_AddEdit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_AddEdit.setForeground(new java.awt.Color(0, 0, 204));
        jButton_AddEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_list2-add_43870.png"))); // NOI18N
        jButton_AddEdit.setText("Adauga modificari la un autovehicol");
        jButton_AddEdit.setToolTipText("Editarea/Adaugarea unor modificari aduse unu-i autovehicol inmatriculat in circulatie.");
        jButton_AddEdit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_AddEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AddEditActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_AddEdit);
        jButton_AddEdit.setBounds(70, 110, 460, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/free-wallpaper-11.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, 0, 610, 330);

        jPanel3.add(jPanel2);
        jPanel2.setBounds(10, 60, 610, 330);

        jButton_LogOut.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton_LogOut.setForeground(new java.awt.Color(0, 0, 204));
        jButton_LogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_logout_63128.png"))); // NOI18N
        jButton_LogOut.setText("Delogare");
        jButton_LogOut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_LogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LogOutActionPerformed(evt);
            }
        });
        jPanel3.add(jButton_LogOut);
        jButton_LogOut.setBounds(480, 10, 140, 40);

        jLabel_currentDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_currentDate.setForeground(new java.awt.Color(51, 204, 255));
        jLabel_currentDate.setText("Date curenta:");
        jPanel3.add(jLabel_currentDate);
        jLabel_currentDate.setBounds(110, 30, 100, 15);

        jLabel_userName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_userName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_userName.setText("Nume utilizator:");
        jPanel3.add(jLabel_userName);
        jLabel_userName.setBounds(110, 10, 100, 15);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_minus_71007.png"))); // NOI18N
        jLabel14.setToolTipText("Ascunde aplicatia in bara de start.");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        jLabel14.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel14);
        jLabel14.setBounds(430, 10, 40, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Date curenta:");
        jPanel3.add(jLabel3);
        jLabel3.setBounds(10, 30, 100, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nume utilizator:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(10, 10, 100, 15);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 630, 400);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_ListSerchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ListSerchActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        show_list window = new show_list();
        window.setVisible(true);
    }//GEN-LAST:event_jButton_ListSerchActionPerformed

    private void jButton_AddEdit_UserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEdit_UserActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        EditareAcountAdministrator window = new EditareAcountAdministrator();
        window.setVisible(true);
    }//GEN-LAST:event_jButton_AddEdit_UserActionPerformed

    private void jButton_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogOutActionPerformed
        // TODO add your handling code here:
        WriteInFile writeIn = new WriteInFile();
        writeIn.setTextInFile("", "");
        
        this.setVisible(false);
        LogIn window = new LogIn();
        window.setVisible(true);

    }//GEN-LAST:event_jButton_LogOutActionPerformed

    private void jButton_AddEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AddEditActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        Add_cars window = new Add_cars();
        window.setVisible(true);
    }//GEN-LAST:event_jButton_AddEditActionPerformed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_AddEdit;
    private javax.swing.JButton jButton_AddEdit_User;
    private javax.swing.JButton jButton_ListSerch;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_currentDate;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
