package sac.CarvInsight.model.DAO;

import java.util.List;
import sac.CarvInsight.model.Asig_Maquinaria;
//import sac.CarvInsight.model.;

public interface Asig_MaquinariaDAO {
    public List<Asig_Maquinaria> findAll();
    //public List<Asig_Maquinaria> findByIdAsig(int IdAsig);
    public int insert(Asig_Maquinaria AsMaq);    
}
