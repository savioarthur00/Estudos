/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Model;




public class Diretoria {
    
    private String nome_instituicao;
    private String nome_diretor;
    private String cpf_diretor;
    private String endereco;
    private String contato;
    private String numero;
    private Integer id_direcao;
    
    private String pesquisa;

    public Diretoria(String nome_instituicao, String nome_diretor, String cpf_diretor, String endereco, String contato, String numero) {
        this.nome_instituicao = nome_instituicao;
        this.nome_diretor = nome_diretor;
        this.cpf_diretor = cpf_diretor;
        this.endereco = endereco;
        this.contato = contato;
        this.numero = numero;
    }

    public Diretoria() {
    }

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    
    
    
    @Override
    public String toString() {
        return "Instituição=" + nome_instituicao + ",diretor=" + nome_diretor +", endereço=" + endereco + ", contato=" + contato + ", Nº=" + numero + '}';
    }
    
    

    public String getNome_instituicao() {
        return nome_instituicao;
    }

    public void setNome_instituicao(String nome_instituicao) {
        this.nome_instituicao = nome_instituicao;
    }

    public String getNome_diretor() {
        return nome_diretor;
    }

    public void setNome_diretor(String nome_diretor) {
        this.nome_diretor = nome_diretor;
    }

    public String getCpf_diretor() {
        return cpf_diretor;
    }

    public void setCpf_diretor(String cpf_diretor) {
        this.cpf_diretor = cpf_diretor;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Integer getId_direcao() {
        return id_direcao;
    }

    public void setId_direcao(Integer id_direcao) {
        this.id_direcao = id_direcao;
    }
    
    
    
    
    
    
}
