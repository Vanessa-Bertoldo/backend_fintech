package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.models.EmprestimoModel;

/*
 * ------------------ -------- ------------ 
ID                 NOT NULL NUMBER(10)   
VALOR              NOT NULL NUMBER(10)   
TRIBUTO                     NUMBER(10)   
JUROS_MENSAIS               VARCHAR2(10) 
QTD_PARCELAS                NUMBER(10)   
QTD_PARCELAS_PAGAS          NUMBER(10)   
DATA                        DATE         
CONTA_BANCARIA_ID  NOT NULL NUMBER(38)  */
public class EmprestimoDAO implements IDAO<EmprestimoModel>{

	@Override
	public void create(EmprestimoModel emprestimo, Connection connection) {
		PreparedStatement stmt = null;
		try {
			String sql = "INSERT INTO TAB_EMPRESTIMO(VALOR, TRIBUTO, JUROS_MENSAIS,QTD_PARCELAS,QTD_PARCELAS_PAGAS, DATA, CONTA_BANCARIA_ID ) "
					+ "VALUES(?, ?, ?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);

			stmt.setDouble(1, emprestimo.getValor());
			stmt.setDouble(2, emprestimo.getTributo());
			stmt.setString(3, emprestimo.getJurosMensal());
			stmt.setInt(4, emprestimo.getQuantidadeParcela());
			stmt.setInt(5, emprestimo.getQuantidadeParcelaPaga());
			java.sql.Date date = new java.sql.Date(emprestimo.getData().getTimeInMillis());
			stmt.setDate(6, date);
			stmt.setInt(7, emprestimo.getId_usuario().getId());
			
			stmt.executeUpdate();
			
			System.out.println("Dados inseridos com sucesso");
		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir dados na tabela emprestimo");
		}
		
	}

	@Override
	public List<EmprestimoModel> getAll(Connection connection) {
		List<EmprestimoModel> emprestimos = new ArrayList<>();
		String sql = "SELECT * FROM TAB_EMPRESTIMO";
		
		try(PreparedStatement preparedStatement = connection.prepareStatement(sql);
			ResultSet resultSet = preparedStatement.executeQuery()){
			while(resultSet.next()) {
				int id = resultSet.getInt("ID");
				double valor = resultSet.getDouble("VALOR");
				int tributo = resultSet.getInt("TRIBUTO");
				String jurosMensais = resultSet.getString("JUROS_MENSAIS");
				int qtdParcelas = resultSet.getInt("QTD_PARCELAS");
				int qtdParcelasPagas = resultSet.getInt("QTD_PARCELAS_PAGAS");
				
				Calendar data = Calendar.getInstance();
				data.setTimeInMillis(resultSet.getTimestamp("DATA").getTime());
				
				int idContaBancaria = resultSet.getInt("CONTA_BANCARIA_ID");
				
				EmprestimoModel emprestimo = new EmprestimoModel(id, valor, tributo, jurosMensais, qtdParcelas, qtdParcelasPagas, data, null);
				emprestimos.add(emprestimo);
			}
			System.out.println("Dados listados com sucesso");			
		} catch(Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao exibir dados de emprestimo");
			
		}
		return emprestimos;
	}

}
