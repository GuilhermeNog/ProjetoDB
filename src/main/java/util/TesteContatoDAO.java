package util;

import DAO.ContatoDAO;
import Model.Contato;

import java.sql.SQLException;
import java.util.List;

public class TesteContatoDAO {
    static ContatoDAO contatoDAO = new ContatoDAO();

    public static void main(String[] args) throws SQLException {

        //count
        System.out.println(contatoDAO.count());

        //salvar
        Contato contato = new Contato(1, "(85) 90000-0000", 1);
        contatoDAO.insertContato(contato);

        //buscar por ID
        contato = contatoDAO.selectContato(33);
        System.out.println(contato);

        //Update
//        contato.setTelefone("teste");
//        contato.setLaboratorio_id(115);
//        contatoDAO.updateContato(contato);
//        contato = contatoDAO.selectContato(33);
//        System.out.println(contato);

        //Select all
        List<Contato> contatos = contatoDAO.selectAllContato();
        contatos.forEach(System.out::println);

        //Delete
        contatoDAO.deleteContato(26);

        contatoDAO.selectAllContato().forEach(System.out::println);
    }
}
