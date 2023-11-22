package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.models.DespesaModel;

public class DespesaDAO implements IDAO<DespesaModel>{

	public void create(DespesaModel despesa, Connection connection) {
		System.out.println("Despesa " + despesa);
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO TAB_DESPESA(TIPO, VALOR, DATA_CRIACAO, DESCRICAO, USUARIO_ID) "
					+ "VALUES(?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, despesa.getTipo());
			stmt.setDouble(2, despesa.getValor());
			java.sql.Date date = new java.sql.Date(despesa.getDataCriacao().getTimeInMillis());
			stmt.setDate(3, date);
			stmt.setString(4, despesa.getDescricao());
			stmt.setInt(5, despesa.getUsuarioID());
			stmt.executeUpdate();
			
			System.out.println("Dados inseridos com sucesso");
		}
		catch(Exception e) {
			System.out.println("Erro ao inserir dados na tabela despesa " + e.getMessage());
		}
	}

	public List<DespesaModel> getAll(Connection connection) {
		List<DespesaModel> despesas = new ArrayList<>();
        String sql = "SELECT * FROM TAB_DESPESA";
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
             ResultSet resultSet = preparedStatement.executeQuery()) {
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String tipo = resultSet.getString("tipo");
                double valor = resultSet.getDouble("valor");
                Calendar dataCriacao = Calendar.getInstance();
				dataCriacao.setTimeInMillis(resultSet.getTimestamp("data_criacao").getTime());
				int usuarioID = resultSet.getInt("usuario_id");
				String descricao = resultSet.getString("descricao");
				DespesaModel despesa = new DespesaModel(id, tipo, valor, dataCriacao, descricao, usuarioID);
                despesas.add(despesa);
            }
            System.out.println("Dados gerados com sucesso");
        } catch (SQLException e) {
            e.printStackTrace();
			System.out.println("Erro ao listar Despesas " + e.getMessage());
        }
        
        return despesas;
    }

}
