/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Aluno;



public interface IBusinessAluno {
    
    public boolean salvar(Aluno aluno);   
    public Aluno buscarID(int id);
    public List getAll();
    public Aluno buscarAluno(Aluno aluno);
    public Aluno editarAluno(Aluno aluno);
}
