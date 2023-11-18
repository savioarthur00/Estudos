/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Responsavel;

/**
 *
 * @author Sávio
 */
public interface IBusinessResponsavel {
    
    public boolean salvar_responsavel(Responsavel responsavel);
    public Responsavel editar_responsavel(Responsavel responsavel);
    public Responsavel buscar_responsavel(Responsavel responsavel);
    public List getAll_responsavel();
    
}
