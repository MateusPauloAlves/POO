package fatec.poo.control;

import fatec.poo.model.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 0030482211023
 */
public class DaoProjeto {
    
    private Connection conn;
    
    public DaoProjeto(Connection conn) {
        this.conn = conn;
    }
    
    public void inserir(Projeto projeto) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement("INSERT INTO tbprojeto(codigo, descricao, dtInicio, dtTermino) VALUES (?, ?, ?, ?)");
            ps.setInt(1, projeto.getCodigo());
            ps.setString(2, projeto.getDescricao());
            ps.setString(3, projeto.getDtInicio());
            ps.setString(4, projeto.getDtTermino());
            
            ps.execute();
        } catch(SQLException ex) {
             System.out.println(ex.toString());
                }
    }
}
