/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testeomega;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 *
 * @author Sávio
 */
public class Aplicacao extends Application {
   
    private static Stage stage;
    
    public static Scene loginScene;
    public static Scene menuScene;
    public static Scene CadastroScene;
    public static Scene BuscarScene;
    public static Scene CriarScene;
    public static Scene RemoverScene;
    public static Scene ListarScene;
    public static Scene EditarScene;
   
    
    @Override
    public void start(Stage primaryStage) throws Exception {
        stage = primaryStage;
        
        Parent root = FXMLLoader.load(getClass().getResource("TelaLogin.fxml"));
        loginScene = new Scene(root);
        
        Parent root2 = FXMLLoader.load(getClass().getResource("TelaMenu.fxml"));        
        menuScene = new Scene(root2);
        
        Parent root3 = FXMLLoader.load(getClass().getResource("TelaCadastrarAluno.fxml"));    
        CadastroScene =  new Scene(root3);        
        
        Parent root4 = FXMLLoader.load(getClass().getResource("TelaBuscar.fxml"));    
        BuscarScene =  new Scene(root4);
        
        Parent root5 = FXMLLoader.load(getClass().getResource("TelaCriarLogin.fxml"));    
        CriarScene =  new Scene(root5);
        
        Parent root6 = FXMLLoader.load(getClass().getResource("TelaRemoverAluno.fxml"));    
        RemoverScene =  new Scene(root6);
        
        Parent root7 = FXMLLoader.load(getClass().getResource("TelaListarAlunos.fxml"));    
        ListarScene =  new Scene(root7);
        
        Parent root8 = FXMLLoader.load(getClass().getResource("TelaEditarAluno.fxml"));    
        EditarScene =  new Scene(root8);
        
        primaryStage.setScene(loginScene);
        primaryStage.show();
    }

    public static void mudarTela(String nome){
        
        switch(nome){
            case "Login":
                stage.setScene(loginScene);
                break;
            case "menu":
                stage.setScene(menuScene);
                break;
            case "cadastro":
                stage.setScene(CadastroScene);
                break;
            case "buscar":
                stage.setScene(BuscarScene);
                break;
            case "Criar":
                stage.setScene(CriarScene);
                break;
            case "remover":
                stage.setScene(RemoverScene);
                break;
            case "listar":
                stage.setScene(ListarScene);
                break;
            case "editar":
                stage.setScene(EditarScene);
                break;
            
            
        }
        
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }
    
}
