
package projeto_faculdade.Business;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_faculdade.DAO.DAOUsuario;
import projeto_faculdade.DAO.IDaoUsuario;
import projeto_faculdade.Exception.BusinessException;
import projeto_faculdade.Model.Usuario;


public class BusinessUsuario implements IBusinessUsuario{
    
    
     private IDaoUsuario daoUsuario;

    public BusinessUsuario() {
        daoUsuario = new DAOUsuario();
    }
        

    @Override
    public boolean salvar(Usuario usuario) {
       try {
        if(usuario.getNome().isEmpty()){
            
                throw new BusinessException("");
            
        }
        if(usuario.getLogin().isEmpty()){
            
                throw new BusinessException("");
            
        }
         if(usuario.getSenha().isEmpty()){
            
                throw new BusinessException("");
            
        }
        if(usuario.getId() == null){
			return this.daoUsuario.salvar(usuario);
        }
        return this.daoUsuario.salvar(usuario);
        } catch (BusinessException ex) {
                
                return false;
            }        
    }

    @Override
    public Usuario buscarID(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Usuario buscarUsuario(Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
