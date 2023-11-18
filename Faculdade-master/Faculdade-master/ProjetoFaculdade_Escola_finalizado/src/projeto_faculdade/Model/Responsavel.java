/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Model;


public class Responsavel {
    
    private String nome;
    private String cpf;
    private Integer id;
    private String pesquisa;
    Aluno aluno;

    
    
    public Responsavel(String nome, String cpf, Aluno aluno) {
        this.nome = nome;
        this.cpf = cpf;       
        this.aluno = aluno;
    }

    public Responsavel() {
    }

    @Override
    public String toString() {
        return "Responsavel{"+ nome +",Responsavel pelo aluno de ID=" + aluno.getId() + '}';
    }

    

   

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    
    
    
    
    
    
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }
    
    
    
}
