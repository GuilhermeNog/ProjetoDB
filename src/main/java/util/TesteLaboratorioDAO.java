package util;

import DAO.LaboratorioDAO;
import Model.Laboratorio;
import Service.LaboratorioService;

import java.sql.SQLException;
import java.util.List;

public class TesteLaboratorioDAO {
    static LaboratorioDAO laboratorioDAO = new LaboratorioDAO();

    static LaboratorioService laboratorioService = new LaboratorioService();

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        //count
        System.out.println(laboratorioDAO.count());

        //salvar
        Laboratorio laboratorio = new Laboratorio(1,"Laboratorio teste", "teste", "teste", "teste", "Lab");
        laboratorioService.insert(laboratorio);

        //buscar por ID
        laboratorio = laboratorioDAO.selectLaboratorio(1);
        System.out.println(laboratorio);

        //Update
        laboratorio.setDescricao("Mudou a descricao");
        laboratorio.setCnes("Mudou o cnes");
        laboratorio.setCnpj("Mudou o cnpj");
        laboratorio.setCrbm("Mudou o crbm");
        laboratorio.setNome_fantasia("Mudou o nome fantasia");
        laboratorioDAO.updateLaboratorio(laboratorio);
        //laboratorio = laboratorioDAO.selectLaboratorio(1);
        System.out.println(laboratorio);

        //Select all
        List<Laboratorio> laboratorios = laboratorioDAO.selectAllLaboratorio();
        laboratorios.forEach(System.out::println);

        //Delete
        laboratorioDAO.deleteLaboratorio(14);
        laboratorioDAO.selectAllLaboratorio().forEach(System.out::println);
    }
}
