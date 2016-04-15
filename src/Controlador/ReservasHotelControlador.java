package Controlador;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.ConsultaTipoPlan;
import BD.ReservaHuespedRepositorio;
import Clases.HuespedReserva;

/**
 * Servlet implementation class ReservasHotelControlador
 */
@WebServlet("/ReservasHotelControlador")
public class ReservasHotelControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	/**
     * @see HttpServlet#HttpServlet()
     */
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		RequestDispatcher rd = request.getRequestDispatcher("ReservaHotel.jsp");
        
        try{
        	int documento_huesped=Integer.parseInt(request.getParameter("dochuesped"));
        	int num_noches=Integer.parseInt(request.getParameter("numnoche"));
        	String nombre_plan=request.getParameter("nomplan");
        	String sex_huesped=request.getParameter("sexhuesped");
        	String pareja_huesped=request.getParameter("parhuesped");
        	String num_hijos_huesped=request.getParameter("hijhuesped");
        	String Habilidades_natacion=request.getParameter("nathuesped");
        	String reporte_datacredito=request.getParameter("dathuesped");
        	int capacidad_economica=Integer.parseInt(request.getParameter("caphuesped"));
        	String enfermedades_huesped=request.getParameter("fhuesped");
        	
        	HuespedReserva nreserva= new HuespedReserva(documento_huesped, num_noches,nombre_plan,sex_huesped, pareja_huesped,num_hijos_huesped,Habilidades_natacion,reporte_datacredito,capacidad_economica, enfermedades_huesped);
        	ReservaHuespedRepositorio.agregar(nreserva);
        	
        }catch (NumberFormatException e) {
        	e.printStackTrace();
            request.setAttribute("estado", "error");
        }finally {
         request.setAttribute("TipoPlan",ConsultaTipoPlan.getNombre_tipoplan());	
         rd.forward(request, response); 
        }
	}   
       
    
    public ReservasHotelControlador() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 RequestDispatcher rd = request.getRequestDispatcher("ReservaHotel.jsp");
		 request.setAttribute("TipoPlan",ConsultaTipoPlan.getNombre_tipoplan());	
         rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		responder(request,response);
	}

}
