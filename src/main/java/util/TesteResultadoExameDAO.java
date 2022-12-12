package util;

import DAO.ResultadoExameDAO;
import Model.ResultadoExame;
import Service.ResultadoExameService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TesteResultadoExameDAO {
    static ResultadoExameDAO resultadoExameDAO = new ResultadoExameDAO();

    static ResultadoExameService resultadoExameService = new ResultadoExameService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(resultadoExameDAO.count());

        //
        ResultadoExame resultadoExame = new ResultadoExame(1, new Date(2023, 05, 12), "1560.90", 3, 1);
        resultadoExameService.insert(resultadoExame);

        //buscar por ID
        resultadoExame = resultadoExameDAO.selectResultadoExame(2);
        System.out.println(resultadoExame);

        //Update
//        resultadoExame.setDt_exame(new Date(2023, 05, 12));
//        resultadoExame.setValor("teste");
//        resultadoExame.setValor("1000");
//        resultadoExame.setComposicao_id(1);
//        resultadoExame.setLaudo_id(1);
//        resultadoExameDAO.updateResultadoExame(resultadoExame);
//        resultadoExame = resultadoExameDAO.selectResultadoExame(2);
//        System.out.println(resultadoExame);


        //Select all
        List<ResultadoExame> resultadoExames = resultadoExameDAO.selectAllResultadoExame();
        resultadoExames.forEach(System.out::println);

        //Delete
        resultadoExameDAO.deleteResultadoExame(2);

        resultadoExameDAO.selectAllResultadoExame().forEach(System.out::println);
    }
}
