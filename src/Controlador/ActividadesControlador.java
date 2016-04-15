package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ActividadesReservaRepositorio;
import Clases.ActividadesReserva;

/**
 * Servlet implementation class ActividadesControlador
 */
@WebServlet("/ActividadesControlador")
public class ActividadesControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Actividades.jsp");
        
        try{
        	int documento=Integer.parseInt(request.getParameter("dochuesped"));
        	String NombreActividad=request.getParameter("nomacti");
        	String FechReserva=request.getParameter("fechrese");
        	String HoraReserva=request.getParameter("horeser");
        	
        	ActividadesReserva nreserva=new ActividadesReserva(documento,NombreActividad,FechReserva,HoraReserva);
        	ActividadesReservaRepositorio.agregar(nreserva);
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            }finally {
         rd.forward(request, response); 
        }
	}    
	public ActividadesControlador() {
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
