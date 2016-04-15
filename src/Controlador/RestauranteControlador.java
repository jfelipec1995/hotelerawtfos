package Controlador;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import BD.RestauranteRepositorio;

import Clases.RestauranteReserva;

/**
 * Servlet implementation class RestauranteControlador
 */
@WebServlet("/RestauranteControlador")
public class RestauranteControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("Restaurante.jsp");
		try{
        	int documento_huesped=Integer.parseInt(request.getParameter("dochuesped"));
        	int numero_personas=Integer.parseInt(request.getParameter("numper"));
        	String fecha_reserva=request.getParameter ("fechrese");
        	String hora_reserva=request.getParameter("horeser");
        	
        	
             
        RestauranteReserva ndatoshuesped= new RestauranteReserva(documento_huesped,numero_personas, fecha_reserva, hora_reserva);
        RestauranteRepositorio.agregar(ndatoshuesped);
        
        
            
            rd.forward(request,response);

        	
       
        
       
    	    	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }
             }
        
	
        
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RestauranteControlador() {
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
