package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.Reg_UsoMaq;

public interface Reg_UsoMaqDAO {
    public List<Reg_UsoMaq> findAll();
    public List<Reg_UsoMaq> findByIdAsig(int IdAsig);
    public int insert(Reg_UsoMaq RgUso);
    public int delete(Reg_UsoMaq RgUso);
}
