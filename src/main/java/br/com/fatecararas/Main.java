package br.com.fatecararas;

import br.com.fatecararas.dao.ContatoDAO;
import br.com.fatecararas.dao.impl.ContatoDAOImpl;
import br.com.fatecararas.model.Contato;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

        Contato contato = new Contato()
                .setNome("Nicolas Chinaglia")
                .setEmail("nicolas@gmail.com")
                .setTelefone("88888-3333");

        ContatoDAO dao = new ContatoDAOImpl();

//        dao.salvar(contato);

        List<Contato> contatos = dao.buscarTodos();

        contatos.forEach(System.out::println);
    }
}
