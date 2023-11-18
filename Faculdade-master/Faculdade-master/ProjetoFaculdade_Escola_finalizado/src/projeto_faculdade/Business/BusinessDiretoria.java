/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.DAO.DaoDiretoria;
import projeto_faculdade.DAO.IDAODiretoria;
import projeto_faculdade.Model.Diretoria;

/**
 *
 * @author Sávio
 */
public class BusinessDiretoria implements IBusinessDiretoria{

    private IDAODiretoria daoDiretoria;

    public BusinessDiretoria() {
        daoDiretoria = new DaoDiretoria();
    }

    
    
    
    @Override
    public boolean salvar_diretoria(Diretoria diretoria) {
        return daoDiretoria.salvar_diretoria(diretoria);
    }

    @Override
    public Diretoria editar_diretoria(Diretoria diretoria) {
        return daoDiretoria.editar_diretoria(diretoria);
    }

    @Override
    public List getAll_diretoria() {
        return daoDiretoria.getAll_diretoria();
    }

    
    @Override
    public Diretoria buscar_diretoria(Diretoria diretoria) {
        return daoDiretoria.buscar_diretoria(diretoria);
    }
    
   
    
    
}
