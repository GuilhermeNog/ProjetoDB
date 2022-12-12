package Service;

import DAO.ValorReferenciaComposicaoExameDAO;
import Model.ValorReferenciaComposicaoExame;

import java.sql.SQLException;

public class ValorReferenciaComposicaoExameService {
    private ValorReferenciaComposicaoExameDAO valorReferenciaComposicaoExameDAO = new ValorReferenciaComposicaoExameDAO();

    public ValorReferenciaComposicaoExame insert(ValorReferenciaComposicaoExame entidade) {
        return valorReferenciaComposicaoExameDAO.insertValorReferenciaComposicaoExame(entidade);
    }

    public ValorReferenciaComposicaoExame select(Integer id) {
        return valorReferenciaComposicaoExameDAO.selectValorReferenciaComposicaoExame(id);
    }

    public void update(ValorReferenciaComposicaoExame valorReferenciaComposicaoExame) throws SQLException {
        valorReferenciaComposicaoExameDAO.updateValorReferenciaComposicaoExame(valorReferenciaComposicaoExame);
    }

    public void delete(Integer id) throws SQLException {
        valorReferenciaComposicaoExameDAO.deleteValorReferenciaComposicaoExame(id);
    }
}
