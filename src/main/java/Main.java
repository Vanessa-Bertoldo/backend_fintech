import java.sql.Connection;
import java.util.Calendar;
import java.util.List;

import br.com.fintech.DBConnection.DBManager;
import br.com.fintech.dao.CartaoDAO;
import br.com.fintech.dao.ContaBancariaDAO;
import br.com.fintech.dao.DespesaDAO;
import br.com.fintech.dao.EmprestimoDAO;
import br.com.fintech.dao.EnderecoDAO;
import br.com.fintech.dao.InvestimentoDAO;
import br.com.fintech.dao.TransacaoDAO;
import br.com.fintech.dao.UsuarioDAO;
import br.com.fintech.models.CartaoModel;
import br.com.fintech.models.ContaBancariaModel;
import br.com.fintech.models.DespesaModel;
import br.com.fintech.models.EmprestimoModel;
import br.com.fintech.models.EnderecoModel;
import br.com.fintech.models.InvestimentoModel;
import br.com.fintech.models.TransacaoModel;
import br.com.fintech.models.UsuarioModel;

public class Main {

	public static void main(String[] args) {
		EnderecoModel end = new EnderecoModel(6, "31313", "teste", "teste", "teste", "teste");
		UsuarioModel user = new UsuarioModel(18, "teste", "teste","teste", "teste", Calendar.getInstance(), 25.55, end, true,"teste");
		System.out.println("id " + end.getId());
		
		DBManager dbManager = new DBManager();
		 // Abrir a conexão
		dbManager.openConnection();
        Connection connection = dbManager.getConnection();
        
        //ENDERECO===================================================
        EnderecoDAO endDAO = new EnderecoDAO();
        //endDAO.create(end, connection);
        List<EnderecoModel> enderecos = endDAO.getAll(connection);
        //System.out.println(enderecos.toString());
        
        //USUARIO===================================================
        UsuarioDAO userDAO = new UsuarioDAO();
        //userDAO.create(user, connection);
        List<UsuarioModel> usuarios = userDAO.getAll(connection);
        //System.out.println(usuarios.toString());
        
        //CONTA BANCARIA============================================
        ContaBancariaDAO contaDAO = new ContaBancariaDAO();
        ContaBancariaModel conta = new ContaBancariaModel(9,"1212", "8585", 252, "poupança",true, user);
        //contaDAO.create(conta, connection);
        List <ContaBancariaModel> contas = contaDAO.getAll(connection);
       // System.out.println(contas);
        
        
        //EMPRESTIMO===============================================
        EmprestimoDAO empDAO = new EmprestimoDAO();
        List<EmprestimoModel> emprestimos = empDAO.getAll(connection);
        //System.out.println(emprestimos.toString());
        EmprestimoModel emprestimo = new EmprestimoModel(2, 2525.0, 55.2, "25%", 12, 6, Calendar.getInstance(), conta);
        //empDAO.create(emprestimo, connection);
        
        
        //CARTAO===================================================
        CartaoDAO cartaoDAO = new CartaoDAO();
        CartaoModel cartao = new CartaoModel("Visa", Calendar.getInstance(), 123, "Vanessa", 5845458, "credito", true, conta);
        //cartaoDAO.create(cartao, connection);
        List<CartaoModel> cartoes = cartaoDAO.getAll(connection);
        //System.out.println(cartoes.toString());
        
        
        //INVESTIMENTO=============================================
        InvestimentoDAO invesDao = new InvestimentoDAO();
        InvestimentoModel investimento = new InvestimentoModel(2, "poupança", 855, Calendar.getInstance(), Calendar.getInstance(), 20);
        //invesDao.create(investimento, connection);
        //List<InvestimentoModel> investimentos = invesDao.getAll(connection);
        //System.out.println(investimentos.toString());
        
        
        //TRANSACAO
        TransacaoDAO transDAO = new TransacaoDAO();
        TransacaoModel transacao = new TransacaoModel(2, "PIX", 455, Calendar.getInstance(), Calendar.getInstance(), 20);
        transDAO.create(transacao, connection);
        //List<TransacaoModel> transacoes = transDAO.getAll(connection);
        //System.out.println(transacoes.toString());
        
        
        //DESPESA
        DespesaDAO despesaDAO = new DespesaDAO();
        DespesaModel despesa = new DespesaModel(1, "Agiota", 128888, Calendar.getInstance(),"Urgente", 20);
        despesaDAO.create(despesa, connection);
        List<DespesaModel> despesas = despesaDAO.getAll(connection);
        System.out.println(despesas.toString());
        
        
        
        
        dbManager.closeConnection();
        
      

	}

}
