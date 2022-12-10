package util;

import DAO.SolicitacaoExameDAO;
import DAO.ValorReferenciaComposicaoExameDAO;
import Model.SolicitacaoExame;
import Model.ValorReferenciaComposicaoExame;

import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

public class TesteSolicitacaoExameDAO {
    static SolicitacaoExameDAO solicitacaoExameDAO = new SolicitacaoExameDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(solicitacaoExameDAO.count());

        //salvar
        SolicitacaoExame solicitacaoExame = new SolicitacaoExame(1, "teste", 1, new Date(2023, 02, 5), 1, 1);
        solicitacaoExameDAO.insertSolicitacaoExame(solicitacaoExame);

        //buscar por ID
        solicitacaoExame = solicitacaoExameDAO.selectSolicitacaoExame(2);
        System.out.println(solicitacaoExame);

        //Update
//        solicitacaoExame.setNm_prescrito("teste");
//        solicitacaoExame.setConsulta_medica_id(1);
//        solicitacaoExame.setDt_solicitacao(new Date(2023, 02, 20));
//        solicitacaoExame.setHabilitacao_exame_id(1);
//        solicitacaoExame.setExame_id(1);
//        solicitacaoExameDAO.updateSolicitacaoExame(solicitacaoExame);
//        solicitacaoExame = solicitacaoExameDAO.selectSolicitacaoExame(2);
//        System.out.println(solicitacaoExame);

        //Select all
        List<SolicitacaoExame> solicitacaoExames = solicitacaoExameDAO.selectAllSolicitacaoExame();
        solicitacaoExames.forEach(System.out::println);

        //Delete
        solicitacaoExameDAO.deleteSolicitacaoExame(2);

        solicitacaoExameDAO.selectAllSolicitacaoExame().forEach(System.out::println);
    }
}
