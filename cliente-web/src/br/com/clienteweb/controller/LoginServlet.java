package br.com.clienteweb.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("inputEmail");
		String senha = request.getParameter("inputPassword");
		
		IDefaultDao daoUsuario = new UsuarioDao();
		List<Usuario> Lista = (<List<Usuario>) daoUsuarioDao.select();
		
		boolean autenticado = false;
		
		private String getparamter(HttpServletRequest request, String parametro) {
			
			if (request != null && parametro != null && !request.equals("")) {
				for (String cliente : clientes) {
					if (cliente.toUpperCase().contains(filtro.toUpperCase()))
						autenticado = true;
				}
			} else {
				autenticado = false;
			
		}


	
			}
			return autenticado;
		
	}

}
