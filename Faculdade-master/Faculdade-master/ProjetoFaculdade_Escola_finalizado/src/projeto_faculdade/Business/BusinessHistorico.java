
package projeto_faculdade.Business;

import projeto_faculdade.DAO.DAOHistorico;
import projeto_faculdade.DAO.IDAOHistorico;
import projeto_faculdade.Model.Historico;


public class BusinessHistorico implements IBusinessHistorico{
    
    IDAOHistorico daoHistorico;

    public BusinessHistorico() {
        daoHistorico = new DAOHistorico();
    }
    
    

    @Override
    public boolean salvar_Historico(Historico historico) {
        return daoHistorico.salvar_Historico(historico);
    }

    @Override
    public Historico editar_historico(Historico historico) {
        return daoHistorico.editar_historico(historico);
    }

    @Override
    public Historico buscar_historico(Historico historico) {
        return daoHistorico.buscar_historico(historico);
    }
    
}
