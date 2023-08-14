package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DAO;
import model.Javabeans;
import model.ProdutoDao;
import model.LoginBeans;
import model.LoginDao;

@WebServlet(urlPatterns = { "/Controller", "/main", "/insert", "/select", "/update", "/delete", "/login"})
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	Javabeans produto = new Javabeans();
	ProdutoDao produtodao = new ProdutoDao();
	LoginBeans login = new LoginBeans();
	

	public Controller() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		if (action.equals("/main")) {
			produtos(request, response);
		} else if (action.equals("/insert")) {
			novoProduto(request, response);
		} else if (action.equals("/select")) {
			listarProduto(request, response);
		} else if (action.equals("/update")) {
			editarProduto(request, response);
		} else if (action.equals("/delete")) {
			removerProduto(request, response);
		} else if (action.equals("/login")) {
			Logar(request, response);
		} else {
			response.sendRedirect("index.jsp");
		}
		// teste de conex�o
		// dao.testeConexao();
	}

	// listar produtos
	protected void produtos(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Criando um objeto que ir� receber os dados Javabeans
		ArrayList<Javabeans> lista = produtodao.listarProduto();
		/**
		 * for (int i = 0; i < lista.size(); i++) {
		 * System.out.println(lista.get(i).getId());
		 * System.out.println(lista.get(i).getNome());
		 * System.out.println(lista.get(i).getQuantidade()); }
		 **/
		// encaminhar a lista pra estoque.jsp
		request.setAttribute("produto", lista);
		RequestDispatcher rd = request.getRequestDispatcher("estoque.jsp");
		rd.forward(request, response);
	}

	// Novo Produto
	protected void novoProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.sendRedirect("main");
		/**
		 * System.out.println(request.getParameter("nome"));
		 * System.out.println(request.getParameter("quantidade"));
		 **/
		// setar as variaveis javabeans
		produto.setNome(request.getParameter("nome"));
		produto.setQuantidade(request.getParameter("quantidade"));
		produto.setValorUni(request.getParameter("valorUni"));
		produto.setValorTotal(request.getParameter("valorTotal"));
		// invocar o metodo inserir produto
		produtodao.inserirProduto(produto);
	}

	// editar produto

	protected void listarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		// setar a variavel javabeans
		produto.setId(id);
		// executar o metodo selecionar produto
		produtodao.selecionarProduto(produto);
		/**
		 * teste de recebimento System.out.println(produto.getId());
		 * System.out.println(produto.getNome());
		 * System.out.println(produto.getQuantidade());
		 **/
		// setar os atributos do formulario
		request.setAttribute("id", produto.getId());
		request.setAttribute("nome", produto.getNome());
		request.setAttribute("quantidade", produto.getQuantidade());
		request.setAttribute("valorUni", produto.getValorUni());
		request.setAttribute("valorTotal", produto.getValorTotal());
		// Encaminhar ao documento editar.jsp
		RequestDispatcher rd = request.getRequestDispatcher("editar.jsp");
		rd.forward(request, response);
	}

	protected void editarProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/**
		 * teste de recebimento System.out.println(request.getParameter("id"));
		 * System.out.println(request.getParameter("nome"));
		 * System.out.println(request.getParameter("quantidade"));
		 **/

		// setar as variaveis javabeans
		produto.setId(request.getParameter("id"));
		produto.setNome(request.getParameter("nome"));
		produto.setQuantidade(request.getParameter("quantidade"));
		produto.setValorUni(request.getParameter("valorUni"));
		produto.setValorTotal(request.getParameter("valorTotal"));
		// executar o metodo alterarProduto
		produtodao.alterarProduto(produto);
		// redirecionar para o documento agenda.jsp(att as altera��es)
		response.sendRedirect("main");

	}

	// remove produto

	protected void removerProduto(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// recebimento da id a ser excluida
		String id = request.getParameter("id");
		// System.out.println(id);
		produto.setId(id);
		// executar o metodo deletarProduto
		produtodao.deletarProduto(produto);
		// redirecionar para o documento agenda.jsp(att as altera��es)
		response.sendRedirect("main");
	}

	protected void Logar(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		/** teste de recebimento
		System.out.println(request.getParameter("login"));
		System.out.println(request.getParameter("senha"));**/
		
		//setar as variaveis na classe loginbeans
		String login = request.getParameter("login");
		String senha = request.getParameter("senha");
		//executar o método de login
		
		LoginDao logindao = new LoginDao();
		boolean resultado = logindao.verificarLogin(login,senha);
		
		
		if(resultado) { // se o login foi confirmado com sucesso
			//redirecionar para a index
			response.sendRedirect("index.jsp");
		} else { // se o login não foi confirmado
			//exibir mensagem de erro na tela de login
			request.setAttribute("mensagem", "Login e/ou senha inválidos!");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
		}
	}

	

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
