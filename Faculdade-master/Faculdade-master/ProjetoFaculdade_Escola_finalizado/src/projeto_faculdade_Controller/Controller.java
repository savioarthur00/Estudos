/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade_Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import projeto_faculdade_Telas.TelaAluno;
import projeto_faculdade_Telas.TelaCriarLogin;
import projeto_faculdade_Telas.TelaLogin;
import projeto_faculdade_Telas.TelaMenu;


public class Controller implements ActionListener{
    
    TelaLogin telaLogin;
    TelaCriarLogin criarLogin;
    TelaMenu telaMenu;
    TelaAluno telaAluno;
    

    public Controller(TelaLogin telaLogin, TelaCriarLogin criarLogin, TelaMenu telaMenu, TelaAluno telaAluno) {
        this.telaLogin = telaLogin;
        this.criarLogin = criarLogin;
        this.telaMenu = telaMenu;
        this.telaAluno = telaAluno;
        
        telaLogin.setVisible(true);
        botoes();
                
    }
    
    public void botoes(){
        
        telaLogin.getButtonEntrar().addActionListener(this);
        telaLogin.getButtonCriarLogin().addActionListener(this);
        
        
        
    }
    


    @Override
    public void actionPerformed(ActionEvent e) {
       
        if(e.getSource() == telaLogin.getButtonCriarLogin()){
            telaLogin.setVisible(false);
        }
        if(e.getSource() == telaLogin.getButtonEntrar()){
            telaLogin.setVisible(false);
        }
    }

    
    public TelaLogin getTelaLogin() {
        return telaLogin;
    }

    public void setTelaLogin(TelaLogin telaLogin) {
        this.telaLogin = telaLogin;
    }

    public TelaCriarLogin getCriarLogin() {
        return criarLogin;
    }

    public void setCriarLogin(TelaCriarLogin criarLogin) {
        this.criarLogin = criarLogin;
    }

    public TelaMenu getTelaMenu() {
        return telaMenu;
    }

    public void setTelaMenu(TelaMenu telaMenu) {
        this.telaMenu = telaMenu;
    }

    public TelaAluno getTelaAluno() {
        return telaAluno;
    }

    public void setTelaAluno(TelaAluno telaAluno) {
        this.telaAluno = telaAluno;
    }

    

    
    
    
   
    
    
}
