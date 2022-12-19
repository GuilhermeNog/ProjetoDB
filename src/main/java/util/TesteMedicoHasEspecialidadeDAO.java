package util;

import DAO.MedicoHasEspecialidadeDAO;
import Model.MedicoHasEspecialidade;
import Service.MedicoHasEspecialidadeService;

import java.sql.SQLException;
import java.util.List;

public class TesteMedicoHasEspecialidadeDAO {
    static MedicoHasEspecialidadeDAO medicoHasEspecialidadeDAO = new MedicoHasEspecialidadeDAO();

    static MedicoHasEspecialidadeService medicoHasEspecialidadeService = new MedicoHasEspecialidadeService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(medicoHasEspecialidadeDAO.count());

        //salvar
        MedicoHasEspecialidade medicoHasEspecialidade = new MedicoHasEspecialidade( 3, 3);
        medicoHasEspecialidadeService.insert(medicoHasEspecialidade);

        //buscar por ID
//        medicoHasEspecialidade = medicoHasEspecialidadeDAO.selectMedicoHasEspecialidade(1);
//        System.out.println(medicoHasEspecialidade);

        //Update
//        medicoHasEspecialidade.setMedico_id(1);
//        medicoHasEspecialidade.setEspecialidade_id(1);
//        medicoHasEspecialidadeDAO.updateMedicoHasEspecialidade(medicoHasEspecialidade);
//        medicoHasEspecialidade = medicoHasEspecialidadeDAO.selectMedicoHasEspecialidade(2);
//        System.out.println(medicoHasEspecialidade);

        //Select all
        List<MedicoHasEspecialidade> medicoHasEspecialidades = medicoHasEspecialidadeDAO.selectAllMedicoHasEspecialidade();
        medicoHasEspecialidades.forEach(System.out::println);

        //Delete
        //medicoHasEspecialidadeDAO.deleteMedicoHasEspecialidade(2);

        medicoHasEspecialidadeDAO.selectAllMedicoHasEspecialidade().forEach(System.out::println);
    }
}
