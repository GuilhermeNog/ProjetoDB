package Service;

import DAO.EspecialidadeDAO;
import Model.Especialidade;

import java.sql.SQLException;

public class EspecialidadeService {
    private EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

    public Especialidade insert(Especialidade entidade) {
        return especialidadeDAO.insertEspecialidade(entidade);
    }

    public Especialidade select(Integer id) {
        return especialidadeDAO.selectEspecialidade(id);
    }

    public void update(Especialidade especialidade) throws SQLException {
        especialidadeDAO.updateEspecialidade(especialidade);
    }

    public void delete(Integer id) throws SQLException {
        especialidadeDAO.deleteEspecialidade(id);
    }
}
