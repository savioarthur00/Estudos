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
public class Responsavel {
    
    private String nome_responsavel;
    private String cpf_1responsavel;
    private String telefone;
    private String email;
    private String celular;

    public Responsavel(String nome_responsavel, String cpf_1responsavel, String telefone, String email, String celular) {
        this.nome_responsavel = nome_responsavel;
        this.cpf_1responsavel = cpf_1responsavel;
        this.telefone = telefone;
        this.email = email;
        this.celular = celular;
    }


    public String getNome_responsavel() {
        return nome_responsavel;
    }

    public void setNome_responsavel(String nome_responsavel) {
        this.nome_responsavel = nome_responsavel;
    }

    public String getCpf_1responsavel() {
        return cpf_1responsavel;
    }

    public void setCpf_1responsavel(String cpf_1responsavel) {
        this.cpf_1responsavel = cpf_1responsavel;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
    
    
}
