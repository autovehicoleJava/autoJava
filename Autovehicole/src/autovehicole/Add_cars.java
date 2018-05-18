
package autovehicole;

import java.awt.Frame;


public class Add_cars extends javax.swing.JFrame {

    /**
     * Creates new form Add_cars
     */
    public Add_cars() {
        initComponents();
        
        GetCurrentDate date = new GetCurrentDate();
        jLabel_currentDate.setText(date.CurrentDate());
        
        ReadFromFile user = new ReadFromFile();
        jLabel_userName.setText(user.getUser());
        
        jTextField_data_inmatricularii.setEnabled(false);
        jTextField_max_util.setEnabled(false);
        
        jTextField_data_inmatricularii.setEnabled(false);
        jTextField_data_inmatricularii.setText(date.CurrentDate());
        
        this.setLocationRelativeTo(null);
        
        
    }
    
    
    public void InserdCarData(){
        
        String category_car = jComboBox_category.getSelectedItem().toString();
        String mark_car = jComboBox_mark.getSelectedItem().toString();
        String carBody_car = jComboBox_carBody.getSelectedItem().toString();
        String type_car = jTextField_type.getText();
        
        String nrOmologare_an_car = jTextField_year.getText();
        int nrSasiu_car = Integer.parseInt(jTextField_sasiu.getText());
        String cutie_car = jComboBox_cutie.getSelectedItem().toString();
        int co2_car = Integer.parseInt(jTextField_co2.getText());
        String color_car = jComboBox_culoare.getSelectedItem().toString();
        int dbA_m_car = Integer.parseInt(jTextField_zgomot_mers.getText());
        int dbA_s_car = Integer.parseInt(jTextField_zgomot_stationare.getText());
        int km_h_car = Integer.parseInt(jTextField_km_h.getText());
        int air_bar_one_car = Integer.parseInt(jTextField_bar_o_conducta.getText());
        int air_bar_tow_car = Integer.parseInt(jTextField_bar_doua_conducte.getText());
        int nrAxe_car = Integer.parseInt(jTextField_nr_axe.getText());
        String traction_car = jComboBox_tractiune.getSelectedItem().toString();
        int l_rezervor_car = Integer.parseInt(jTextField_rezervor.getText());
        int kg_self_car = Integer.parseInt(jTextField_kg_p.getText());
        int kg_max_car = Integer.parseInt(jTextField_kg_max.getText());
        int kg_max_aut_car = kg_max_car - kg_self_car;
        String kg_max_aut_carr = String.valueOf(kg_max_aut_car);
        jTextField_max_util.setText(kg_max_aut_carr);
        int kg_max_hook_car = Integer.parseInt(jTextField_sarcina_remorca.getText());
        int max_aut_ax_front_car = Integer.parseInt(jTextField_ax_fata.getText());
        int max_aut_ax_middle_car = Integer.parseInt(jTextField_ax_mijloc.getText());
        int max_aut_ax_back_car = Integer.parseInt(jTextField_ax_spate.getText());
        int max_aut_onTrack_car = Integer.parseInt(jTextField_rola_senila.getText());
        int trailer_with_brakes_car = Integer.parseInt(jTextField_remorca_cu_frane.getText());
        int trailer_without_brakes_car = Integer.parseInt(jTextField_remorca_fara_frane.getText());
        int nrSeats_total_car = Integer.parseInt(jTextField_nr_loc_total.getText());
        int nrSeats_onFront_car = Integer.parseInt(jTextField_nr_loc_fata.getText());
        int nrSeats_standing_car = Integer.parseInt(jTextField_nr_loc_picioare.getText());
        int nrSeats_onTheSeats_car = Integer.parseInt(jTextField_nr_loc_scaun.getText());
        String tires_front_car = jComboBox_anvelope_fata.getSelectedItem().toString();
        String tires_else_front_car = jComboBox_anvelope_fata2.getSelectedItem().toString();
        String tires_middle_back_car = jComboBox_anvelope_mijlocSpate.getSelectedItem().toString();
        String tires_else_middle_back_car = jComboBox_anvelope_mijlocSpate2.getSelectedItem().toString();
        String engine_type_car = jTextField_tip_motor.getText();
        String engine_series_car = jTextField_serie_motor.getText();
        int engine_cm3_car = Integer.parseInt(jTextField_cm3_motor.getText());
        int power_kW_min_car = Integer.parseInt(jTextField_putere_motor.getText());
        String fuel_car = jComboBox_combustibil.getSelectedItem().toString();
        int length_car = Integer.parseInt(jTextField_lungime_aut.getText());
        int width_kW_min_car = Integer.parseInt(jTextField_latime_aut.getText());
        int height_kW_min_car = Integer.parseInt(jTextField_inaltime_aut.getText());
        String date_car =  jLabel_currentDate.getText();
        
        String query = "INSERT INTO cars("
                + "category_car, mark_car, carBody_car, type_car "
                + ", nrOmologare_an_car , nrSasiu_car , cutie_car , co2_car "
                + ", color_car , dbA_m_car , dbA_s_car , km_h_car "
                + ", air_bar_one_car , air_bar_tow_car , nrAxe_car , traction_car "
                + ", l_rezervor_car , kg_self_car , kg_max_car , kg_max_aut_car "
                + ", kg_max_hook_car , max_aut_ax_front_car , max_aut_ax_middle_car , max_aut_ax_back_car "
                + ", max_aut_onTrack_car , trailer_with_brakes_car , trailer_without_brakes_car , nrSeats_total_car "
                + ", nrSeats_onFront_car , nrSeats_standing_car , nrSeats_onTheSeats_car , tires_front_car "
                + ", tires_else_front_car , tires_middle_back_car , tires_else_middle_back_car , engine_type_car "
                + ", engine_series_car , engine_cm3_car , power_kW_min_car , fuel_car "
                + ", length_car , width_kW_min_car , height_kW_min_car , date_car "
                + ")"+" VALUES ("
                + "'"+category_car+"','"+mark_car+"','"+carBody_car+"','"+type_car+"'"
                + ",'"+nrOmologare_an_car+"','"+nrSasiu_car+"','"+cutie_car+"','"+co2_car+"'"
                + ",'"+color_car+"','"+dbA_m_car+"','"+dbA_s_car+"','"+km_h_car+"'"
                + ",'"+air_bar_one_car+"','"+air_bar_tow_car+"','"+nrAxe_car+"','"+traction_car+"'"
                + ",'"+l_rezervor_car+"','"+kg_self_car+"','"+kg_max_car+"','"+kg_max_aut_car+"'"
                + ",'"+kg_max_hook_car+"','"+max_aut_ax_front_car+"','"+max_aut_ax_middle_car+"','"+max_aut_ax_back_car+"'"
                + ",'"+max_aut_onTrack_car+"','"+trailer_with_brakes_car+"','"+trailer_without_brakes_car+"','"+nrSeats_total_car+"'"
                + ",'"+nrSeats_onFront_car+"','"+nrSeats_standing_car+"','"+nrSeats_onTheSeats_car+"','"+tires_front_car+"'"
                + ",'"+tires_else_front_car+"','"+tires_middle_back_car+"','"+tires_else_middle_back_car+"','"+engine_type_car+"'"
                + ",'"+engine_series_car+"','"+engine_cm3_car+"','"+power_kW_min_car+"','"+fuel_car+"'"
                + ",'"+length_car+"','"+width_kW_min_car+"','"+height_kW_min_car+"','"+date_car+"'"
                + ")";

        executQuery this_query = new executQuery();
        this_query.executeSqlQuery(query, "Masina a fost adaugat cu\n succes in baza de date!", "Inregistrare masina");  
        
    }
    
