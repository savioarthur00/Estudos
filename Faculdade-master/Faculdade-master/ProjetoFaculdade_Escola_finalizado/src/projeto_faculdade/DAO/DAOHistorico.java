/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Historico;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class DAOHistorico implements IDAOHistorico{
     SQL_Connection conex_sql =  new SQL_Connection();

    @Override
    public boolean salvar_Historico(Historico historico) {
          conex_sql.Connection();
        
       try {
			
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into historico(id_diretoria,id_aluno,id_notas,id_responsavel,nome) values (?,?,?,?,?)");                         
			statement.setInt(1, historico.getDiretoria().getId_direcao());
                        statement.setInt(2, historico.getAluno().getId());
                        statement.setInt(3, historico.getNotas().getId());
                        statement.setInt(4, historico.getResponsavel().getId());
                        statement.setString(5,historico.getNome());
                        
                                               			
			statement.execute();
                        
                        System.out.println("SALVO");
                        return true;
                        
			
    } catch (Exception e) {
                        System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		
       conex_sql.desconection();
       return false;
    }

    @Override
    public Historico editar_historico(Historico historico) {
        conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update historico set id_diretoria=?,id_aluno=?,id_notas=?,id_responsavel=?,nome=? where id=?");
            
            state.setInt(1, historico.getDiretoria().getId_direcao());
            state.setInt(2, historico.getAluno().getId());
            state.setInt(3,historico.getNotas().getId());
            state.setInt(4,historico.getResponsavel().getId());
            state.setString(5, historico.getNome());     
        
           
            state.setInt(6, historico.getId());   
         
            
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Histórico editado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar histórico" + ex);
            System.out.println(ex);
        }
        
       conex_sql.desconection();
        
        return historico;
    }

    @Override
    public Historico buscar_historico(Historico historico) {
    
     conex_sql.Connection();      
        conex_sql.executaSql("select *from historico where nome like '%" + historico.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            historico.setId(conex_sql.rs.getInt("id")); 
            historico.setNome(conex_sql.rs.getString("nome"));
           
                  
             JOptionPane.showMessageDialog(null,"Histórico encontrado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar histórico" +ex);
        }
        conex_sql.desconection();
        return historico;
    
    }
    
    
}
