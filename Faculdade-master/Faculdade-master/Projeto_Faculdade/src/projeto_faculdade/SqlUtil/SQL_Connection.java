/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.SqlUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;




public class SQL_Connection {
    
    public static final String NOME_BD_CONNECTION_POSTGRESS = "POSTGRES";
	
	private static Connection conexao = null;
        public Statement stm;
        public ResultSet rs;
        
	
	private SQL_Connection(){
		
	}
	
	public static Connection getConnectionInstance(){
		try {
			if(conexao == null || conexao.isClosed()){
				conexao = DriverManager.getConnection(SQLUtil.URL_POSTGRES, SQLUtil.USUARIO_POSTGRES, SQLUtil.SENHA_POSTGRES);
			}
		} catch (SQLException e) {
			 JOptionPane.showMessageDialog(null,"Erro ao conectar com o banco de dados");
			e.printStackTrace();
		}
		return conexao;
	}
    
        public void executaSql(String sql){
            
        try {
            stm = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.TYPE_FORWARD_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro no executa sql");
           
        }
            
        }
    
}
