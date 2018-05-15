/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Calin-Alex
 */
public class executQuery extends Connect {
    
    public void executeSqlQuery(String query, String message, String title)
    {
        Connect setConnect = new Connect();
        
        Connection con = setConnect.getConnection();
        Statement st;
        try {
            st = con.createStatement();
            if((st.executeUpdate(query))== 1)
            {
                JOptionPane.showMessageDialog(null, message + " a fost editat cu succes!" , title ,JOptionPane.INFORMATION_MESSAGE);
            }else{
                JOptionPane.showMessageDialog(null, "Erroare "+message+"!","Erroare",JOptionPane.INFORMATION_MESSAGE);
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
}
