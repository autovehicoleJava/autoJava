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
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Calin-Alex
 */
public class show_list extends javax.swing.JFrame {

    public int sortare = 0;
    public int idSelected;
    public String selectedSort;
    public Date selectedDate;
    
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
        
        SetSearchOf();
        
        SetSortOf();
        
        ShowAllData();

    }
    
    
    public void SetSortOn(){
        jComboBox_sort.setEnabled(true);
        jRadioButton_asc.setEnabled(true);
        jRadioButton_desc.setEnabled(true);
    }
    public void SetSortOf(){
        jComboBox_sort.setEnabled(false);
        jRadioButton_asc.setEnabled(false);
        jRadioButton_desc.setEnabled(false);
    }
    
    
    public void SetSearchOf(){
        jComboBox_list_search.setEnabled(false);
        jTextField_search.setEnabled(false);
        jButton_search.setEnabled(false);
    }
    public void SetSearchOn(){
        jComboBox_list_search.setEnabled(true);
        jTextField_search.setEnabled(true);
        jButton_search.setEnabled(true);
    }
    
    
    public void ShowAllData(){
        sortare = 0;
        GolesteTabelul();
        
        ShowCars();
        ShowOwners();
        ShowRegistereds();
    }
    
    
    
    
    //Goleste textul din tabel
    public void GolesteTabelul()
    {
            //sterge tabelul
            DefaultTableModel model = (DefaultTableModel) jTable_showInfo_registered.getModel();
            DefaultTableModel model2 = (DefaultTableModel) jTable_showInfo_owner.getModel();
            DefaultTableModel model3 = (DefaultTableModel) jTable_showInfo_cars.getModel();
            model.setRowCount(0);
            model2.setRowCount(0);
            model3.setRowCount(0);
            // sf st tab
    }
    
    
    
    
    public ArrayList<Cars> getCarsList(){
        ArrayList<Cars> carsList = new ArrayList<Cars>(); 
        String query ="";
        if( sortare == 0){
            query = "SELECT * FROM `cars` "; 
        }
        if( sortare == 1 || sortare == 2 || sortare == 3 ){
            query = "SELECT * FROM `cars` WHERE `id_car`= '"+idSelected+"'"; 
        } 
        if( sortare == 3 ){
            query = "SELECT * FROM `cars` WHERE `date_car`< '"+jTextField_search.getText()+"'"; 
        } 
        if( sortare == 9){
            if( jRadioButton_asc.isSelected()){
                query = "SELECT * FROM `cars` ORDER BY `"+ selectedSort +"` ASC ";
            }else if( jRadioButton_desc.isSelected()){
                query = "SELECT * FROM `cars` ORDER BY `"+ selectedSort +"` DESC ";
            }
             
        } 
        
        
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
                        rs.getDate("date_car"));
                carsList.add(cars);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return carsList;
    }   
    
    
    
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
        
        String query = "";
        
        if( sortare == 0 || sortare == 9){
            query = "SELECT * FROM `owner` ";   
        } 
        if( sortare == 1 || sortare == 3 ){
            query = "SELECT * FROM `owner` WHERE `id_owner`= '"+idSelected+"'"; 
        } 
        if( sortare == 2){
            query = "SELECT * FROM `owner` WHERE `firstName_owner`= '"+jTextField_search.getText()+"' OR `lastName_owner`= '"+jTextField_search.getText()+"' "; 
        }
        if( sortare == 3 ){
            query = "SELECT * FROM `owner` WHERE `date_owner`< '"+jTextField_search.getText()+"'"; 
        } 
        
        
        
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
                        rs.getString("jud_owner"), rs.getString("address_owner"), rs.getDate("date_owner"));
                ownerList.add(owner);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return ownerList;
    }   
    
    
    
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
        if( sortare == 2 ){
            idSelected = owners.get(0).getId_owner();
        }
    }
    
    
    
    
