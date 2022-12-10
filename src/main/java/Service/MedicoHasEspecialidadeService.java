package Service;

import DAO.MedicoHasEspecialidadeDAO;
import Model.MedicoHasEspecialidade;

import java.sql.SQLException;

public class MedicoHasEspecialidadeService {
    private MedicoHasEspecialidadeDAO medicoHasEspecialidadeDAO = new MedicoHasEspecialidadeDAO();

    public MedicoHasEspecialidade insert(MedicoHasEspecialidade entidade) {
        return medicoHasEspecialidadeDAO.insertMedicoHasEspecialidade(entidade);
    }

    public MedicoHasEspecialidade select(Integer id) {
        return medicoHasEspecialidadeDAO.selectMedicoHasEspecialidade(id);
    }

    public void update(MedicoHasEspecialidade medicoHasEspecialidade) throws SQLException {
        medicoHasEspecialidadeDAO.updateMedicoHasEspecialidade(medicoHasEspecialidade);
    }

    public void delete(Integer id) throws SQLException {
        medicoHasEspecialidadeDAO.deleteMedicoHasEspecialidade(id);
    }
}
