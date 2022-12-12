package util;

import DAO.EspecialidadeDAO;
import Model.Especialidade;
import Service.EspecialidadeService;

import java.sql.SQLException;
import java.util.List;

public class TesteEspecialidadeDAO {
    static EspecialidadeDAO especialidadeDAO = new EspecialidadeDAO();

    static EspecialidadeService especialidadeService = new EspecialidadeService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(especialidadeDAO.count());

        //salvar
        Especialidade especialidade = new Especialidade(1, "teste descricao", "teste observacao");
        especialidadeService.insert(especialidade);

        //buscar por ID
        especialidade = especialidadeDAO.selectEspecialidade(2);
        System.out.println(especialidade);

        //Update
//        especialidade.setDescricao("teste");
//        especialidade.setObservacao("teste");
//        especialidadeDAO.updateEspecialidade(especialidade);
//        especialidade = especialidadeDAO.selectEspecialidade(2);
//        System.out.println(especialidade);

        //Select all
        List<Especialidade> especialidades = especialidadeDAO.selectAllEspecialidade();
        especialidades.forEach(System.out::println);

        //Delete
        especialidadeDAO.deleteEspecialidade(2);

        especialidadeDAO.selectAllEspecialidade().forEach(System.out::println);
    }
}
