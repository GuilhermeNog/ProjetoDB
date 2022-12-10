package util;

import DAO.ResponsavelTecnicoDAO;
import DAO.SiglaFormacaoDAO;
import Model.ResponsavelTecnico;
import Model.SiglaFormacao;

import java.sql.SQLException;
import java.util.List;

public class TesteResponsavelTecnicoDAO {
    static ResponsavelTecnicoDAO responsavelTecnicoDAO = new ResponsavelTecnicoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(responsavelTecnicoDAO.count());

        //salvar
        ResponsavelTecnico responsavelTecnico = new ResponsavelTecnico(1, "teste nome", "teste conselho", "teste formacao", 1);
        responsavelTecnicoDAO.insertResponsavelTecnico(responsavelTecnico);

        //buscar por ID
        responsavelTecnico = responsavelTecnicoDAO.selectResponsavelTecnico(2);
        System.out.println(responsavelTecnico);

        //Update
//        responsavelTecnico.setNome("teste");
//        responsavelTecnico.setConselho("teste");
//        responsavelTecnico.setFormacao("teste");
//        responsavelTecnico.setSigla_formacao_id(2);
//        responsavelTecnicoDAO.updateResponsavelTecnico(responsavelTecnico);
//        responsavelTecnico = responsavelTecnicoDAO.selectResponsavelTecnico(2);
//        System.out.println(responsavelTecnico);

        //Select all
        List<ResponsavelTecnico> responsavelTecnicos = responsavelTecnicoDAO.selectAllResponsavelTecnico();
        responsavelTecnicos.forEach(System.out::println);

        //Delete
        responsavelTecnicoDAO.deleteResponsavelTecnico(2);

        responsavelTecnicoDAO.selectAllResponsavelTecnico().forEach(System.out::println);
    }
}
