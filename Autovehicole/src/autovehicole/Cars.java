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
public class Cars {

    private int id;
    private String category;
    private String mark;
    private String carBody;
    private String type;
    private String nrOmologare;
    private int sasiu;
    private String cutieViteze;
    private int co2;
    private String color;
    private int dBA_inMers;
    private int dBA_stationare;
    private int kmh;
    private int aerBar_oConducta;
    private int aerBar_douaConducte;
    private int nr_axe;
    private String tractiune;
    private int rezervor;
    private int kg_masina;
    private int masa_totala;
    private int masa_totala_aut;
    private int masa_totala_aut_carlig;
    private int masa_max_aut_fata;
    private int masa_max_aut_mijloc;
    private int masa_max_aut_spate;
    private int masa_max_aut_senila;
    private int maxa_aut_remorca_cu_franare;
    private int maxa_aut_remorca_fara_franare;
    private int nr_locuri;
    private int nr_locuri_inFata;
    private int nr_locuri_picioare;
    private int nr_locuri_peScaun;
    private String anvelope_fata;
    private String anvelope_fata_sau;
    private String anvelope_mijloc_spate;
    private String anvelope_mijloc_spate_sau;
    private String tip_motor;
    private String serie_motor;
    private int cilindrii_motor;
    private int putere_turatii;
    private String carburant;
    private int lungime_masina;
    private int latime_masina;
    private int inaltime_masina;
    private Date data_inmatricularii;


