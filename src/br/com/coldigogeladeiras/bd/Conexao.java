package br.com.coldigogeladeiras.bd;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private Connection conexao;
    private static final String USUARIO = "root";
    private static final String SENHA = "Heihachi@123*789";
    private static final String URL = "jdbc:mysql://localhost/bdcoldigo?&userTimezone=true&serverTimezone=UTC";
    private static final String DRIVER = "com.mysql.cj.jdbc.Driver";

    public Connection abrirConexao() {

        try {

            Class.forName(DRIVER);
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);

        } catch (Exception e) {

            e.printStackTrace();

        }

        return conexao;
    }

    public void fecharConexao() {

        try {
            conexao.close();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}