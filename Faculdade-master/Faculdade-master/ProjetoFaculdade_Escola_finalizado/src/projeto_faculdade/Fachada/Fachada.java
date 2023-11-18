/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Fachada;

import java.util.List;
import projeto_faculdade.Business.BusinessAluno;
import projeto_faculdade.Business.BusinessDiretoria;
import projeto_faculdade.Business.BusinessHistorico;
import projeto_faculdade.Business.BusinessNotas;

import projeto_faculdade.Business.BusinessResponsavel;


import projeto_faculdade.Business.BusinessUsuario;
import projeto_faculdade.Business.IBusinessAluno;
import projeto_faculdade.Business.IBusinessDiretoria;
import projeto_faculdade.Business.IBusinessHistorico;
import projeto_faculdade.Business.IBusinessNotas;

import projeto_faculdade.Business.IBusinessResponsavel;



import projeto_faculdade.Business.IBusinessUsuario;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Diretoria;
import projeto_faculdade.Model.Historico;
import projeto_faculdade.Model.Notas;

import projeto_faculdade.Model.Responsavel;



import projeto_faculdade.Model.Usuario;


public class Fachada implements IFachada{
    
    private IBusinessAluno businessAluno;
   
    private IBusinessUsuario businessUsuario;
    
   
    
    private IBusinessDiretoria  businessDiretoria;
    
    private IBusinessNotas businessNotas;
    
    private IBusinessHistorico businessHistorico;

    private static Fachada instance;
    
    private IBusinessResponsavel businessResponsavel;
    private Fachada(){
		businessAluno = new BusinessAluno();
		businessUsuario = new BusinessUsuario();
               
               businessDiretoria = new BusinessDiretoria();
               businessResponsavel = new BusinessResponsavel();
               businessNotas = new BusinessNotas();
                businessHistorico = new BusinessHistorico();
                
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
    public List getAllUsuario() {
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

    @Override
    public boolean excluirAluno(Aluno aluno) {
        return businessAluno.excluir(aluno);
    }

   

    @Override
    public boolean salvarDiretor(Diretoria diretoria) {
       return businessDiretoria.salvar_diretoria(diretoria);
    }

    @Override
    public Diretoria editarDiretor(Diretoria diretoria) {
        return businessDiretoria.editar_diretoria(diretoria);
    
    }

    @Override
    public List getAll_diretoria() {
        return businessDiretoria.getAll_diretoria();
    }

    

    @Override
    public Diretoria buscar_diretoria(Diretoria diretoria) {
        return businessDiretoria.buscar_diretoria(diretoria);
    }

    @Override
    public boolean salvar_responsavel(Responsavel responsavel) {
        return businessResponsavel.salvar_responsavel(responsavel);
    }

    @Override
    public Responsavel editar_responsavel(Responsavel responsavel) {
        return businessResponsavel.editar_responsavel(responsavel);}
    

    @Override
    public Responsavel buscar_responsavel(Responsavel responsavel) {
     return businessResponsavel.buscar_responsavel(responsavel);}

    @Override
    public List getAll_responsavel() {
     return businessResponsavel.getAll_responsavel();}

    @Override
    public boolean salvar_notas(Notas notas) {
        return businessNotas.salvar_notas(notas);
    }
     
        

    @Override
    public Notas editar_notas(Notas notas) {
        return businessNotas.editar_notas(notas);
    }
     

    @Override
    public List getALL_notas() {
      return businessNotas.getALL_notas();
    }

    @Override
    public Notas buscar_notas(Notas notas) {
        return businessNotas.buscar_notas(notas);
    }

    @Override
    public boolean salvar_Historico(Historico historico) {
        return businessHistorico.salvar_Historico(historico);
    }

    @Override
    public Historico editar_historico(Historico historico) {
        return businessHistorico.editar_historico(historico);
    }

    @Override
    public Historico buscar_historico(Historico historico) {
        return businessHistorico.buscar_historico(historico);
    }
    

    
   
    
    
    
}
