/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.Clock;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto_faculdade.Model.Aluno;

import projeto_faculdade.SqlUtil.SQL_Connection;


public class DAOAluno implements IDAOAluno{
    SQL_Connection conex_sql =  new SQL_Connection();
    
    
    @Override
    public boolean salvar(Aluno aluno) {        
        
        conex_sql.Connection();
        
       try {
			
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into alunos(nome,cpf,cidade,uf,nacionalidade,rg,data) values (?,?,?,?,?,?,?)");                         
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getCpf());
                        statement.setString(3,aluno.getCidade());
                        statement.setString(4,aluno.getUF());
                        statement.setString(5,aluno.getNacionalidade());                       
                        statement.setString(6,aluno.getRg());
                        statement.setString(7,aluno.getData());
                        
                        			
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
    public Aluno editar(Aluno aluno) {
        
        conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update alunos set nome=?,cpf =?,cidade=?,uf=?,nacionalidade=?,rg=?, data=? where id=?");
            
            state.setString(1, aluno.getNome());
            state.setString(2, aluno.getCpf());
            state.setString(3,aluno.getCidade());
            state.setString(4,aluno.getUF());
            state.setString(5,aluno.getNacionalidade());           
            state.setString(6,aluno.getRg());
            state.setString(7,aluno.getData());
           
            state.setInt(8, aluno.getId());
            
         
            
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Aluno editado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar Aluno" + ex);
            System.out.println(ex);
        }
        
        
        
        
        
        
        
        conex_sql.desconection();
        
        
        
        return aluno;
    }

    @Override
    public Aluno buscarID(int id) {
         return null;
    }

    @Override
    public List getAll() {
        
        conex_sql.Connection();
        
        List<Aluno> alunos = new ArrayList<Aluno>();
        
         try {
            ResultSet rs;
            PreparedStatement state = conex_sql.conexao.prepareStatement("SELECT *FROM alunos");
             
           rs = state.executeQuery();
           
           while(rs.next()){
               Aluno aluno = new Aluno();
               aluno.setId(rs.getInt("id"));
               aluno.setNome(rs.getString("nome"));
               alunos.add(aluno);
               
           }
            
        } catch (Exception e) {
        }
        conex_sql.desconection();           
        return alunos;
    }

    @Override
    public Aluno buscarAluno(Aluno aluno) {
                   
        conex_sql.Connection();      
        conex_sql.executaSql("select *from alunos where nome like '%" + aluno.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            aluno.setId(conex_sql.rs.getInt("id"));
            aluno.setNome(conex_sql.rs.getString("nome"));
            aluno.setCpf(conex_sql.rs.getString("cpf"));
            aluno.setCidade(conex_sql.rs.getString("cidade"));
            aluno.setUF(conex_sql.rs.getString("uf"));
            aluno.setNacionalidade(conex_sql.rs.getString("nacionalidade"));
           
            aluno.setRg(conex_sql.rs.getString("rg"));
            aluno.setData(conex_sql.rs.getString("data"));
           
            
                 
            
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Aluno" +ex);
        }
        conex_sql.desconection();
        return aluno;

    }

    @Override
    public boolean excluir(Aluno aluno) {
        
        conex_sql.Connection();  
        
        try {
          PreparedStatement  state = conex_sql.conexao.prepareStatement("delete from alunos where id=?");
            
          state.setInt(1,aluno.getId());
          state.execute();
          JOptionPane.showMessageDialog(null,"Aluno excluido com sucesso");
          return true; 
            
        } catch (SQLException ex) {
            Logger.getLogger(DAOAluno.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não foi possivel excluir o aluno");
        }
            
           
            
         
            
           
            
            JOptionPane.showMessageDialog(null,"Aluno editado com sucesso");
        
        
        
        
        
        
        
        
        
        
        
        conex_sql.desconection();
        
        
        
        
        
        
        
        
        
        
        
        return true;
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
