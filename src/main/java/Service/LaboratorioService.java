package Service;

import DAO.LaboratorioDAO;
import Model.Laboratorio;

import java.sql.SQLException;

public class LaboratorioService {

    private LaboratorioDAO laboratorioDAO = new LaboratorioDAO();

    public Laboratorio insert(Laboratorio entidade) {
        return laboratorioDAO.insertLaboratorio(entidade);
    }

    public Laboratorio select(Integer id) {
        return laboratorioDAO.selectLaboratorio(id);
    }

    public void update(Laboratorio laboratorio) throws SQLException {
        laboratorioDAO.updateLaboratorio(laboratorio);
    }

    public void delete(Integer id) throws SQLException {
        laboratorioDAO.deleteLaboratorio(id);
    }
}
