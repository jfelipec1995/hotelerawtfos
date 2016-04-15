package Clases;

public class RestauranteReserva extends DocumentoHuespedes{
	public int NumeroPersonas;
	public String FechaReserva;
	public String HoReserva;
	
	public int getNumeroPersonas() {
		return NumeroPersonas;
	}
	public void setNumeroPersonas(int numeroPersonas) {
		NumeroPersonas = numeroPersonas;
	}
	public String getFechaReserva() {
		return FechaReserva;
	}
	public void setFechaReserva(String fechaReserva) {
		FechaReserva = fechaReserva;
	}
	public String getHoReserva() {
		return HoReserva;
	}
	public void setHoReserva(String hoReserva) {
		HoReserva = hoReserva;
	}

	public RestauranteReserva (int documento_huesped, int NumeroPersonas, String FechaReserva, String HoReserva){
		super (documento_huesped);
		this.NumeroPersonas=NumeroPersonas;
		this.FechaReserva=FechaReserva;
		this.HoReserva=HoReserva;
		}
}