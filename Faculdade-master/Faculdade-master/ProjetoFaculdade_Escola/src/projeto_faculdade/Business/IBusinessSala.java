/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Sala;


public interface IBusinessSala {
    
    
    public boolean salvarSala(Sala sala);
    public List getAll();
    public Sala editarSala(Sala sala);
    public Sala buscarSala(Sala sala);
    
    
}
