package Service;

import DAO.TipoExameDAO;
import Model.TipoExame;

import java.sql.SQLException;

public class TipoExameService {
    private TipoExameDAO tipoExameDAO = new TipoExameDAO();

    public TipoExame insert(TipoExame entidade) {
        return tipoExameDAO.insertTipoExame(entidade);
    }

    public TipoExame select(Integer id) {
        return tipoExameDAO.selectTipoExame(id);
    }

    public void update(TipoExame tipoExame) throws SQLException {
        tipoExameDAO.updateTipoExame(tipoExame);
    }

    public void delete(Integer id) throws SQLException {
        tipoExameDAO.deleteTipoExame(id);
    }
}
