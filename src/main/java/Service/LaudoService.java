package Service;

import DAO.LaudoDAO;
import Model.Laudo;

import java.sql.SQLException;

public class LaudoService {
    private LaudoDAO laudoDAO = new LaudoDAO();

    public Laudo insert(Laudo entidade) {
        return laudoDAO.insertLaudo(entidade);
    }

    public Laudo select(Integer id) {
        return laudoDAO.selectLaudo(id);
    }

    public void update(Laudo laudo) throws SQLException {
        laudoDAO.updateLaudo(laudo);
    }

    public void delete(Integer id) throws SQLException {
        laudoDAO.deleteLaudo(id);
    }
}
