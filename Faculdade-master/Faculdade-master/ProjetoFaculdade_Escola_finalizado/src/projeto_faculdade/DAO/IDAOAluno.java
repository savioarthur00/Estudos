/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.util.List;
import projeto_faculdade.Model.Aluno;



public interface IDAOAluno {
    
    public boolean salvar(Aluno aluno);
    public Aluno editar(Aluno aluno);
    public Aluno buscarAluno(Aluno aluno);
    public Aluno buscarID(int id);
    public List getAll();
    public boolean excluir(Aluno aluno);
    
    
    
}
