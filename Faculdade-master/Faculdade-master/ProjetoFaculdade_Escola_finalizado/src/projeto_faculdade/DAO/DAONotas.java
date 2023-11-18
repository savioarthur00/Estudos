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
import projeto_faculdade.Model.Notas;
import projeto_faculdade.SqlUtil.SQL_Connection;

/**
 *
 * @author Sávio
 */
public class DAONotas implements IDAONotas{
    SQL_Connection conex_sql =  new SQL_Connection();

    @Override
    public boolean salvar_notas(Notas notas) {
          conex_sql.Connection();
        
       try {
			
			PreparedStatement statement = conex_sql.conexao.prepareStatement("insert into notas(id_aluno,p_05,p_06,p_07,p_08,m_05,m_06,m_07,m_08,h_05,h_06,h_07,h_08,g_05,g_06,g_07,g_08,a_05,a_06,a_07,a_08,c_05,c_06,c_07,c_08,nome) values (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");                         
			
                        statement.setInt(1, notas.getAluno().getId());
                        statement.setString(2, notas.getPortugues_5());
                        statement.setString(3, notas.getPortugues_6());
                        statement.setString(4, notas.getPortugues_7());
                        statement.setString(5, notas.getPortugues_8());
                        statement.setString(6, notas.getMatematica_5());
                        statement.setString(7, notas.getMatematica_6());
                        statement.setString(8, notas.getMatematica_7());
                        statement.setString(9, notas.getMatematica_8());
                        statement.setString(10, notas.getHistoria_5());
                        statement.setString(11, notas.getHistoria_6());
                        statement.setString(12, notas.getHistoria_7());
                        statement.setString(13, notas.getHistoria_8());
                        statement.setString(14, notas.getGeografia_5());
                        statement.setString(15, notas.getGeografia_6());
                        statement.setString(16, notas.getGeografia_7());
                        statement.setString(17, notas.getGeografia_8());
                        statement.setString(18, notas.getArte_5());
                        statement.setString(19, notas.getArte_6());
                        statement.setString(20, notas.getArte_7());
                        statement.setString(21, notas.getArte_8());
                        statement.setString(22, notas.getCiencia_5());
                        statement.setString(23, notas.getCiencia_6());
                        statement.setString(24, notas.getCiencia_7()); 
                        statement.setString(25, notas.getCiencia_8());
                        statement.setString(26,notas.getNome()); 
                           
                        
                        
                        
                        
                        
                        			
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
    public Notas editar_notas(Notas notas) {
        conex_sql.Connection();
        
        try {
            
            PreparedStatement state = conex_sql.conexao.prepareStatement("update notas set id_aluno=?,p_05=?,p_06=?,p_07=?,p_08=?,m_05=?,m_06=?,m_07=?,m_08=?,h_05=?,h_06=?,h_07=?,h_08=?,g_05=?,g_06=?,g_07=?,g_08=?,a_05=?,a_06=?,a_07=?,a_08=?,c_05=?,c_06=?,c_07=?,c_08=?,nome=? where id=?");
            
            
            state.setInt(1, notas.getAluno().getId());
            
            state.setString(2,notas.getPortugues_5());
            state.setString(3,notas.getPortugues_6());
            state.setString(4,notas.getPortugues_7());
            state.setString(5,notas.getPortugues_8());
            
            state.setString(6, notas.getMatematica_5());
            state.setString(7, notas.getMatematica_6());
            state.setString(8, notas.getMatematica_7());
            state.setString(9, notas.getMatematica_8());
            state.setString(10, notas.getHistoria_5());
            state.setString(11, notas.getHistoria_6());
            state.setString(12, notas.getHistoria_7());
            state.setString(13, notas.getHistoria_8());
            state.setString(14, notas.getGeografia_5());
            state.setString(15, notas.getGeografia_6());
            state.setString(16, notas.getGeografia_7());
            state.setString(17, notas.getGeografia_8());
            state.setString(18, notas.getArte_5());
            state.setString(19, notas.getArte_6());
            state.setString(20, notas.getArte_7());
            state.setString(21, notas.getArte_8());
            state.setString(22, notas.getCiencia_5());
            state.setString(23, notas.getCiencia_6());
            state.setString(24, notas.getCiencia_7()); 
            state.setString(25, notas.getCiencia_8());
            state.setString(26,notas.getNome());            
            
            
            state.setInt(27, notas.getId());   
         
            state.execute();
            
            JOptionPane.showMessageDialog(null,"Notas editadas com sucesso");
            
        
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"ERRO");
            System.out.println(ex);
        }
        
        
        
        conex_sql.desconection();
                
        return notas;
    }

    @Override
    public List getALL_notas() {
        
      conex_sql.Connection();
        
        List<Notas> notass = new ArrayList<Notas>();
        
         try {
            ResultSet rs;
            PreparedStatement state = conex_sql.conexao.prepareStatement("SELECT *FROM notas ");
             
           rs = state.executeQuery();
           
           while(rs.next()){
              Notas notas = new Notas();
               notas.setNome(rs.getString("nome"));
               notas.setId(rs.getInt("id"));
               notas.setPortugues_5(rs.getString("p_05"));
               notas.setPortugues_6(rs.getString("p_06"));
               notas.setPortugues_7(rs.getString("p_07"));
               notas.setPortugues_8(rs.getString("p_08"));
               notas.setMatematica_5(rs.getString("m_05"));
               notas.setMatematica_6(rs.getString("m_06")); 
               notas.setMatematica_7(rs.getString("m_07"));
               notas.setMatematica_8(rs.getString("m_08"));
               notas.setHistoria_5(rs.getString("h_05"));
               notas.setHistoria_6(rs.getString("h_06"));
               notas.setHistoria_7(rs.getString("h_07"));
               notas.setHistoria_8(rs.getString("h_08"));
               notas.setGeografia_5(rs.getString("g_05"));
               notas.setGeografia_6(rs.getString("g_06"));
               notas.setGeografia_7(rs.getString("g_07"));
               notas.setGeografia_8(rs.getString("g_08"));
               notas.setArte_5(rs.getString("a_05"));
               notas.setArte_6(rs.getString("a_06"));
               notas.setArte_7(rs.getString("a_07"));
               notas.setArte_8(rs.getString("a_08"));
               notas.setCiencia_5(rs.getString("c_05"));
               notas.setCiencia_6(rs.getString("c_06"));
               notas.setCiencia_7(rs.getString("c_07")); 
               notas.setCiencia_8(rs.getString("c_08"));
              
               Aluno aluno = new Aluno();
               aluno.setId(rs.getInt("id_aluno"));
               
               
               notas.setAluno(aluno);
                 
               
               
               
               notass.add(notas);
               
           }
            
        } catch (Exception e) {
        }
        conex_sql.desconection();           
        return notass;
    }

    @Override
    public Notas buscar_notas(Notas notas) {
        conex_sql.Connection();      
        conex_sql.executaSql("select *from notas where nome like '%" + notas.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();      
            
            
                notas.setNome(conex_sql.rs.getString("nome"));
               notas.setId(conex_sql.rs.getInt("id"));
               notas.setPortugues_5(conex_sql.rs.getString("p_05"));
               notas.setPortugues_6(conex_sql.rs.getString("p_06"));
               notas.setPortugues_7(conex_sql.rs.getString("p_07"));
               notas.setPortugues_8(conex_sql.rs.getString("p_08"));
               notas.setMatematica_5(conex_sql.rs.getString("m_05"));
               notas.setMatematica_6(conex_sql.rs.getString("m_06")); 
               notas.setMatematica_7(conex_sql.rs.getString("m_07"));
               notas.setMatematica_8(conex_sql.rs.getString("m_08"));
               notas.setHistoria_5(conex_sql.rs.getString("h_05"));
               notas.setHistoria_6(conex_sql.rs.getString("h_06"));
               notas.setHistoria_7(conex_sql.rs.getString("h_07"));
               notas.setHistoria_8(conex_sql.rs.getString("h_08"));
               notas.setGeografia_5(conex_sql.rs.getString("g_05"));
               notas.setGeografia_6(conex_sql.rs.getString("g_06"));
               notas.setGeografia_7(conex_sql.rs.getString("g_07"));
               notas.setGeografia_8(conex_sql.rs.getString("g_08"));
               notas.setArte_5(conex_sql.rs.getString("a_05"));
               notas.setArte_6(conex_sql.rs.getString("a_06"));
               notas.setArte_7(conex_sql.rs.getString("a_07"));
               notas.setArte_8(conex_sql.rs.getString("a_08"));
               notas.setCiencia_5(conex_sql.rs.getString("c_05"));
               notas.setCiencia_6(conex_sql.rs.getString("c_06"));
               notas.setCiencia_7(conex_sql.rs.getString("c_07")); 
               notas.setCiencia_8(conex_sql.rs.getString("c_08"));
            
            
            
                  
             JOptionPane.showMessageDialog(null,"Notas encontrada");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Notas" +ex);
        }
        conex_sql.desconection();
        return notas;
    }
    
    
    
    
}
