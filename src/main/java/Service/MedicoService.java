package Service;

import DAO.MedicoDAO;
import Model.Medico;

import java.sql.SQLException;

public class MedicoService {
    private MedicoDAO medicoDAO = new MedicoDAO();

    public Medico insert(Medico entidade) {
        return medicoDAO.insertMedico(entidade);
    }

    public Medico select(Integer id) {
        return medicoDAO.selectMedico(id);
    }

    public void update(Medico medico) throws SQLException {
        medicoDAO.updateMedico(medico);
    }

    public void delete(Integer id) throws SQLException {
        medicoDAO.deleteMedico(id);
    }
}
