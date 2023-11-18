/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import projeto_faculdade.Model.Professor;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class DAOProfessor implements IDAOProfessor{

     SQL_Connection conex_sql =  new SQL_Connection();
    List<Professor> professores = new ArrayList<Professor>();
     
    @Override
    public boolean salvarProfessor(Professor professor) {
      conex_sql.Connection();
        
       try {
			       
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into professores(nome,cpf,materia,formacao) values (?,?,?,?)");                         
			statement.setString(1, professor.getNome());
			statement.setString(2, professor.getCpf());
                        statement.setString(3,professor.getMateria());
                        statement.setString(4,professor.getFormacao());
                        
                        			
			statement.execute();
                        
                        System.out.println("Professor SALVO");
                        return true;
                        
			
    } catch (Exception e) {
                        System.out.println("Erro ao salvar Professor");
			e.printStackTrace();
		}
		
       conex_sql.desconection();
        System.out.println("NÃO SALVEI");
       return false;
        
        
        
    }

    @Override
    public Professor editar(Professor professor) {
        
        
        
         conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update professores set nome=?,cpf =?,materia=?,formacao=? where id=?");
            
            state.setString(1, professor.getNome());
            state.setString(2, professor.getCpf());
            state.setString(3,professor.getMateria());
            state.setString(4,professor.getFormacao());
            
            state.setInt(5, professor.getId());
            
         
            
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Professor editado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar Professor" + ex);
            System.out.println(ex);
        }
        
                
        conex_sql.desconection();
           
        
        return professor;
        
        
        
        
    }

    @Override
    public Professor buscarProfessor(Professor professor) {
         conex_sql.Connection();      
        conex_sql.executaSql("select *from professores where nome like '%" + professor.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            professor.setId(conex_sql.rs.getInt("id"));
            professor.setNome(conex_sql.rs.getString("nome"));
            professor.setCpf(conex_sql.rs.getString("cpf"));
            professor.setMateria(conex_sql.rs.getString("materia"));
            professor.setFormacao(conex_sql.rs.getString("formacao"));
            
                    
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Professor");
        }
        conex_sql.desconection();
        return professor;
    }

    @Override
    public List getAllProfessor() {
        
        conex_sql.Connection();
        
        
        
         try {
             ResultSet rs;
            PreparedStatement state = conex_sql.conexao.prepareStatement("SELECT *FROM professores");
             
            rs = state.executeQuery();
           
           while(rs.next()){
               Professor professor = new Professor();
               professor.setId(rs.getInt("id"));
               professor.setNome(rs.getString("nome"));
               professor.setCpf(rs.getString("cpf"));
               professor.setMateria(rs.getString("materia"));
               professor.setFormacao(rs.getString("formacao"));
               professores.add(professor);
               
           }
            
        } catch (Exception e) {
        }
        conex_sql.desconection();           
        return professores;
        
        
        
        
    }
    
}
