package br.com.tipos;

/* Endereço browser
 * http://localhost:8085/ExercServlet/Condicional?paramum=1  (&paramdois=4&paramtres=5)
 */

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Condicional
 */
public class Condicional extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Condicional() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String paramum = request.getParameter("paramum");
		int x = Integer.parseInt(paramum);
		String mensagemASerExibida;
		
		if (x==1) {
			mensagemASerExibida = "O nº informado esta correto";
		} else {
			mensagemASerExibida = "O nº informado está incorreto, deve ser 1";
		}	

////	
		convertNumberToExtenso(paramum);
		
//		PrintWriter writer = response.getWriter();		
//		writer.write("<html><body>");
//		writer.write(mensagemASerExibida);
//		writer.write("</body></html>");
		
	}

	
	String convertNumberToExtenso(String numero) {
		String retorno = null;
		
		if(numero != null && !numero.equals("")) {
			if(numero.equals("1")) 
				retorno = "Um";
			else if(numero.equals("2"))
				retorno = "Dois";
			else if(numero.equals("3"))
				retorno = "Três";
			else 
			{
				retorno = "O lenin vai fazer o retante";
			}
						
		}
		return retorno;	
	}
}
