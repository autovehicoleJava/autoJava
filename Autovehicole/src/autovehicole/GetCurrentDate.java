/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

/**
 *
 * @author Calin-Alex
 */
public class GetCurrentDate {
    
    private Date date;
    
    public String CurrentDate()
    {
        LocalDate localDate = LocalDate.now();
        String date = (DateTimeFormatter.ofPattern("yyyy-MM-dd").format(localDate));
       return date;
    }
    
    public String SelectedDate( Date  date){
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");

        return formatter.format(date);
    }
}
