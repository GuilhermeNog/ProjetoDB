package util;

import DAO.ComposicaoExameDAO;
import DAO.UnidadeMedidaDAO;
import Model.ComposicaoExame;
import Model.UnidadeMedida;

import java.sql.SQLException;
import java.util.List;

public class TesteComposicaoExameDAO {
    static ComposicaoExameDAO composicaoExameDAO = new ComposicaoExameDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(composicaoExameDAO.count());

        //salvar
        ComposicaoExame composicaoExame = new ComposicaoExame(1, "teste descricao", 1);
        composicaoExameDAO.insertComposicaoExame(composicaoExame);

        //buscar por ID
        composicaoExame = composicaoExameDAO.selectComposicaoExame(2);
        System.out.println(composicaoExame);

        //Update
//        composicaoExame.setDescricao("teste");
//        composicaoExame.setUnidade_medida_id(2);
//        composicaoExameDAO.updateComposicaoExame(composicaoExame);
//        composicaoExame = composicaoExameDAO.selectComposicaoExame(2);
//        System.out.println(composicaoExame);

        //Select all
        List<ComposicaoExame> composicaoExames = composicaoExameDAO.selectAllComposicaoExame();
        composicaoExames.forEach(System.out::println);

        //Delete
        composicaoExameDAO.deleteComposicaoExame(2);

        composicaoExameDAO.selectAllComposicaoExame().forEach(System.out::println);
    }
}
