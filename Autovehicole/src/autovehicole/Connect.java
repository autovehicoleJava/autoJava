/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Calin-Alex
 */
public class Connect {
    
    public Connection getConnection()
    {
        Connection con;
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/autovehicole", "root","");
            return con;
        } catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    
    
    
}
