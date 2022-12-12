package util;

import DAO.EnderecoDAO;
import Model.Endereco;
import Service.EnderecoService;

import java.sql.SQLException;
import java.util.List;

public class TesteEnderecoDAO {
    static EnderecoDAO enderecoDAO = new EnderecoDAO();

    static EnderecoService enderecoService = new EnderecoService();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(enderecoDAO.count());

        //salvar
        Endereco endereco = new Endereco(1, "teste rua", "teste numero", "teste complemento", "teste bairro", "teste cep", "teste cidade", 1);
        enderecoService.insert(endereco);

        //buscar por ID
        endereco = enderecoDAO.selectEndereco(1);
        System.out.println(endereco);

        //Update
//        endereco.setRua("teste");
//        endereco.setNumero("teste");
//        endereco.setComplemento("teste");
//        endereco.setBairro("teste");
//        endereco.setCep("teste");
//        endereco.setCidade("teste");
//        endereco.setLaboratorio_id(1);
//        enderecoDAO.updateEndereco(endereco);
//        endereco = enderecoDAO.selectEndereco(2);
//        System.out.println(endereco);

        //Select all
        List<Endereco> enderecos = enderecoDAO.selectAllEndereco();
        enderecos.forEach(System.out::println);

        //Delete
        //enderecoDAO.deleteEndereco(2);

        enderecoDAO.selectAllEndereco().forEach(System.out::println);
    }
}