public ArrayList<Registered> getRegisteredList(){
        ArrayList<Registered> registeredList = new ArrayList<Registered>(); 
        
        String query = "";  
        if( sortare == 0 || sortare == 9){
            query = "SELECT * FROM `registered` "; 
        } 
        if( sortare == 1){
            query = "SELECT * FROM `registered` WHERE `nr_registered`= '"+jTextField_search.getText()+"'"; 
        } 
        if( sortare == 2 ){
            query = "SELECT * FROM `registered` WHERE `id_registered`= '"+idSelected+"'"; 
        } 
        if( sortare == 3 ){
                query = "SELECT * FROM `registered` WHERE `date_registered`< '"+jTextField_search.getText()+"'"; 
        }
        
          
        Connect con = new Connect();
        Statement st;
        ResultSet rs;
        
        try {
            st = con.getConnection().createStatement();
            rs = st.executeQuery(query);
            Registered registered;
            while (rs.next())
            {
                registered = new Registered(rs.getInt("id_registered"),rs.getString("nr_registered"), rs.getDate("date_registered"), 
                        rs.getDate("revision_registered"));
                registeredList.add(registered);
            }
        }catch (Exception e){
            e.printStackTrace();
        }  
        return registeredList;
    }   
    
    
    
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
        if( sortare == 1 ){
            idSelected = registereds.get(0).getId_registered();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jTextField_search = new javax.swing.JTextField();
        jButton_search = new javax.swing.JButton();
        jComboBox_list_search = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton_stergere_dataCar = new javax.swing.JButton();
        jButton_editare_dataCars = new javax.swing.JButton();
        jComboBox_sort = new javax.swing.JComboBox<>();
        jCheckBox_sort = new javax.swing.JCheckBox();
        jCheckBox_search = new javax.swing.JCheckBox();
        jRadioButton_desc = new javax.swing.JRadioButton();
        jRadioButton_asc = new javax.swing.JRadioButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel_currentDate = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel_userName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1300, 690));
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

        jLayeredPane1.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Detalii autovehicol", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N
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
        jScrollPane1.setBounds(10, 30, 4000, 190);

        jScrollPane3.setViewportView(jLayeredPane1);

        jPanel2.add(jScrollPane3);
        jScrollPane3.setBounds(10, 90, 1260, 250);

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Detalii Proprietar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

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
        jScrollPane4.setBounds(10, 30, 750, 210);

        jScrollPane2.setViewportView(jLayeredPane2);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(10, 355, 770, 250);

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true), "Detalii Inmatriculare", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 18))); // NOI18N

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
        jScrollPane6.setBounds(10, 30, 460, 210);

        jScrollPane5.setViewportView(jLayeredPane3);

        jPanel2.add(jScrollPane5);
        jScrollPane5.setBounds(790, 355, 480, 250);
        jPanel2.add(jTextField_search);
        jTextField_search.setBounds(950, 15, 180, 30);

        jButton_search.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton_search.setText("Cautare");
        jButton_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_searchActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_search);
        jButton_search.setBounds(1140, 15, 130, 30);

        jComboBox_list_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_list_search.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Numarul de inmatriculare", "Nume sau prenume proprietar", "Inmatriculate inainte de", "Ultima revizie inainte de" }));
        jPanel2.add(jComboBox_list_search);
        jComboBox_list_search.setBounds(680, 15, 260, 30);

        jButton2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton2.setText("Toate autoturismele");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(10, 15, 160, 30);

        jButton_stergere_dataCar.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton_stergere_dataCar.setText("Stergere");
        jButton_stergere_dataCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_stergere_dataCarActionPerformed(evt);
            }
        });
        jPanel2.add(jButton_stergere_dataCar);
        jButton_stergere_dataCar.setBounds(290, 15, 100, 30);

        jButton_editare_dataCars.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jButton_editare_dataCars.setText("Editare");
        jPanel2.add(jButton_editare_dataCars);
        jButton_editare_dataCars.setBounds(180, 15, 100, 30);

        jComboBox_sort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jComboBox_sort.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Categorie", "Marca", "Model ( Tipul auto.)", "Caroserie", "Capacitate cilindrica" }));
        jComboBox_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_sortActionPerformed(evt);
            }
        });
        jPanel2.add(jComboBox_sort);
        jComboBox_sort.setBounds(680, 50, 260, 30);

        jCheckBox_sort.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_sort.setText("Sortare dupa:");
        jCheckBox_sort.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox_sort.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox_sort.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_sortActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox_sort);
        jCheckBox_sort.setBounds(550, 50, 120, 30);

        jCheckBox_search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jCheckBox_search.setText("Cautare autoturism dupa:");
        jCheckBox_search.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jCheckBox_search.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jCheckBox_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox_searchActionPerformed(evt);
            }
        });
        jPanel2.add(jCheckBox_search);
        jCheckBox_search.setBounds(480, 15, 190, 30);

        buttonGroup1.add(jRadioButton_desc);
        jRadioButton_desc.setText("Descendent");
        jPanel2.add(jRadioButton_desc);
        jRadioButton_desc.setBounds(1043, 50, 90, 30);

        buttonGroup1.add(jRadioButton_asc);
        jRadioButton_asc.setSelected(true);
        jRadioButton_asc.setText("Ascendent");
        jPanel2.add(jRadioButton_asc);
        jRadioButton_asc.setBounds(950, 50, 90, 30);

        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 60, 1280, 615);

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
        jPanel1.setBounds(0, 0, 1300, 690);

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

    private void jButton_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_searchActionPerformed
        // TODO add your handling code here:
        int curentItem = jComboBox_list_search.getSelectedIndex();
        sortare = 1 + curentItem;
        GolesteTabelul();
        ShowRegistereds();
        ShowOwners();
        ShowCars();
    }//GEN-LAST:event_jButton_searchActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ShowAllData();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton_stergere_dataCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_stergere_dataCarActionPerformed
        // TODO add your handling code here:
        
        int carsTable = jTable_showInfo_cars.getSelectedRow();
        int ownerTable = jTable_showInfo_owner.getSelectedRow();
        int registeredTable = jTable_showInfo_registered.getSelectedRow();
        
        TableModel model = jTable_showInfo_cars.getModel(); 
        TableModel model2 = jTable_showInfo_owner.getModel();
        TableModel model3 = jTable_showInfo_registered.getModel();
        
        if ( jTable_showInfo_cars.getSelectionModel().isSelectionEmpty() && jTable_showInfo_owner.getSelectionModel().isSelectionEmpty() && jTable_showInfo_registered.getSelectionModel().isSelectionEmpty() ) 
        {
            JOptionPane.showMessageDialog(null, "Selectati un autovehicolo/ proprietar/ date de\n inregistrare pentru al sterge! " , "Atentie!" ,JOptionPane.WARNING_MESSAGE); 
        }else{
        
            if( !jTable_showInfo_cars.getSelectionModel().isSelectionEmpty() ){
                 int mesaj = JOptionPane.showConfirmDialog(null, "Vreti sa stergeti acest user? ", "Atentie", JOptionPane.OK_CANCEL_OPTION);
                 if (mesaj == 0){
                 int i = carsTable;
                 String query = "DELETE FROM `cars` WHERE `id_car`="+ model.getValueAt(i, 0).toString() ;
                 String query2 = "DELETE FROM `owner` WHERE `id_owner`="+ model.getValueAt(i, 0).toString() ;
                 String query3 = "DELETE FROM `registered` WHERE `id_registered`="+ model.getValueAt(i, 0).toString() ;

                executQuery this_query = new executQuery();
                this_query.executeSqlQuery(query, "Autovegicolul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query2, "Proprietarul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query3, "Inmatricularea a fost stersa.", "Informatii");

                }
   
            }
            if( !jTable_showInfo_owner.getSelectionModel().isSelectionEmpty() ){
                 int mesaj = JOptionPane.showConfirmDialog(null, "Vreti sa stergeti acest user? ", "Atentie", JOptionPane.OK_CANCEL_OPTION);
                 if (mesaj == 0){
                 int i = ownerTable;
                 String query = "DELETE FROM `cars` WHERE `id_car`="+ model2.getValueAt(i, 0).toString() ;
                 String query2 = "DELETE FROM `owner` WHERE `id_owner`="+ model2.getValueAt(i, 0).toString() ;
                 String query3 = "DELETE FROM `registered` WHERE `id_registered`="+ model2.getValueAt(i, 0).toString() ;

                executQuery this_query = new executQuery();
                this_query.executeSqlQuery(query, "Autovegicolul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query2, "Proprietarul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query3, "Inmatricularea a fost stersa.", "Informatii");

                }
          
            }
            if( !jTable_showInfo_registered.getSelectionModel().isSelectionEmpty() ){
                 int mesaj = JOptionPane.showConfirmDialog(null, "Vreti sa stergeti acest user? ", "Atentie", JOptionPane.OK_CANCEL_OPTION);
                 if (mesaj == 0){
                 int i = registeredTable;
                 String query = "DELETE FROM `cars` WHERE `id_car`="+ model3.getValueAt(i, 0).toString() ;
                 String query2 = "DELETE FROM `owner` WHERE `id_owner`="+ model3.getValueAt(i, 0).toString() ;
                 String query3 = "DELETE FROM `registered` WHERE `id_registered`="+ model3.getValueAt(i, 0).toString() ;

                executQuery this_query = new executQuery();
                this_query.executeSqlQuery(query, "Autovegicolul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query2, "Proprietarul a fost sters.", "Informatii");
                this_query.executeSqlQuery(query3, "Inmatricularea a fost stersa.", "Informatii");

                }
                
            }
            ShowAllData();
        }
        
        
    }//GEN-LAST:event_jButton_stergere_dataCarActionPerformed

    private void jCheckBox_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_searchActionPerformed
        // TODO add your handling code here:
        if(jCheckBox_search.isSelected()){
            SetSearchOn();
        }else{
            SetSearchOf();
        }
        
    }//GEN-LAST:event_jCheckBox_searchActionPerformed

    private void jCheckBox_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox_sortActionPerformed
        // TODO add your handling code here:
        if(jCheckBox_sort.isSelected()){
            SetSortOn();
        }else{
            SetSortOf();
        }
        
        
    }//GEN-LAST:event_jCheckBox_sortActionPerformed

    private void jComboBox_sortActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_sortActionPerformed
        // TODO add your handling code here:
        
        int curentItem = jComboBox_sort.getSelectedIndex();
        if( curentItem == 0){
            selectedSort = "category_car";
        }else if(curentItem == 1){
            selectedSort = "mark_car";
        }else if(curentItem == 2){
            selectedSort = "type_car";
        }else if(curentItem == 3){
            selectedSort = "carBody_car";
        }else if(curentItem == 4){
            selectedSort = "engine_cm3_car";
        }

        sortare = 9;

        GolesteTabelul();
        ShowRegistereds();
        ShowOwners();
        ShowCars();

    }//GEN-LAST:event_jComboBox_sortActionPerformed

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
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton_LogOut;
    private javax.swing.JButton jButton_editare_dataCars;
    private javax.swing.JButton jButton_search;
    private javax.swing.JButton jButton_stergere_dataCar;
    private javax.swing.JCheckBox jCheckBox_search;
    private javax.swing.JCheckBox jCheckBox_sort;
    private javax.swing.JComboBox<String> jComboBox_list_search;
    private javax.swing.JComboBox<String> jComboBox_sort;
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
    private javax.swing.JRadioButton jRadioButton_asc;
    private javax.swing.JRadioButton jRadioButton_desc;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable_showInfo_cars;
    private javax.swing.JTable jTable_showInfo_owner;
    private javax.swing.JTable jTable_showInfo_registered;
    private javax.swing.JTextField jTextField_search;
    // End of variables declaration//GEN-END:variables
}