    public Cars(int id, String category, String mark, String carBody, String type, String nrOmologare, int sasiu, String cutieViteze, int co2, String color, int dBA_inMers, int dBA_stationare, int kmh, int aerBar_oConducta, int aerBar_douaConducte, int nr_axe, String tractiune, int rezervor, int kg_masina, int masa_totala, int masa_totala_aut, int masa_totala_aut_carlig, int masa_max_aut_fata, int masa_max_aut_mijloc, int masa_max_aut_spate, int masa_max_aut_senila, int maxa_aut_remorca_cu_franare, int maxa_aut_remorca_fara_franare, int nr_locuri, int nr_locuri_inFata, int nr_locuri_picioare, int nr_locuri_peScaun, String anvelope_fata, String anvelope_fata_sau, String anvelope_mijloc_spate, String anvelope_mijloc_spate_sau, String tip_motor, String serie_motor, int cilindrii_motor, int putere_turatii, String carburant, int lungime_masina, int latime_masina, int inaltime_masina, Date data_inmatricularii) {
        this.id = id;
        this.category = category;
        this.mark = mark;
        this.carBody = carBody;
        this.type = type;
        this.nrOmologare = nrOmologare;
        this.sasiu = sasiu;
        this.cutieViteze = cutieViteze;
        this.co2 = co2;
        this.color = color;
        this.dBA_inMers = dBA_inMers;
        this.dBA_stationare = dBA_stationare;
        this.kmh = kmh;
        this.aerBar_oConducta = aerBar_oConducta;
        this.aerBar_douaConducte = aerBar_douaConducte;
        this.nr_axe = nr_axe;
        this.tractiune = tractiune;
        this.rezervor = rezervor;
        this.kg_masina = kg_masina;
        this.masa_totala = masa_totala;
        this.masa_totala_aut = masa_totala_aut;
        this.masa_totala_aut_carlig = masa_totala_aut_carlig;
        this.masa_max_aut_fata = masa_max_aut_fata;
        this.masa_max_aut_mijloc = masa_max_aut_mijloc;
        this.masa_max_aut_spate = masa_max_aut_spate;
        this.masa_max_aut_senila = masa_max_aut_senila;
        this.maxa_aut_remorca_cu_franare = maxa_aut_remorca_cu_franare;
        this.maxa_aut_remorca_fara_franare = maxa_aut_remorca_fara_franare;
        this.nr_locuri = nr_locuri;
        this.nr_locuri_inFata = nr_locuri_inFata;
        this.nr_locuri_picioare = nr_locuri_picioare;
        this.nr_locuri_peScaun = nr_locuri_peScaun;
        this.anvelope_fata = anvelope_fata;
        this.anvelope_fata_sau = anvelope_fata_sau;
        this.anvelope_mijloc_spate = anvelope_mijloc_spate;
        this.anvelope_mijloc_spate_sau = anvelope_mijloc_spate_sau;
        this.tip_motor = tip_motor;
        this.serie_motor = serie_motor;
        this.cilindrii_motor = cilindrii_motor;
        this.putere_turatii = putere_turatii;
        this.carburant = carburant;
        this.lungime_masina = lungime_masina;
        this.latime_masina = latime_masina;
        this.inaltime_masina = inaltime_masina;
        this.data_inmatricularii = data_inmatricularii;
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

    /**
     * @return the nrOmologare
     */
    public String getNrOmologare() {
        return nrOmologare;
    }

    /**
     * @param nrOmologare the nrOmologare to set
     */
    public void setNrOmologare(String nrOmologare) {
        this.nrOmologare = nrOmologare;
    }

    /**
     * @return the sasiu
     */
    public int getSasiu() {
        return sasiu;
    }

    /**
     * @param sasiu the sasiu to set
     */
    public void setSasiu(int sasiu) {
        this.sasiu = sasiu;
    }

    /**
     * @return the cutieViteze
     */
    public String getCutieViteze() {
        return cutieViteze;
    }

    /**
     * @param cutieViteze the cutieViteze to set
     */
    public void setCutieViteze(String cutieViteze) {
        this.cutieViteze = cutieViteze;
    }

    /**
     * @return the co2
     */
    public int getCo2() {
        return co2;
    }

    /**
     * @param co2 the co2 to set
     */
    public void setCo2(int co2) {
        this.co2 = co2;
    }

    /**
     * @return the color
     */
    public String getColor() {
        return color;
    }

    /**
     * @param color the color to set
     */
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * @return the dBA_inMers
     */
    public int getdBA_inMers() {
        return dBA_inMers;
    }

    /**
     * @param dBA_inMers the dBA_inMers to set
     */
    public void setdBA_inMers(int dBA_inMers) {
        this.dBA_inMers = dBA_inMers;
    }

    /**
     * @return the dBA_stationare
     */
    public int getdBA_stationare() {
        return dBA_stationare;
    }

    /**
     * @param dBA_stationare the dBA_stationare to set
     */
    public void setdBA_stationare(int dBA_stationare) {
        this.dBA_stationare = dBA_stationare;
    }

    /**
     * @return the kmh
     */
    public int getKmh() {
        return kmh;
    }

    /**
     * @param kmh the kmh to set
     */
    public void setKmh(int kmh) {
        this.kmh = kmh;
    }

    /**
     * @return the aerBar_oConducta
     */
    public int getAerBar_oConducta() {
        return aerBar_oConducta;
    }

    /**
     * @param aerBar_oConducta the aerBar_oConducta to set
     */
    public void setAerBar_oConducta(int aerBar_oConducta) {
        this.aerBar_oConducta = aerBar_oConducta;
    }

    /**
     * @return the aerBar_douaConducte
     */
    public int getAerBar_douaConducte() {
        return aerBar_douaConducte;
    }

    /**
     * @param aerBar_douaConducte the aerBar_douaConducte to set
     */
    public void setAerBar_douaConducte(int aerBar_douaConducte) {
        this.aerBar_douaConducte = aerBar_douaConducte;
    }

    /**
     * @return the nr_axe
     */
    public int getNr_axe() {
        return nr_axe;
    }

    /**
     * @param nr_axe the nr_axe to set
     */
    public void setNr_axe(int nr_axe) {
        this.nr_axe = nr_axe;
    }

    /**
     * @return the tractiune
     */
    public String getTractiune() {
        return tractiune;
    }

    /**
     * @param tractiune the tractiune to set
     */
    public void setTractiune(String tractiune) {
        this.tractiune = tractiune;
    }

    /**
     * @return the rezervor
     */
    public int getRezervor() {
        return rezervor;
    }

    /**
     * @param rezervor the rezervor to set
     */
    public void setRezervor(int rezervor) {
        this.rezervor = rezervor;
    }

    /**
     * @return the kg_masina
     */
    public int getKg_masina() {
        return kg_masina;
    }

    /**
     * @param kg_masina the kg_masina to set
     */
    public void setKg_masina(int kg_masina) {
        this.kg_masina = kg_masina;
    }

    /**
     * @return the masa_totala
     */
    public int getMasa_totala() {
        return masa_totala;
    }

    /**
     * @param masa_totala the masa_totala to set
     */
    public void setMasa_totala(int masa_totala) {
        this.masa_totala = masa_totala;
    }

    /**
     * @return the masa_totala_aut
     */
    public int getMasa_totala_aut() {
        return masa_totala_aut;
    }

    /**
     * @param masa_totala_aut the masa_totala_aut to set
     */
    public void setMasa_totala_aut(int masa_totala_aut) {
        this.masa_totala_aut = masa_totala_aut;
    }

    /**
     * @return the masa_totala_aut_carlig
     */
    public int getMasa_totala_aut_carlig() {
        return masa_totala_aut_carlig;
    }

    /**
     * @param masa_totala_aut_carlig the masa_totala_aut_carlig to set
     */
    public void setMasa_totala_aut_carlig(int masa_totala_aut_carlig) {
        this.masa_totala_aut_carlig = masa_totala_aut_carlig;
    }

    /**
     * @return the masa_max_aut_fata
     */
    public int getMasa_max_aut_fata() {
        return masa_max_aut_fata;
    }

    /**
     * @param masa_max_aut_fata the masa_max_aut_fata to set
     */
    public void setMasa_max_aut_fata(int masa_max_aut_fata) {
        this.masa_max_aut_fata = masa_max_aut_fata;
    }

    /**
     * @return the masa_max_aut_mijloc
     */
    public int getMasa_max_aut_mijloc() {
        return masa_max_aut_mijloc;
    }

    /**
     * @param masa_max_aut_mijloc the masa_max_aut_mijloc to set
     */
    public void setMasa_max_aut_mijloc(int masa_max_aut_mijloc) {
        this.masa_max_aut_mijloc = masa_max_aut_mijloc;
    }

    /**
     * @return the masa_max_aut_spate
     */
    public int getMasa_max_aut_spate() {
        return masa_max_aut_spate;
    }

    /**
     * @param masa_max_aut_spate the masa_max_aut_spate to set
     */
    public void setMasa_max_aut_spate(int masa_max_aut_spate) {
        this.masa_max_aut_spate = masa_max_aut_spate;
    }

    /**
     * @return the masa_max_aut_senila
     */
    public int getMasa_max_aut_senila() {
        return masa_max_aut_senila;
    }

    /**
     * @param masa_max_aut_senila the masa_max_aut_senila to set
     */
    public void setMasa_max_aut_senila(int masa_max_aut_senila) {
        this.masa_max_aut_senila = masa_max_aut_senila;
    }

    /**
     * @return the maxa_aut_remorca_cu_franare
     */
    public int getMaxa_aut_remorca_cu_franare() {
        return maxa_aut_remorca_cu_franare;
    }

    /**
     * @param maxa_aut_remorca_cu_franare the maxa_aut_remorca_cu_franare to set
     */
    public void setMaxa_aut_remorca_cu_franare(int maxa_aut_remorca_cu_franare) {
        this.maxa_aut_remorca_cu_franare = maxa_aut_remorca_cu_franare;
    }

    /**
     * @return the maxa_aut_remorca_fara_franare
     */
    public int getMaxa_aut_remorca_fara_franare() {
        return maxa_aut_remorca_fara_franare;
    }

    /**
     * @param maxa_aut_remorca_fara_franare the maxa_aut_remorca_fara_franare to set
     */
    public void setMaxa_aut_remorca_fara_franare(int maxa_aut_remorca_fara_franare) {
        this.maxa_aut_remorca_fara_franare = maxa_aut_remorca_fara_franare;
    }

    /**
     * @return the nr_locuri
     */
    public int getNr_locuri() {
        return nr_locuri;
    }

    /**
     * @param nr_locuri the nr_locuri to set
     */
    public void setNr_locuri(int nr_locuri) {
        this.nr_locuri = nr_locuri;
    }

    /**
     * @return the nr_locuri_inFata
     */
    public int getNr_locuri_inFata() {
        return nr_locuri_inFata;
    }

    /**
     * @param nr_locuri_inFata the nr_locuri_inFata to set
     */
    public void setNr_locuri_inFata(int nr_locuri_inFata) {
        this.nr_locuri_inFata = nr_locuri_inFata;
    }

    /**
     * @return the nr_locuri_picioare
     */
    public int getNr_locuri_picioare() {
        return nr_locuri_picioare;
    }

    /**
     * @param nr_locuri_picioare the nr_locuri_picioare to set
     */
    public void setNr_locuri_picioare(int nr_locuri_picioare) {
        this.nr_locuri_picioare = nr_locuri_picioare;
    }

    /**
     * @return the nr_locuri_peScaun
     */
    public int getNr_locuri_peScaun() {
        return nr_locuri_peScaun;
    }

    /**
     * @param nr_locuri_peScaun the nr_locuri_peScaun to set
     */
    public void setNr_locuri_peScaun(int nr_locuri_peScaun) {
        this.nr_locuri_peScaun = nr_locuri_peScaun;
    }

    /**
     * @return the anvelope_fata
     */
    public String getAnvelope_fata() {
        return anvelope_fata;
    }

    /**
     * @param anvelope_fata the anvelope_fata to set
     */
    public void setAnvelope_fata(String anvelope_fata) {
        this.anvelope_fata = anvelope_fata;
    }

    /**
     * @return the anvelope_fata_sau
     */
    public String getAnvelope_fata_sau() {
        return anvelope_fata_sau;
    }

    /**
     * @param anvelope_fata_sau the anvelope_fata_sau to set
     */
    public void setAnvelope_fata_sau(String anvelope_fata_sau) {
        this.anvelope_fata_sau = anvelope_fata_sau;
    }

    /**
     * @return the anvelope_mijloc_spate
     */
    public String getAnvelope_mijloc_spate() {
        return anvelope_mijloc_spate;
    }

    /**
     * @param anvelope_mijloc_spate the anvelope_mijloc_spate to set
     */
    public void setAnvelope_mijloc_spate(String anvelope_mijloc_spate) {
        this.anvelope_mijloc_spate = anvelope_mijloc_spate;
    }

    /**
     * @return the anvelope_mijloc_spate_sau
     */
    public String getAnvelope_mijloc_spate_sau() {
        return anvelope_mijloc_spate_sau;
    }

    /**
     * @param anvelope_mijloc_spate_sau the anvelope_mijloc_spate_sau to set
     */
    public void setAnvelope_mijloc_spate_sau(String anvelope_mijloc_spate_sau) {
        this.anvelope_mijloc_spate_sau = anvelope_mijloc_spate_sau;
    }

    /**
     * @return the tip_motor
     */
    public String getTip_motor() {
        return tip_motor;
    }

    /**
     * @param tip_motor the tip_motor to set
     */
    public void setTip_motor(String tip_motor) {
        this.tip_motor = tip_motor;
    }

    /**
     * @return the serie_motor
     */
    public String getSerie_motor() {
        return serie_motor;
    }

    /**
     * @param serie_motor the serie_motor to set
     */
    public void setSerie_motor(String serie_motor) {
        this.serie_motor = serie_motor;
    }

    /**
     * @return the cilindrii_cotor
     */
    public int getCilindrii_motor() {
        return cilindrii_motor;
    }

    /**
     * @param cilindrii_cotor the cilindrii_cotor to set
     */
    public void setCilindrii_motor(int cilindrii_cotor) {
        this.cilindrii_motor = cilindrii_motor;
    }

    /**
     * @return the putere_turatii
     */
    public int getPutere_turatii() {
        return putere_turatii;
    }

    /**
     * @param putere_turatii the putere_turatii to set
     */
    public void setPutere_turatii(int putere_turatii) {
        this.putere_turatii = putere_turatii;
    }

    /**
     * @return the carburant
     */
    public String getCarburant() {
        return carburant;
    }

    /**
     * @param carburant the carburant to set
     */
    public void setCarburant(String carburant) {
        this.carburant = carburant;
    }

    /**
     * @return the lungime_masina
     */
    public int getLungime_masina() {
        return lungime_masina;
    }

    /**
     * @param lungime_masina the lungime_masina to set
     */
    public void setLungime_masina(int lungime_masina) {
        this.lungime_masina = lungime_masina;
    }

    /**
     * @return the latime_masina
     */
    public int getLatime_masina() {
        return latime_masina;
    }

    /**
     * @param latime_masina the latime_masina to set
     */
    public void setLatime_masina(int latime_masina) {
        this.latime_masina = latime_masina;
    }

    /**
     * @return the inaltime_masina
     */
    public int getInaltime_masina() {
        return inaltime_masina;
    }

    /**
     * @param inaltime_masina the inaltime_masina to set
     */
    public void setInaltime_masina(int inaltime_masina) {
        this.inaltime_masina = inaltime_masina;
    }

    /**
     * @return the data_inmatricularii
     */
    public Date getData_inmatricularii() {
        return data_inmatricularii;
    }

    /**
     * @param data_inmatricularii the data_inmatricularii to set
     */
    public void setData_inmatricularii(Date data_inmatricularii) {
        this.data_inmatricularii = data_inmatricularii;
    }
    
    
    
}
