
package sac.CarvInsight.model;


public class Asig_Maquinaria {
    
    private int id_maquinaria;
    private int state;
    private float time_estimade;
    private String date_plann;
    private int id_prod;
    private int id_maq;

    public Asig_Maquinaria() {
    }

    public Asig_Maquinaria(int id_maquinaria, int state, float time_estimade, String date_plann, int id_prod, int id_maq) {
        this.id_maquinaria = id_maquinaria;
        this.state = state;
        this.time_estimade = time_estimade;
        this.date_plann = date_plann;
        this.id_prod = id_prod;
        this.id_maq = id_maq;
    }

    public int getId_maquinaria() {
        return id_maquinaria;
    }

    public void setId_maquinaria(int id_maquinaria) {
        this.id_maquinaria = id_maquinaria;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public float getTime_estimade() {
        return time_estimade;
    }

    public void setTime_estimade(float time_estimade) {
        this.time_estimade = time_estimade;
    }

    public String getDate_plann() {
        return date_plann;
    }

    public void setDate_plann(String date_plann) {
        this.date_plann = date_plann;
    }

    public int getId_prod() {
        return id_prod;
    }

    public void setId_prod(int id_prod) {
        this.id_prod = id_prod;
    }

    public int getId_maq() {
        return id_maq;
    }

    public void setId_maq(int id_maq) {
        this.id_maq = id_maq;
    }
    
    
            
    
}
