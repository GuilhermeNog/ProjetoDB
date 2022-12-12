package util;

import DAO.PacienteDAO;
import Model.Paciente;
import Service.PacienteService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TestePacienteDAO {
    static PacienteDAO pacienteDAO = new PacienteDAO();

    static PacienteService pacienteService = new PacienteService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(pacienteDAO.count());

        //salvar
        Paciente paciente = new Paciente(1, "teste nome", new Date(2022, 1, 12));
        pacienteService.insert(paciente);

        //buscar por ID
        paciente = pacienteDAO.selectPaciente(2);
        System.out.println(paciente);

        //Update
//        paciente.setNome("teste");
//        paciente.setDt_nascimento(new Date(2023, 2, 26));
//        pacienteDAO.updatePaciente(paciente);
//        paciente = pacienteDAO.selectPaciente(2);
//        System.out.println(paciente);

        //Select all
        List<Paciente> pacientes = pacienteDAO.selectAllPaciente();
        pacientes.forEach(System.out::println);

        //Delete
        pacienteDAO.deletePaciente(2);

        pacienteDAO.selectAllPaciente().forEach(System.out::println);
    }
}
