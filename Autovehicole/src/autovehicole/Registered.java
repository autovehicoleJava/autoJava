/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

import java.util.Date;

/**
 *
 * @author Calin-Alex
 */
public class Registered {
    
    
    private int id_registered;
    private String nrCar_registered;
    private Date date_registered;
    private Date last_date_registered;

    public Registered(int id_registered, String nrCar_registered, Date date_registered, Date last_date_registered) {
        this.id_registered = id_registered;
        this.nrCar_registered = nrCar_registered;
        this.date_registered = date_registered;
        this.last_date_registered = last_date_registered;
    }

    /**
     * @return the id_registered
     */
    public int getId_registered() {
        return id_registered;
    }

    /**
     * @param id_registered the id_registered to set
     */
    public void setId_registered(int id_registered) {
        this.id_registered = id_registered;
    }

    /**
     * @return the nrCar_registered
     */
    public String getNrCar_registered() {
        return nrCar_registered;
    }

    /**
     * @param nrCar_registered the nrCar_registered to set
     */
    public void setNrCar_registered(String nrCar_registered) {
        this.nrCar_registered = nrCar_registered;
    }

    /**
     * @return the date_registered
     */
    public Date getDate_registered() {
        return date_registered;
    }

    /**
     * @param date_registered the date_registered to set
     */
    public void setDate_registered(Date date_registered) {
        this.date_registered = date_registered;
    }

    /**
     * @return the last_date_registered
     */
    public Date getLast_date_registered() {
        return last_date_registered;
    }

    /**
     * @param last_date_registered the last_date_registered to set
     */
    public void setLast_date_registered(Date last_date_registered) {
        this.last_date_registered = last_date_registered;
    }
    
    
    
    
}
