/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Fachada;

import java.util.List;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade.Model.Diretoria;
import projeto_faculdade.Model.Historico;
import projeto_faculdade.Model.Notas;

import projeto_faculdade.Model.Responsavel;



import projeto_faculdade.Model.Usuario;


public interface IFachada {
    
     
    //Aluno 
    
    public boolean  salvarAluno(Aluno aluno);
    public Aluno buscarIdAluno(int id);
    public List getAllAluno();
    public Aluno buscarAluno(Aluno aluno);
    public Aluno editarAluno(Aluno aluno);
    public boolean excluirAluno(Aluno aluno);
    
    // Usuario
    
    public boolean salvar(Usuario usuario);   
    public Usuario buscarID(int id);
    public Usuario buscarUsuario(Usuario usuario);
    public List getAllUsuario();
    
   
    
    // Diretor 
    
    public boolean salvarDiretor(Diretoria diretoria);
    public Diretoria editarDiretor(Diretoria diretoria);
    public List getAll_diretoria();
    public Diretoria buscar_diretoria(Diretoria diretoria);
    
    //Responsável
    
    public boolean salvar_responsavel(Responsavel responsavel);
    public Responsavel editar_responsavel(Responsavel responsavel);
    public Responsavel buscar_responsavel(Responsavel responsavel);
    public List getAll_responsavel();
    
    
    //Notas 
    
    
    public boolean salvar_notas(Notas notas);
    public Notas editar_notas(Notas notas);
    public List getALL_notas();
    public Notas buscar_notas(Notas notas);
    
    //Historico
    
    public boolean salvar_Historico(Historico historico);
    public Historico editar_historico(Historico historico);
    public Historico buscar_historico(Historico historico);
    
}
