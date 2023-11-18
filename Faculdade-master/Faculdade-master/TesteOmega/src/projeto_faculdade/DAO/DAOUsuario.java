/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import projeto_faculdade.Model.Usuario;
import projeto_faculdade.SqlUtil.SQL_Connection;


public class DAOUsuario  implements  IDaoUsuario{
    
    private Connection conexao;
    private PreparedStatement statement; 
    SQL_Connection conex_sql;
    
    @Override
    public boolean salvar(Usuario usuario) {
        try {
			conex_sql.Connection();
			statement = conexao.prepareStatement("insert into usuarios(nome,login,senha) values (?,?,?)");                         
			statement.setString(1, usuario.getNome());
			statement.setString(2, usuario.getLogin());
                        statement.setString(3, usuario.getSenha());
                        
			
			statement.execute();
                        System.out.println("Salvo no banco de dados");
			
    } catch (Exception e) {
                        System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		return false;
    }
    
    @Override
    public Usuario buscar_Usuario(Usuario usuario) {
        conex_sql.Connection();
        
        conex_sql.executaSql("select *from usuarios where login like '%" + usuario.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            usuario.setId(conex_sql.rs.getInt("id"));
            usuario.setNome(conex_sql.rs.getString("nome"));
            usuario.setLogin(conex_sql.rs.getString("login"));
            usuario.setSenha(conex_sql.rs.getString("senha"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Usuario");
        }
        
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
