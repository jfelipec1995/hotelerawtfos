package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.DatosHuesped;

public class HuespedRepositorio {
	public HuespedRepositorio(DatosHuesped DatosHuesped1){
	}
	public static void agregar(DatosHuesped DatosHuesped1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            String i="INSERT INTO huesped (`hu_documento`, `hu_nombre`, `hu_apellido`, `hu_telefono`, `hu_correo`, `hu_estado_civil`, `hu_num_habitacion`) VALUES ("+ DatosHuesped1.getDocumento_huesped()+ ",'"+ DatosHuesped1.getNombre_huesped()+ "','"+ DatosHuesped1.getApellido_huesped()+ "',"+ DatosHuesped1.getTelefono_huesped()+ ",'"+ DatosHuesped1.getCorreo_huesped()+ "','" + DatosHuesped1.getEst_civil_huesped()+ "'," + DatosHuesped1.getNum_habitacion_huesped()+ ")"; 
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
	
            
           
            