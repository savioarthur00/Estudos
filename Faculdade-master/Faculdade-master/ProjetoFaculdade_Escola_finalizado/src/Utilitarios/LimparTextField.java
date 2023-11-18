/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utilitarios;

import java.awt.Component;
import javax.swing.JFrame;

import javax.swing.JTextField;


public class LimparTextField {
    
    public void LimpaTela(JFrame Frame) {     
            //limpa os campos     
            for (int i=0; i < Frame.getContentPane().getComponentCount(); i++) {   
                //varre todos os componentes     
                Component c = Frame.getContentPane().getComponent(i);     
                if (c instanceof JTextField) {                           
                    JTextField field = (JTextField) c;   
                    field.setText("");                      
                    }   
                }   
            }  
    
}
