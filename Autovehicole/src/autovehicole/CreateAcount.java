/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;


import java.awt.Frame;
import javax.swing.JOptionPane;





public class CreateAcount extends javax.swing.JFrame {

    /**
     * Creates new form CreateAcount
     */
    public CreateAcount() {
        initComponents();
        
        this.setLocationRelativeTo(null);

        jLabel_wrong_user.setVisible(false);
        jLabel_wrong_firstName.setVisible(false);
        jLabel_wrong_lastName.setVisible(false);
        jLabel_wrong_password_repeat.setVisible(false);
        jLabel_wrong_password.setVisible(false);
        jLabel_wrong_address.setVisible(false);
    }

    //Close the application
    public void ExitAplication(){
        int yes_no = JOptionPane.showConfirmDialog(null, "Sunteti sigur ca doriti sa inchideti aplicatia?", "Inchidere aplicatie.", JOptionPane.YES_NO_OPTION);
        if(yes_no == 0){
            System.exit(0);
        }
        
    }
    
    // Check if the user is Unique
    public boolean UnicityUser(){
        boolean yes = false;
        String sql = "SELECT * FROM `user` WHERE `userName_user`= '"+jTextField_userName_user.getText()+"'";
        
        ExecutQuerySimple simple_query = new ExecutQuerySimple();
        simple_query.executeSqlQuery(sql);
        
        if(simple_query.getIdentic() == true){
            jLabel_wrong_user.setVisible(true);
            yes = true;
        }else{
            jLabel_wrong_user.setVisible(false);
            yes = false;
        }
        
        return yes;
    }
    
    
    // function for go back to login panel
    public void GoBackToLogin(){
        if( !jTextField_userName_user.getText().equals("") || !jTextField_firstName_user.getText().equals("") || !jTextField_lastName_user.getText().equals("") 
            || !jPasswordField_password_user.getText().equals("") || !jTextArea_address_user.getText().equals("") )
        {
          int yes_no =  JOptionPane.showConfirmDialog(null, "Vrei sa renunti la crearea noului cont?", "Creare cont nou.", JOptionPane.YES_NO_OPTION);
          
          if( yes_no == 0){
                this.setVisible(false);
                LogIn window = new LogIn();
                window.setVisible(true);
          }
        }else{
                this.setVisible(false);
                LogIn window = new LogIn();
                window.setVisible(true);
          }
    }
    
    // Reset all fields to their first state
    public void EmptyTheFields(){
        jTextField_userName_user.setText("");
        jTextField_firstName_user.setText("");
        jTextField_lastName_user.setText("");
        jPasswordField_password_user.setText("");
        jPasswordField_repeat_password_user.setText("");
        jTextArea_address_user.setText("");
        jComboBox_jud_user.setSelectedIndex(0);
        jComboBox_function_user.setSelectedIndex(0);
        jRadioButton_m_user.setSelected(true);
        
    } 

