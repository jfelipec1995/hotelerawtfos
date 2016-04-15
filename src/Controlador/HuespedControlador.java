package Controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import BD.HuespedRepositorio;
import Clases.DatosHuesped;

/**
 * Servlet implementation class HuespedControlador
 */
@WebServlet("/HuespedControlador")
public class HuespedControlador extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void responder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     PrintWriter out = response.getWriter();   
        try{
        	int documento_huesped=Integer.parseInt(request.getParameter("dochuesped"));
        	String nombre_huesped=request.getParameter("nomhuesped");
        	String apellido_huesped=request.getParameter ("apehuesped");
        	int telefono_huesped= Integer.parseInt(request.getParameter("telhuesped"));
        	String correo_huesped=request.getParameter("corrhuesped");
        	String Est_civil_huesped=request.getParameter("estadohuesped");
        	int num_habitacion_huesped=Integer.parseInt(request.getParameter("habitacion"));
        	
             
        DatosHuesped ndatoshuesped= new DatosHuesped(documento_huesped,nombre_huesped, apellido_huesped, telefono_huesped, correo_huesped,Est_civil_huesped, num_habitacion_huesped);
        HuespedRepositorio.agregar(ndatoshuesped);
        
        if (num_habitacion_huesped > 0){
            RequestDispatcher rd = request.getRequestDispatcher("Menu.jsp");
            rd.forward(request,response);

        	
        }else{
        	out.print("<p style=\"color:green\">Seleccione una Habitacion</p>");
            RequestDispatcher rd = request.getRequestDispatcher("Huesped.jsp");
            rd.forward(request,response);
        }
        out.close();
    	    	
        }catch (NumberFormatException e) {
            request.setAttribute("estado", "error");
            }
             }      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HuespedControlador() {
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
