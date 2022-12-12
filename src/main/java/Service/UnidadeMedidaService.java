package Service;

import DAO.UnidadeMedidaDAO;
import Model.UnidadeMedida;

import java.sql.SQLException;

public class UnidadeMedidaService {
    private UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();

    public UnidadeMedida insert(UnidadeMedida entidade) {
        return unidadeMedidaDAO.insertUnidadeMedida(entidade);
    }

    public UnidadeMedida select(Integer id) {
        return unidadeMedidaDAO.selectUnidadeMedida(id);
    }

    public void update(UnidadeMedida unidadeMedida) throws SQLException {
        unidadeMedidaDAO.updateUnidadeMedida(unidadeMedida);
    }

    public void delete(Integer id) throws SQLException {
        unidadeMedidaDAO.deleteUnidadeMedida(id);
    }
}
