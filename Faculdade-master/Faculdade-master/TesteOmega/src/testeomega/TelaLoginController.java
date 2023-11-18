/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeomega;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

import javafx.fxml.Initializable;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;
import projeto_faculdade.Fachada.Fachada;
import projeto_faculdade.Model.Usuario;

/**
 *
 * @author Sávio
 */
public class TelaLoginController implements Initializable {
    
    @FXML
    private Label label;
    
      @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
   
    
    //---------------------------------------------//
    //Botões LOGIN

     @FXML
    private TextField TextFieldSenha;    
    @FXML
    private TextField textFieldLogin;  

    @FXML
    void botaoEntrar(ActionEvent event) throws IOException {
        Aplicacao.mudarTela("menu");
        
        
    }
    @FXML
    void botaocriarlogin(ActionEvent event) {
        Aplicacao.mudarTela("Criar");
    }
    
    //---------------------------------------------//
    //Botões do menu
    @FXML
    void BuscarButton(ActionEvent event) {
        Aplicacao.mudarTela("buscar");              
    }
    @FXML
    void CadastrarButton(ActionEvent event) {
        Aplicacao.mudarTela("cadastro");
    }
    @FXML
    void EditarButton(ActionEvent event) {
        Aplicacao.mudarTela("editar");
    }
    @FXML
    void RemoverButton(ActionEvent event) {
        Aplicacao.mudarTela("remover");
    }
    @FXML
    void SairButton(ActionEvent event) {
        System.exit(0);
    }
     @FXML
    void ListarButton(ActionEvent event) {
        Aplicacao.mudarTela("listar");
    }
     @FXML
    void ButtonDadosLogin(ActionEvent event) {
    }
    
    
    // -----------------------------------------------------//
    
    
     @FXML
    private TextField fieldLoginCriarLogin;

    @FXML
    private TextField fieldNomeCriarLogin;

    @FXML
    private TextField fieldSenhaCriarLogin;
    
    
     @FXML
    private Label LabelMensagem01;

    @FXML
    private Label LabelMensagem02;

    @FXML
    private Label LabelMensagem03;


    @FXML
    void buttonCriarLogin(ActionEvent event) {
        
        Usuario usuario = new Usuario(fieldNomeCriarLogin.getText(),fieldLoginCriarLogin.getText(),
                fieldSenhaCriarLogin.getText());
        
        if(Fachada.getInstance().salvar(usuario)){
           
        }
        else{
            LabelMensagem01.setVisible(true);
            LabelMensagem02.setVisible(true);
            LabelMensagem03.setVisible(true);

        }
        
        
        
        
    }

    @FXML
    void buttonVoltarLogin(ActionEvent event) {
        Aplicacao.mudarTela("Login");
    }
    
    
    
    // -----------------------------------------------------//
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }    
    
}
