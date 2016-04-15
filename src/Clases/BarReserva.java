package Clases;

public class BarReserva extends DocumentoHuespedes {
	public int NumPersonas;
	public int RanEdades;
	public String FechReserva;
	public String HoraReserva;
	
	public int getNumPersonas() {
		return NumPersonas;
	}
	public void setNumPersonas(int numPersonas) {
		NumPersonas = numPersonas;
	}
	public int getRanEdades() {
		return RanEdades;
	}
	public void setRanEdades(int ranEdades) {
		RanEdades = ranEdades;
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
	
	public BarReserva (int Documento, int NumPersonas, int RanEdades, String FechReserva, String HoraReserva){
	super (Documento);
	this.NumPersonas=NumPersonas;
	this.RanEdades=RanEdades;
	this.FechReserva=FechReserva;
	this.HoraReserva=HoraReserva;
	}
}
	
