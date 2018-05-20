/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autovehicole;

/**
 *
 * @author Calin-Alex
 */
public class Owner {
    
    private int id_owner;
    private String firstName_owner;
    private String lastName_owner;
    private int cnp_owner;
    private String nationality_owner;
    private String gender_owner;
    private String jud_owner;
    private String address_owner;
    private String data_owner;

    public Owner(int id_owner, String firstName_owner, String lastName_owner, int cnp_owner, String nationality_owner, String gender_owner, String jud_owner, String address_owner, String data_owner) {
        this.id_owner = id_owner;
        this.firstName_owner = firstName_owner;
        this.lastName_owner = lastName_owner;
        this.cnp_owner = cnp_owner;
        this.nationality_owner = nationality_owner;
        this.gender_owner = gender_owner;
        this.jud_owner = jud_owner;
        this.address_owner = address_owner;
        this.data_owner = data_owner;
    }

    /**
     * @return the id_owner
     */
    public int getId_owner() {
        return id_owner;
    }

    /**
     * @param id_owner the id_owner to set
     */
    public void setId_owner(int id_owner) {
        this.id_owner = id_owner;
    }

    /**
     * @return the firstName_owner
     */
    public String getFirstName_owner() {
        return firstName_owner;
    }

    /**
     * @param firstName_owner the firstName_owner to set
     */
    public void setFirstName_owner(String firstName_owner) {
        this.firstName_owner = firstName_owner;
    }

    /**
     * @return the lastName_owner
     */
    public String getLastName_owner() {
        return lastName_owner;
    }

    /**
     * @param lastName_owner the lastName_owner to set
     */
    public void setLastName_owner(String lastName_owner) {
        this.lastName_owner = lastName_owner;
    }

    /**
     * @return the cnp_owner
     */
    public int getCnp_owner() {
        return cnp_owner;
    }

    /**
     * @param cnp_owner the cnp_owner to set
     */
    public void setCnp_owner(int cnp_owner) {
        this.cnp_owner = cnp_owner;
    }

    /**
     * @return the nationality_owner
     */
    public String getNationality_owner() {
        return nationality_owner;
    }

    /**
     * @param nationality_owner the nationality_owner to set
     */
    public void setNationality_owner(String nationality_owner) {
        this.nationality_owner = nationality_owner;
    }

    /**
     * @return the gender_owner
     */
    public String getGender_owner() {
        return gender_owner;
    }

    /**
     * @param gender_owner the gender_owner to set
     */
    public void setGender_owner(String gender_owner) {
        this.gender_owner = gender_owner;
    }

    /**
     * @return the jud_owner
     */
    public String getJud_owner() {
        return jud_owner;
    }

    /**
     * @param jud_owner the jud_owner to set
     */
    public void setJud_owner(String jud_owner) {
        this.jud_owner = jud_owner;
    }

    /**
     * @return the address_owner
     */
    public String getAddress_owner() {
        return address_owner;
    }

    /**
     * @param address_owner the address_owner to set
     */
    public void setAddress_owner(String address_owner) {
        this.address_owner = address_owner;
    }

    /**
     * @return the data_owner
     */
    public String getData_owner() {
        return data_owner;
    }

    /**
     * @param data_owner the data_owner to set
     */
    public void setData_owner(String data_owner) {
        this.data_owner = data_owner;
    }
    
    
    
}
