package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.models.UsuarioModel;

public class UsuarioDAO implements IDAO<UsuarioModel>{

	@Override
	public void create(UsuarioModel usuario, Connection connection) {
		PreparedStatement stmt = null;
		
		try {
			String sql = "INSERT INTO TAB_USUARIO(NOME, EMAIL, SENHA, CARGO, "
					+ "SALARIO, ADMINISTRADOR, ID_ENDERECO, TELEFONE, DATANASC)"
					+ "VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
			stmt = connection.prepareStatement(sql);
			stmt.setString(1, usuario.getNome());
			stmt.setString(2, usuario.getEmail());
			stmt.setString(3, usuario.getSenha());
			stmt.setString(4, usuario.getCargo());
			stmt.setDouble(5, usuario.getSalario());
			stmt.setInt(6, usuario.isAdm() == true ? 1 : 0);
			stmt.setInt(7, usuario.getEndereco().getId());
			stmt.setString(8, usuario.getTelefone());
			java.sql.Date date = new java.sql.Date(usuario.getDataNascimento().getTimeInMillis());
			stmt.setDate(9, date);
			stmt.executeUpdate();
			
			
			System.out.println("Dados inseridos com sucesso");
		} catch (Exception e) {
			System.out.println("Erro ao inserir dados" + e.getMessage());
		}
		
	}

	@Override
	public List<UsuarioModel> getAll(Connection connection) {
			List<UsuarioModel> usuarios = new ArrayList<>();
			String sql = "SELECT * FROM TAB_USUARIO";
			System.out.println("entrada while");
			
			try {
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				ResultSet resultSet = preparedStatement.executeQuery();
				Calendar calendar = Calendar.getInstance();
	           
				while(resultSet.next()) {
					boolean  adm;
					int id = resultSet.getInt("ID");
					int id_endereco = resultSet.getInt("ID_ENDERECO");
					String nome = resultSet.getString("NOME");
					String email = resultSet.getString("EMAIL");
					String senha = resultSet.getString("SENHA");
					String cargo = resultSet.getString("CARGO");
					double salario = resultSet.getDouble("SALARIO");
					String telefone = resultSet.getString("TELEFONE");
					int isAdm = resultSet.getInt("ADMINISTRADOR");
					if(isAdm == 1) {
						adm = true;
					} else {
						adm = false;
					}
					Calendar dataNasc = Calendar.getInstance();
					//dataNasc.setTimeInMillis(resultSet.getTimestamp("DATANASC").getTime());
					
					UsuarioModel user = new UsuarioModel(id, nome, email, telefone, cargo, dataNasc, salario, null, adm, senha);
					usuarios.add(user);
				}
 			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Erro ao listar dados de usuarios " + e.getMessage());
			}
			
			return usuarios;
	}

}
