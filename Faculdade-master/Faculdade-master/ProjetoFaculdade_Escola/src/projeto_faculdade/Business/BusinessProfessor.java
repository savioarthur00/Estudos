/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_faculdade.Business;

import java.util.List;
import java.util.logging.Logger;
import projeto_faculdade.DAO.DAOProfessor;

import projeto_faculdade.DAO.IDAOProfessor;

import projeto_faculdade.Model.Professor;

/**
 *
 * @author Sávio
 */
public class BusinessProfessor implements IBusinessProfessor{

    private IDAOProfessor daoProfessor;

    public BusinessProfessor() {
        daoProfessor = new DAOProfessor();
    }
    
    
    
    
    @Override
    public boolean salvarProfessor(Professor professor) {
        try {
            return this.daoProfessor.salvarProfessor(professor);
        } catch (Exception e) {
             Logger.getLogger("Erro ao cadastrar");
        }
        return false;
    }

    @Override
    public List getAll() {
        return daoProfessor.getAllProfessor();
    }

    @Override
    public Professor buscarProfessor(Professor professor) {
       return daoProfessor.buscarProfessor(professor);
    }

    @Override
    public Professor editarProfessor(Professor professor) {
    return daoProfessor.editar(professor);
    }

   

    
}
