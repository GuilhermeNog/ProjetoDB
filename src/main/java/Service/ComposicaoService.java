package Service;

import DAO.ComposicaoDAO;
import Model.Composicao;

import java.sql.SQLException;

public class ComposicaoService {
    private ComposicaoDAO composicaoDAO = new ComposicaoDAO();

    public Composicao insert(Composicao entidade) {
        return composicaoDAO.insertComposicao(entidade);
    }

    public Composicao select(Integer id) {
        return composicaoDAO.selectComposicao(id);
    }

    public void update(Composicao composicao) throws SQLException {
        composicaoDAO.updateComposicao(composicao);
    }

    public void delete(Integer id) throws SQLException {
        composicaoDAO.deleteComposicao(id);
    }
}
