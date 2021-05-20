package br.com.fatecararas.dao.impl;

import br.com.fatecararas.dao.ContatoDAO;
import br.com.fatecararas.dao.factory.ConnectionFactory;
import br.com.fatecararas.model.Contato;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ContatoDAOImpl implements ContatoDAO {

    private Connection conexao;

    public ContatoDAOImpl() throws SQLException {
        conexao = ConnectionFactory.getConexao();
    }

    @Override
    public void salvar(Contato contato) {

        String sql = "INSERT INTO `fatec`.`contatos`\n" +
                "(`nome`,`email`,`telefone`,`endereco`,\n" +
                "`empresa`,`observacoes`)\n" +
                "VALUES\n" +
                "('%s', '%s', '%s', '%s', '%s', '%s');";

        try (Statement statement = conexao.createStatement()){
            statement.execute(String.format(sql,
                    contato.getNome(),
                    contato.getEmail(),
                    contato.getTelefone(),
                    contato.getEnd(),
                    contato.getEmpresa(),
                    contato.getObservacoes()));
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }

    @Override
    public Contato atualizar(Contato contato) {
        return null;
    }

    @Override
    public Contato buscarPorNome(String nome) {
        return null;
    }

    @Override
    public boolean apagar(Contato contato) {
        return false;
    }

    @Override
    public List<Contato> buscarTodos() {
        List<Contato> contatos = new ArrayList<>();
        String sql = "select * from contatos";

        try(Statement statement = conexao.createStatement();
            ResultSet resultSet = statement.executeQuery(sql)) {

            while (resultSet.next()) {
                Contato contato = new Contato();

                contato.setNome(resultSet.getString("nome"));
                contato.setEmail(resultSet.getString("email"));
                contato.setTelefone(resultSet.getString("telefone"));

                contatos.add(contato);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return contatos;
    }
}
