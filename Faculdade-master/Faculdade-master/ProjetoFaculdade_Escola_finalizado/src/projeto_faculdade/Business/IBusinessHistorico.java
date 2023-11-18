/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import projeto_faculdade.Model.Historico;

/**
 *
 * @author Sávio
 */
public interface IBusinessHistorico {
    
    public boolean salvar_Historico(Historico historico);
    public Historico editar_historico(Historico historico);
    public Historico buscar_historico(Historico historico);
    
    
    
}
