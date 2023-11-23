package br.com.fintech.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	private final String dbUrl = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private final String dbUser = "RM552402";
	private final String dbPassword = "010503";

	public DBManager() {
	}

	// Método para abrir a conexão com o banco de dados
	public void openConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			connection = DriverManager.getConnection(dbUrl, dbUser, dbPassword);
			System.out.println("Conexão com o banco de dados estabelecida.");
		} catch (Exception e) {
			System.err.println("Erro ao carregar o driver JDBC: " + e.getMessage());
			throw new RuntimeException(e);
		}
	}

	// Método para fechar a conexão com o banco de dados
	public void closeConnection() {
	}

	private static Connection connection;

	public Connection getConnection() {
		try {
			if (connection == null || connection.isClosed())
				openConnection();

		} catch (Exception e) {
			throw new RuntimeException(e);
		}

		return this.connection;
	}
}
