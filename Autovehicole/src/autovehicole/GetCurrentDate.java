/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author Calin-Alex
 */
public class GetCurrentDate {
    
    public String CurrentDate()
    {
        LocalDate localDate = LocalDate.now();
        String date = (DateTimeFormatter.ofPattern("dd-MM-yyy").format(localDate));
       return date;
    }
}
