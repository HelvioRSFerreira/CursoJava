package br.com.cursos.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Chamada no browser http://localhost:8085/ProjetoServlet/Busca?filtro=Clésio
 */


/**
 * Servlet implementation class ClientServlet
 */
public class ClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private List<String> clientes;

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String filtro = req.getParameter("filtro");
		List<String> resultado = filtrarClientes(filtro);

		PrintWriter writer = resp.getWriter();

		writer.write("<html><body>");
		writer.write("<ul>");

		for (String item : resultado) {
			writer.write("<li>" + item + "</li>");

		}

		writer.write("</ul>");
		writer.write("</body></html>");

	}

	private List<String> filtrarClientes(String filtro) {

		List<String> clientes = new ArrayList<String>();
		List<String> listaFiltrada = new ArrayList<String>();

		clientes.add("Hélvio");
		clientes.add("Cátia");
		clientes.add("Clésio");
		clientes.add("Janjan");
		clientes.add("Sergio");

		if (!filtro.equals("")) {
			for (String cliente : clientes) {
				if (cliente.toUpperCase().contains(filtro.toUpperCase()))
					listaFiltrada.add(cliente);
			}
		} else {
			listaFiltrada = clientes;
		}
		return listaFiltrada;

	}

}
