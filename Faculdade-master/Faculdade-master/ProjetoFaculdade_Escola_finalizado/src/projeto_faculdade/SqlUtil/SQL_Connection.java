
package projeto_faculdade.SqlUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;




public class SQL_Connection {
    
    public static final String NOME_BD_CONNECTION_POSTGRESS = "POSTGRES";
	
    
        public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/Projeto_Faculdade";
	public static String USUARIO_POSTGRES = "postgres";
	public static String SENHA_POSTGRES = "123";
	
    
	public  Connection conexao;
        public Statement stm;
        public ResultSet rs;
        	
	
	public void Connection(){
            
            try {
                
                System.setProperty("jdbc.Drivers", URL_POSTGRES);
                conexao = DriverManager.getConnection(URL_POSTGRES,USUARIO_POSTGRES,SENHA_POSTGRES);
                
                
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados");
                
            }
        
                        
            
        }
            

	
    
        public void executaSql(String sql){
            
        try {
            stm = conexao.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro executaSql " + ex);
           
        }
            
        }
        
        
        public void desconection(){
            
            try {
                conexao.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null,"Erro ao desconectar com o banco de Dados");
            }
            
        }
    
}
