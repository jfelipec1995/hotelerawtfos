package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.BarReservaRepositorio;
import Clases.BarReserva;

/**
 * Servlet implementation class BarControlador
 */
@WebServlet("/BarControlador")
public class BarControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("Bar.jsp");
        
        try{
        	int documento_identidad=Integer.parseInt(request.getParameter("dochuesped"));
        	int reserva_personas=Integer.parseInt(request.getParameter("numper"));
        	int promedio_edades=Integer.parseInt(request.getParameter("edper"));
        	String fecha_reserva=request.getParameter("fechrese");
        	String hora_reserva=request.getParameter("horeser");
        	
        	BarReserva nreserva= new BarReserva(documento_identidad,reserva_personas,promedio_edades,fecha_reserva,hora_reserva);
        	BarReservaRepositorio.agregar(nreserva);
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            }finally {
         rd.forward(request, response); 
        }
	}    
    public BarControlador() {
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
