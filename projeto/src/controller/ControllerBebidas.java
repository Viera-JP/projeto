package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.BebidasBeans;
import model.BebidasDao;
import model.DAO;


@WebServlet(urlPatterns = {"/ControllerBebidas","/mainBebidas","/insertBebidas","/selectBebidas","/updateBebidas","/deleteBebidas"})
public class ControllerBebidas extends HttpServlet {
	private static final long serialVersionUID = 1L;
	DAO dao = new DAO();
	BebidasBeans bebidas = new BebidasBeans();
	BebidasDao bebidasdao = new BebidasDao();
   
    public ControllerBebidas() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getServletPath();
		System.out.println(action);
		dao.testeConexao();
		if (action.equals("/mainBebidas")) {
			bebidas(request, response);
			} else if (action.equals("/insertBebidas")) {
				novoBebidas(request, response);
			}else if (action.equals("/selectBebidas")) {
				listarBebidas(request, response);
			}else if (action.equals("/updateBebidas")) {
				editarBebidas(request, response);
			}else if (action.equals("/deleteBebidas")) {
				deletarBebidas(request, response);
			} else {
				response.sendRedirect("index.jsp");
			}
		} 
	// listar bebidas
		protected void bebidas(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// Criando um objeto que irá receber os dados Bebidabeans
			ArrayList<BebidasBeans> lista = bebidasdao.listarBebidas();
			
			/**for (int i = 0; i < lista.size(); i++) {
				System.out.println(lista.get(i).getIdBebidas());
				System.out.println(lista.get(i).getNomeBebidas());
				System.out.println(lista.get(i).getTamanho());
				System.out.println(lista.get(i).getQuantidadeBebidas());
				System.out.println(lista.get(i).getValorUniBebidas());
				System.out.println(lista.get(i).getValorTotalBebidas());**/
			
			request.setAttribute("bebidas", lista);
			RequestDispatcher rd = request.getRequestDispatcher("estoqueBebidas.jsp");
			rd.forward(request, response);
			}
		
		protected void novoBebidas(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			/**teste de recebimento do formulario
			System.out.println(request.getParameter("nomeBebidas"));
			System.out.println(request.getParameter("tamanho"));
			System.out.println(request.getParameter("quantidadeBebidas"));
			System.out.println(request.getParameter("valorUniBebidas"));
			System.out.println(request.getParameter("valorTotalBebidas"));**/
			
			// setar as variaveis bebidasbeans
			bebidas.setNomeBebidas(request.getParameter("nomeBebidas"));
			bebidas.setTamanho(request.getParameter("tamanho"));
			bebidas.setQuantidadeBebidas(request.getParameter("quantidadeBebidas"));
			bebidas.setValorUniBebidas(request.getParameter("valorUniBebidas"));
			bebidas.setValorTotalBebidas(request.getParameter("valorTotalBebidas"));
			
			// invocar o metodo inserir produto
			bebidasdao.inserirBebidas(bebidas);
			
			response.sendRedirect("mainBebidas");
		}
		
		//editar bebidas
		protected void listarBebidas(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			String idBebidas = request.getParameter("idBebidas");
			
			bebidas.setIdBebidas(idBebidas);
			
			bebidasdao.selecionarBebidas(bebidas);
			
			// setar os atributos do formulario
			request.setAttribute("idBebidas", bebidas.getIdBebidas());
			request.setAttribute("tamanho", bebidas.getTamanho());
			request.setAttribute("nomeBebidas", bebidas.getNomeBebidas());
			request.setAttribute("quantidadeBebidas", bebidas.getQuantidadeBebidas());
			request.setAttribute("valorUniBebidas", bebidas.getValorUniBebidas());
			request.setAttribute("valorTotalBebidas", bebidas.getValorTotalBebidas());
			RequestDispatcher rd = request.getRequestDispatcher("editarBebidas.jsp");
			rd.forward(request, response);
		}
		protected void editarBebidas(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			/**
			 * teste de recebimento System.out.println(request.getParameter("id"));
			 * System.out.println(request.getParameter("nome"));
			 * System.out.println(request.getParameter("quantidade"));
			 **/

			// setar as variaveis javabeans
			bebidas.setIdBebidas(request.getParameter("idBebidas"));
			bebidas.setNomeBebidas(request.getParameter("nomeBebidas"));
			bebidas.setTamanho(request.getParameter("tamanho"));
			bebidas.setQuantidadeBebidas(request.getParameter("quantidadeBebidas"));
			bebidas.setValorUniBebidas(request.getParameter("valorUniBebidas"));
			bebidas.setValorTotalBebidas(request.getParameter("valorTotalBebidas"));
			// executar o metodo alterarProduto
			bebidasdao.alterarBebidas(bebidas);
			// redirecionar para o documento agenda.jsp(att as altera��es)
			response.sendRedirect("mainBebidas");
		}
		
		protected void deletarBebidas(HttpServletRequest request, HttpServletResponse response)
				throws ServletException, IOException {
			// recebimento da id a ser excluida
			String idBebidas = request.getParameter("idBebidas");
			//System.out.println(idBebidas);
			bebidas.setIdBebidas(idBebidas);
			
			bebidasdao.deletarBebidas(bebidas);
			
			// redirecionar para o documento agenda.jsp(att as altera��es)
			response.sendRedirect("mainBebidas");
		
		}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
