
package sac.CarviInsight.model;

public class Reg_UsoMaq {
    
    
    private int id_asig;
    private String Date;
    private float timeWork;
    private int quantity;
    private int error;
    
    private float AvailPC;
    private float PerfoPC;
    private float QuantPC;
    private float OEE;

    public Reg_UsoMaq() {
    }

    public Reg_UsoMaq(int id_asig, String Date, float timeWork, int quantity, int error, float AvailPC, float PerfoPC, float QuantPC, float OEE) {
        this.id_asig = id_asig;
        this.Date = Date;
        this.timeWork = timeWork;
        this.quantity = quantity;
        this.error = error;
        this.AvailPC = AvailPC;
        this.PerfoPC = PerfoPC;
        this.QuantPC = QuantPC;
        this.OEE = OEE;
    }

    public int getId_asig() {
        return id_asig;
    }

    public void setId_asig(int id_asig) {
        this.id_asig = id_asig;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
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
        return AvailPC;
    }

    public void setAvailPC(float AvailPC) {
        this.AvailPC = AvailPC;
    }

    public float getPerfoPC() {
        return PerfoPC;
    }

    public void setPerfoPC(float PerfoPC) {
        this.PerfoPC = PerfoPC;
    }

    public float getQuantPC() {
        return QuantPC;
    }

    public void setQuantPC(float QuantPC) {
        this.QuantPC = QuantPC;
    }

    public float getOEE() {
        return OEE;
    }

    public void setOEE(float OEE) {
        this.OEE = OEE;
    }
    
    
    
}
