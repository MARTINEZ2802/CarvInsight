package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.Reg_UsoMaq;

public interface Reg_UsoMaqDAO {
    public Reg_UsoMaq findToDay(int id_maq, String Date);
    public List<Reg_UsoMaq> findToWeek(int id_maq,String Date);
    public List<Reg_UsoMaq> findToProduction(int id_maq, int prod);
    public int insert(Reg_UsoMaq RgUso);
}
