package Service;

import DAO.ContatoDAO;
import Model.Contato;

import java.sql.SQLException;

public class ContatoService {
    private ContatoDAO contatoDAO = new ContatoDAO();

    public Contato insert(Contato entidade) {
        return contatoDAO.insertContato(entidade);
    }

    public Contato select(Integer id) {
        return contatoDAO.selectContato(id);
    }

    public void update(Contato contato) throws SQLException {
        contatoDAO.updateContato(contato);
    }

    public void delete(Integer id) throws SQLException {
        contatoDAO.deleteContato(id);
    }
}
