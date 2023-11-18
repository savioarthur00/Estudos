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
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Responsavel;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class DAOResponsavel implements IDAOResponsavel{
    
     SQL_Connection conex_sql =  new SQL_Connection();
    

    @Override
    public boolean salvar_responsavel(Responsavel responsavel) {
       
        conex_sql.Connection();
        
       try {
			
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into responsavel(nome_res,cpf,id_aluno) values (?,?,?)");                         
			statement.setString(1, responsavel.getNome());
                        statement.setString(2, responsavel.getCpf());
                        statement.setInt(3, responsavel.getAluno().getId());
                        
                        
                        
                        			
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
    public Responsavel editar_responsavel(Responsavel responsavel) {
        conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update responsavel set nome_res=?,cpf =?,id_aluno=? where id=?");
            
            state.setString(1, responsavel.getNome());
            state.setString(2,responsavel.getCpf());
            state.setInt(3, responsavel.getAluno().getId());
            
            
            
            
            state.setInt(4, responsavel.getId());   
         
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Responsável editado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar Responsável" + ex);
            System.out.println(ex);
        }
        
        
        
        conex_sql.desconection();
                
        return responsavel;
    }

    @Override
    public Responsavel buscar_responsavel(Responsavel responsavel) {
        conex_sql.Connection();      
        conex_sql.executaSql("select *from responsavel where nome_res like '%" + responsavel.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            responsavel.setId(conex_sql.rs.getInt("id"));
            responsavel.setNome(conex_sql.rs.getString("nome_res"));
            responsavel.setCpf(conex_sql.rs.getString("cpf"));
           
                  
             JOptionPane.showMessageDialog(null,"Responsavel encontrado");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Responsável" +ex);
        }
        conex_sql.desconection();
        return responsavel;
    }

    @Override
    public List getAll_responsavel() {
       
           conex_sql.Connection();
        
        List<Responsavel> responsaveis = new ArrayList<Responsavel>();
        
         try {
            ResultSet rs;
            PreparedStatement state = conex_sql.conexao.prepareStatement("SELECT *FROM responsavel");
             
           rs = state.executeQuery();
           
           while(rs.next()){
               Responsavel responsavel = new Responsavel();
               responsavel.setId(rs.getInt("id"));
               responsavel.setNome(rs.getString("nome_res"));
              
               Aluno aluno = new Aluno();
               aluno.setId(rs.getInt("id_aluno"));
               responsavel.setAluno(aluno);
                                  
              responsaveis.add(responsavel);
              
               
           }
            
        } catch (Exception e) {
        }
        conex_sql.desconection();           
        return responsaveis;
        
        
        
        
       
    }
    
    
    
}
