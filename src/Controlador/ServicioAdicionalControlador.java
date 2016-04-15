package Controlador;

import java.io.IOException;




import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.serAdicionalesNRepositorio;
import BD.serAdicionalesPRepositorio;
import Clases.ServicioAdicional;

/**
 * Servlet implementation class ServicioAdicionalControlador
 */
@WebServlet("/ServicioAdicionalControlador")
public class ServicioAdicionalControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("ServicioAdicional.jsp");
        
        try{        	
        	String nombre=request.getParameter("servicio");
        	String FechaServicio=request.getParameter("fecservi");
        	
        	
        	if (request.getParameter("servicio").equals("Periodico")){
        		ServicioAdicional nservicio= new ServicioAdicional(new serAdicionalesPRepositorio(), nombre, FechaServicio);
            	nservicio.agregar();             	
        	}else{
        		ServicioAdicional nservicio= new ServicioAdicional(new serAdicionalesNRepositorio(), nombre, FechaServicio);
            	nservicio.agregar();
        	}
        	
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            }finally {
         rd.forward(request, response); 
        }
	}
    public ServicioAdicionalControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
