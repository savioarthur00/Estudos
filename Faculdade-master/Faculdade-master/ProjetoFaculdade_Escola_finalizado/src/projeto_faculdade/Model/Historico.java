/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Model;

/**
 *
 * @author Sávio
 */
public class Historico {
    
    
    Integer id;
    String nome;
    Aluno aluno;
    Diretoria diretoria;
    Notas notas;
    Responsavel responsavel;
    String pesquisa;

    public Historico(String nome, Aluno aluno, Diretoria diretoria, Notas notas, Responsavel responsavel) {
        this.nome = nome;
        this.aluno = aluno;
        this.diretoria = diretoria;
        this.notas = notas;
        this.responsavel = responsavel;
    }

    public Historico() {}

   

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Diretoria getDiretoria() {
        return diretoria;
    }

    public void setDiretoria(Diretoria diretoria) {
        this.diretoria = diretoria;
    }

    public Notas getNotas() {
        return notas;
    }

    public void setNotas(Notas notas) {
        this.notas = notas;
    }

    public Responsavel getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Responsavel responsavel) {
        this.responsavel = responsavel;
    }
    
    
    
}
