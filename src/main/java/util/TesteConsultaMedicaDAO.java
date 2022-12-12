package util;

import DAO.ConsultaMedicaDAO;
import Model.ConsultaMedica;
import Service.ConsultaMedicaService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TesteConsultaMedicaDAO {
    static ConsultaMedicaDAO consultaMedicaDAO = new ConsultaMedicaDAO();

    static ConsultaMedicaService consultaMedicaService = new ConsultaMedicaService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(consultaMedicaDAO.count());

        //salvar
        ConsultaMedica consultaMedica = new ConsultaMedica(1, new Date(2022, 1, 12), 1, 1, "teste nm_atendimento");
        consultaMedicaService.insert(consultaMedica);

        //buscar por ID
        consultaMedica = consultaMedicaDAO.selectConsultaMedica(2);
        System.out.println(consultaMedica);

        //Update
//        consultaMedica.setDt_consulta(new Date(2023, 2, 26));
//        consultaMedica.setMedico_id(1);
//        consultaMedica.setPaciente_id(1);
//        consultaMedica.setNm_atendimento("teste");
//        consultaMedicaDAO.updateConsultaMedica(consultaMedica);
//        consultaMedica = consultaMedicaDAO.selectConsultaMedica(2);
//        System.out.println(consultaMedica);

        //Select all
        List<ConsultaMedica> consultaMedicas = consultaMedicaDAO.selectAllConsultaMedica();
        consultaMedicas.forEach(System.out::println);

        //Delete
        consultaMedicaDAO.deleteConsultaMedica(2);

        consultaMedicaDAO.selectAllConsultaMedica().forEach(System.out::println);
    }
}
