package Service;

import DAO.SiglaFormacaoDAO;
import Model.SiglaFormacao;

import java.sql.SQLException;

public class SiglaFormacaoService {
    private SiglaFormacaoDAO siglaFormacaoDAO = new SiglaFormacaoDAO();

    public SiglaFormacao insert(SiglaFormacao entidade) {
        return siglaFormacaoDAO.insertSiglaFormacao(entidade);
    }

    public SiglaFormacao select(Integer id) {
        return siglaFormacaoDAO.selectSiglaFormacao(id);
    }

    public void update(SiglaFormacao siglaFormacao) throws SQLException {
        siglaFormacaoDAO.updateSiglaFormacao(siglaFormacao);
    }

    public void delete(Integer id) throws SQLException {
        siglaFormacaoDAO.deleteSiglaFormacao(id);
    }
}
