package util;

import DAO.UnidadeMedidaDAO;
import Model.UnidadeMedida;
import Service.UnidadeMedidaService;

import java.sql.SQLException;
import java.util.List;

public class TesteUnidadeMedidaDAO {
    static UnidadeMedidaDAO unidadeMedidaDAO = new UnidadeMedidaDAO();

    static UnidadeMedidaService unidadeMedidaService = new UnidadeMedidaService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(unidadeMedidaDAO.count());

        //salvar
        UnidadeMedida unidadeMedida = new UnidadeMedida(1, "teste descricao");
        unidadeMedidaService.insert(unidadeMedida);

        //buscar por ID
        unidadeMedida = unidadeMedidaDAO.selectUnidadeMedida(2);
        System.out.println(unidadeMedida);

        //Update
//        unidadeMedida.setDescricao("teste");
//        unidadeMedidaDAO.updateUnidadeMedida(unidadeMedida);
//        unidadeMedida = unidadeMedidaDAO.selectUnidadeMedida(2);
//        System.out.println(unidadeMedida);

        //Select all
        List<UnidadeMedida> unidadeMedidas = unidadeMedidaDAO.selectAllUnidadeMedida();
        unidadeMedidas.forEach(System.out::println);

        //Delete
        unidadeMedidaDAO.deleteUnidadeMedida(2);

        unidadeMedidaDAO.selectAllUnidadeMedida().forEach(System.out::println);
    }
}
