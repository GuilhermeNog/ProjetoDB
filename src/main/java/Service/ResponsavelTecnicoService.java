package Service;

import DAO.ResponsavelTecnicoDAO;
import Model.ResponsavelTecnico;

import java.sql.SQLException;

public class ResponsavelTecnicoService {
    private ResponsavelTecnicoDAO responsavelTecnicoDAO = new ResponsavelTecnicoDAO();

    public ResponsavelTecnico insert(ResponsavelTecnico entidade) {
        return responsavelTecnicoDAO.insertResponsavelTecnico(entidade);
    }

    public ResponsavelTecnico select(Integer id) {
        return responsavelTecnicoDAO.selectResponsavelTecnico(id);
    }

    public void update(ResponsavelTecnico responsavelTecnico) throws SQLException {
        responsavelTecnicoDAO.updateResponsavelTecnico(responsavelTecnico);
    }

    public void delete(Integer id) throws SQLException {
        responsavelTecnicoDAO.deleteResponsavelTecnico(id);
    }
}
