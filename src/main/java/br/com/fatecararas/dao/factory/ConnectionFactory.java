package br.com.fatecararas.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    static final String DATABASE_URL = "jdbc:mysql://localhost:3306/fatec";
    static final String USUARIO = "esdras";
    static final String SENHA = "donotcross";

    public static Connection getConexao() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, USUARIO, SENHA);
    }
}
