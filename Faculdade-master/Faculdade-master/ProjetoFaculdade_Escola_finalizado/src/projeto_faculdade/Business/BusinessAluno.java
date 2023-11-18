/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import projeto_faculdade.Exception.BusinessException;
import java.util.List;

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
    public boolean salvar(Aluno aluno) {
       try {
        if(aluno.getNome().isEmpty()){
            throw new BusinessException("1");
          
                
            
        }
        if(aluno.getCpf().isEmpty()){
            
                throw new BusinessException("2");
            
        }
        if(aluno.getRg().isEmpty()){
            
                throw new BusinessException("3");
            
        }
        if(aluno.getUF().isEmpty()){
            
                throw new BusinessException("4");
            
        }
        
        
        if(aluno.getId() == null){
            
		return this.daoAluno.salvar(aluno);
		}
           
        return this.daoAluno.salvar(aluno);
        } catch (BusinessException ex) {
                Logger.getLogger("Erro ao cadastrar");
                 
                
            }        
        return false;
    }

    @Override
    public Aluno buscarID(int id) {
        return null;
    }

    @Override
    public List getAll() {
       return this.daoAluno.getAll(); 
    }

    @Override
    public Aluno buscarAluno(Aluno aluno) {
          return this.daoAluno.buscarAluno(aluno);
        
    }

    @Override
    public Aluno editarAluno(Aluno aluno) {
        return this.daoAluno.editar(aluno);
    }

    @Override
    public boolean excluir(Aluno aluno) {
        return this.daoAluno.excluir(aluno);
    }
    
    
    
}
