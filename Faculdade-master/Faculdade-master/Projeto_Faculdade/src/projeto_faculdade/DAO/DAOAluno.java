/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.Clock;
import java.util.List;
import javax.swing.JOptionPane;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.SqlUtil.SQL_Connection;


public class DAOAluno implements IDAOAluno{
    SQL_Connection conex_sql;
    private Connection conexao;
    private PreparedStatement statement;

    @Override
    public boolean salvar(Aluno aluno) {
       
        
        
       
        
        
       try {
			conexao = SQL_Connection.getConnectionInstance();
			statement = conexao.prepareStatement("insert into alunos(nome,cpf,cidade,uf,nacionalidade,sexo,rg) values (?,?,?,?,?,?,?)");                         
			statement.setString(1, aluno.getNome());
			statement.setString(2, aluno.getCpf());
                        statement.setString(3,aluno.getCidade());
                        statement.setString(4,aluno.getUF());
                        statement.setString(5,aluno.getNacionalidade());
                        statement.setString(6,aluno.getSexo());
                        statement.setString(7,aluno.getRg());
                        
                        
			
			statement.execute();
                        System.out.println("SALVO");
			
    } catch (Exception e) {
                        System.out.println("Erro ao salvar");
			e.printStackTrace();
		}
		return false;
    }

    @Override
    public boolean editar(Aluno aluno) {
        return false;
    }

    @Override
    public Aluno buscarID(int id) {
         return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    @Override
    public Aluno buscarAluno(Aluno aluno) {
                   
        
        SQL_Connection.getConnectionInstance();
        
        conex_sql.executaSql("select *from alunos where nome like '%" + aluno.getPesquisa() + "%'");
        try {
            conex_sql.rs.first();
            aluno.setId(conex_sql.rs.getInt("id"));
            aluno.setNome(conex_sql.rs.getString("nome"));
            aluno.setCpf(conex_sql.rs.getString("cpf"));
            aluno.setCidade(conex_sql.rs.getString("cidade"));
            aluno.setUF(conex_sql.rs.getString("uf"));
            aluno.setNacionalidade(conex_sql.rs.getString("nacionalidade"));
            aluno.setSexo(conex_sql.rs.getString("sexo"));
            aluno.setRg(conex_sql.rs.getString("rg"));
                 
            
            
            
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao buscar Usuario");
        }
        
        return aluno;

    }
    
    
    
    
}
