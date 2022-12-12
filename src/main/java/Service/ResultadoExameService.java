package Service;

import DAO.ResultadoExameDAO;
import Model.ResultadoExame;

import java.sql.SQLException;

public class ResultadoExameService {
    private ResultadoExameDAO resultadoExameDAO = new ResultadoExameDAO();

    public ResultadoExame insert(ResultadoExame entidade) {
        return resultadoExameDAO.insertResultadoExame(entidade);
    }

    public ResultadoExame select(Integer id) {
        return resultadoExameDAO.selectResultadoExame(id);
    }

    public void update(ResultadoExame resultadoExame) throws SQLException {
        resultadoExameDAO.updateResultadoExame(resultadoExame);
    }

    public void delete(Integer id) throws SQLException {
        resultadoExameDAO.deleteResultadoExame(id);
    }
}
