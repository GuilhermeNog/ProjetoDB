package util;

import DAO.TipoExameDAO;
import Model.TipoExame;
import Service.TipoExameService;

import java.sql.SQLException;
import java.util.List;

public class TesteTipoExameDAO {
    static TipoExameDAO tipoExameDAO = new TipoExameDAO();

    static TipoExameService tipoExameService = new TipoExameService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(tipoExameDAO.count());

        //salvar
        TipoExame tipoExame = new TipoExame(1, "teste descricao", "teste observacao");
        tipoExameService.insert(tipoExame);

        //buscar por ID
        tipoExame = tipoExameDAO.selectTipoExame(2);
        System.out.println(tipoExame);

        //Update
//        tipoExame.setDescricao("teste");
//        tipoExame.setObservacao("teste");
//        tipoExameDAO.updateTipoExame(tipoExame);
//        tipoExame = tipoExameDAO.selectTipoExame(2);
//        System.out.println(tipoExame);

        //Select all
        List<TipoExame> tipoExames = tipoExameDAO.selectAllTipoExame();
        tipoExames.forEach(System.out::println);

        //Delete
        tipoExameDAO.deleteTipoExame(2);

        tipoExameDAO.selectAllTipoExame().forEach(System.out::println);
    }
}
