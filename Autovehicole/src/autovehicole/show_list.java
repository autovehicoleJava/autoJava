/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.awt.Frame;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Calin-Alex
 */
public class show_list extends javax.swing.JFrame {

    /**
     * Creates new form show_list
     */
    public show_list() {
        initComponents();
        
        GetCurrentDate date = new GetCurrentDate();
        jLabel_currentDate.setText(date.CurrentDate());
        
        ReadFromFile user = new ReadFromFile();
        jLabel_userName.setText(user.getUser());
        
        this.setLocationRelativeTo(null);
        
        ShowCars();
        ShowOwners();
        ShowRegistereds();

    }
    
    
    
    
    
    
    
    
    
//    public void ShowCars(){
//        jTable_showInfo_cars
//    }
    
    public ArrayList<Cars> getCarsList(){
        ArrayList<Cars> carsList = new ArrayList<Cars>(); 

        String query = "SELECT * FROM `cars` ";     
        Connect con = new Connect();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(query);
            Cars cars;
            while (rs.next())
            {
                cars = new Cars(rs.getInt("id_car"),rs.getString("category_car"), rs.getString("mark_car"), rs.getString("carBody_car"),
                        rs.getString("type_car"),rs.getString("nrOmologare_an_car"), rs.getInt("nrSasiu_car"), rs.getString("cutie_car"),
                        rs.getInt("co2_car"),rs.getString("color_car"), rs.getInt("dbA_m_car"), rs.getInt("dbA_s_car"),
                        rs.getInt("km_h_car"),rs.getInt("air_bar_one_car"), rs.getInt("air_bar_tow_car"), rs.getInt("nrAxe_car"),
                        rs.getString("traction_car"),rs.getInt("l_rezervor_car"), rs.getInt("kg_self_car"), rs.getInt("kg_max_car"),
                        rs.getInt("kg_max_aut_car"),rs.getInt("kg_max_hook_car"), rs.getInt("max_aut_ax_front_car"), rs.getInt("max_aut_ax_middle_car"),
                        rs.getInt("max_aut_ax_back_car"),rs.getInt("max_aut_onTrack_car"), rs.getInt("trailer_with_brakes_car"), rs.getInt("trailer_without_brakes_car"),
                        rs.getInt("nrSeats_total_car"),rs.getInt("nrSeats_onFront_car"), rs.getInt("nrSeats_standing_car"), rs.getInt("nrSeats_onTheSeats_car"),
                        rs.getString("tires_front_car"),rs.getString("tires_else_front_car"), rs.getString("tires_middle_back_car"), rs.getString("tires_else_middle_back_car"),
                        rs.getString("engine_type_car"),rs.getString("engine_series_car"), rs.getInt("engine_cm3_car"), rs.getInt("power_kW_min_car"),
                        rs.getString("fuel_car"),rs.getInt("length_car"), rs.getInt("width_kW_min_car"), rs.getInt("height_kW_min_car"),
                        rs.getString("date_car"));
                carsList.add(cars);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return carsList;
    }   
    
    
    
    
    // Arata evenimentele in tabel
    public void ShowCars()
    {
        ArrayList<Cars> cars= getCarsList();
        DefaultTableModel model = (DefaultTableModel)jTable_showInfo_cars.getModel();
        Object[] row = new Object[45];
        for(int i = 0; i < cars.size(); i++)
        {
            row[0] = cars.get(i).getId();
            row[1] = cars.get(i).getCategory();
            row[2] = cars.get(i).getMark();
            row[3] = cars.get(i).getCarBody();
            row[4] = cars.get(i).getType();
            row[5] = cars.get(i).getNrOmologare();
            row[6] = cars.get(i).getSasiu();
            row[7] = cars.get(i).getCutieViteze();
            row[8] = cars.get(i).getCo2();
            row[9] = cars.get(i).getColor();
            row[10] = cars.get(i).getdBA_inMers();
            row[11] = cars.get(i).getdBA_stationare();
            row[12] = cars.get(i).getKmh();
            row[13] = cars.get(i).getAerBar_oConducta();
            row[14] = cars.get(i).getAerBar_douaConducte();
            row[15] = cars.get(i).getNr_axe();
            row[16] = cars.get(i).getTractiune();
            row[17] = cars.get(i).getRezervor();
            row[18] = cars.get(i).getKg_masina();
            row[19] = cars.get(i).getMasa_totala();
            row[20] = cars.get(i).getMasa_totala_aut();
            row[21] = cars.get(i).getMasa_totala_aut_carlig();
            row[22] = cars.get(i).getMasa_max_aut_fata();
            row[23] = cars.get(i).getMasa_max_aut_mijloc();
            row[24] = cars.get(i).getMasa_max_aut_spate();
            row[25] = cars.get(i).getMasa_max_aut_senila();
            row[26] = cars.get(i).getMaxa_aut_remorca_cu_franare();
            row[27] = cars.get(i).getMaxa_aut_remorca_fara_franare();
            row[28] = cars.get(i).getNr_locuri();
            row[29] = cars.get(i).getNr_locuri_inFata();
            row[30] = cars.get(i).getNr_locuri_picioare();
            row[31] = cars.get(i).getNr_locuri_peScaun();
            row[32] = cars.get(i).getAnvelope_fata();
            row[33] = cars.get(i).getAnvelope_fata_sau();
            row[34] = cars.get(i).getAnvelope_mijloc_spate();
            row[35] = cars.get(i).getAnvelope_mijloc_spate_sau();
            row[36] = cars.get(i).getTip_motor();
            row[37] = cars.get(i).getSerie_motor();
            row[38] = cars.get(i).getCilindrii_motor();
            row[39] = cars.get(i).getPutere_turatii();
            row[40] = cars.get(i).getCarburant();
            row[41] = cars.get(i).getLungime_masina();
            row[42] = cars.get(i).getLatime_masina();
            row[43] = cars.get(i).getInaltime_masina();
            row[44] = cars.get(i).getData_inmatricularii();

            
            model.addRow(row);
          
        }
    }
    
    
    
    
    public ArrayList<Owner> getOwnerList(){
        ArrayList<Owner> ownerList = new ArrayList<Owner>(); 

        String query = "SELECT * FROM `owner` ";     
        Connect con = new Connect();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(query);
            Owner owner;
            while (rs.next())
            {
                owner = new Owner(rs.getInt("id_owner"),rs.getString("firstName_owner"), rs.getString("lastName_owner"), 
                        rs.getInt("cnp_owner"), rs.getString("nationality_owner"), rs.getString("gender_owner"),
                        rs.getString("jud_owner"), rs.getString("address_owner"), rs.getString("date_owner"));
                ownerList.add(owner);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return ownerList;
    }   
    
    
    
    // Arata evenimentele in tabel
    public void ShowOwners()
    {
        ArrayList<Owner> owners= getOwnerList();
        DefaultTableModel model2 = (DefaultTableModel)jTable_showInfo_owner.getModel();
        Object[] row = new Object[9];
        for(int i = 0; i < owners.size(); i++)
        {
            row[0] = owners.get(i).getId_owner();
            row[1] = owners.get(i).getFirstName_owner();
            row[2] = owners.get(i).getLastName_owner();
            row[3] = owners.get(i).getCnp_owner();
            row[4] = owners.get(i).getNationality_owner();
            row[5] = owners.get(i).getGender_owner();
            row[6] = owners.get(i).getJud_owner();
            row[7] = owners.get(i).getAddress_owner();
            row[8] = owners.get(i).getData_owner();

            
            model2.addRow(row);
          
        }
    }
    
    
    
    
public ArrayList<Registered> getRegisteredList(){
        ArrayList<Registered> registeredList = new ArrayList<Registered>(); 

        String query = "SELECT * FROM `registered` ";     
        Connect con = new Connect();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(query);
            Registered registered;
            while (rs.next())
            {
                registered = new Registered(rs.getInt("id_registered"),rs.getString("nr_registered"), rs.getString("date_registered"), 
                        rs.getString("revision_registered"));
                registeredList.add(registered);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return registeredList;
    }   
    
    
    
    // Arata evenimentele in tabel
    public void ShowRegistereds()
    {
        ArrayList<Registered> registereds= getRegisteredList();
        DefaultTableModel model3 = (DefaultTableModel)jTable_showInfo_registered.getModel();
        Object[] row = new Object[4];
        for(int i = 0; i < registereds.size(); i++)
        {
            row[0] = registereds.get(i).getId_registered();
            row[1] = registereds.get(i).getNrCar_registered();
            row[2] = registereds.get(i).getDate_registered();
            row[3] = registereds.get(i).getLast_date_registered();

            
            model3.addRow(row);
          
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

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jButton_LogOut = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_showInfo_cars = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable_showInfo_owner = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable_showInfo_registered = new javax.swing.JTable();
        jLabel14 = new javax.swing.JLabel();
        jLabel_currentDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 640));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204)));
        jPanel1.setPreferredSize(new java.awt.Dimension(1020, 510));
        jPanel1.setLayout(null);

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
        jLabel13.setBounds(10, 10, 50, 32);

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
        jPanel1.add(jButton_LogOut);
        jButton_LogOut.setBounds(1150, 10, 140, 40);

