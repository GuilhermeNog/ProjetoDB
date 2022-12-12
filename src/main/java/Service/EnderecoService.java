package Service;

import DAO.EnderecoDAO;
import Model.Endereco;

import java.sql.SQLException;

public class EnderecoService {
    private EnderecoDAO enderecoDAO = new EnderecoDAO();

    public Endereco insert(Endereco entidade) {
        return enderecoDAO.insertEndereco(entidade);
    }

    public Endereco select(Integer id) {
        return enderecoDAO.selectEndereco(id);
    }

    public void update(Endereco endereco) throws SQLException {
        enderecoDAO.updateEndereco(endereco);
    }

    public void delete(Integer id) throws SQLException {
        enderecoDAO.deleteEndereco(id);
    }
}
