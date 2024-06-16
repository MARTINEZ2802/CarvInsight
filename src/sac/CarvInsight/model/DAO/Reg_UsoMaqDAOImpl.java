package sac.CarvInsight.model.DAO;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import sac.CarvInsight.util.Conexion;
import sac.CarvInsight.model.Asig_Maquinaria;
import sac.CarvInsight.model.Reg_UsoMaq;

public class Reg_UsoMaqDAOImpl implements Reg_UsoMaqDAO{

    @Override
    public List<Reg_UsoMaq> findAll() {
    throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Reg_UsoMaq> findByIdAsig(int IdAsig) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int insert(Reg_UsoMaq RgUso) {
    int result=0;
    String sql= "INSERTO INTO registrouso (id_Asignacion, date_use, time_out, quatity, error, availability, performance, quality, oee)";
    try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, RgUso.getId_asig());
            stmt.setString(2, RgUso.getDate());
            stmt.setFloat(3, RgUso.getTimeWork());
            stmt.setInt(4, RgUso.getQuantity());
            stmt.setQueryTimeout(result);
            result = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e.getMessage());
        }
        return result;
        
    }

    @Override
    public int delete(Reg_UsoMaq RgUso) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
