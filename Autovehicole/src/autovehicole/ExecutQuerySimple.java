/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author Calin-Alex
 */
public class ExecutQuerySimple extends Connect {
    
    private boolean identic = false;
    
    public void executeSqlQuery(String query)
    {
        Connect setConnect = new Connect();
        
        Connection con = setConnect.getConnection();
        Statement st;
        ResultSet rs; 
        try {
            st = con.createStatement();
            rs = st.executeQuery(query);
            while(rs.next())
            {
                this.identic = true;
            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
    
    
    
    public boolean getIdentic(){
        return this.identic;
    }
    
}
