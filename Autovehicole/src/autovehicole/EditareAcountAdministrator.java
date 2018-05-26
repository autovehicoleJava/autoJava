
package autovehicole;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;


public class EditareAcountAdministrator extends javax.swing.JFrame {

    /**
     * Creates new form EditareAcountAdministrator
     */
    public EditareAcountAdministrator() {
        initComponents();
        SetEnebleFalse();
        this.setLocationRelativeTo(null);
        
        ShowUsers();
        
        jLabel_wrong_user.setVisible(false);
        jLabel_wrong_firstName.setVisible(false);
        jLabel_wrong_lastName.setVisible(false);
        jLabel_wrong_password_repeat.setVisible(false);
        jLabel_wrong_password.setVisible(false);
        jLabel_wrong_address.setVisible(false); 
    }

    public void ExitAplication(){
        int yes_no = JOptionPane.showConfirmDialog(null, "Sunteti sigur ca doriti sa inchideti aplicatia?", "Inchidere aplicatie.", JOptionPane.YES_NO_OPTION);
        if(yes_no == 0){
            System.exit(0);
        }
        
    }

    
    public void RemoveUsersFromTable(){
        DefaultTableModel model = (DefaultTableModel)jTable_show_users.getModel();
        model.setRowCount(0);
    }
    
    
     //Selectarea evenimentelor din baza de date in functie de selectie
    public ArrayList<User> getUserList(){
        ArrayList<User> userList = new ArrayList<User>(); 

        String query = "SELECT * FROM `user` ";     
        Connect con = new Connect();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(query);
            User user;
            while (rs.next())
            {
                user = new User(rs.getInt("id_user"),rs.getString("userName_user"), rs.getString("firstName_user"), 
                        rs.getString("lastName_user"), rs.getString("address_user"), rs.getString("password_user"),
                        rs.getString("gender_user"), rs.getString("function_user"), rs.getString("jud_user"),
                        rs.getString("date_user"));
                userList.add(user);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return userList;
    }   
    
    
    
    // Arata evenimentele in tabel
    public void ShowUsers()
    {
        ArrayList<User> list= getUserList();
        DefaultTableModel model = (DefaultTableModel)jTable_show_users.getModel();
        Object[] row = new Object[10];
        for(int i = 0; i < list.size(); i++)
        {
            row[0] = list.get(i).getId();
            row[1] = list.get(i).getUserName();
            row[2] = list.get(i).getFirstName();
            row[3] = list.get(i).getLastName();
            row[4] = list.get(i).getAddress();
            row[5] = list.get(i).getPassword();
            row[6] = list.get(i).getGender();
            row[7] = list.get(i).getFunction();
            row[8] = list.get(i).getJud();
            row[9] = list.get(i).getDate();
            
            model.addRow(row);
          
        }
    }
    
    
    public void SetEnebleFalse(){
        jTextField_userName_user.setEnabled(false);
        jTextField_firstName_user.setEnabled(false);
        jTextField_lastName_user.setEnabled(false);
        jPasswordField_password_user.setEnabled(false);
        jPasswordField_repeat_password_user.setEnabled(false);
        jComboBox_jud_user.setEnabled(false);
        jComboBox_function_user.setEnabled(false);
        jRadioButton_m_user.setEnabled(false);
        jRadioButton_f_user.setEnabled(false);
        jTextArea_address_user.setEnabled(false);
        jButton_create_user.setEnabled(false);
    }
    
    
    public void SetEnebleTrus(){
      //  jTextField_userName_user.setEnabled(true);
        jTextField_firstName_user.setEnabled(true);
        jTextField_lastName_user.setEnabled(true);
        jPasswordField_password_user.setEnabled(true);
        jPasswordField_repeat_password_user.setEnabled(true);
        jComboBox_jud_user.setEnabled(true);
        jComboBox_function_user.setEnabled(true);
        jRadioButton_m_user.setEnabled(true);
        jRadioButton_f_user.setEnabled(true);
        jTextArea_address_user.setEnabled(true);
        jButton_create_user.setEnabled(true);
    }
    
    
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
    
    
    // function for go back to login panel
    public void GoBackToLogin(){
        if( jButton_create_user.isEnabled() )
        {
          int yes_no =  JOptionPane.showConfirmDialog(null, "Vrei sa renunti la editarea contului?", "Editare cont.", JOptionPane.YES_NO_OPTION);
          
          if( yes_no == 0){
                this.setVisible(false);
                Menu window = new Menu();
                window.setVisible(true);
          }
        }else{
                this.setVisible(false);
                Menu window = new Menu();
                window.setVisible(true);
          }
    }
    
    
    public void CheckFields(){
        
        String userName_user = jTextField_userName_user.getText();
        String firstName = jTextField_firstName_user.getText();
        String lastName = jTextField_lastName_user.getText();
        String password = jPasswordField_password_user.getText();
        String function = jComboBox_function_user.getSelectedItem().toString();
        String jud = jComboBox_jud_user.getSelectedItem().toString();
        String gender_m = jRadioButton_m_user.getText();
        String gender_f = jRadioButton_f_user.getText();
        jRadioButton_m_user.setActionCommand(gender_m);
        jRadioButton_f_user.setActionCommand(gender_f);
        String gender = buttonGroup_gender.getSelection().getActionCommand();
        String address = jTextArea_address_user.getText();

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
                
        int i = jTable_show_users.getSelectedRow();
        TableModel model = jTable_show_users.getModel();
        String date = model.getValueAt(i, 8).toString();
        
        System.out.println(date);
        if( !firstName.equals("") && !lastName.equals("") &&
            !password.equals("") && !address.equals("") &&  password.equals(jPasswordField_repeat_password_user.getText())  )
        {
            String query = "UPDATE `user` SET `userName_user`='"+userName_user+"',`firstName_user`='"+firstName+"',`lastName_user`='"+lastName+"',`address_user`='"+address+"',`password_user`='"+password+"',`gender_user`='"+gender+"',`function_user`='"+function+"',`jud_user`='"+jud+"',`date_user`='"+date+"' WHERE `userName_user`= '"+userName_user+"' ";
            
            executQuery this_query = new executQuery();
            this_query.executeSqlQuery(query, "Utilizator a fost editat cu succes!", "Editare utilizator");
          
            SetEnebleFalse();
            EmptyTheFields();
            RemoveUsersFromTable();
            ShowUsers();
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
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_show_users = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
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
        jButton_create_user = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jComboBox_function_user = new javax.swing.JComboBox<>();
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
        jLabel9 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1010, 620));
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
        jLabel12.setBounds(970, 4, 36, 32);

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
        jLabel14.setBounds(920, 4, 36, 32);

        jPanel3.setLayout(null);

        jTable_show_users.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "User", "Nume", "Prenume", "Adresa", "Parola", "Sex", "Functie", "Judet", "Data"
            }
        ));
        jTable_show_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_show_usersMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_show_users);
        if (jTable_show_users.getColumnModel().getColumnCount() > 0) {
            jTable_show_users.getColumnModel().getColumn(0).setMinWidth(40);
            jTable_show_users.getColumnModel().getColumn(0).setPreferredWidth(40);
            jTable_show_users.getColumnModel().getColumn(0).setMaxWidth(40);
            jTable_show_users.getColumnModel().getColumn(1).setMinWidth(80);
            jTable_show_users.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable_show_users.getColumnModel().getColumn(1).setMaxWidth(80);
            jTable_show_users.getColumnModel().getColumn(2).setMinWidth(80);
            jTable_show_users.getColumnModel().getColumn(2).setPreferredWidth(80);
            jTable_show_users.getColumnModel().getColumn(2).setMaxWidth(80);
            jTable_show_users.getColumnModel().getColumn(3).setMinWidth(125);
            jTable_show_users.getColumnModel().getColumn(3).setPreferredWidth(125);
            jTable_show_users.getColumnModel().getColumn(3).setMaxWidth(125);
            jTable_show_users.getColumnModel().getColumn(5).setMinWidth(100);
            jTable_show_users.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable_show_users.getColumnModel().getColumn(5).setMaxWidth(100);
            jTable_show_users.getColumnModel().getColumn(6).setMinWidth(65);
            jTable_show_users.getColumnModel().getColumn(6).setPreferredWidth(65);
            jTable_show_users.getColumnModel().getColumn(6).setMaxWidth(65);
            jTable_show_users.getColumnModel().getColumn(7).setMinWidth(90);
            jTable_show_users.getColumnModel().getColumn(7).setPreferredWidth(90);
            jTable_show_users.getColumnModel().getColumn(7).setMaxWidth(90);
            jTable_show_users.getColumnModel().getColumn(8).setMinWidth(80);
            jTable_show_users.getColumnModel().getColumn(8).setPreferredWidth(80);
            jTable_show_users.getColumnModel().getColumn(8).setMaxWidth(80);
            jTable_show_users.getColumnModel().getColumn(9).setMinWidth(80);
            jTable_show_users.getColumnModel().getColumn(9).setPreferredWidth(80);
            jTable_show_users.getColumnModel().getColumn(9).setMaxWidth(80);
        }

        jPanel3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 20, 970, 190);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_user_close_security_103764.png"))); // NOI18N
        jButton1.setText("Accepta");
        jButton1.setToolTipText("Ofera permisiune de a deveni user.");
        jPanel3.add(jButton1);
        jButton1.setBounds(820, 220, 160, 45);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_user_male_delete_44487.png"))); // NOI18N
        jButton2.setText("Sterge");
        jButton2.setToolTipText("Sterge userul. ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2);
        jButton2.setBounds(440, 220, 160, 45);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/if_user_male_edit_44491.png"))); // NOI18N
        jButton3.setText("Editeaza");
        jButton3.setToolTipText("Editeaza datele userilor.");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3);
        jButton3.setBounds(630, 220, 160, 45);

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/free-wallpaper-11.jpg"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 990, 280);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(10, 40, 990, 280);

        jPanel2.setBackground(new java.awt.Color(243, 243, 243));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 255), 2, true), "Editare utilizatori:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 1, 24), new java.awt.Color(0, 0, 255))); // NOI18N
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User :");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(110, 40, 47, 30);

        jTextField_firstName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_firstName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_firstName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_firstName_user);
        jTextField_firstName_user.setBounds(240, 80, 220, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prenume :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(110, 120, 81, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Judet :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(530, 40, 55, 30);

        jTextField_lastName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_lastName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_lastName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_lastName_user);
        jTextField_lastName_user.setBounds(240, 120, 220, 30);

        jComboBox_jud_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_jud_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alba", "Arad", "Arges", "Bacau", "Bihor", "Bistrita Nasaud", "Botosani", "Braila", "Brasov", "Bucuresti", "Buzau", "Calaras", "Caras Severin", "Cluj", "Constanta", "Covasna", "Dambovita", "Galati", "Giurgiu", "Gorj", "Harghita", "Hunedoara", "Ialomita", "Iasi", "Ilfov", "Maramures", "Mehedinti", "Mures", "Neamt", "Olt", "Prahova", "Salaj", "Satul Mare", "Sibiu", "Suceava", "Teleorman", "Timis", "Tulcea", "Valcia", "Vaslui", "Vrancea" }));
        jComboBox_jud_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox_jud_user);
        jComboBox_jud_user.setBounds(660, 40, 220, 30);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Adresa :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(530, 120, 65, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Sex :");
        jPanel2.add(jLabel5);
        jLabel5.setBounds(110, 240, 40, 30);

        buttonGroup_gender.add(jRadioButton_m_user);
        jRadioButton_m_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_m_user.setText("Masculin");
        jRadioButton_m_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton_m_user.setOpaque(false);
        jPanel2.add(jRadioButton_m_user);
        jRadioButton_m_user.setBounds(270, 240, 75, 30);

        buttonGroup_gender.add(jRadioButton_f_user);
        jRadioButton_f_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jRadioButton_f_user.setText("Feminin");
        jRadioButton_f_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton_f_user.setOpaque(false);
        jPanel2.add(jRadioButton_f_user);
        jRadioButton_f_user.setBounds(360, 240, 71, 30);

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
        jScrollPane1.setBounds(660, 120, 220, 78);

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
        jButton_create_user.setBounds(660, 220, 220, 45);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Functie :");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(530, 80, 68, 30);

        jComboBox_function_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_function_user.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Operator", "Inspector", "Administrator", "Altele" }));
        jComboBox_function_user.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(jComboBox_function_user);
        jComboBox_function_user.setBounds(660, 80, 220, 30);

        jLabel_wrong_firstName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_firstName.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_firstName);
        jLabel_wrong_firstName.setBounds(460, 80, 30, 30);

        jLabel_wrong_lastName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_lastName.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_lastName);
        jLabel_wrong_lastName.setBounds(460, 120, 30, 30);

        jLabel_wrong_address.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_address.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_address);
        jLabel_wrong_address.setBounds(880, 140, 30, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Repeta parola : ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(110, 200, 140, 30);

        jLabel_wrong_password_repeat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_password_repeat.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_password_repeat);
        jLabel_wrong_password_repeat.setBounds(460, 200, 30, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Parola : ");
        jPanel2.add(jLabel11);
        jLabel11.setBounds(110, 160, 66, 30);

        jPasswordField_repeat_password_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_repeat_password_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_repeat_password_userKeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField_repeat_password_user);
        jPasswordField_repeat_password_user.setBounds(240, 200, 220, 30);

        jPasswordField_password_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPasswordField_password_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField_password_userKeyReleased(evt);
            }
        });
        jPanel2.add(jPasswordField_password_user);
        jPasswordField_password_user.setBounds(240, 160, 220, 30);

        jLabel_wrong_password.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_password.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_password);
        jLabel_wrong_password.setBounds(460, 160, 30, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nume :");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(110, 80, 58, 30);

        jTextField_userName_user.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_userName_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField_userName_userKeyReleased(evt);
            }
        });
        jPanel2.add(jTextField_userName_user);
        jTextField_userName_user.setBounds(240, 40, 220, 30);

        jLabel_wrong_user.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_wrong_user.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\if_Erase_32464.png")); // NOI18N
        jPanel2.add(jLabel_wrong_user);
        jLabel_wrong_user.setBounds(460, 40, 30, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autovehicole/imgAutovehicole/user-groups-frenchnavy-256px-120x120.png"))); // NOI18N
        jPanel2.add(jLabel9);
        jLabel9.setBounds(530, 150, 120, 120);

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\Calin-Alex\\Desktop\\POZE PROIECT\\poze proiect autovehicole\\35293hd.jpg")); // NOI18N
        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 30, 970, 250);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 320, 990, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1010, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        ExitAplication();
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        GoBackToLogin();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
        this.setState(Frame.ICONIFIED);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        SetEnebleTrus();
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int i = jTable_show_users.getSelectedRow();
        TableModel model = jTable_show_users.getModel(); 
        
        if ( jTextField_userName_user.getText().equals("") ) 
        {
             JOptionPane.showMessageDialog(null, "Selectati un utilizator pentru al sterge! " , "Atentie!" ,JOptionPane.WARNING_MESSAGE); 
        }else{
             int mesaj = JOptionPane.showConfirmDialog(null, "Vreti sa stergeti acest user? ", "Atentie", JOptionPane.OK_CANCEL_OPTION);
             if (mesaj == 0){
              String query = "DELETE FROM `user` WHERE `id_user`="+ model.getValueAt(i, 0).toString() ;
              
            executQuery this_query = new executQuery();
            this_query.executeSqlQuery(query, "Utilizatorul a fost sters.", "Informatii");

             }
        }
        
        RemoveUsersFromTable();
        ShowUsers();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_firstName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_firstName_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_firstName.setVisible(false);
    }//GEN-LAST:event_jTextField_firstName_userKeyReleased

    private void jTextField_lastName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_lastName_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_lastName.setVisible(false);
    }//GEN-LAST:event_jTextField_lastName_userKeyReleased

    private void jTextArea_address_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextArea_address_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_address.setVisible(false);
    }//GEN-LAST:event_jTextArea_address_userKeyReleased

    private void jButton_create_userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_create_userActionPerformed
        // TODO add your handling code here:

        CheckFields();

    }//GEN-LAST:event_jButton_create_userActionPerformed

    private void jPasswordField_repeat_password_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_repeat_password_userKeyReleased
        // TODO add your handling code here:
        if( jPasswordField_password_user.getText().equals(jPasswordField_repeat_password_user.getText())){
            jLabel_wrong_password_repeat.setVisible(false);
        }else{
            jLabel_wrong_password_repeat.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField_repeat_password_userKeyReleased

    private void jPasswordField_password_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField_password_userKeyReleased
        // TODO add your handling code here:
        jLabel_wrong_password.setVisible(false);

        if(jPasswordField_repeat_password_user.getText().equals(jPasswordField_password_user.getText())){
            jLabel_wrong_password_repeat.setVisible(false);
        }else{
            jLabel_wrong_password_repeat.setVisible(true);
        }
    }//GEN-LAST:event_jPasswordField_password_userKeyReleased

    private void jTextField_userName_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_userName_userKeyReleased
        // TODO add your handling code here:
    
    }//GEN-LAST:event_jTextField_userName_userKeyReleased

    private void jTable_show_usersMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_show_usersMouseClicked
        // TODO add your handling code here:
        int i = jTable_show_users.getSelectedRow();
        TableModel model = jTable_show_users.getModel();
       // jTextField_userName_user.setText(model.getValueAt(i, 0).toString());
        jTextField_userName_user.setText(model.getValueAt(i, 1).toString());
        jTextField_firstName_user.setText(model.getValueAt(i, 2).toString());
        jTextField_lastName_user.setText(model.getValueAt(i, 3).toString());
        jTextArea_address_user.setText(model.getValueAt(i, 4).toString());
        jPasswordField_password_user.setText(model.getValueAt(i, 5).toString());
        jPasswordField_repeat_password_user.setText(model.getValueAt(i, 5).toString());
        String gender = model.getValueAt(i, 6).toString();
        String func = model.getValueAt(i, 7).toString();
        String jud = model.getValueAt(i, 8).toString();
