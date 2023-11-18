package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.fintech.models.EnderecoModel;

public class EnderecoDAO implements IDAO<EnderecoModel>{

	@Override
	public void create(EnderecoModel endereco, Connection connection) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO TAB_ENDERECO(CEP, RUA, BAIRRO, CIDADE, ESTADO)"
					+ "VALUES(?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, endereco.getCep());
			stmt.setString(2, endereco.getRua());
			stmt.setString(3, endereco.getBairro());
			stmt.setString(4, endereco.getCidade());
			stmt.setString(5, endereco.getEstado());
			stmt.executeUpdate();
			
			System.out.println("Dados inseridos com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir dados");
		}
	}

	@Override
	public List<EnderecoModel> getAll(Connection connection) {
		List<EnderecoModel> enderecos = new ArrayList<>();
		String sql = "SELECT * FROM TAB_ENDERECO";
		try 
			(PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				String cep = resultSet.getString("CEP");
				String rua = resultSet.getString("RUA");
				String bairro = resultSet.getString("BAIRRO");
				String cidade = resultSet.getString("CIDADE");
				String estado = resultSet.getString("ESTADO");
				
				EnderecoModel endereco = new EnderecoModel(id, cep, rua, bairro, cidade, estado);
				enderecos.add(endereco);
			}
			System.out.println("Dados listados com sucesso");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao listar enderecos " + e.getMessage());
		}
		
		return enderecos;
	}

}
