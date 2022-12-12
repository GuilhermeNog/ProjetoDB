package Service;

import DAO.ComposicaoExameDAO;
import Model.ComposicaoExame;

import java.sql.SQLException;

public class ComposicaoExameService {
    private ComposicaoExameDAO composicaoExameDAO = new ComposicaoExameDAO();

    public ComposicaoExame insert(ComposicaoExame entidade) {
        return composicaoExameDAO.insertComposicaoExame(entidade);
    }

    public ComposicaoExame select(Integer id) {
        return composicaoExameDAO.selectComposicaoExame(id);
    }

    public void update(ComposicaoExame composicaoExame) throws SQLException {
        composicaoExameDAO.updateComposicaoExame(composicaoExame);
    }

    public void delete(Integer id) throws SQLException {
        composicaoExameDAO.deleteComposicaoExame(id);
    }
}
