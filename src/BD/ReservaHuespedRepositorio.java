package BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import Clases.HuespedReserva;

public class ReservaHuespedRepositorio {
	public ReservaHuespedRepositorio(HuespedReserva HuespedReserva1){
	}
	public static void agregar(HuespedReserva HuespedReserva1){
		Connection con;
        Statement st;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/erawtfos","root", "root");
            st = con.createStatement();
            if(HuespedReserva1.nombre_plan.equals("Romantico")){ 
            	if(HuespedReserva1.sex_huesped.equals("m")&&(HuespedReserva1.pareja_huesped.equals("f"))){
            		String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";             		System.out.println(i);
            		st.executeUpdate(i);
            		st.close();
            		}            	
            		else {
            			if(HuespedReserva1.nombre_plan.equals("Romantico")){ 
            				if(HuespedReserva1.sex_huesped.equals("f")&&(HuespedReserva1.pareja_huesped.equals("m"))){ 
            					String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";             					System.out.println(i);
            					st.executeUpdate(i);
            					st.close();
            				}
            				else{
								System.out.println("El sexo de la pareja no es apto para el plan");
								}
            			}          			
            			else {
        					if(HuespedReserva1.nombre_plan.equals("Sol")){
        						if(HuespedReserva1.capacidad_economica > 10000){
        							String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";                 					System.out.println(i);
                					st.executeUpdate(i);
                					st.close();
        						}
        						else{
        							System.out.println("No tiene plata en la cuenta para pagar este plan");
        						}
        					}
        					else {
        						if(HuespedReserva1.nombre_plan.equals("Romantico")){
        							if(HuespedReserva1.enfermedades_huesped.equals("n")){
        								String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";                     					System.out.println(i);
                    					st.executeUpdate(i);
                    					st.close();
        							}
        							else{
        								System.out.println("El huesped no puede disfrutar de este plan");
        							}
        						}
        						else{
        							if(HuespedReserva1.nombre_plan.equals("Familiar")){
        								if(HuespedReserva1.reporte_datacredito.equals("n")){
        									String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`, `habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')"; 
        									System.out.println(i);
                        					st.executeUpdate(i);
                        					st.close();
        								}
        								else{
        									if(HuespedReserva1.nombre_plan.equals("Familiar")){
        										if(HuespedReserva1.hijos_huesped.equals("s")){
        											String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";  
            	                					System.out.println(i);
            	                					st.executeUpdate(i);
            	                					st.close();
        										}
        										else{
        											if(HuespedReserva1.nombre_plan.equals("Familiar")){
                										if(HuespedReserva1.Habilidades_natacion.equals("s")){
                											String i = "INSERT INTO reservashotel (`hu_documento`, `NumeroNoches`, `NombrePlan`, `hu_sex`, `ParejaHuesped`, `HijosHuesped`, `ReprteDatacredito`, `CapacidadEconomica`, `EnfermedadesHuesped`,`habilidades_natacion`) VALUES ("+ HuespedReserva1.getDocumento_huesped()+ ","+ HuespedReserva1.getNum_noches()+ ",'" + HuespedReserva1.getNombre_plan() +"','" +HuespedReserva1.getSex_huesped()+ "','" + HuespedReserva1.getPareja_huesped()+"','" +HuespedReserva1.getHijos_huesped()+ "','" +HuespedReserva1.getReporte_datacredito()+ "'," +HuespedReserva1.getCapacidad_economica()+ ",'" +HuespedReserva1.getEnfermedades_huesped()+ "','" +HuespedReserva1.getHabilidades_natacion()+"')";  
                    	                					System.out.println(i);
                    	                					st.executeUpdate(i);
                    	                					st.close();
                										}
        											}	
        											System.out.println("No puede reservar el plan familiar");
        										}
        									}
        								}
        							} 
        						}
        					}
            			}
            		}
            }
        
        }catch (ClassNotFoundException e){
            System.out.println("La clase no existe");
        }catch (SQLException e){
            throw new RuntimeException(e);
        }
	}
}
    
      

