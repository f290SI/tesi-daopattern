package br.com.fatecararas.dao;

import br.com.fatecararas.model.Contato;

import java.sql.SQLException;
import java.util.List;

public interface ContatoDAO {

    void salvar(Contato contato) throws SQLException;

    Contato atualizar(Contato contato);

    Contato buscarPorNome(String nome);

    boolean apagar(Contato contato);

    List<Contato> buscarTodos();
}
