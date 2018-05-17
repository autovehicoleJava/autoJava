/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Calin-Alex
 */
public class ReadFromFile {
    
    private  String user;
    private  String function;
    
    private void GetUserData(){
        try{
            FileReader fr = new FileReader("user.txt");
            BufferedReader br = new BufferedReader(fr);
                
            this.user = (br.readLine());
            this.function = (br.readLine());
            br.close();
        }catch(IOException e){
            System.out.println("Fisierul nu exista!");
        }

    }
        
    

    public String getUser(){
        GetUserData();
        return this.user;
    }
    public String getFunction(){
        GetUserData();
        return this.function;
    }
    
    
}
