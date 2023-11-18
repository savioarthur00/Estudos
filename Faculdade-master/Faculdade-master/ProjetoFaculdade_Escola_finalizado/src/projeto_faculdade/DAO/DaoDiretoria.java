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
import projeto_faculdade.Model.Diretoria;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class DaoDiretoria implements IDAODiretoria{

    
    SQL_Connection conex_sql =  new SQL_Connection();
    
    @Override
    public boolean salvar_diretoria(Diretoria diretoria) {
        
        
        conex_sql.Connection();
        
       try {
			
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into Diretoria(nome,diretor,cpf,endereco,numero,contato) values (?,?,?,?,?,?)");                         
			statement.setString(1, diretoria.getNome_instituicao());
			statement.setString(2, diretoria.getNome_diretor());
                        statement.setString(3,diretoria.getCpf_diretor());
                        statement.setString(4,diretoria.getEndereco());
                        statement.setString(5,diretoria.getNumero());
                        statement.setString(6,diretoria.getContato());
                       
                        
                        			
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
    public Diretoria editar_diretoria(Diretoria diretoria) {
        
        
         conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update diretoria set nome=?,diretor =?,cpf=?,endereco=?,numero=?,contato=? where id=?");
            
            state.setString(1, diretoria.getNome_instituicao());
            state.setString(2, diretoria.getNome_diretor());
            state.setString(3, diretoria.getCpf_diretor());
            state.setString(4, diretoria.getEndereco());
            state.setString(5, diretoria.getNumero());
            state.setString(6, diretoria.getContato());        
                
            
            
           
            state.setInt(7, diretoria.getId_direcao());
            
         
            
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Diretoria editado com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao editar diretoria" + ex);
            System.out.println(ex);
        }
        
        
        
        
        
        
        
        conex_sql.desconection();
        
        
        
        return diretoria;
    }

    @Override
    public List getAll_diretoria() {
          conex_sql.Connection();
        
        List<Diretoria> diretores = new ArrayList<Diretoria>();
        
         try {
            ResultSet rs;
            PreparedStatement state = conex_sql.conexao.prepareStatement("SELECT *FROM Diretoria");
             
           rs = state.executeQuery();
           
           while(rs.next()){
               Diretoria diretoria = new Diretoria();
               diretoria.setNome_diretor(rs.getString("diretor"));
               diretoria.setId_direcao(rs.getInt("id"));
               diretoria.setNome_instituicao(rs.getString("nome"));
               diretoria.setCpf_diretor(rs.getString("cpf"));
               diretoria.setEndereco(rs.getString("endereco"));
               diretoria.setContato(rs.getString("contato"));
               diretoria.setNumero(rs.getString("numero"));
               diretores.add(diretoria);
               
               
           }
            
        } catch (Exception e) {
        }
        conex_sql.desconection();           
        return diretores;
    }

    @Override
    public Diretoria buscar_diretoria(Diretoria diretoria) {
        conex_sql.Connection();      
        conex_sql.executaSql("select *from diretoria where nome like '%" + diretoria.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            diretoria.setId_direcao(conex_sql.rs.getInt("id"));
            diretoria.setNome_instituicao(conex_sql.rs.getString("nome"));
            diretoria.setNome_diretor(conex_sql.rs.getString("diretor"));
            diretoria.setCpf_diretor(conex_sql.rs.getString("cpf"));
            diretoria.setEndereco(conex_sql.rs.getString("endereco"));
            diretoria.setNumero(conex_sql.rs.getString("numero"));
            diretoria.setContato(conex_sql.rs.getString("contato"));
           
           
          
           
            
                 
            
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Diretoria" +ex);
        }
        conex_sql.desconection();
        return diretoria;
    }
    
}
