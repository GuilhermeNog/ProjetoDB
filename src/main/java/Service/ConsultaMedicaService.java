package Service;


import DAO.ConsultaMedicaDAO;
import Model.ConsultaMedica;

import java.sql.SQLException;

public class ConsultaMedicaService {
    private ConsultaMedicaDAO consultaMedicaDAO = new ConsultaMedicaDAO();

    public ConsultaMedica insert(ConsultaMedica entidade) {
        return consultaMedicaDAO.insertConsultaMedica(entidade);
    }

    public ConsultaMedica select(Integer id) {
        return consultaMedicaDAO.selectConsultaMedica(id);
    }

    public void update(ConsultaMedica consultaMedica) throws SQLException {
        consultaMedicaDAO.updateConsultaMedica(consultaMedica);
    }

    public void delete(Integer id) throws SQLException {
        consultaMedicaDAO.deleteConsultaMedica(id);
    }
}
