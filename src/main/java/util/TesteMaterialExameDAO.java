package util;

import DAO.HabilitacaoExameDAO;
import DAO.MaterialExameDAO;
import Model.HabilitacaoExame;
import Model.MaterialExame;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.List;

public class TesteMaterialExameDAO {
    static MaterialExameDAO materialExameDAO = new MaterialExameDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(materialExameDAO.count());

        //salvar
        MaterialExame materialExame = new MaterialExame(1, "teste material", "teste observacao");
        materialExameDAO.insertMaterialExame(materialExame);

        //buscar por ID
        materialExame = materialExameDAO.selectMaterialExame(2);
        System.out.println(materialExame);

        //Update
//        materialExame.setMaterial("teste");
//        materialExame.setObsercavao("teste");
//        materialExameDAO.updateMaterialExame(materialExame);
//        materialExame = materialExameDAO.selectMaterialExame(2);
//        System.out.println(materialExame);

        //Select all
        List<MaterialExame> materialExames = materialExameDAO.selectAllMaterialExame();
        materialExames.forEach(System.out::println);

        //Delete
        materialExameDAO.deleteMaterialExame(2);

        materialExameDAO.selectAllMaterialExame().forEach(System.out::println);
    }
}
