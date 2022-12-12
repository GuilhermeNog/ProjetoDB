package util;

import DAO.LaudoDAO;
import Model.Laudo;
import Service.LaudoService;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TesteLaudoDAO {
    static LaudoDAO laudoDAO = new LaudoDAO();

    static LaudoService laudoService = new LaudoService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(laudoDAO.count());

        //salvar
        Laudo laudo = new Laudo(1, "teste", new Date(2023, 04, 26), "teste", 1);
        laudoService.insert(laudo);

        //buscar por ID
        laudo = laudoDAO.selectLaudo(2);
        System.out.println(laudo);

        //Update
//        laudo.setAssinatura_digital("teste");
//        laudo.setDt_resultado(new Date(2023, 05, 12));
//        laudo.setCodigo("teste");
//        laudo.setSolicitacao_exame_id(1);
//        laudoDAO.updateLaudo(laudo);
//        laudo = laudoDAO.selectLaudo(2);
//        System.out.println(laudo);


        //Select all
        List<Laudo> laudos = laudoDAO.selectAllLaudo();
        laudos.forEach(System.out::println);

        //Delete
        laudoDAO.deleteLaudo(2);

        laudoDAO.selectAllLaudo().forEach(System.out::println);
    }
}
