package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.BarReserva;

public class BarReservaRepositorio {
	public BarReservaRepositorio(BarReserva BarReserva1){
	}
	public static void agregar(BarReserva BarReserva1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            String i="INSERT INTO bar (`hu_documento`, `bar_num_personas`,`bar_ran_edades`, `bar_fec_reserva`, `bar_hor_reserva`)VALUES ("+ BarReserva1.getDocumento_huesped()+ ","+ BarReserva1.getNumPersonas()+ ","+ BarReserva1.getRanEdades()+ ",'"+ BarReserva1.getFechReserva()+ "','"+ BarReserva1.getHoraReserva()+ "')"; 
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
		
	
