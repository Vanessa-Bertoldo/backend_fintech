package br.com.fintech.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {
	private Connection connection;
	private final String dbUrl = "";
	private final String dbUser = "";
	private final String dbPassword = "";
	
	public DBManager() {	
	}
	
	// Método para abrir a conexão com o banco de dados
	public void openConnection() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            this.connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
            System.out.println("Conexão com o banco de dados estabelecida.");
        } catch (ClassNotFoundException e) {
            System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
        } catch (SQLException e) {
            System.err.println("Erro ao abrir a conexão com o banco de dados: " + e.getMessage());
        }
    }

    // Método para fechar a conexão com o banco de dados
    public void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Conexão com o banco de dados fechada.");
            } catch (SQLException e) {
                System.err.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
    
    public Connection getConnection() {
    	return this.connection;
    }
}
