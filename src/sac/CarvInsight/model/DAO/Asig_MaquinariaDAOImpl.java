package sac.CarvInsight.model.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sac.CarvInsight.util.Conexion;
import sac.CarvInsight.model.Asig_Maquinaria;


public class Asig_MaquinariaDAOImpl implements Asig_MaquinariaDAO{

    
    //Para llenado de cbo
    @Override
    public List<Asig_Maquinaria> findAllIncompleted() {
    List<Asig_Maquinaria> listAsig = new ArrayList<>();
    String query = "Select id_asig, id_maq, id_prod, description from asig_machines";
    try {
        Connection conn = Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Asig_Maquinaria asigMaq= new Asig_Maquinaria();
            asigMaq.setId_asig(rs.getInt("id_asig"));
            asigMaq.setId_maq(rs.getInt("id_maq"));
            asigMaq.setId_prod(rs.getInt("id_prod"));
            asigMaq.setDescription(rs.getString("description"));
            listAsig.add(asigMaq);
        }
     
    } catch (Exception e) {
    } 
    return listAsig;
    }

    @Override
    public int insert(Asig_Maquinaria AsMaq) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //para actualizar estado luego de registrar uso
    @Override
    public int updateState(Asig_Maquinaria asig) {
        int result = 0;
        String Query = "UPDATE Asig_Machines SET state_asig=? where id_asig=?";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(Query);
            stmt.setInt(1, asig.getState());
            stmt.setInt(2, asig.getId_asig());
            result = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e.getMessage());
        }
        return result;
    }
    
    
    
}
