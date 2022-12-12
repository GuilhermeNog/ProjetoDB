package Service;

import DAO.ExameDAO;
import Model.Exame;

import java.sql.SQLException;

public class ExameService {
    private ExameDAO exameDAO = new ExameDAO();

    public Exame insert(Exame entidade) {
        return exameDAO.insertExame(entidade);
    }

    public Exame select(Integer id) {
        return exameDAO.selectExame(id);
    }

    public void update(Exame exame) throws SQLException {
        exameDAO.updateExame(exame);
    }

    public void delete(Integer id) throws SQLException {
        exameDAO.deleteExame(id);
    }
}