    /**
    /* Check if the fields are empty
    /* If the field are not empty insert the value in data base
    **/
    public void CheckFields(){
        
        String userName_user = jTextField_userName_user.getText();
        String firstName = jTextField_firstName_user.getText();
        String lastName = jTextField_lastName_user.getText();
        String password = jPasswordField_password_user.getText();
        String function = jComboBox_function_user.getSelectedItem().toString();
        String jud = jComboBox_jud_user.getSelectedItem().toString();
        String address = jTextArea_address_user.getText();
        String gender_m = jRadioButton_m_user.getText();
        String gender_f = jRadioButton_f_user.getText();
        jRadioButton_m_user.setActionCommand(gender_m);
        jRadioButton_f_user.setActionCommand(gender_f);     
        String gender = buttonGroup_gender.getSelection().getActionCommand();

       

        if( userName_user.equals("")){
            jLabel_wrong_user.setVisible(true);
        }else{
            jLabel_wrong_user.setVisible(false);
        }
        if( firstName.equals("")){
            jLabel_wrong_firstName.setVisible(true);
        }else{
            jLabel_wrong_firstName.setVisible(false);
        }
        if( lastName.equals("")){
            jLabel_wrong_lastName.setVisible(true);
        }else{
            jLabel_wrong_lastName.setVisible(false);
        }
        if( password.equals("")){
            jLabel_wrong_password.setVisible(true);
        }else{
            jLabel_wrong_password.setVisible(false);
        }   
        if( address.equals("")){
            jLabel_wrong_address.setVisible(true);
        }else{
            jLabel_wrong_address.setVisible(false);
        }
        
        GetCurrentDate date = new GetCurrentDate();  
        
        // insert the data in data base if no fields is empty
        if( !userName_user.equals("") && !UnicityUser() && !firstName.equals("") && !lastName.equals("") &&
            !password.equals("") && !address.equals("") &&  password.equals(jPasswordField_repeat_password_user.getText())   )
        {
            String query = "INSERT INTO user( userName_user, firstName_user, lastName_user, address_user, password_user, gender_user, function_user, jud_user, date_user"
                    + ")"+" VALUES ("
                    + "'"+userName_user+"','"+firstName+"','"+lastName+"','"+address+"','"+password+"','"+gender+"','"+function+"','"+jud+"','"+date.CurrentDate()+"')";
            
            executQuery this_query = new executQuery();
            this_query.executeSqlQuery(query, "Utilizator adaugat cu succes in baza de date!", "Inregistrare utilizator");
          
            EmptyTheFields();
        }else{
            JOptionPane.showMessageDialog(null, "Campurile trebuie completate\n si sa nu fie marcate cu X !","Atentie!", JOptionPane.INFORMATION_MESSAGE);
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

        buttonGroup_gender = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextField_firstName_user = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField_lastName_user = new javax.swing.JTextField();
        jComboBox_jud_user = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton_m_user = new javax.swing.JRadioButton();
        jRadioButton_f_user = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address_user = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton_create_user = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_function_user = new javax.swing.JComboBox<>();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jLabel_wrong_firstName = new javax.swing.JLabel();
        jLabel_wrong_lastName = new javax.swing.JLabel();
        jLabel_wrong_address = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel_wrong_password_repeat = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPasswordField_repeat_password_user = new javax.swing.JPasswordField();
        jPasswordField_password_user = new javax.swing.JPasswordField();
        jLabel_wrong_password = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_userName_user = new javax.swing.JTextField();
        jLabel_wrong_user = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(510, 620));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.setLayout(null);

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_Close_Box_Red_34217.png"))); // NOI18N
        jLabel12.setToolTipText("Inchide aplicatia.");
        jLabel12.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel12);
        jLabel12.setBounds(470, 4, 36, 32);

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_misc_17_10758.png"))); // NOI18N
        jLabel13.setToolTipText("Inapoi la pagina de logare.");
        jLabel13.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13);
        jLabel13.setBounds(0, 4, 50, 32);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_minus_71007.png"))); // NOI18N
        jLabel14.setToolTipText("Ascunde aplicatia in bara de start.");
        jLabel14.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel14);
        jLabel14.setBounds(420, 4, 36, 32);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true), "Creaza un utilizator nou :", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(50, 60, 47, 30);

        jTextField_firstName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_firstName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_firstName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_firstName_user);
        jTextField_firstName_user.setBounds(200, 100, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Prenume :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(50, 140, 81, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Judet :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(50, 260, 55, 30);

        jTextField_lastName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_lastName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_lastName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_lastName_user);
        jTextField_lastName_user.setBounds(200, 140, 220, 30);

        jComboBox_jud_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_jud_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alba", "Arad", "Arges", "Bacau", "Bihor", "Bistrita Nasaud", "Botosani", "Braila", "Brasov", "Bucuresti", "Buzau", "Calaras", "Caras Severin", "Cluj", "Constanta", "Covasna", "Dambovita", "Galati", "Giurgiu", "Gorj", "Harghita", "Hunedoara", "Ialomita", "Iasi", "Ilfov", "Maramures", "Mehedinti", "Mures", "Neamt", "Olt", "Prahova", "Salaj", "Satul Mare", "Sibiu", "Suceava", "Teleorman", "Timis", "Tulcea", "Valcia", "Vaslui", "Vrancea" }));
        jComboBox_jud_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox_jud_user);
        jComboBox_jud_user.setBounds(200, 260, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Adresa :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(50, 380, 65, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Sex :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(50, 300, 40, 30);

        buttonGroup_gender.add(jRadioButton_m_user);
        jRadioButton_m_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_m_user.setSelected(true);
        jRadioButton_m_user.setText("Masculin");
        jRadioButton_m_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRadioButton_m_user);
        jRadioButton_m_user.setBounds(200, 300, 75, 30);

        buttonGroup_gender.add(jRadioButton_f_user);
        jRadioButton_f_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_f_user.setText("Feminin");
        jRadioButton_f_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jRadioButton_f_user);
        jRadioButton_f_user.setBounds(290, 300, 71, 30);

        jTextArea_address_user.setColumns(20);
        jTextArea_address_user.setRows(4);
        jTextArea_address_user.setTabSize(6);
        jTextArea_address_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextArea_address_userKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(jTextArea_address_user);

        jPanel2.add(jScrollPane1);
        jScrollPane1.setBounds(200, 380, 220, 78);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 255));
        jLabel7.setText("Inapoi la logare.");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(200, 540, 95, 17);
        jPanel2.add(jSeparator2);
        jSeparator2.setBounds(50, 530, 370, 2);

        jButton_create_user.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton_create_user.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_user_male_add_44485.png"))); // NOI18N
        jButton_create_user.setText("Creaza utilizator");
        jButton_create_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_create_user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_create_userActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_create_user);
        jButton_create_user.setBounds(200, 480, 220, 45);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Functie :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(50, 340, 68, 30);

        jComboBox_function_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_function_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operator", "Inspector", "Administrator", "Altele" }));
        jComboBox_function_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox_function_user);
        jComboBox_function_user.setBounds(200, 340, 220, 30);
        jPanel2.add(jSeparator3);
        jSeparator3.setBounds(50, 50, 370, 7);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/user-groups-frenchnavy-256px-120x120.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(50, 410, 120, 120);

        jLabel_wrong_firstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_firstName.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_firstName);
        jLabel_wrong_firstName.setBounds(430, 100, 30, 30);

        jLabel_wrong_lastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_lastName.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_lastName);
        jLabel_wrong_lastName.setBounds(430, 140, 30, 30);

        jLabel_wrong_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_address.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_address);
        jLabel_wrong_address.setBounds(430, 400, 30, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Repeta parola : ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(50, 220, 140, 30);

        jLabel_wrong_password_repeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_password_repeat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_password_repeat);
        jLabel_wrong_password_repeat.setBounds(430, 220, 30, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Parola : ");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(50, 180, 66, 30);

        jPasswordField_repeat_password_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_repeat_password_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_repeat_password_userKeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField_repeat_password_user);
        jPasswordField_repeat_password_user.setBounds(200, 220, 220, 30);

        jPasswordField_password_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_password_userKeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField_password_user);
        jPasswordField_password_user.setBounds(200, 180, 220, 30);

        jLabel_wrong_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_password.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_password);
        jLabel_wrong_password.setBounds(430, 180, 30, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Nume :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(50, 100, 58, 30);

        jTextField_userName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_userName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_userName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_userName_user);
        jTextField_userName_user.setBounds(200, 60, 220, 30);

        jLabel_wrong_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_user);
        jLabel_wrong_user.setBounds(430, 60, 30, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 40, 490, 570);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 510, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here:
        GoBackToLogin();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton_create_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_create_userActionPerformed
        // TODO add your handling code here:
        
        CheckFields(); 
        
    }//GEN-LAST:event_jButton_create_userActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        GoBackToLogin();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ExitAplication();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jPasswordField_repeat_password_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_repeat_password_userKeyReleased
        // TODO add your handling code here:
        if( jPasswordField_password_user.getText().equals(jPasswordField_repeat_password_user.getText())){
            jLabel_wrong_password_repeat.setVisible(false);
        }else{
            jLabel_wrong_password_repeat.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField_repeat_password_userKeyReleased

    private void jTextField_userName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_userName_userKeyReleased
        // TODO add your handling code here:
        UnicityUser();    
    }//GEN-LAST:event_jTextField_userName_userKeyReleased

    private void jTextField_firstName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_firstName_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_firstName.setVisible(false);
    }//GEN-LAST:event_jTextField_firstName_userKeyReleased

    private void jTextField_lastName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lastName_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_lastName.setVisible(false);
    }//GEN-LAST:event_jTextField_lastName_userKeyReleased

    private void jPasswordField_password_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_password_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_password.setVisible(false);
        
        if(jPasswordField_repeat_password_user.getText().equals(jPasswordField_password_user.getText())){
            jLabel_wrong_password_repeat.setVisible(false);
        }else{
            jLabel_wrong_password_repeat.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField_password_userKeyReleased

    private void jTextArea_address_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_address_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_address.setVisible(false);
    }//GEN-LAST:event_jTextArea_address_userKeyReleased

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
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateAcount.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateAcount().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton jButton_create_user;
    private javax.swing.JComboBox<String> jComboBox_function_user;
    private javax.swing.JComboBox<String> jComboBox_jud_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel_wrong_address;
    private javax.swing.JLabel jLabel_wrong_firstName;
    private javax.swing.JLabel jLabel_wrong_lastName;
    private javax.swing.JLabel jLabel_wrong_password;
    private javax.swing.JLabel jLabel_wrong_password_repeat;
    private javax.swing.JLabel jLabel_wrong_user;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField_password_user;
    private javax.swing.JPasswordField jPasswordField_repeat_password_user;
    private javax.swing.JRadioButton jRadioButton_f_user;
    private javax.swing.JRadioButton jRadioButton_m_user;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea_address_user;
    private javax.swing.JTextField jTextField_firstName_user;
    private javax.swing.JTextField jTextField_lastName_user;
    private javax.swing.JTextField jTextField_userName_user;
    // End of variables declaration//GEN-END:variables
}
