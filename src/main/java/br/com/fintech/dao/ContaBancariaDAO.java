package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.fintech.models.ContaBancariaModel;

/*ID         NOT NULL NUMBER(10)   
AGENCIA    NOT NULL VARCHAR2(10) 
CONTA      NOT NULL VARCHAR2(20) 
SALDO      NOT NULL NUMBER       
TIPO_CONTA NOT NULL VARCHAR2(50) 
ATIVO      NOT NULL NUMBER(1)    
USUARIO_ID NOT NULL NUMBER(38)   */

public class ContaBancariaDAO implements IDAO<ContaBancariaModel>{

	@Override
	public void create(ContaBancariaModel conta, Connection connection) {
		PreparedStatement stmt = null;
		
		try {
			String sql = "INSERT INTO TAB_CONTA_BANCARIA(AGENCIA, CONTA, SALDO, TIPO_CONTA, ATIVO, USUARIO_ID) "
					+ "VALUES(?, ?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, conta.getAgencia());
			stmt.setString(2, conta.getConta());
			stmt.setDouble(3, conta.getSaldo());
			stmt.setString(4, conta.getTipoConta());
			stmt.setInt(5, conta.isAtivo() == true ? 1 : 0);
			stmt.setInt(6, conta.getId_usuario().getId());
			
			stmt.executeUpdate();
			
			System.out.println("Dados inseridos com sucesso");
		} catch (Exception e) {

			System.out.println("Erro ao inserir dados de conta bancaria " + e.getMessage());
		}
	}

	@Override
	public List<ContaBancariaModel> getAll(Connection connection) {
		List<ContaBancariaModel> contas = new ArrayList<>();
		
		String sql = "SELECT * FROM TAB_CONTA_BANCARIA";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery()) {
				while (resultSet.next()) {
					int id = resultSet.getInt("ID");
					int id_usuario = resultSet.getInt("USUARIO_ID");
					String agencia = resultSet.getString("agencia");
					String conta = resultSet.getString("conta");
					double saldo = resultSet.getDouble("saldo");
					String tipoConta = resultSet.getString("tipo_conta");
					boolean ativo = resultSet.getBoolean("ativo");
					System.out.println("Ativ " + resultSet.getInt("ativo"));
					ContaBancariaModel contaBancaria = new ContaBancariaModel(id, agencia, conta, saldo,tipoConta, ativo, null);
					contas.add(contaBancaria);
				}
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("Erro ao listar Contas Bancárias " + e.getMessage());
				}
		
		return contas;
	}

}
