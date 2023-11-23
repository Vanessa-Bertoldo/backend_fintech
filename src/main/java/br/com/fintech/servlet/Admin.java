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
import br.com.fintech.dao.DespesaDAO;
import br.com.fintech.models.DespesaModel;

/**
 * Servlet implementation class Admin
 */
@WebServlet("/admin")
public class Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBManager dbManager = new DBManager();
	DespesaDAO despesaDAO = new DespesaDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Admin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection = dbManager.getConnection();
		List<DespesaModel> investimento = despesaDAO.getAll(connection);
		
		double totEntradas = 0.0, totSaidas = 0.0, total = 0.0;
		
		for (DespesaModel despesa : investimento) {
			System.out.println("EntradaFor");
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

		RequestDispatcher dispatcher = request.getRequestDispatcher("/admin.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
