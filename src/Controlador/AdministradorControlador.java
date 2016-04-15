package Controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import BD.AdministradorRepositorio;
import javax.servlet.RequestDispatcher;
import java.io.PrintWriter;

/**
 * Servlet implementation class AdministradorControlador
 */


@WebServlet("/AdministradorControlador")
public class AdministradorControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");    
        PrintWriter out = response.getWriter();    
          
        String n =request.getParameter("nomadministrador");    
        String p =request.getParameter("contadministrador");        
        
        HttpSession session = request.getSession(false);  
        if(session!=null)  
        session.setAttribute("name", n );  
  		
		if(AdministradorRepositorio.validate(n, p)){    
            RequestDispatcher rd=request.getRequestDispatcher("HuespedControlador.java");    
            rd.forward(request,response);
            out.println("Entro al if");
        }    
        else{    
            out.print("<p style=\"color:red\">Usuario y/o Contraseña Invalidos</p>");    
            RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");    
            rd.include(request,response);    
        }   
        out.close();    
    }    

}


