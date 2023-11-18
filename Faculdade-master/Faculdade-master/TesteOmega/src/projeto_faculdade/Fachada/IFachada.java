/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Fachada;

import java.util.List;
import projeto_faculdade.Model.Aluno;


import projeto_faculdade.Model.Usuario;


public interface IFachada {
    
     
    //Aluno 
    
    public boolean  salvarAluno(Aluno aluno);
    public Aluno buscarIdAluno(int id);
    public List getAllAluno();
    public Aluno buscarAluno(Aluno aluno);
    public Aluno editarAluno(Aluno aluno);
    
    // Usuario
    
    public boolean salvar(Usuario usuario);   
    public Usuario buscarID(int id);
    public Usuario buscarUsuario(Usuario usuario);
    public List getAll();
    
    
   
    
    
}
