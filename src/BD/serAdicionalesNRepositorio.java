package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.ServicioAdicional;

public class serAdicionalesNRepositorio implements IserAdicionalesRepositorio{

	@Override
	public void agregar(ServicioAdicional ServiAdicional) {
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            String i= "INSERT INTO `erawtfos`.`servicios_adicionales` (`serad_nombre`, `serad_fechaServicio`) VALUES  ('"+ ServiAdicional.getNombre()+ "','"+ ServiAdicional.getFechaServicio()+ "')";  
            System.out.println("ServicioAdicionalNRepositorio" + i);
            st.executeUpdate(i);
            st.close();
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
    }
}
	
