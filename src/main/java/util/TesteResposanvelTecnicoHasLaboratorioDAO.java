package util;

import DAO.EnderecoDAO;
import DAO.ResponsavelTecnicoDAO;
import DAO.ResponsavelTecnicoHasLaboratorioDAO;
import Model.Endereco;
import Model.ResponsavelTecnicoHasLaboratorio;

import java.sql.SQLException;
import java.util.List;

public class TesteResposanvelTecnicoHasLaboratorioDAO {
    static ResponsavelTecnicoHasLaboratorioDAO responsavelTecnicoHasLaboratorioDAO = new ResponsavelTecnicoHasLaboratorioDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(responsavelTecnicoHasLaboratorioDAO.count());

        //salvar
        ResponsavelTecnicoHasLaboratorio responsavelTecnicoHasLaboratorio = new ResponsavelTecnicoHasLaboratorio(1, 1, 1);
        responsavelTecnicoHasLaboratorioDAO.insertResponsavelTecnicoHasLaboratorio(responsavelTecnicoHasLaboratorio);

        //buscar por ID
        responsavelTecnicoHasLaboratorio = responsavelTecnicoHasLaboratorioDAO.selectResponsavelTecnicoHasLaboratorio(2);
        System.out.println(responsavelTecnicoHasLaboratorio);

        //Update
//        responsavelTecnicoHasLaboratorio.setResponsavel_tecnico_id(2);
//        responsavelTecnicoHasLaboratorio.setLaboratorio_id(2);
//        responsavelTecnicoHasLaboratorioDAO.updateResponsavelTecnicoHasLaboratorio(responsavelTecnicoHasLaboratorio);
//        responsavelTecnicoHasLaboratorio = responsavelTecnicoHasLaboratorioDAO.selectResponsavelTecnicoHasLaboratorio(2);
//        System.out.println(responsavelTecnicoHasLaboratorio);

        //Select all
        List<ResponsavelTecnicoHasLaboratorio> responsavelTecnicoHasLaboratorios = responsavelTecnicoHasLaboratorioDAO.selectAllResponsavelTecnicoHasLaboratorio();
        responsavelTecnicoHasLaboratorios.forEach(System.out::println);

        //Delete
        responsavelTecnicoHasLaboratorioDAO.deleteResponsavelTecnicoHasLaboratorio(2);

        responsavelTecnicoHasLaboratorioDAO.selectAllResponsavelTecnicoHasLaboratorio().forEach(System.out::println);
    }
}
