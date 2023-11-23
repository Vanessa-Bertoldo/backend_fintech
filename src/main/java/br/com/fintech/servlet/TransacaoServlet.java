package br.com.fintech.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.util.Calendar;
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

		String dataVencimento = request.getParameter("dataVencimento");
		double valor = Double.parseDouble(request.getParameter("valor"));
		String tipo = request.getParameter("tipo");

		TransacaoModel transacao = new TransacaoModel();
		transacao.setUsuarioID(20);
		transacao.setTipo(tipo);
		transacao.setValor(valor);
		transacao.setDataCriacao(Calendar.getInstance());
		transacao.setDataVencimento(Calendar.getInstance());
		transacaoDAO.create(transacao, connection);

		doGet(request, response);
	}

}
