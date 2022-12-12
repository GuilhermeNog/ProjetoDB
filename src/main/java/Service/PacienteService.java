package Service;

import DAO.PacienteDAO;
import Model.Paciente;

import java.sql.SQLException;

public class PacienteService {
    private PacienteDAO pacienteDAO = new PacienteDAO();

    public Paciente insert(Paciente entidade) {
        return pacienteDAO.insertPaciente(entidade);
    }

    public Paciente select(Integer id) {
        return pacienteDAO.selectPaciente(id);
    }

    public void update(Paciente paciente) throws SQLException {
        pacienteDAO.updatePaciente(paciente);
    }

    public void delete(Integer id) throws SQLException {
        pacienteDAO.deletePaciente(id);
    }
}
