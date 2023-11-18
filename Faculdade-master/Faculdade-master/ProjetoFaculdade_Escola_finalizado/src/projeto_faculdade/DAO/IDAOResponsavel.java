/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;

import java.util.List;
import projeto_faculdade.Model.Responsavel;


public interface IDAOResponsavel {
     public boolean salvar_responsavel(Responsavel responsavel);
    public Responsavel editar_responsavel(Responsavel responsavel);
    public Responsavel buscar_responsavel(Responsavel responsavel);
    public List getAll_responsavel();
}
