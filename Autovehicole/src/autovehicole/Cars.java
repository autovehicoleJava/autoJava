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
public class Cars {
    
    private int id;
    private String category;
    private String mark;
    private String carBody;
    private String type;

    public Cars(int id, String category, String mark, String carBody, String type) {
        this.id = id;
        this.category = category;
        this.mark = mark;
        this.carBody = carBody;
        this.type = type;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }   
    
    /**
     * @return the category
     */
    public String getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * @return the mark
     */
    public String getMark() {
        return mark;
    }

    /**
     * @param mark the mark to set
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

    /**
     * @return the carBody
     */
    public String getCarBody() {
        return carBody;
    }

    /**
     * @param carBody the carBody to set
     */
    public void setCarBody(String carBody) {
        this.carBody = carBody;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }


    
}
