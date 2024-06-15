package sac.CarviInsight.model;

public class TipoMaq {
    private int id_tipomaq;
    private String descripcion;

    public TipoMaq() {
    }

    public TipoMaq(int id_tipomaq, String descripcion) {
        this.id_tipomaq = id_tipomaq;
        this.descripcion = descripcion;
    }

    public int getId_tipomaq() {
        return id_tipomaq;
    }

    public void setId_tipomaq(int id_tipomaq) {
        this.id_tipomaq = id_tipomaq;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
