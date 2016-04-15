package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Clases.TipoPlan;
	
	public class ConsultaTipoPlan {
		public static ArrayList<TipoPlan> getNombre_tipoplan(){
			ArrayList<TipoPlan> listaPlanes = new ArrayList<TipoPlan>();	
	        Connection con = null;
	        Statement sql = null;
	        {        	
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos", "root", "root");
	            sql = con.createStatement();
	            ResultSet rs = sql.executeQuery("Select * from tipo_plan");  
	            while (rs.next()){
	            	TipoPlan huesped = new TipoPlan(rs.getString("ti_nombre_plan"), rs.getInt("ti_precio_plan"), rs.getInt("ti_cantidad_huespedes"),rs.getString("ti_todo_incluido"));
	            	huesped.setNombre_tipoplan(rs.getString("ti_nombre_plan"));            	
	            	listaPlanes.add(huesped);
	                }
	            System.out.println("conexion establecida ");	
	            rs.close();       
	            } catch (Exception e) {
	            System.out.println("error en la conexion" + e);
	            }
	        }
			return listaPlanes; 
		}
	}


