package Service;

import DAO.HabilitacaoExameDAO;
import Model.HabilitacaoExame;

import java.sql.SQLException;

public class HabilitacaoExameService {
    private HabilitacaoExameDAO habilitacaoExameDAO = new HabilitacaoExameDAO();

    public HabilitacaoExame insert(HabilitacaoExame entidade) {
        return habilitacaoExameDAO.insertHabilitacaoExame(entidade);
    }

    public HabilitacaoExame select(Integer id) {
        return habilitacaoExameDAO.selectHabilitacaoExame(id);
    }

    public void update(HabilitacaoExame habilitacaoExame) throws SQLException {
        habilitacaoExameDAO.updateHabilitacaoExame(habilitacaoExame);
    }

    public void delete(Integer id) throws SQLException {
        habilitacaoExameDAO.deleteHabilitacaoExame(id);
    }
}