    public void InserdOwnerData(){
        
        String firstName_owner = jTextField_firstName_owner.getText();
        String lastName_owner = jTextField_lastName_owner.getText();
        int cnp_owner = Integer.parseInt(jTextField_cnp_owner.getText());
        String nationality_owner = jComboBox_nationality_owner.getSelectedItem().toString();
        
        jRadioButton_gender_m_owner.setActionCommand(jRadioButton_gender_m_owner.getText());
        jRadioButton_gender_f_owner.setActionCommand(jRadioButton_gender_f_owner.getText());  
        String gender_owner = buttonGroup_gender_owner.getSelection().getActionCommand();
        
        String jud_owner = jComboBox_jud_owner.getSelectedItem().toString();
        String address_owner = jTextArea_address_owner.getText();
        String date_owner =  jLabel_currentDate.getText();
        
        String query = "INSERT INTO owner( firstName_owner, lastName_owner, cnp_owner"
                + " , nationality_owner, gender_owner, jud_owner, address_owner, date_owner"
                + ")"+" VALUES ("
                + "'"+firstName_owner+"','"+lastName_owner+"','"+cnp_owner+"'"
                + ",'"+nationality_owner+"','"+gender_owner+"','"+jud_owner+"'"
                + ",'"+address_owner+"','"+date_owner+"')";

        executQuery this_query = new executQuery();
        this_query.executeSqlQuery(query, "Masina a fost adaugat cu\n succes in baza de date!", "Inregistrare masina");  
        
    }
    
