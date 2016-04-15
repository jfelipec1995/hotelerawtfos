package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.RestauranteReserva;

public class RestauranteRepositorio {
	public RestauranteRepositorio(RestauranteReserva DatosHuesped1){
	}
	public static void agregar(RestauranteReserva DatosHuesped1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            String i="INSERT INTO restaurante (`hu_documento`, `res_num_personas`,`res_fecha_reserva`, `res_hora_reserva`)VALUES ("+ DatosHuesped1.getDocumento_huesped()+ ","+ DatosHuesped1.getNumeroPersonas()+ ",'"+ DatosHuesped1.getFechaReserva()+ "','"+ DatosHuesped1.getHoReserva()+ "')"; 
            System.out.println(i);
            st.executeUpdate(i);
            st.close();
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
	