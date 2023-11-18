/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.SqlUtil;

class SQLUtil {
    
    public static String URL_POSTGRES = "jdbc:postgresql://localhost:5432/Projeto_Faculdade";
	public static String USUARIO_POSTGRES = "postgres";
	public static String SENHA_POSTGRES = "123";
	
	public static class Aluno{
		private static String NOME_TABELA = "aluno";
		private static String COL_NOME = "nome";
		private static String COL_CPF = "cpf";
		
		public static String INSERT_ALL = "INSERT INTO "+ NOME_TABELA +" ("+ COL_NOME + "," +COL_CPF+ ") values (?,?)";
	}
    
}
