/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import javax.swing.JOptionPane;
import projeto_faculdade.DAO.DAONotas;
import projeto_faculdade.DAO.IDAONotas;
import projeto_faculdade.Model.Notas;

/**
 *
 * @author Sávio
 */
public class BusinessNotas implements IBusinessNotas{
    
    private IDAONotas daoNotas;
    Notas nota;

    public BusinessNotas() {
        daoNotas = new DAONotas();
    }
   
    @Override
    public boolean salvar_notas(Notas notas) {
        
      return  daoNotas.salvar_notas(notas);
    }

    @Override
    public Notas editar_notas(Notas notas) {
        return daoNotas.editar_notas(notas);
    }

    @Override
    public List getALL_notas() {
        return daoNotas.getALL_notas();
    }

    @Override
    public Notas buscar_notas(Notas notas) {
        return daoNotas.buscar_notas(notas);
    }
     
        
    
    
}
