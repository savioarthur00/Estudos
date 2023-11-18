/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.DAO;


import java.util.List;
import projeto_faculdade.Model.Usuario;


public interface IDaoUsuario {
    
    public boolean salvar(Usuario usuario);
    public boolean editar(Usuario usuario);
    public Usuario buscarID(int id);
    public Usuario buscar_Usuario(Usuario usuario);
    public List getAll();
    
}
