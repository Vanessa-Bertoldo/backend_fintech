package br.com.fintech.servlet;

import java.io.Console;
import java.io.IOException;
import java.io.PrintWriter;
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
import br.com.fintech.dao.DespesaDAO;
import br.com.fintech.models.DespesaModel;

/**
 * Servlet implementation class Despesa
 */
@WebServlet("/Investimento")
public class Investimento extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBManager dbManager = new DBManager();
	DespesaDAO despesaDAO = new DespesaDAO();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Investimento() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Connection connection = dbManager.getConnection();
		List<DespesaModel> investimento = despesaDAO.getAll(connection);
		
		double totEntradas = 0.0, totSaidas = 0.0, total = 0.0;
		
		for (DespesaModel despesa : investimento) {
			String tipo = despesa.getTipo();
			double valor = despesa.getValor();
			if(tipo.equals("entrada")) {
				totEntradas += valor;
			} else {
				totSaidas += valor;
			}
			
		}
		total = totEntradas - totSaidas;

		request.setAttribute("totEntradas", totEntradas);
		request.setAttribute("totSaidas", totSaidas);
		request.setAttribute("total", total);
		request.setAttribute("investimentos", investimento);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/investimento.jsp");
		RequestDispatcher dispatcher2 = request.getRequestDispatcher("/admin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		dbManager.openConnection();
		Connection connection = dbManager.getConnection();

		String descricao = request.getParameter("descricao");
		double valor = Double.parseDouble(request.getParameter("valor"));
		String tipo = request.getParameter("tipo");

		DespesaDAO despesaDAO = new DespesaDAO();
		//DespesaModel despesa = new DespesaModel(1, "teste", 128888, Calendar.getInstance(), "Urgente", 18);

		DespesaModel despesa = new DespesaModel(1, tipo, valor, Calendar.getInstance(), descricao, 18);
		// Calendar.getInstance(), descricao, 20);
		despesaDAO.create(despesa, connection);

		doGet(request, response);

		// dbManager.closeConnection();
	}

}
