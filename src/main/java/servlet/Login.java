package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.User;
import utilidades.Navegar;

//@WebServlet("/Login")
public class Login extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	    
	    if (!request.getParameter("username").equalsIgnoreCase("") && !request.getParameter("password").equalsIgnoreCase("")){
	    	
	    	User userBean = new User();
	    	userBean.setUsername(request.getParameter("username"));
	    	userBean.setPassword(request.getParameter("password"));
	    	request.setAttribute("user", userBean);
	    	Navegar.navegar("resultado.jsp",request,response);
	    }
	    else {
			
			// llama a una pagina HTML sin datos
			response.sendRedirect("error.html");
		}
	    
	} // doPost

}