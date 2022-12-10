package util;

import DAO.HabilitacaoExameDAO;
import Model.HabilitacaoExame;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

public class TesteHabilitacaoExameDAO {
    static HabilitacaoExameDAO habilitacaoExameDAO = new HabilitacaoExameDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(habilitacaoExameDAO.count());

        //salvar
        HabilitacaoExame habilitacaoExame = new HabilitacaoExame(1, "teste observacao", BigInteger.valueOf(10), 1, 1);
        habilitacaoExameDAO.insertHabilitacaoExame(habilitacaoExame);

        //buscar por ID
        habilitacaoExame = habilitacaoExameDAO.selectHabilitacaoExame(2);
        System.out.println(habilitacaoExame);

        //Update
//        habilitacaoExame.setObservacao("teste");
//        habilitacaoExame.setCusto(BigInteger.valueOf(250));
//        habilitacaoExame.setLaboratorio_id(1);
//        habilitacaoExame.setTipo_exame_id(1);
//        habilitacaoExameDAO.updateHabilitacaoExame(habilitacaoExame);
//        habilitacaoExame = habilitacaoExameDAO.selectHabilitacaoExame(2);
//        System.out.println(habilitacaoExame);

        //Select all
        List<HabilitacaoExame> habilitacaoExames = habilitacaoExameDAO.selectAllHabilitacaoExame();
        habilitacaoExames.forEach(System.out::println);

        //Delete
        habilitacaoExameDAO.deleteHabilitacaoExame(2);

        habilitacaoExameDAO.selectAllHabilitacaoExame().forEach(System.out::println);
    }
}
