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
    public List<Asig_Maquinaria> findAll() {
    List<Asig_Maquinaria> listAsig = new ArrayList<>();
    String query = "Select id_Asignacion from registrouso";
    try {
        Connection conn = Conexion.getConnection();
        PreparedStatement stmt = conn.prepareStatement(query);
        ResultSet rs = stmt.executeQuery();
        while(rs.next()){
            Asig_Maquinaria asigMaq= new Asig_Maquinaria();
            asigMaq.setId_maquinaria(rs.getInt("id_Asignacion"));
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
    
    
    
}
