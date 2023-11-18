/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Notas;

/**
 *
 * @author Sávio
 */
public interface IBusinessNotas {
    
   
     public boolean salvar_notas(Notas notas);
    public Notas editar_notas(Notas notas);
    public Notas buscar_notas(Notas notas);
    public List getALL_notas();
    
    
}
