package br.usjt.controle;

import java.io.IOException;
import java.sql.Connection;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.usjt.dominio.DAOFactory;
import br.usjt.dominio.Fachada;

/**
 * Servlet implementation class ServletControle
 */
@WebServlet("/ServletControle")
public class ServletControle extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletControle() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// TODO Auto-generated method stub
				String userName = request.getParameter("userName");
				String password = request.getParameter("password");
				String acao = request.getParameter("acao"); // controla a logica de
															// aplicação
				String cadastraOK = "false";
				String url = "";
				String achou = "false";
				//ArrayList<Filme> filmes = new ArrayList<Filme>();
				String cpf;
				String nome;
				String endereco;
				String telefone;
				String mensagem;
				Fachada fachada = new Fachada();
				Connection con = DAOFactory.criaConexao();
				
				if (acao.equals("FormLogin")) {

					if (fachada.login(userName, password)) {
						
						achou = "true";
						url = "/visao/FormMenu.jsp";
					} else {
						achou = "false";
						url = "/visao/FormLogin.jsp";
					}
				}
				/*
				 * 87126514190
				 */
				if (acao.equals("cadastraCliente")) {
					cpf = request.getParameter("cpf");
					nome = request.getParameter("nome");
					endereco = request.getParameter("endereco");
					telefone = request.getParameter("telefone");
					cadastraOK = fachada.cadastraCliente(cpf, nome, endereco, telefone);
					request.setAttribute("cadastraOK", cadastraOK);
					url = "/visao/FormCadastraCliente.jsp";

				}
				RequestDispatcher rd = request.getRequestDispatcher(url);
				rd.forward(request, response);
	}

}
