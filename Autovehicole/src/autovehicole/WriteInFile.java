/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Calin-Alex
 */
public class WriteInFile {
    
    private void WriteInFile(String userName, String function){
        try{
            FileWriter file = new FileWriter("user.txt");
            PrintWriter printWrite = new PrintWriter(file);

            printWrite.println(userName);
            printWrite.println(function);

            printWrite.close();

        }catch(IOException e){
            System.out.println("Error");
        }
        
    } 
    
    public void setTextInFile(String userName, String function){
        WriteInFile( userName,  function);
    }
    
}
