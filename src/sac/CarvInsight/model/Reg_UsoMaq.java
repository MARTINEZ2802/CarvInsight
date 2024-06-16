
package sac.CarvInsight.model;

public class Reg_UsoMaq {
    
    
    private int id_asig;
    private String date;
    private float timeWork;
    private int quantity;
    private int error;
    private float availPC;
    private float perfoPC;
    private float qualiPC;
    private float OEE;

    public Reg_UsoMaq() {
    }

    public Reg_UsoMaq(int id_asig, String date, float timeWork, int quantity, int error, float AvailPC, float PerfoPC, float QuantPC, float OEE) {
        this.id_asig = id_asig;
        this.date = date;
        this.timeWork = timeWork;
        this.quantity = quantity;
        this.error = error;
        this.availPC = AvailPC;
        this.perfoPC = PerfoPC;
        this.qualiPC = QuantPC;
        this.OEE = OEE;
    }

    public int getId_asig() {
        return id_asig;
    }

    public void setId_asig(int id_asig) {
        this.id_asig = id_asig;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String Date) {
        this.date = Date;
    }

    public float getTimeWork() {
        return timeWork;
    }

    public void setTimeWork(float timeWork) {
        this.timeWork = timeWork;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getError() {
        return error;
    }

    public void setError(int error) {
        this.error = error;
    }

    public float getAvailPC() {
        return availPC;
    }

    public void setAvailPC(float AvailPC) {
        this.availPC = AvailPC;
    }

    public float getPerfoPC() {
        return perfoPC;
    }

    public void setPerfoPC(float PerfoPC) {
        this.perfoPC = PerfoPC;
    }

    public float getQuantPC() {
        return qualiPC;
    }

    public void setQuantPC(float QuantPC) {
        this.qualiPC = QuantPC;
    }

    public float getOEE() {
        return OEE;
    }

    public void setOEE(float OEE) {
        this.OEE = OEE;
    }
    
    
    
}
