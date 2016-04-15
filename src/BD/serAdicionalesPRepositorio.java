package BD;

import Clases.ServicioAdicional;
import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class serAdicionalesPRepositorio implements IserAdicionalesRepositorio{

	@Override
	public void agregar(ServicioAdicional ServiAdicional) {
		Connection con;
		Statement st;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
           
            	String i = "INSERT INTO `erawtfos`.`servicios_adicionales` (`serad_nombre`, `serad_fechaServicio`) VALUES  ('"+ ServiAdicional.getNombre()+ "','"+ ServiAdicional.getFechaServicio()+ "')"; 
            	System.out.println("ServicioAdicionalPRepositorio" + i);
            	st.executeUpdate(i);
            	st.close();            	

            	String escribir = i;
            	
            	File archivo = new File ("C:\\Users\\CristianDavid\\workspace\\proyectoTexto");
            	
            	if (!archivo.exists()) {
    				archivo.createNewFile();
    				System.out.println("Se ha creado el archivo");    				
    			}            	
                FileWriter w = new FileWriter(archivo);
                BufferedWriter bw = new BufferedWriter(w);

                bw.write(escribir);                
                System.out.println(escribir);          
                bw.close();
          
		
	}catch (IOException e) {
		System.out.println("La clase no existe");	
		System.err.println("No se ha podido crear el archivo" + e );
		System.out.println("NOOO Se ha creado el archivo");	
	}catch (SQLException e){
		throw new RuntimeException(e);
	}catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}


		
	}
	

