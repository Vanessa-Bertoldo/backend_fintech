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
@WebServlet("/Despesa")
public class Despesa extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DBManager dbManager = new DBManager();
	DespesaDAO despesaDAO = new DespesaDAO();

       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Despesa() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        dbManager.openConnection();
    	Connection connection = dbManager.getConnection();
        List<DespesaModel> despesas = despesaDAO.getAll(connection);
        for (DespesaModel despesa : despesas) {
            System.out.println("ID: " + despesa.getId());
            System.out.println("Descricao: " + despesa.getDescricao());
            // Adicione mais linhas conforme necessário para exibir outras informações

            System.out.println("------------------------------------");
        }
		dbManager.closeConnection();
		
		request.setAttribute("despesas", despesas);

		RequestDispatcher dispatcher = request.getRequestDispatcher("/Despesa.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		dbManager.openConnection();
	    Connection connection = dbManager.getConnection();
	    
	    String descricao = request.getParameter("descricao");
        double valor = Double.parseDouble(request.getParameter("valor"));
        String tipo = request.getParameter("tipo");
        
        System.out.println(descricao + valor + tipo);
	    
		DespesaModel despesa = new DespesaModel(1, tipo, valor, Calendar.getInstance(), descricao, 20);
        despesaDAO.create(despesa, connection);
        
		

		doGet(request, response);
		
		dbManager.closeConnection();
	}

}
