/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Professor;

public interface IBusinessProfessor {
    
     public boolean salvarProfessor(Professor professor);     
    public List getAll();
    public Professor buscarProfessor(Professor professor);
    public Professor editarProfessor(Professor professor);
    
    
}
