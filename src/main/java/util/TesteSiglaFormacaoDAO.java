package util;

import DAO.ContatoDAO;
import DAO.SiglaFormacaoDAO;
import Model.Contato;
import Model.SiglaFormacao;

import java.sql.SQLException;
import java.util.List;

public class TesteSiglaFormacaoDAO {
    static SiglaFormacaoDAO siglaFormacaoDAO = new SiglaFormacaoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(siglaFormacaoDAO.count());

        //salvar
        SiglaFormacao siglaFormacao = new SiglaFormacao(1, "SIGLA");
        siglaFormacaoDAO.insertSiglaFormacao(siglaFormacao);

        //buscar por ID
        siglaFormacao = siglaFormacaoDAO.selectSiglaFormacao(2);
        System.out.println(siglaFormacao);

        //Update
//        siglaFormacao.setSigla("SIGLA TESTE");
//        siglaFormacaoDAO.updateSiglaFormacao(siglaFormacao);
//        siglaFormacao = siglaFormacaoDAO.selectSiglaFormacao(2);
//        System.out.println(siglaFormacao);

        //Select all
        List<SiglaFormacao> siglaFormacaos = siglaFormacaoDAO.selectAllSiglaFormacao();
        siglaFormacaos.forEach(System.out::println);

        //Delete
        siglaFormacaoDAO.deleteSiglaFormacao(2);

        siglaFormacaoDAO.selectAllSiglaFormacao().forEach(System.out::println);
    }
}
