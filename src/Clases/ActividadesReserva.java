package Clases;

public class ActividadesReserva extends DocumentoHuespedes{
	public String NombreActividad;
	public String FechReserva;
	public String HoraReserva;
	
	public String getNombreActividad() {
		return NombreActividad;
	}
	public void setNombreActividad(String nombreActividad) {
		NombreActividad = nombreActividad;
	}
	public String getFechReserva() {
		return FechReserva;
	}
	public void setFechReserva(String fechReserva) {
		FechReserva = fechReserva;
	}
	public String getHoraReserva() {
		return HoraReserva;
	}
	public void setHoraReserva(String horaReserva) {
		HoraReserva = horaReserva;
	}
	
	public ActividadesReserva (int Documento, String NombreActividad, String FechReserva, String HoraReserva){
		super (Documento);
		this.NombreActividad=NombreActividad;
		this.FechReserva=FechReserva;
		this.HoraReserva=HoraReserva;
		}

}
