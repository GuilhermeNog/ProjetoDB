package util;

import DAO.ComposicaoDAO;
import DAO.ValorReferenciaComposicaoExameDAO;
import Model.Composicao;
import Model.ValorReferenciaComposicaoExame;

import java.sql.SQLException;
import java.util.List;

public class TesteValorReferenciaComposicaoExameDAO {
    static ValorReferenciaComposicaoExameDAO valorReferenciaComposicaoExameDAO = new ValorReferenciaComposicaoExameDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(valorReferenciaComposicaoExameDAO.count());

        //salvar
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(1, "teste", "teste", "teste", "teste", 1);
        valorReferenciaComposicaoExameDAO.insertValorReferenciaComposicaoExame(valorReferenciaComposicaoExame);

        //buscar por ID
        valorReferenciaComposicaoExame = valorReferenciaComposicaoExameDAO.selectValorReferenciaComposicaoExame(2);
        System.out.println(valorReferenciaComposicaoExame);

        //Update
//        valorReferenciaComposicaoExame.setValor_minimo("teste");
//        valorReferenciaComposicaoExame.setValor_maximo("teste");
//        valorReferenciaComposicaoExame.setLimitador_minimo("teste");
//        valorReferenciaComposicaoExame.setLimitador_maximo("teste");
//        valorReferenciaComposicaoExame.setUnidade_medida_id(2);
//        valorReferenciaComposicaoExameDAO.updateValorReferenciaComposicaoExame(valorReferenciaComposicaoExame);
//        valorReferenciaComposicaoExame = valorReferenciaComposicaoExameDAO.selectValorReferenciaComposicaoExame(2);
//        System.out.println(valorReferenciaComposicaoExame);

        //Select all
        List<ValorReferenciaComposicaoExame> valorReferenciaComposicaoExames = valorReferenciaComposicaoExameDAO.selectAllValorReferenciaComposicaoExame();
        valorReferenciaComposicaoExames.forEach(System.out::println);

        //Delete
        valorReferenciaComposicaoExameDAO.deleteValorReferenciaComposicaoExame(2);

        valorReferenciaComposicaoExameDAO.selectAllValorReferenciaComposicaoExame().forEach(System.out::println);
    }
}
