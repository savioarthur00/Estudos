/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.DAO.DAOResponsavel;

import projeto_faculdade.DAO.IDAOResponsavel;
import projeto_faculdade.Model.Responsavel;


public class BusinessResponsavel implements IBusinessResponsavel{
    
    IDAOResponsavel daoResponsavel;

    public BusinessResponsavel() {
        daoResponsavel = new DAOResponsavel();
    }
    
    

    @Override
    public boolean salvar_responsavel(Responsavel responsavel) {
        return daoResponsavel.salvar_responsavel(responsavel);
    }

    @Override
    public Responsavel editar_responsavel(Responsavel responsavel) {
        return daoResponsavel.editar_responsavel(responsavel);
    }

    @Override
    public Responsavel buscar_responsavel(Responsavel responsavel) {
     return daoResponsavel.buscar_responsavel(responsavel);
    }
    @Override
    public List getAll_responsavel() {
     return daoResponsavel.getAll_responsavel();
    }
    
    
    
    
    
}
