/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Diretoria;

/**
 *
 * @author Sávio
 */
public interface IBusinessDiretoria {
    
    
    public boolean salvar_diretoria (Diretoria diretoria);
    public Diretoria editar_diretoria(Diretoria diretoria);
    public Diretoria buscar_diretoria(Diretoria diretoria);
    public List getAll_diretoria();
    
}
