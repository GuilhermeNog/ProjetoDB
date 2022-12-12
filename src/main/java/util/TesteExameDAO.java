package util;

import DAO.ExameDAO;
import Model.Exame;
import Service.ExameService;

import java.sql.SQLException;
import java.util.List;

public class TesteExameDAO {
    static ExameDAO exameDAO = new ExameDAO();

    static ExameService exameService = new ExameService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(exameDAO.count());

        //salvar
        Exame exame = new Exame(1, 1, "teste descricao", 1, "metodo");
        exameService.insert(exame);

        //buscar por ID
        exame = exameDAO.selectExame(2);
        System.out.println(exame);

        //Update
//        exame.setTipo_exame_id(2);
//        exame.setDescricao("teste");
//        exame.setMaterial_exame_id(2);
//        exame.setMetodo("teste");
//        exameDAO.updateExame(exame);
//        exame = exameDAO.selectExame(2);
//        System.out.println(exame);

        //Select all
        List<Exame> exames = exameDAO.selectAllExame();
        exames.forEach(System.out::println);

        //Delete
        exameDAO.deleteExame(2);

        exameDAO.selectAllExame().forEach(System.out::println);
    }
}
