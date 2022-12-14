package util;

import DAO.ComposicaoDAO;
import Model.Composicao;
import Service.ComposicaoService;

import java.sql.SQLException;
import java.util.List;

public class TesteComposicaoDAO {
    static ComposicaoDAO composicaoDAO = new ComposicaoDAO();

    static ComposicaoService composicaoService = new ComposicaoService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(composicaoDAO.count());

        //salvar
        Composicao composicao = new Composicao(1, 1, 1, 1);
        composicaoService.insert(composicao);

        //buscar por ID
        composicao = composicaoDAO.selectComposicao(2);
        System.out.println(composicao);

        //Update
//        composicao.setExame_id(2);
//        composicao.setComposicao_exame_id(2);
//        composicao.setValor_referencia_composicao_exame_id(2);
//        composicaoDAO.updateComposicao(composicao);
//        composicao = composicaoDAO.selectComposicao(2);
//        System.out.println(composicao);

        //Select all
        List<Composicao> composicaos = composicaoDAO.selectAllComposicao();
        composicaos.forEach(System.out::println);

        //Delete
        composicaoDAO.deleteComposicao(2);

        composicaoDAO.selectAllComposicao().forEach(System.out::println);
    }
}
