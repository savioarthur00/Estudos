/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import projeto_faculdade.Exception.BusinessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import projeto_faculdade.DAO.DAOAluno;
import projeto_faculdade.DAO.IDAOAluno;
import projeto_faculdade.Model.Aluno;


public class BusinessAluno implements  IBusinessAluno{
    
    private IDAOAluno daoAluno;

    public BusinessAluno() {
        daoAluno = new DAOAluno();
    }
        
    

    @Override
    public boolean salvarEditar(Aluno aluno) {
       try {
        if(aluno.getNome().split(" ").length <=1 ){
            
                throw new BusinessException("Nome deve conter nome e sobrenome");
                
            
        }
        if(aluno.getId() == null){
			return this.daoAluno.salvar(aluno);
		}
        return this.daoAluno.salvar(aluno);
        } catch (BusinessException ex) {
                Logger.getLogger(BusinessAluno.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }        
        
    }

    @Override
    public Aluno buscarID(int id) {
        return null;
    }

    @Override
    public List getAll() {
       return null; 
    }

    @Override
    public Aluno buscarAluno(Aluno aluno) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
