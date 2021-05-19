package br.com.fatecararas;

import br.com.fatecararas.dao.ContatoDAO;
import br.com.fatecararas.dao.impl.ContatoDAOImpl;
import br.com.fatecararas.model.Contato;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = in.nextLine();

        Contato contato = new Contato()
                .setNome(nome);

        ContatoDAO dao = new ContatoDAOImpl();

        dao.salvar(contato);
    }
}
