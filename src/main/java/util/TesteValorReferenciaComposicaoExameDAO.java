package util;

import DAO.ValorReferenciaComposicaoExameDAO;
import Model.ValorReferenciaComposicaoExame;
import Service.ValorReferenciaComposicaoExameService;

import java.sql.SQLException;
import java.util.List;

public class TesteValorReferenciaComposicaoExameDAO {
    static ValorReferenciaComposicaoExameDAO valorReferenciaComposicaoExameDAO = new ValorReferenciaComposicaoExameDAO();

    static ValorReferenciaComposicaoExameService valorReferenciaComposicaoExameService = new ValorReferenciaComposicaoExameService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(valorReferenciaComposicaoExameDAO.count());

        //salvar
        ValorReferenciaComposicaoExame valorReferenciaComposicaoExame = new ValorReferenciaComposicaoExame(1, "teste", "teste", "teste", "teste", 1);
        valorReferenciaComposicaoExameService.insert(valorReferenciaComposicaoExame);

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
