/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Fachada;

import java.util.List;
import projeto_faculdade.Business.BusinessAluno;

import projeto_faculdade.Business.BusinessUsuario;
import projeto_faculdade.Business.IBusinessAluno;


import projeto_faculdade.Business.IBusinessUsuario;
import projeto_faculdade.Model.Aluno;


import projeto_faculdade.Model.Usuario;


public class Fachada implements IFachada{
    
    private IBusinessAluno businessAluno;
   
    private IBusinessUsuario businessUsuario;
    

    private static Fachada instance;
    
    
    private Fachada(){
		businessAluno = new BusinessAluno();
		businessUsuario = new BusinessUsuario();
               
	}
	
    public static Fachada getInstance(){
		if(instance == null){
			instance = new Fachada();
		}
		return instance;
		
	}
    
    

    

   

    @Override
    public boolean salvarAluno(Aluno aluno) {
      return businessAluno.salvar(aluno);
    }
    
    

    @Override
    public Aluno buscarIdAluno(int id) {
        return businessAluno.buscarID(id);
        
    }

    @Override
    public List getAllAluno() {
        return businessAluno.getAll();
        
    }

    @Override
    public boolean salvar(Usuario usuario) {
       return businessUsuario.salvar(usuario);
    }

    @Override
    public Usuario buscarID(int id) {
     return businessUsuario.buscarID(id);
    }

    @Override
    public List getAll() {
        return businessUsuario.getAll();
    }

    @Override
    public Aluno buscarAluno(Aluno aluno) {
        return businessAluno.buscarAluno(aluno);
    }

    @Override
    public Usuario buscarUsuario(Usuario usuario) {
        return businessUsuario.buscarUsuario(usuario);
        
    }

    @Override
    public Aluno editarAluno(Aluno aluno) {
        return businessAluno.editarAluno(aluno);
    }

    
   
    
    
    
}
