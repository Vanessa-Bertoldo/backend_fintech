package br.com.fintech.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.models.CartaoModel;

/*ID                NOT NULL NUMBER(10)    
NOME_BANDEIRA     NOT NULL VARCHAR2(40)  
DATA_VALIDADE     NOT NULL DATE          
COD_SEGURANCA     NOT NULL NUMBER(4)     
NOME_IMPRESSO     NOT NULL VARCHAR2(250) 
TIPO_CARTAO                VARCHAR2(50)  
ATIVO             NOT NULL NUMBER(38)    
CONTA_BANCARIA_ID NOT NULL NUMBER(38) */
public class CartaoDAO implements IDAO<CartaoModel>{

	@Override
	public void create(CartaoModel cartao, Connection connection) {
		PreparedStatement stmt = null;
		try {
            String sql = "INSERT INTO TAB_CARTAO (NOME_BANDEIRA, DATA_VALIDADE, COD_SEGURANCA, NOME_IMPRESSO, TIPO_CARTAO, ATIVO, CONTA_BANCARIA_ID) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?)";
            
            stmt = connection.prepareStatement(sql);

            stmt.setString(1, cartao.getNomeBandeira());
			java.sql.Date date = new java.sql.Date(cartao.getDataValidade().getTimeInMillis());
            stmt.setDate(2, date);
            stmt.setInt(3, cartao.getCodigoSeguranca());
            stmt.setString(4, cartao.getNomeImpresso());
            stmt.setString(5, cartao.getTipoCartao());
            stmt.setInt(6, cartao.isAtivo() == true ? 1 : 0);
            stmt.setInt(7, cartao.getConta().getId());

            stmt.executeUpdate();
		} catch(SQLException e) {
			System.out.println("Erro na instruão sql " + e.getMessage());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Erro ao inserir dados na tabela cartao " + e.getMessage());
		}
	}

	@Override
	public List<CartaoModel> getAll(Connection connection) {
		List<CartaoModel> cartoes = new ArrayList<>();
		String sql = "SELECT * FROM TAB_CARTAO";
		try (PreparedStatement preparedStatement = connection.prepareStatement(sql);
	             ResultSet resultSet = preparedStatement.executeQuery()){
        
            while (resultSet.next()) {
                CartaoModel cartao = new CartaoModel();
                cartao.setNomeBandeira(resultSet.getString("NOME_BANDEIRA"));
                Calendar dataVal = Calendar.getInstance();
                dataVal.setTimeInMillis(resultSet.getTimestamp("DATA_VALIDADE").getTime());
                cartao.setDataValidade(dataVal);
                cartao.setCodigoSeguranca(resultSet.getInt("COD_SEGURANCA"));
                cartao.setNomeImpresso(resultSet.getString("NOME_IMPRESSO"));
                cartao.setTipoCartao(resultSet.getString("TIPO_CARTAO"));
                cartao.setAtivo(resultSet.getInt("ATIVO") == 1 ? true : false);
                
     
                cartoes.add(cartao);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Erro ao recuperar dados da tabela cartao " + e.getMessage());
        } catch(Exception e) {
        	System.out.println("Erro ao listar dados da tabela cartao");
        }
		return cartoes;
	}

}
