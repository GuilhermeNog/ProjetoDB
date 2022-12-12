package util;

import DAO.MedicoDAO;
import Model.Medico;
import Service.MedicoService;

import java.sql.SQLException;
import java.util.List;

public class TesteMedicoDAO {
    static MedicoDAO medicoDAO = new MedicoDAO();

    static MedicoService medicoService = new MedicoService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(medicoDAO.count());

        //salvar
        Medico medico = new Medico(1, "teste crm", "teste nome");
        medicoService.insert(medico);

        //buscar por ID
        medico = medicoDAO.selectMedico(2);
        System.out.println(medico);

        //Update
//        medico.setCrm("teste");
//        medico.setNome("teste");
//        medicoDAO.updateMedico(medico);
//        medico = medicoDAO.selectMedico(2);
//        System.out.println(medico);

        //Select all
        List<Medico> medicos = medicoDAO.selectAllMedico();
        medicos.forEach(System.out::println);

        //Delete
        medicoDAO.deleteMedico(2);

        medicoDAO.selectAllMedico().forEach(System.out::println);
    }
}
