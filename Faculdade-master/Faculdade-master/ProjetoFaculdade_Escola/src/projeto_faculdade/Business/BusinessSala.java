/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.DAO.DAOSala;
import projeto_faculdade.DAO.IDAOSala;
import projeto_faculdade.Model.Sala;


public class BusinessSala implements IBusinessSala{
    
    private IDAOSala daoSala;

    public BusinessSala() {
        daoSala = new DAOSala();
    }
    
    

    @Override
    public boolean salvarSala(Sala sala) {
        return daoSala.salvarSala(sala);
    }

    @Override
    public List getAll() {
        return daoSala.getAll();
    }

    @Override
    public Sala editarSala(Sala sala) {
        return daoSala.editarSala(sala);
    }

    @Override
    public Sala buscarSala(Sala sala) {
       return daoSala.buscarSala(sala);
    }
    
    
    
}
