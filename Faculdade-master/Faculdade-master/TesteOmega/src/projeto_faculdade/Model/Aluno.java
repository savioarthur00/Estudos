/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Model;


public class Aluno{
    
    private Integer id;
    private String nome;
    private String cpf;   
    private String cidade;
    private String UF;    
    private String nacionalidade;
    private String sexo;
    private String Rg;
    private String celular;
    private String email;
    private String nome_res;
    
    
    
    
    private String Data;
    
   
    private String pesquisa;

    public Aluno(String nome, String cpf, String cidade, String UF, String nacionalidade, String sexo, String Rg, String celular, String email, String nome_res, String Data) {
        this.nome = nome;
        this.cpf = cpf;
        this.cidade = cidade;
        this.UF = UF;
        this.nacionalidade = nacionalidade;
        this.sexo = sexo;
        this.Rg = Rg;
        this.celular = celular;
        this.email = email;
        this.nome_res = nome_res;
        this.Data = Data;
    }

    
    

    

    public Aluno(){
    }
 

   
    

   

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

   
    public String getRg() {
        return Rg;
    }

    public void setRg(String Rg) {
        this.Rg = Rg;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    
    
    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome_res() {
        return nome_res;
    }

    public void setNome_res(String nome_res) {
        this.nome_res = nome_res;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    
    
    
}
