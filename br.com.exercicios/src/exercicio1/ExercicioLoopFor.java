package exercicio1;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ExercicioLoopFor extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ExercicioLoopFor() {
        // TODO Auto-generated constructor stub
    }


protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String paramum1 = request.getParameter("paramum1");
		String paramum2 = request.getParameter("paramum2");
		int valorP1 = Integer.parseInt(paramum1);
		int valorP2 = Integer.parseInt(paramum2);
		String resultaComparação;
		
		if (valorP1 == valorP2) {
			resultaComparação = "O valor de P1 (" + valorP1 + ") é igual ao valor de P2 (" + valorP2 + ")";
		} else If (valorP1 > valorP2) {
			resultaComparação = "O valor de P1 (" + valorP1 + ") é igual ao valor de P2 (" + valorP2 + ")";
		} else {resultaComparação = "O valor de P1 (" + valorP1 + ") é igual ao valor de P2 (" + valorP2 + ")";}
		}	
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
