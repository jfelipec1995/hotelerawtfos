package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.ActividadesReserva;

public class ActividadesReservaRepositorio {
	public ActividadesReservaRepositorio(ActividadesReserva ActividadesReserva1){
	}
	public static void agregar(ActividadesReserva ActividadesReserva1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            String i="INSERT INTO actividades (`hu_documento`, `act_nombre_actividad`,`act_fecha_reserva`,`act_hora_reserva`)VALUES ("+ ActividadesReserva1.getDocumento_huesped()+ ",'"+ ActividadesReserva1.getNombreActividad()+ "','"+ ActividadesReserva1.getFechReserva()+ "','"+ ActividadesReserva1.getHoraReserva()+ "')"; 
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