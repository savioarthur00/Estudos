/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import projeto_faculdade.Model.Usuario;


public interface IBusinessUsuario {
    
    public boolean salvarEditar(Usuario usuario);   
    public Usuario buscarID(int id);
    public List getAll();
    public Usuario buscarUsuario(Usuario usuario);
    
}
