package Service;

import DAO.MaterialExameDAO;
import Model.MaterialExame;

import java.sql.SQLException;

public class MaterialExameService {
    private MaterialExameDAO materialExameDAO = new MaterialExameDAO();

    public MaterialExame insert(MaterialExame entidade) {
        return materialExameDAO.insertMaterialExame(entidade);
    }

    public MaterialExame select(Integer id) {
        return materialExameDAO.selectMaterialExame(id);
    }

    public void update(MaterialExame materialExame) throws SQLException {
        materialExameDAO.updateMaterialExame(materialExame);
    }

    public void delete(Integer id) throws SQLException {
        materialExameDAO.deleteMaterialExame(id);
    }
}
