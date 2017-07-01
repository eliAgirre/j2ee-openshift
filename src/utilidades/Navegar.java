package utilidades;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Navegar {
	
	public static void navegar(String direccion,HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
		
		//Lanza la pagina
		RequestDispatcher despachador=request.getRequestDispatcher(direccion);
		
		// se utiliza para jsp
		despachador.forward(request,response);
		
	} // navegar
}