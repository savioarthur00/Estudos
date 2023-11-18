/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeomega;


import Utilitarios.LimparTextField;
import Utilitarios.MaskFieldUtil;




import java.net.URL;
import java.nio.file.FileVisitResult;
import java.text.ParseException;

import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


import javax.swing.JOptionPane;

import javax.swing.text.MaskFormatter;
import projeto_faculdade.Fachada.Fachada;
import projeto_faculdade.Model.Aluno;



public class TelasAlunoController implements Initializable {
    
    Aluno aluno = new Aluno();

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;
    
    //---------------------------------------------------------------------------------------------------//
    //Tela Adicionar
    
    

    

    @FXML
    private TextField fieldCelular;

    @FXML
    private TextField fieldCidadeAluno;

    @FXML
    private TextField fieldDataAluno;

    @FXML
    private TextField fieldEmail;

    @FXML
    private TextField fieldNascionalidadeAluno;

    @FXML
    private TextField fieldNomeAluno;

    @FXML
    private TextField fieldNomeResponsavel;

    @FXML
    private TextField fieldRGAluno;

    @FXML
    private TextField fieldSexoAluno;

    

    @FXML
    private TextField fieldUFAluno;
    

     @FXML
    private TextField textFieldCPFDOALUNO;
    
   
    
    
     @FXML
    public Label LabelMensagemNome;
    @FXML
    public Label LabelMensagem;

    @FXML
    public Label LabelMensagem1;

    @FXML
    public Label LabelMensagem2;
   


    @FXML
    void AdicionarBotao(ActionEvent event) {
  
               
        Aluno aluno = new Aluno(fieldNomeAluno.getText(),textFieldCPFDOALUNO.getText(),fieldCidadeAluno.getText(),
                fieldUFAluno.getText(),fieldNascionalidadeAluno.getText(),fieldSexoAluno.getText()
                ,fieldRGAluno.getText(),fieldCelular.getText(),fieldEmail.getText(),
                fieldNomeResponsavel.getText(),fieldDataAluno.getText());
                           
       
       if(Fachada.getInstance().salvarAluno(aluno)){
           JOptionPane.showMessageDialog(null,"Aluno cadastrado com sucesso"
                   );
       }
                  
       else if(Fachada.getInstance().salvarAluno(aluno) == false){
            LabelMensagemNome.setVisible(true);
            LabelMensagem.setVisible(true);
            LabelMensagem1.setVisible(true);
            LabelMensagem2.setVisible(true);            
            
        }
          
    }

    @FXML
    void botaoMenu(ActionEvent event) {
        Aplicacao.mudarTela("menu");
    }
    // --------------------------------------------------------------------------------------------------//
    
    //Tela Buscar
    
    @FXML
    private TextField fieldCPFBusca;

    @FXML
    private TextField fieldCPFBuscar;

    @FXML
    private TextField fieldCidadeeBuscar;

    @FXML
    private TextField fieldDataBuscar;

    @FXML
    private TextField fieldNascionalidadeBuscar;

    @FXML
    private TextField fieldNomeBuscar;

    @FXML
    private TextField fieldRGBuscar;

    @FXML
    private TextField fieldSexoBuscar;

    @FXML
    private TextField fieldUFBuscar;


    @FXML
    void buttonBuscarAluno(ActionEvent event) {
         Aluno aluno = new Aluno();
        
        aluno.setPesquisa(fieldCPFBusca.getText());
        Fachada.getInstance().buscarAluno(aluno);
        
        fieldNomeBuscar.setText(aluno.getNome());
        fieldCPFBuscar.setText(aluno.getCpf());
        fieldNascionalidadeBuscar.setText(aluno.getNacionalidade());
        fieldRGBuscar.setText(aluno.getRg());
       // fieldDataBuscar.setText(aluno);
       fieldSexoBuscar.setText(aluno.getSexo());
       fieldCidadeeBuscar.setText(aluno.getCidade());
       fieldUFBuscar.setText(aluno.getUF());
       
       
       desbalitar();
       
       
        JOptionPane.showMessageDialog(null,"Encontrado");
        
    }

    @FXML
    void buttonMenuBuscar(ActionEvent event) {
         Aplicacao.mudarTela("menu");
    }

    
    //---------------------------------------------------------------------------------------------------//
    
    // TELA REMOVER
    
    
     @FXML
    private TextField fieldCPFBuscarRemover;