        jPanel2.setLayout(null);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(4020, 100));

        jTable_showInfo_cars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Categoria", "Marca", "Caroserie", "Tipul", "Nr. Omologare/An masina", "Serie sasiu", "Cutie de viteze", "CO2", "Culoare", "Zgomot in mers(dB(A))", "Zgomot stationare(dB(A))", "Viteza maxima", "Presiune aer la cupla (bar) o conducta", "Presiune aer la cupla (bar) doua conducte", "Numar axe", "Tractiune", "Capacitate rezervor (l)", "Mase (kg) proprie", "Mase (kg) totala", "Sarcina utila maxima", "Sarcina utila pe carlig", "Masa max. aut. fata", "Masa max. aut. mijloc", "Masa max. aut. spate", "Masa max. aut. rola de senila", "Remorca cu dispozitiv de franare", "Remorca fara dispozitiv de franare", "Total nr. locuri", "Locuri in fata", "Locuri in picioare", "Locuri pe scaune", "Dimensine anveope fata", "Dimensine anveope sau", "Dimensine anveope mijloc-spate", "Dimensine anveope sau", "Tip motor", "Serie motor", "Capacitate cilindrica", "Putere(kW)/Turatie(min)", "Combustibil", "Lungime autovehicol", "Latime autovehicol", "Inaltime autovehicol", "Data inregistrarii"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_showInfo_cars.setMaximumSize(new java.awt.Dimension(4475, 0));
        jTable_showInfo_cars.setMinimumSize(new java.awt.Dimension(4475, 0));
        jTable_showInfo_cars.setPreferredSize(new java.awt.Dimension(4475, 200));
        jScrollPane1.setViewportView(jTable_showInfo_cars);
        if (jTable_showInfo_cars.getColumnModel().getColumnCount() > 0) {
            jTable_showInfo_cars.getColumnModel().getColumn(1).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(2).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(3).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(4).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(5).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(6).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(7).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(8).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(9).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(10).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(11).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(12).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(13).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(14).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(15).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(16).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(17).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(18).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(19).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(20).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(21).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(22).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(23).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(24).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(25).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(26).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(27).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(28).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(29).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(30).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(31).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(32).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(33).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(34).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(35).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(36).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(37).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(38).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(39).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(40).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(41).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(42).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(43).setPreferredWidth(100);
            jTable_showInfo_cars.getColumnModel().getColumn(44).setPreferredWidth(100);
        }

        jLayeredPane1.add(jScrollPane1);
        jScrollPane1.setBounds(10, 10, 4000, 200);

        jScrollPane3.setViewportView(jLayeredPane1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 70, 1260, 240);

        jTable_showInfo_owner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nume", "Prenume", "CNP", "Nationalitate", "Sex", "Judet", "Adresa", "Data "
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTable_showInfo_owner);
        if (jTable_showInfo_owner.getColumnModel().getColumnCount() > 0) {
            jTable_showInfo_owner.getColumnModel().getColumn(0).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(1).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(2).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(3).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(4).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(5).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(6).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(7).setPreferredWidth(120);
            jTable_showInfo_owner.getColumnModel().getColumn(8).setPreferredWidth(120);
        }

        jLayeredPane2.add(jScrollPane4);
        jScrollPane4.setBounds(10, 10, 750, 220);

        jScrollPane2.setViewportView(jLayeredPane2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 320, 770, 240);

        jTable_showInfo_registered.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Numar masina", "Data inmatricularii", "Data ultimei revizii"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane6.setViewportView(jTable_showInfo_registered);
        if (jTable_showInfo_registered.getColumnModel().getColumnCount() > 0) {
            jTable_showInfo_registered.getColumnModel().getColumn(0).setMinWidth(50);
            jTable_showInfo_registered.getColumnModel().getColumn(0).setPreferredWidth(50);
            jTable_showInfo_registered.getColumnModel().getColumn(0).setMaxWidth(50);
        }

        jLayeredPane3.add(jScrollPane6);
        jScrollPane6.setBounds(10, 10, 460, 220);

        jScrollPane5.setViewportView(jLayeredPane3);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(790, 320, 480, 240);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 1280, 570);

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
        jPanel1.add(jLabel14);
        jLabel14.setBounds(1100, 10, 40, 40);

        jLabel_currentDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_currentDate.setForeground(new java.awt.Color(51, 204, 255));
        jLabel_currentDate.setText("Date curenta:");
        jPanel1.add(jLabel_currentDate);
        jLabel_currentDate.setBounds(590, 30, 100, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Date curenta:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(490, 30, 100, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nume utilizator:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(490, 10, 100, 15);

        jLabel_userName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_userName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_userName.setText("Nume utilizator:");
        jPanel1.add(jLabel_userName);
        jLabel_userName.setBounds(590, 10, 100, 15);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1300, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Menu window = new Menu();
        window.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton_LogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LogOutActionPerformed
        // TODO add your handling code here:
        WriteInFile writeIn = new WriteInFile();
        writeIn.setTextInFile("", "");
        
        this.setVisible(false);
        LogIn window = new LogIn();
        window.setVisible(true);
    }//GEN-LAST:event_jButton_LogOutActionPerformed

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
            java.util.logging.Logger.getLogger(show_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(show_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(show_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(show_list.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new show_list().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel_currentDate;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable_showInfo_cars;
    private javax.swing.JTable jTable_showInfo_owner;
    private javax.swing.JTable jTable_showInfo_registered;
    // End of variables declaration//GEN-END:variables
}
