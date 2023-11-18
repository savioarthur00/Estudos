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
public class Notas {
    private String nome;
    Aluno aluno;
    private String portugues_5;
    private String portugues_6;
    private String portugues_7;
    private String portugues_8;
    
    private String matematica_5;
    private String matematica_6;
    private String matematica_7;
    private String matematica_8;
    
     private String historia_5;
     private String historia_6;
     private String historia_7;
     private String historia_8;
     
     
     private String geografia_5;
     private String geografia_6;
     private String geografia_7;
     private String geografia_8;
     
     
     private String Arte_5;
     private String Arte_6;
     private String Arte_7; 
     private String Arte_8;
     
     private String ciencia_5;
     private String ciencia_6;
     private String ciencia_7; 
     private String ciencia_8;
     
    private String pesquisa;
       
  
     private Integer id;

    public Notas(String nome, Aluno aluno, String portugues_5, String portugues_6, String portugues_7, String portugues_8, String matematica_5, String matematica_6, String matematica_7, String matematica_8, String historia_5, String historia_6, String historia_7, String historia_8, String geografia_5, String geografia_6, String geografia_7, String geografia_8, String Arte_5, String Arte_6, String Arte_7, String Arte_8, String ciencia_5, String ciencia_6, String ciencia_7, String ciencia_8) {
        this.nome = nome;
        this.aluno = aluno;
        this.portugues_5 = portugues_5;
        this.portugues_6 = portugues_6;
        this.portugues_7 = portugues_7;
        this.portugues_8 = portugues_8;
        this.matematica_5 = matematica_5;
        this.matematica_6 = matematica_6;
        this.matematica_7 = matematica_7;
        this.matematica_8 = matematica_8;
        this.historia_5 = historia_5;
        this.historia_6 = historia_6;
        this.historia_7 = historia_7;
        this.historia_8 = historia_8;
        this.geografia_5 = geografia_5;
        this.geografia_6 = geografia_6;
        this.geografia_7 = geografia_7;
        this.geografia_8 = geografia_8;
        this.Arte_5 = Arte_5;
        this.Arte_6 = Arte_6;
        this.Arte_7 = Arte_7;
        this.Arte_8 = Arte_8;
        this.ciencia_5 = ciencia_5;
        this.ciencia_6 = ciencia_6;
        this.ciencia_7 = ciencia_7;
        this.ciencia_8 = ciencia_8;
    }

     
     
    public Notas() {
    }

    

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

   

    
    
    
    

    public String getPortugues_5() {
        return portugues_5;
    }

    public void setPortugues_5(String portugues_5) {
        this.portugues_5 = portugues_5;
    }

    public String getPortugues_6() {
        return portugues_6;
    }

    public void setPortugues_6(String portugues_6) {
        this.portugues_6 = portugues_6;
    }

    public String getPortugues_7() {
        return portugues_7;
    }

    public void setPortugues_7(String portugues_7) {
        this.portugues_7 = portugues_7;
    }

    public String getPortugues_8() {
        return portugues_8;
    }

    public void setPortugues_8(String portugues_8) {
        this.portugues_8 = portugues_8;
    }

    public String getMatematica_5() {
        return matematica_5;
    }

    public void setMatematica_5(String matematica_5) {
        this.matematica_5 = matematica_5;
    }

    public String getMatematica_6() {
        return matematica_6;
    }

    public void setMatematica_6(String matematica_6) {
        this.matematica_6 = matematica_6;
    }

    public String getMatematica_7() {
        return matematica_7;
    }

    public void setMatematica_7(String matematica_7) {
        this.matematica_7 = matematica_7;
    }

    public String getMatematica_8() {
        return matematica_8;
    }

    public void setMatematica_8(String matematica_8) {
        this.matematica_8 = matematica_8;
    }

    public String getHistoria_5() {
        return historia_5;
    }

    public void setHistoria_5(String historia_5) {
        this.historia_5 = historia_5;
    }

    public String getHistoria_6() {
        return historia_6;
    }

    public void setHistoria_6(String historia_6) {
        this.historia_6 = historia_6;
    }

    public String getHistoria_7() {
        return historia_7;
    }

    public void setHistoria_7(String historia_7) {
        this.historia_7 = historia_7;
    }

    public String getHistoria_8() {
        return historia_8;
    }

    public void setHistoria_8(String historia_8) {
        this.historia_8 = historia_8;
    }

    public String getGeografia_5() {
        return geografia_5;
    }

    public void setGeografia_5(String geografia_5) {
        this.geografia_5 = geografia_5;
    }

    public String getGeografia_6() {
        return geografia_6;
    }

    public void setGeografia_6(String geografia_6) {
        this.geografia_6 = geografia_6;
    }

    public String getGeografia_7() {
        return geografia_7;
    }

    public void setGeografia_7(String geografia_7) {
        this.geografia_7 = geografia_7;
    }

    public String getGeografia_8() {
        return geografia_8;
    }

    public void setGeografia_8(String geografia_8) {
        this.geografia_8 = geografia_8;
    }

    public String getArte_5() {
        return Arte_5;
    }

    public void setArte_5(String Arte_5) {
        this.Arte_5 = Arte_5;
    }

    public String getArte_6() {
        return Arte_6;
    }

    public void setArte_6(String Arte_6) {
        this.Arte_6 = Arte_6;
    }

    public String getArte_7() {
        return Arte_7;
    }

    public void setArte_7(String Arte_7) {
        this.Arte_7 = Arte_7;
    }

    public String getArte_8() {
        return Arte_8;
    }

    public void setArte_8(String Arte_8) {
        this.Arte_8 = Arte_8;
    }

    public String getCiencia_5() {
        return ciencia_5;
    }

    public void setCiencia_5(String ciencia_5) {
        this.ciencia_5 = ciencia_5;
    }

    public String getCiencia_6() {
        return ciencia_6;
    }

    public void setCiencia_6(String ciencia_6) {
        this.ciencia_6 = ciencia_6;
    }

    public String getCiencia_7() {
        return ciencia_7;
    }

    public void setCiencia_7(String ciencia_7) {
        this.ciencia_7 = ciencia_7;
    }

    public String getCiencia_8() {
        return ciencia_8;
    }

    public void setCiencia_8(String ciencia_8) {
        this.ciencia_8 = ciencia_8;
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

    @Override
    public String toString() {
        return "Notas{" + "Notas do aluno de ID =" + aluno.getId() + ", portugues_5=" + portugues_5 + ", portugues_6=" + portugues_6 + ", portugues_7=" + portugues_7 + ", portugues_8=" + portugues_8 + ", matematica_5=" + matematica_5 + ", matematica_6=" + matematica_6 + ", matematica_7=" + matematica_7 + ", matematica_8=" + matematica_8 + ", historia_5=" + historia_5 + ", historia_6=" + historia_6 + ", historia_7=" + historia_7 + ", historia_8=" + historia_8 + ", geografia_5=" + geografia_5 + ", geografia_6=" + geografia_6 + ", geografia_7=" + geografia_7 + ", geografia_8=" + geografia_8 + ", Arte_5=" + Arte_5 + ", Arte_6=" + Arte_6 + ", Arte_7=" + Arte_7 + ", Arte_8=" + Arte_8 + ", ciencia_5=" + ciencia_5 + ", ciencia_6=" + ciencia_6 + ", ciencia_7=" + ciencia_7 + ", ciencia_8=" + ciencia_8 + ", pesquisa=" + pesquisa + ", id=" + id + '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    

    

    

    

   
    
    
    
}
