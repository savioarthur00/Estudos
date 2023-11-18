/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;


import java.sql.PreparedStatement;

import java.sql.SQLException;
import java.util.List;

import javax.swing.JOptionPane;
import projeto_faculdade.Model.Usuario;
import projeto_faculdade.SqlUtil.SQL_Connection;


public class DAOUsuario  implements  IDaoUsuario{
    
  
    SQL_Connection conex_sql =  new SQL_Connection();
    
    @Override
    public boolean salvar(Usuario usuario) {
       conex_sql.Connection();
        
       try {
			
			PreparedStatement statem = conex_sql.conexao.prepareStatement("insert into usuarios(nome,login,senha) values (?,?,?)");                         
			statem.setString(1, usuario.getNome());
			statem.setString(2, usuario.getLogin());
                        statem.setString(3,usuario.getSenha());
                        
                        			
			statem.execute();
                        
                        JOptionPane.showMessageDialog(null,"Usuario cadastrado");
                        return true;
                        
			
    } catch (Exception e) {
                        System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		
       conex_sql.desconection();
       return false;
    }
    
    @Override
    public Usuario buscar_Usuario(Usuario usuario) {
        
        
        
        conex_sql.Connection();      
        conex_sql.executaSql("select *from usuarios where senha like '%" + usuario.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            usuario.setId(conex_sql.rs.getInt("id"));
            usuario.setNome(conex_sql.rs.getString("nome"));
            usuario.setLogin(conex_sql.rs.getString("login"));
            usuario.setSenha(conex_sql.rs.getString("senha"));
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Usuario!");
            return null;
        }
        conex_sql.desconection();
        return usuario;
        
        
        
       
        
    }

    @Override
    public boolean editar(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