    @FXML
    private TextField fieldCPFRemover;

    @FXML
    private TextField fieldCidadeRemover;

    @FXML
    private TextField fieldDataRemover;

    @FXML
    private TextField fieldNacionalidadeRemover;

    @FXML
    private TextField fieldNomeRemover;

    @FXML
    private TextField fieldRGRemover;

    @FXML
    private TextField fieldSexoRemover;

    @FXML
    private TextField fieldUFRemover;


    @FXML
    void buttonBuscarRemover(ActionEvent event) {
    }

    @FXML
    void buttonMenuRemover(ActionEvent event) {
        Aplicacao.mudarTela("menu");
    }

    @FXML
    void buttonRemoverRemover(ActionEvent event) {
    }
    
    //---------------------------------------------------------------------------------------------------//
    
    //Tela Listar 
    
     @FXML
    void buttonMenuListar(ActionEvent event) {
        Aplicacao.mudarTela("menu");
        
    }
    
    //---------------------------------------------------------------------------------------------------//
    
    
    // Tela Eidtar
     @FXML
    private TextField fieldCPFBuscarEditar;
    
     @FXML
    private TextField fieldCPFEditar;

    @FXML
    private TextField fieldCidadeEditar;

    @FXML
    private TextField fieldDataEditar;

    @FXML
    private TextField fieldNacionalidadeEditar;

    @FXML
    private TextField fieldNomeEditar;

    @FXML
    private TextField fieldRGEditar;

    @FXML
    private TextField fieldSexoEditar;

    @FXML
    private TextField fieldUFEditar;
    @FXML
    private TextField fieldIDEditar;
    
    


    @FXML
    void buttonBuscarEditar(ActionEvent event) {
        
        
        
        aluno.setPesquisa(fieldCPFBuscarEditar.getText());
        Fachada.getInstance().buscarAluno(aluno);
        
        fieldIDEditar.setText(String.valueOf(aluno.getId()));
        fieldNomeEditar.setText(aluno.getNome());
        fieldCPFEditar.setText(aluno.getCpf());
        fieldNacionalidadeEditar.setText(aluno.getNacionalidade());
        fieldRGEditar.setText(aluno.getRg());
        fieldSexoEditar.setText(aluno.getSexo());
        fieldCidadeEditar.setText(aluno.getCidade());
        fieldUFEditar.setText(aluno.getUF());
        
        
                
        JOptionPane.showMessageDialog(null,"Encontrado");
    }

    @FXML
    void buttonEditarEditar(ActionEvent event) {
               
        
        
        aluno.setId(Integer.parseInt(fieldIDEditar.getText()));
        aluno.setNome(fieldNomeEditar.getText());
        aluno.setCpf(fieldCPFEditar.getText());
        aluno.setCidade(fieldCidadeEditar.getText());
        aluno.setUF(fieldUFEditar.getText());
        aluno.setNacionalidade(fieldNacionalidadeEditar.getText());
        aluno.setRg(fieldRGEditar.getText());
        aluno.setSexo(fieldSexoEditar.getText());
        Fachada.getInstance().editarAluno(aluno);
        
        fieldNomeEditar.setEditable(false);
        fieldIDEditar.setEditable(false);
        fieldNomeEditar.setEditable(false);
        fieldCPFEditar.setEditable(false);
        fieldNacionalidadeEditar.setEditable(false);
        fieldRGEditar.setEditable(false);
        fieldSexoEditar.setEditable(false);
        fieldCidadeEditar.setEditable(false);
        fieldUFEditar.setEditable(false);
        
        
        
        
        
        
        
        
        
        
    }

    @FXML
    void buttonMenuEditar(ActionEvent event) {
        Aplicacao.mudarTela("menu");
    }
    
     //---------------------------------------------------------------------------------------------------//
    
    
    
    
    public void desbalitar(){
       fieldNomeBuscar.setEditable(false);
       fieldCPFBuscar.setEditable(false);
       fieldNascionalidadeBuscar.setEditable(false);
       fieldRGBuscar.setEditable(false);
       fieldSexoBuscar.setEditable(false);
       fieldCidadeeBuscar.setEditable(false);
       fieldUFBuscar.setEditable(false);
            
       
    }
    
    
    
    
    

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
        
       // MaskFieldUtil.cpfField(fieldCPFBusca);

                    

         

        
    } 

    
    
    
    
    
  
    
}
