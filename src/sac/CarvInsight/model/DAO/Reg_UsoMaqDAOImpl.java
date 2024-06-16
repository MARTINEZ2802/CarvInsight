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
    public int insert(Reg_UsoMaq RgUso) {
    int result=0;
    String sql= "INSERTO INTO Reg_using (id_asig, date_use, time_work, quantity, error, availability, performance, quality, oee)";
    try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, RgUso.getId_asig());
            stmt.setString(2, RgUso.getDate());
            stmt.setFloat(3, RgUso.getTimeWork());
            stmt.setInt(4, RgUso.getQuantity());
            stmt.setFloat(5, RgUso.getError());
            stmt.setFloat(6, RgUso.getAvailPC());
            stmt.setFloat(7, RgUso.getQuantPC());
            stmt.setFloat(8, RgUso.getOEE());
            stmt.setQueryTimeout(result);
            result = stmt.executeUpdate();
        } catch (Exception e) {
            System.out.println("Ocurrio un error" + e.getMessage());
        }
        return result;

    }

    @Override
    public Reg_UsoMaq findToDay(int id_maq, String Date) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Reg_UsoMaq> findToWeek(int id_maq, String Date) {
    List<Reg_UsoMaq> LisRgUsed = new ArrayList<>();
    String query = "SELECT \n" +
            "    ru.id_asig, ru.date_use, ru.time_work, ru.quantity, ru.error, \n" +
            "    ru.availability, ru.performance, ru.quality, ru.oee, m.perfor_maq, am.time_estimate\n" +
            "FROM \n" +
            "    reg_using ru\n" +
            "INNER JOIN \n" +
            "    asig_machines am ON ru.id_asig = am.id_asig\n" +
            "INNER JOIN \n" +
            "    machines m ON am.id_maq = m.id_maq\n" +
            "WHERE \n" +
            "	 ru.date_use =? AND m.id_maq=?;";
        try {
            Connection conn = Conexion.getConnection();
            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setInt(1, id_maq);
            stmt.setString(2, Date);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {                
                Reg_UsoMaq rgUsedLocal = new Reg_UsoMaq();
            }
            
        } catch (Exception e) {
        }
      return LisRgUsed;  
    }

    @Override
    public List<Reg_UsoMaq> findToProduction(int id_maq, int prod) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
  
}
