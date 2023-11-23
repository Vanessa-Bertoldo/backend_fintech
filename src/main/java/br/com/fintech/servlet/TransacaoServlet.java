package br.com.fintech.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.fintech.DBConnection.DBManager;
import br.com.fintech.dao.TransacaoDAO;
import br.com.fintech.models.TransacaoModel;

@WebServlet("/Transacao")
public class TransacaoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	DBManager dbManager = new DBManager();
	TransacaoDAO transacaoDAO = new TransacaoDAO();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = dbManager.getConnection();
		List<TransacaoModel> investimento = transacaoDAO.getAll(connection);

		request.setAttribute("transacoes", investimento);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/transacao.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Connection connection = dbManager.getConnection();
		
		String nome =  request.getParameter("nome");
		String sobrenome =request.getParameter("sobrenome");
		String username =request.getParameter("username");
		String email =request.getParameter("email");
		String endereco =request.getParameter("endereco");
		String pais =request.getParameter("pais");
		String cep =request.getParameter("cep");
		String paymentMethod =request.getParameter("paymentMethod");
		String nomeCartao =request.getParameter("nomeCartao");
		String cartao =request.getParameter("cartao");
		String cartaoExpiracao =request.getParameter("cartaoExpiracao");
		String cartaoCodigo =request.getParameter("cartaoCodigo");
		
		doGet(request, response);
	}

}
