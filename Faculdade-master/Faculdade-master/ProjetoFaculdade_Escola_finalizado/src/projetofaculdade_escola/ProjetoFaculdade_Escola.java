/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetofaculdade_escola;

import projeto_faculdade.Fachada.Fachada;
import projeto_faculdade.Model.Aluno;
import projeto_faculdade_Controller.Controller;
import projeto_faculdade_Telas.TelaAluno;
import projeto_faculdade_Telas.TelaCriarLogin;
import projeto_faculdade_Telas.TelaLogin;
import projeto_faculdade_Telas.TelaMenu;


/**
 *
 * @author Sávio
 */
public class ProjetoFaculdade_Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        TelaLogin telaLogin = new TelaLogin();
        TelaCriarLogin criarLogin = new TelaCriarLogin();
        TelaMenu telaMenu = new TelaMenu();
        TelaAluno telaAluno = new TelaAluno();
        
        
        Controller controller = new Controller(telaLogin, criarLogin, telaMenu, telaAluno);
    }
    
   
    
    
    
    
    
}