    public void InserdRegisteredData(){
        
        String nr_registered = jTextField_nr_inmatriculare.getText();
        String date_registered = jLabel_currentDate.getText();
        String revision_registered = jTextField_data_revizie.getText();

        
        String query = "INSERT INTO registered( nr_registered, date_registered, revision_registered"
                + ")"+" VALUES ("
                + "'"+nr_registered+"','"+date_registered+"','"+revision_registered+"')";

        executQuery this_query = new executQuery();
        this_query.executeSqlQuery(query, "Masina a fost adaugat cu\n succes in baza de date!", "Inregistrare masina");  
        
    }  
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup_gender_owner = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jButton_LogOut = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel_currentDate = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel14 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jComboBox_category = new javax.swing.JComboBox<>();
        jPanel21 = new javax.swing.JPanel();
        jComboBox_carBody = new javax.swing.JComboBox<>();
        jPanel22 = new javax.swing.JPanel();
        jComboBox_mark = new javax.swing.JComboBox<>();
        jPanel23 = new javax.swing.JPanel();
        jTextField_type = new javax.swing.JTextField();
        jPanel24 = new javax.swing.JPanel();
        jTextField_year = new javax.swing.JTextField();
        jPanel25 = new javax.swing.JPanel();
        jTextField_sasiu = new javax.swing.JTextField();
        jPanel27 = new javax.swing.JPanel();
        jComboBox_cutie = new javax.swing.JComboBox<>();
        jPanel28 = new javax.swing.JPanel();
        jTextField_co2 = new javax.swing.JTextField();
        jPanel29 = new javax.swing.JPanel();
        jComboBox_culoare = new javax.swing.JComboBox<>();
        jPanel30 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_zgomot_stationare = new javax.swing.JTextField();
        jTextField_zgomot_mers = new javax.swing.JTextField();
        jPanel31 = new javax.swing.JPanel();
        jTextField_bar_o_conducta = new javax.swing.JTextField();
        jTextField_bar_doua_conducte = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel32 = new javax.swing.JPanel();
        jTextField_km_h = new javax.swing.JTextField();
        jPanel13 = new javax.swing.JPanel();
        jTextField_nr_axe = new javax.swing.JTextField();
        jPanel18 = new javax.swing.JPanel();
        jComboBox_tractiune = new javax.swing.JComboBox<>();
        jPanel33 = new javax.swing.JPanel();
        jTextField_rezervor = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1_next = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jTextField_kg_p = new javax.swing.JTextField();
        jTextField_kg_max = new javax.swing.JTextField();
        jTextField_max_util = new javax.swing.JTextField();
        jTextField_sarcina_remorca = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jTextField_ax_spate = new javax.swing.JTextField();
        jTextField_ax_fata = new javax.swing.JTextField();
        jTextField_rola_senila = new javax.swing.JTextField();
        jTextField_ax_mijloc = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jTextField_remorca_cu_frane = new javax.swing.JTextField();
        jTextField_remorca_fara_frane = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jTextField_nr_loc_total = new javax.swing.JTextField();
        jTextField_nr_loc_fata = new javax.swing.JTextField();
        jTextField_nr_loc_picioare = new javax.swing.JTextField();
        jTextField_nr_loc_scaun = new javax.swing.JTextField();
        jPanel11 = new javax.swing.JPanel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jTextField_lungime_aut = new javax.swing.JTextField();
        jTextField_latime_aut = new javax.swing.JTextField();
        jTextField_inaltime_aut = new javax.swing.JTextField();
        jPanel12 = new javax.swing.JPanel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jTextField_tip_motor = new javax.swing.JTextField();
        jTextField_serie_motor = new javax.swing.JTextField();
        jTextField_cm3_motor = new javax.swing.JTextField();
        jTextField_putere_motor = new javax.swing.JTextField();
        jComboBox_combustibil = new javax.swing.JComboBox<>();
        jPanel19 = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jComboBox_anvelope_fata = new javax.swing.JComboBox<>();
        jComboBox_anvelope_fata2 = new javax.swing.JComboBox<>();
        jComboBox_anvelope_mijlocSpate = new javax.swing.JComboBox<>();
        jComboBox_anvelope_mijlocSpate2 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jTextField_data_revizie = new javax.swing.JTextField();
        jTextField_data_inmatricularii = new javax.swing.JTextField();
        jTextField_nr_inmatriculare = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_address_owner = new javax.swing.JTextArea();
        jComboBox_jud_owner = new javax.swing.JComboBox<>();
        jTextField_firstName_owner = new javax.swing.JTextField();
        jTextField_lastName_owner = new javax.swing.JTextField();
        jTextField_cnp_owner = new javax.swing.JTextField();
        jComboBox_nationality_owner = new javax.swing.JComboBox<>();
        jRadioButton_gender_m_owner = new javax.swing.JRadioButton();
        jRadioButton_gender_f_owner = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jButton_car_save = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1020, 570));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153), new java.awt.Color(204, 204, 204), new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(null);

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
        jButton_LogOut.setBounds(870, 10, 140, 40);

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
        jLabel14.setBounds(820, 10, 40, 40);

        jLabel_currentDate.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_currentDate.setForeground(new java.awt.Color(51, 204, 255));
        jLabel_currentDate.setText("Date curenta:");
        jPanel1.add(jLabel_currentDate);
        jLabel_currentDate.setBounds(500, 30, 100, 15);

        jLabel_userName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel_userName.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_userName.setText("Nume utilizator:");
        jPanel1.add(jLabel_userName);
        jLabel_userName.setBounds(500, 10, 100, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nume utilizator:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(400, 10, 100, 15);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 255));
        jLabel3.setText("Date curenta:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(400, 30, 100, 15);

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

        jPanel14.setLayout(null);

        jPanel20.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Categoria:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel20.setLayout(null);

        jComboBox_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Autoturism L", "Autoturism M1", "Autoturism M2", "Autoturism M3", "Autoturism N1", "Autoturism N2", "Autoturism N3", "Autoturism O1", "Autoturism O2", "Autoturism O3", "Autoturism O4", " ", " ", " ", " ", " " }));
        jPanel20.add(jComboBox_category);
        jComboBox_category.setBounds(16, 25, 288, 25);

        jPanel14.add(jPanel20);
        jPanel20.setBounds(10, 11, 320, 65);

        jPanel21.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Caroseria:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel21.setLayout(null);

        jComboBox_carBody.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Berlina", "Break", "Cabrio", "Coupe", "Hatchback", "Minibus", "Monovolum", "Offroad", "SUV" }));
        jPanel21.add(jComboBox_carBody);
        jComboBox_carBody.setBounds(104, 25, 200, 25);

        jPanel14.add(jPanel21);
        jPanel21.setBounds(10, 163, 320, 65);

        jPanel22.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Marca:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel22.setLayout(null);

        jComboBox_mark.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Acura", "Aixam", "Alfa Romeo", "Aro", "Aston Martin", "Audi", "Bentley", "BMW", "Buick", "Bugatti", "Cadillac", "Chaika", "Chevrolet", "Citroen", "Dacia", "Daewoo", "Daihatsu", "Daimler Chrysler", "De Tomaso", "Dodge", "Eagle", "EMW", "Ferrari", "Fiat", "Ford", "General Motors", "GMC", "Holden", "Honda", "Hummer", "Hyundai", "Infiniti", "Isuzu", "Jaguar", "Jeep", "Kia", "Lada", "Lamborghini", "Lancia", "Land Rover", "Lexus", "Ligier", "Lincoln", "Maserati", "Mazda", "Mercedes-Benz", "Mercury", "MG", "Mitsubishi", "Mini", "Morgan", "Nissan", "Oldsmobile", "Oltcit", "Opel", "Peugeot", "Plymouth", "Pontiac (automobil)", "Porsche", "Range Rover", "Renault", "REVA", "Rolls-Royce", "Rover", "Saab", "Saleen", "Saturn", "Seat", "Skoda", "Smart", "SsangYoung", "Subaru", "Suzuki", "Tata", "Toyota", "Trabant", "TVR", "UAZ", "Vauxhall", "Volga", "Volkswagen", "Volvo", "Wartburg" }));
        jPanel22.add(jComboBox_mark);
        jComboBox_mark.setBounds(104, 30, 200, 25);

        jPanel14.add(jPanel22);
        jPanel22.setBounds(10, 87, 320, 65);

        jPanel23.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipul / Varianta:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel23.setLayout(null);
        jPanel23.add(jTextField_type);
        jTextField_type.setBounds(104, 25, 200, 25);

        jPanel14.add(jPanel23);
        jPanel23.setBounds(10, 239, 320, 65);

        jPanel24.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numarul de omologare / Anul fabricatiei:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel24.setLayout(null);
        jPanel24.add(jTextField_year);
        jTextField_year.setBounds(34, 25, 270, 25);

        jPanel14.add(jPanel24);
        jPanel24.setBounds(10, 315, 320, 65);

        jPanel25.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Serie sasiu (numar de identificare):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel25.setLayout(null);
        jPanel25.add(jTextField_sasiu);
        jTextField_sasiu.setBounds(34, 25, 270, 25);

        jPanel14.add(jPanel25);
        jPanel25.setBounds(10, 395, 320, 65);

        jPanel27.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cutie de viteze:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel27.setLayout(null);

        jComboBox_cutie.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manuala", "SemiAutomata", "Automata" }));
        jPanel27.add(jComboBox_cutie);
        jComboBox_cutie.setBounds(104, 25, 200, 25);

        jPanel14.add(jPanel27);
        jPanel27.setBounds(350, 11, 320, 65);

        jPanel28.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Norma de poluare (CO2):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel28.setLayout(null);
        jPanel28.add(jTextField_co2);
        jTextField_co2.setBounds(16, 25, 290, 25);

        jPanel14.add(jPanel28);
        jPanel28.setBounds(350, 87, 320, 65);

        jPanel29.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Culoarea:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel29.setLayout(null);

        jComboBox_culoare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alb", "Negru", "Rosu", "Verde", "Albastru", "Galben", "Portocaliu", "Gri", "Visiniu", "Alta culoare" }));
        jPanel29.add(jComboBox_culoare);
        jComboBox_culoare.setBounds(104, 25, 200, 25);

        jPanel14.add(jPanel29);
        jPanel29.setBounds(350, 163, 320, 65);

        jPanel30.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Zgomotul (dB(A)):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel30.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("In stationare:");
        jPanel30.add(jLabel1);
        jLabel1.setBounds(169, 29, 81, 17);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("In mers:");
        jPanel30.add(jLabel2);
        jLabel2.setBounds(29, 29, 51, 17);
        jPanel30.add(jTextField_zgomot_stationare);
        jTextField_zgomot_stationare.setBounds(254, 25, 50, 25);
        jPanel30.add(jTextField_zgomot_mers);
        jTextField_zgomot_mers.setBounds(84, 25, 50, 25);

        jPanel14.add(jPanel30);
        jPanel30.setBounds(350, 239, 320, 65);

        jPanel31.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Presiunea aerului la cupla de franare (bar):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel31.setLayout(null);
        jPanel31.add(jTextField_bar_o_conducta);
        jTextField_bar_o_conducta.setBounds(174, 30, 100, 25);
        jPanel31.add(jTextField_bar_doua_conducte);
        jTextField_bar_doua_conducte.setBounds(174, 61, 100, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Cu o conducta:");
        jPanel31.add(jLabel5);
        jLabel5.setBounds(28, 32, 96, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Cu doua conducte:");
        jPanel31.add(jLabel6);
        jLabel6.setBounds(28, 63, 119, 17);

        jPanel14.add(jPanel31);
        jPanel31.setBounds(680, 11, 305, 140);

        jPanel32.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Viteza max. constructiva (km/h):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel32.setLayout(null);
        jPanel32.add(jTextField_km_h);
        jTextField_km_h.setBounds(124, 25, 180, 25);

        jPanel14.add(jPanel32);
        jPanel32.setBounds(350, 315, 320, 65);

        jPanel13.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numarul axelor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel13.setLayout(null);
        jPanel13.add(jTextField_nr_axe);
        jTextField_nr_axe.setBounds(16, 25, 273, 25);

        jPanel14.add(jPanel13);
        jPanel13.setBounds(680, 165, 305, 65);

        jPanel18.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tractiunea:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel18.setLayout(null);

        jComboBox_tractiune.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Fata", "Spate", "Integrala" }));
        jPanel18.add(jComboBox_tractiune);
        jComboBox_tractiune.setBounds(16, 25, 273, 25);

        jPanel14.add(jPanel18);
        jPanel18.setBounds(680, 239, 305, 65);

        jPanel33.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Capacitatea rezervorului (l):", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel33.setLayout(null);
        jPanel33.add(jTextField_rezervor);
        jTextField_rezervor.setBounds(16, 25, 273, 25);

        jPanel14.add(jPanel33);
        jPanel33.setBounds(680, 315, 305, 65);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setText("Inapoi");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel14.add(jButton2);
        jButton2.setBounds(680, 420, 150, 37);

        jButton1_next.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1_next.setText("Inainte");
        jButton1_next.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_nextActionPerformed(evt);
            }
        });
        jPanel14.add(jButton1_next);
        jButton1_next.setBounds(835, 420, 150, 37);

        jTabbedPane3.addTab("Date tehnice 1", jPanel14);

        jPanel15.setLayout(null);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Masele (kg)", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel8.setLayout(null);

        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel29.setText("Proprie:");
        jPanel8.add(jLabel29);
        jLabel29.setBounds(16, 32, 48, 17);

        jLabel30.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel30.setText("Totala (maxima autorizata) :");
        jPanel8.add(jLabel30);
        jLabel30.setBounds(260, 30, 172, 17);

        jLabel31.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel31.setText("Sarcina utila maxima autoriata:");
        jPanel8.add(jLabel31);
        jLabel31.setBounds(16, 61, 187, 17);

        jLabel32.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel32.setText("Sarcina utila pe carligul de remorcare:");
        jPanel8.add(jLabel32);
        jLabel32.setBounds(260, 61, 227, 17);
        jPanel8.add(jTextField_kg_p);
        jTextField_kg_p.setBounds(82, 30, 160, 25);
        jPanel8.add(jTextField_kg_max);
        jTextField_kg_max.setBounds(450, 30, 150, 25);
        jPanel8.add(jTextField_max_util);
        jTextField_max_util.setBounds(16, 84, 225, 25);
        jPanel8.add(jTextField_sarcina_remorca);
        jTextField_sarcina_remorca.setBounds(260, 84, 340, 25);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Maxima autorizata pe axe:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel33.setText("Fata:");

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel34.setText("Spate:");

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel35.setText("Pe mijloc:");

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Pe rola de senila:");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel34)
                    .addComponent(jLabel33))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ax_fata, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ax_spate, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel36)
                    .addComponent(jLabel35))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField_ax_mijloc, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rola_senila, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel33)
                    .addComponent(jLabel35)
                    .addComponent(jTextField_ax_fata, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_ax_mijloc, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(jLabel36)
                    .addComponent(jTextField_ax_spate, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_rola_senila, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 18, Short.MAX_VALUE))
        );

        jPanel8.add(jPanel9);
        jPanel9.setBounds(16, 115, 585, 100);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Remorca cu dispozitiv de franare:");
        jPanel8.add(jLabel37);
        jLabel37.setBounds(16, 214, 204, 17);

        jLabel38.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel38.setText("Remorca fara dispozitiv de franare:");
        jPanel8.add(jLabel38);
        jLabel38.setBounds(260, 214, 212, 17);
        jPanel8.add(jTextField_remorca_cu_frane);
        jTextField_remorca_cu_frane.setBounds(16, 237, 225, 25);
        jPanel8.add(jTextField_remorca_fara_frane);
        jTextField_remorca_fara_frane.setBounds(260, 237, 340, 25);

        jPanel15.add(jPanel8);
        jPanel8.setBounds(7, 11, 620, 280);

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Numar locuri:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel39.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel39.setText("Total: ");

        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel40.setText("Pe scaune:");

        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel41.setText("In fata:");

        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel42.setText("In picioare:");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel41)
                    .addComponent(jLabel40)
                    .addComponent(jLabel42)
                    .addComponent(jLabel39))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jTextField_nr_loc_picioare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nr_loc_scaun, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nr_loc_total, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_nr_loc_fata, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_nr_loc_total, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39))
                .addGap(7, 7, 7)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_nr_loc_fata, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_nr_loc_picioare, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel42))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_nr_loc_scaun, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel40))
                .addContainerGap())
        );

        jPanel15.add(jPanel10);
        jPanel10.setBounds(7, 304, 200, 156);

        jPanel11.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dimensiunile de gabarit:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel11.setLayout(null);

        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel43.setText("Lungime:");
        jPanel11.add(jLabel43);
        jLabel43.setBounds(16, 32, 57, 17);

        jLabel44.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel44.setText("Inaltime:");
        jPanel11.add(jLabel44);
        jLabel44.setBounds(16, 68, 52, 17);

        jLabel45.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel45.setText("Latime:");
        jPanel11.add(jLabel45);
        jLabel45.setBounds(204, 32, 45, 17);

        jTextField_lungime_aut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_lungime_autActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField_lungime_aut);
        jTextField_lungime_aut.setBounds(83, 30, 75, 25);
        jPanel11.add(jTextField_latime_aut);
        jTextField_latime_aut.setBounds(259, 30, 75, 25);

        jTextField_inaltime_aut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_inaltime_autActionPerformed(evt);
            }
        });
        jPanel11.add(jTextField_inaltime_aut);
        jTextField_inaltime_aut.setBounds(83, 66, 75, 25);

        jPanel15.add(jPanel11);
        jPanel11.setBounds(635, 304, 350, 110);

        jPanel12.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Motor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel12.setLayout(null);

        jLabel46.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel46.setText("Tipul:");
        jPanel12.add(jLabel46);
        jLabel46.setBounds(15, 34, 33, 17);

        jLabel47.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel47.setText("Serie:");
        jPanel12.add(jLabel47);
        jLabel47.setBounds(15, 65, 34, 17);

        jLabel48.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel48.setText("Cilindree (cm3):");
        jPanel12.add(jLabel48);
        jLabel48.setBounds(15, 96, 96, 17);

        jLabel49.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel49.setText("Putere max.(kW) / Turatie (min):");
        jPanel12.add(jLabel49);
        jLabel49.setBounds(15, 145, 202, 17);

        jLabel50.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel50.setText("Sursa de energie ( combustibil ):");
        jPanel12.add(jLabel50);
        jLabel50.setBounds(15, 215, 196, 17);
        jPanel12.add(jTextField_tip_motor);
        jTextField_tip_motor.setBounds(134, 30, 200, 25);
        jPanel12.add(jTextField_serie_motor);
        jTextField_serie_motor.setBounds(134, 61, 200, 25);
        jPanel12.add(jTextField_cm3_motor);
        jTextField_cm3_motor.setBounds(134, 92, 200, 25);
        jPanel12.add(jTextField_putere_motor);
        jTextField_putere_motor.setBounds(15, 170, 318, 25);

        jComboBox_combustibil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Benzina", "Diesel", "GPL", "Hibrid", "Electric" }));
        jPanel12.add(jComboBox_combustibil);
        jComboBox_combustibil.setBounds(15, 240, 318, 25);

        jPanel15.add(jPanel12);
        jPanel12.setBounds(635, 11, 350, 280);

        jPanel19.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Dimensiunea anvelopelor:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel19.setLayout(null);

        jLabel51.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel51.setText("Fata:");
        jPanel19.add(jLabel51);
        jLabel51.setBounds(16, 21, 31, 17);

        jLabel52.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel52.setText("sau:");
        jPanel19.add(jLabel52);
        jLabel52.setBounds(16, 52, 26, 17);

        jLabel53.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel53.setText("Mijloc- spate:");
        jPanel19.add(jLabel53);
        jLabel53.setBounds(16, 81, 80, 17);

        jLabel54.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel54.setText("sau:");
        jPanel19.add(jLabel54);
        jLabel54.setBounds(16, 114, 26, 17);

        jComboBox_anvelope_fata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "205 / 50R16 83U", "185 / 65R14 83Q M+S" }));
        jPanel19.add(jComboBox_anvelope_fata);
        jComboBox_anvelope_fata.setBounds(100, 19, 280, 25);

        jComboBox_anvelope_fata2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "205 / 50R16 83U", "185 / 65R14 83Q M+S" }));
        jPanel19.add(jComboBox_anvelope_fata2);
        jComboBox_anvelope_fata2.setBounds(100, 50, 280, 25);

        jComboBox_anvelope_mijlocSpate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "205 / 50R16 83U", "185 / 65R14 83Q M+S" }));
        jPanel19.add(jComboBox_anvelope_mijlocSpate);
        jComboBox_anvelope_mijlocSpate.setBounds(100, 81, 280, 25);

        jComboBox_anvelope_mijlocSpate2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "205 / 50R16 83U", "185 / 65R14 83Q M+S" }));
        jPanel19.add(jComboBox_anvelope_mijlocSpate2);
        jComboBox_anvelope_mijlocSpate2.setBounds(100, 112, 280, 25);

        jPanel15.add(jPanel19);
        jPanel19.setBounds(217, 304, 410, 155);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton1.setText("Inapoi");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jButton1);
        jButton1.setBounds(680, 420, 150, 37);

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton5.setText("Inainte");
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel15.add(jButton5);
        jButton5.setBounds(835, 420, 150, 37);

        jTabbedPane3.addTab("Date tehnice 2", jPanel15);

        jPanel16.setLayout(null);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date privind inmatricularea:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jTextField_data_inmatricularii.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Numar de inmatriculare:");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Data inmatricularii:");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Data ultimei revizii tehnice:");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(29, 29, 29)
                        .addComponent(jTextField_nr_inmatriculare, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(63, 63, 63))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addGap(15, 15, 15)))
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_data_revizie)
                            .addComponent(jTextField_data_inmatricularii, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_nr_inmatriculare, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_data_inmatricularii, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_data_revizie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel16.add(jPanel7);
        jPanel7.setBounds(526, 38, 407, 140);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Date proprietar:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 24))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nume:");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Prenume:");

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel18.setText("CNP:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel19.setText("Cetatenie:");

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Adresa:", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 14))); // NOI18N

        jLabel20.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel20.setText("Judet:");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel22.setText("Localitate: / Str: / Nr: / Bl: / Ap:");

        jTextArea_address_owner.setColumns(20);
        jTextArea_address_owner.setRows(5);
        jScrollPane1.setViewportView(jTextArea_address_owner);

        jComboBox_jud_owner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Alba", "Arad", "Arges", "Bacau", "Bihor", "Bistrita Nasaud", "Botosani", "Braila", "Brasov", "Bucuresti", "Buzau", "Calaras", "Caras Severin", "Cluj", "Constanta", "Covasna", "Dambovita", "Galati", "Giurgiu", "Gorj", "Harghita", "Hunedoara", "Ialomita", "Iasi", "Ilfov", "Maramures", "Mehedinti", "Mures", "Neamt", "Olt", "Prahova", "Salaj", "Satul Mare", "Sibiu", "Suceava", "Teleorman", "Timis", "Tulcea", "Valcia", "Vaslui", "Vrancea" }));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(jLabel20)
                                .addGap(39, 39, 39)
                                .addComponent(jComboBox_jud_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jComboBox_jud_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jComboBox_nationality_owner.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Romana", "Magheara", "Rom", "Grec" }));

        buttonGroup_gender_owner.add(jRadioButton_gender_m_owner);
        jRadioButton_gender_m_owner.setSelected(true);
        jRadioButton_gender_m_owner.setText("Masculin");

        buttonGroup_gender_owner.add(jRadioButton_gender_f_owner);
        jRadioButton_gender_f_owner.setText("Feminin");

        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel21.setText("Sex:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                                    .addComponent(jLabel19)
                                    .addGap(18, 18, 18)
                                    .addComponent(jComboBox_nationality_owner, 0, 250, Short.MAX_VALUE))
                                .addGroup(jPanel4Layout.createSequentialGroup()
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18)
                                        .addComponent(jLabel7))
                                    .addGap(18, 18, 18)
                                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField_firstName_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_cnp_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jTextField_lastName_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(52, 52, 52)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton_gender_m_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_gender_f_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_firstName_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_lastName_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTextField_cnp_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jComboBox_nationality_owner, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jRadioButton_gender_m_owner))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton_gender_f_owner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane2.addTab("Persoana fizica", jPanel4);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 333, Short.MAX_VALUE)
        );

        jTabbedPane2.addTab("Persoana juridica", jPanel5);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        jPanel16.add(jPanel3);
        jPanel3.setBounds(63, 38, 387, 405);

        jButton_car_save.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_car_save.setText("Salveaza datele");
        jButton_car_save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton_car_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_car_saveActionPerformed(evt);
            }
        });
        jPanel16.add(jButton_car_save);
        jButton_car_save.setBounds(835, 420, 150, 37);

        jButton6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton6.setText("Inapoi");
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel16.add(jButton6);
        jButton6.setBounds(680, 420, 150, 37);

        jTabbedPane3.addTab("Date proprietar / inmatriculare", jPanel16);

        jPanel1.add(jTabbedPane3);
        jTabbedPane3.setBounds(10, 60, 1000, 500);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1020, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
        this.setVisible(false);
        Menu window = new Menu();
        window.setVisible(true);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField_lungime_autActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_lungime_autActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_lungime_autActionPerformed

    private void jTextField_inaltime_autActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_inaltime_autActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_inaltime_autActionPerformed

    private void jButton1_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_nextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_nextActionPerformed

    private void jButton_car_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_car_saveActionPerformed
        // TODO add your handling code here:
        InserdCarData();
        InserdOwnerData();
        InserdRegisteredData();
    }//GEN-LAST:event_jButton_car_saveActionPerformed

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
            java.util.logging.Logger.getLogger(Add_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_cars.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_cars().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup_gender_owner;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_next;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_car_save;
    private javax.swing.JComboBox<String> jComboBox_anvelope_fata;
    private javax.swing.JComboBox<String> jComboBox_anvelope_fata2;
    private javax.swing.JComboBox<String> jComboBox_anvelope_mijlocSpate;
    private javax.swing.JComboBox<String> jComboBox_anvelope_mijlocSpate2;
    private javax.swing.JComboBox<String> jComboBox_carBody;
    private javax.swing.JComboBox<String> jComboBox_category;
    private javax.swing.JComboBox<String> jComboBox_combustibil;
    private javax.swing.JComboBox<String> jComboBox_culoare;
    private javax.swing.JComboBox<String> jComboBox_cutie;
    private javax.swing.JComboBox<String> jComboBox_jud_owner;
    private javax.swing.JComboBox<String> jComboBox_mark;
    private javax.swing.JComboBox<String> jComboBox_nationality_owner;
    private javax.swing.JComboBox<String> jComboBox_tractiune;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel_currentDate;
    private javax.swing.JLabel jLabel_userName;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel29;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel30;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel33;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton_gender_f_owner;
    private javax.swing.JRadioButton jRadioButton_gender_m_owner;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTextArea jTextArea_address_owner;
    private javax.swing.JTextField jTextField_ax_fata;
    private javax.swing.JTextField jTextField_ax_mijloc;
    private javax.swing.JTextField jTextField_ax_spate;
    private javax.swing.JTextField jTextField_bar_doua_conducte;
    private javax.swing.JTextField jTextField_bar_o_conducta;
    private javax.swing.JTextField jTextField_cm3_motor;
    private javax.swing.JTextField jTextField_cnp_owner;
    private javax.swing.JTextField jTextField_co2;
    private javax.swing.JTextField jTextField_data_inmatricularii;
    private javax.swing.JTextField jTextField_data_revizie;
    private javax.swing.JTextField jTextField_firstName_owner;
    private javax.swing.JTextField jTextField_inaltime_aut;
    private javax.swing.JTextField jTextField_kg_max;
    private javax.swing.JTextField jTextField_kg_p;
    private javax.swing.JTextField jTextField_km_h;
    private javax.swing.JTextField jTextField_lastName_owner;
    private javax.swing.JTextField jTextField_latime_aut;
    private javax.swing.JTextField jTextField_lungime_aut;
    private javax.swing.JTextField jTextField_max_util;
    private javax.swing.JTextField jTextField_nr_axe;
    private javax.swing.JTextField jTextField_nr_inmatriculare;
    private javax.swing.JTextField jTextField_nr_loc_fata;
    private javax.swing.JTextField jTextField_nr_loc_picioare;
    private javax.swing.JTextField jTextField_nr_loc_scaun;
    private javax.swing.JTextField jTextField_nr_loc_total;
    private javax.swing.JTextField jTextField_putere_motor;
    private javax.swing.JTextField jTextField_remorca_cu_frane;
    private javax.swing.JTextField jTextField_remorca_fara_frane;
    private javax.swing.JTextField jTextField_rezervor;
    private javax.swing.JTextField jTextField_rola_senila;
    private javax.swing.JTextField jTextField_sarcina_remorca;
    private javax.swing.JTextField jTextField_sasiu;
    private javax.swing.JTextField jTextField_serie_motor;
    private javax.swing.JTextField jTextField_tip_motor;
    private javax.swing.JTextField jTextField_type;
    private javax.swing.JTextField jTextField_year;
    private javax.swing.JTextField jTextField_zgomot_mers;
    private javax.swing.JTextField jTextField_zgomot_stationare;
    // End of variables declaration//GEN-END:variables
}