System.out.println(jud);
        buttonGroup_gender.clearSelection();
        if( gender.equals("Masculin") ){
            jRadioButton_m_user.setSelected(true);
        }else{
            jRadioButton_f_user.setSelected(true);
        }
   
        for( int j =0; j < jComboBox_function_user.getItemCount(); j++){
            String item = jComboBox_function_user.getItemAt(j).toString();
            if( func.equals(item) ){
                jComboBox_function_user.getModel().setSelectedItem(item);
            }
        }
        for( int t =0; t < jComboBox_jud_user.getItemCount(); t++){
            String itemm = jComboBox_jud_user.getItemAt(t).toString();
            if( jud.equals(itemm) ){
                jComboBox_jud_user.getModel().setSelectedItem(itemm);
            }
        }
        
     
    }//GEN-LAST:event_jTable_show_usersMouseClicked

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
            java.util.logging.Logger.getLogger(EditareAcountAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditareAcountAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditareAcountAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditareAcountAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditareAcountAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton_create_user;
    private javax.swing.JComboBox<String> jComboBox_function_user;
    private javax.swing.JComboBox<String> jComboBox_jud_user;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPasswordField jPasswordField_password_user;
    private javax.swing.JPasswordField jPasswordField_repeat_password_user;
    private javax.swing.JRadioButton jRadioButton_f_user;
    private javax.swing.JRadioButton jRadioButton_m_user;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_show_users;
    private javax.swing.JTextArea jTextArea_address_user;
    private javax.swing.JTextField jTextField_firstName_user;
    private javax.swing.JTextField jTextField_lastName_user;
    private javax.swing.JTextField jTextField_userName_user;
    // End of variables declaration//GEN-END:variables
}
