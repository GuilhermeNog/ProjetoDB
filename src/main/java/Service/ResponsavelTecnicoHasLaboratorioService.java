package Service;

import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import Model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;

public class ResponsavelTecnicoHasLaboratorioService {
    private ResponsavelTecnicoHasLaboratorioDAO responsavelTecnicoHasLaboratorioDAO = new ResponsavelTecnicoHasLaboratorioDAO();

    public ResponsavelTecnicoHasLaboratorio insert(ResponsavelTecnicoHasLaboratorio entidade) {
        return responsavelTecnicoHasLaboratorioDAO.insertResponsavelTecnicoHasLaboratorio(entidade);
    }

    public ResponsavelTecnicoHasLaboratorio select(Integer id) {
        return responsavelTecnicoHasLaboratorioDAO.selectResponsavelTecnicoHasLaboratorio(id);
    }

    public void update(ResponsavelTecnicoHasLaboratorio responsavelTecnicoHasLaboratorio) throws SQLException {
        responsavelTecnicoHasLaboratorioDAO.updateResponsavelTecnicoHasLaboratorio(responsavelTecnicoHasLaboratorio);
    }

    public void delete(Integer id) throws SQLException {
        responsavelTecnicoHasLaboratorioDAO.deleteResponsavelTecnicoHasLaboratorio(id);
    }
}
