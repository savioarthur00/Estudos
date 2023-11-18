/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Exception;

import javax.swing.JOptionPane;
import testeomega.TelasAlunoController;

/**
 *
 * @author Sávio
 */
public class BusinessException extends Exception {

    TelasAlunoController alunoController;
    
   public BusinessException(String txt){
		    // JOptionPane.showMessageDialog(null, txt);
	}
    
}
