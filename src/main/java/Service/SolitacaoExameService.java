package Service;

import DAO.SolicitacaoExameDAO;
import Model.SolicitacaoExame;

import java.sql.SQLException;

public class SolitacaoExameService {
    private SolicitacaoExameDAO solicitacaoExameDAO = new SolicitacaoExameDAO();

    public SolicitacaoExame insert(SolicitacaoExame entidade) {
        return solicitacaoExameDAO.insertSolicitacaoExame(entidade);
    }

    public SolicitacaoExame select(Integer id) {
        return solicitacaoExameDAO.selectSolicitacaoExame(id);
    }

    public void update(SolicitacaoExame solicitacaoExame) throws SQLException {
        solicitacaoExameDAO.updateSolicitacaoExame(solicitacaoExame);
    }

    public void delete(Integer id) throws SQLException {
        solicitacaoExameDAO.deleteSolicitacaoExame(id);
    }
}
