package Clases;

public class HuespedReserva extends DocumentoHuespedes {
	public int num_noches;
	public String nombre_plan;
	public String sex_huesped;
	public String pareja_huesped;
	public String hijos_huesped;
	public String Habilidades_natacion;
	public String reporte_datacredito;
	public int capacidad_economica;
	public String enfermedades_huesped;

	
	public int getNum_noches() {
		return num_noches;
	}
	public void setNum_noches(int num_noches) {
		this.num_noches = num_noches;
	}
	public String getNombre_plan() {
		return nombre_plan;
	}
	public void setNombre_plan(String nombre_plan) {
		this.nombre_plan = nombre_plan;
	}
	public String getSex_huesped() {
		return sex_huesped;
	}
	public void setSex_huesped(String sex_huesped) {
		this.sex_huesped = sex_huesped;
	}
	public String getPareja_huesped() {
		return pareja_huesped;
	}
	public void setPareja_huesped(String pareja_huesped) {
		this.pareja_huesped = pareja_huesped;
	}
	public String getHijos_huesped() {
		return hijos_huesped;
	}
	public void setHijos_huesped(String hijos_huesped) {
		this.hijos_huesped = hijos_huesped;
	}
	public String getHabilidades_natacion() {
		return Habilidades_natacion;
	}
	public void setHabilidades_natacion(String habilidades_natacion) {
		Habilidades_natacion = habilidades_natacion;
	}
	public String getReporte_datacredito() {
		return reporte_datacredito;
	}
	public void setReporte_datacredito(String reporte_datacredito) {
		this.reporte_datacredito = reporte_datacredito;
	}
	public int getCapacidad_economica() {
		return capacidad_economica;
	}
	public void setCapacidad_economica(int capacidad_economica) {  
		this.capacidad_economica = capacidad_economica;
	}
	public String getEnfermedades_huesped() {
		return enfermedades_huesped;
	}
	public void setEnfermedades_huesped(String enfermedades_huesped) {
		this.enfermedades_huesped = enfermedades_huesped;
	}
	public HuespedReserva(int documento_huesped,int num_noches, String nombre_plan, String sex_huesped, String pareja_huesped, String hijos_huesped, String Habilidades_natacion, String reporte_datacredito, int capacidad_economica, String enfermedades_huesped){
		super(documento_huesped);
		this.num_noches=num_noches;
		this.nombre_plan = nombre_plan;
		this.pareja_huesped = pareja_huesped;
		this.hijos_huesped = hijos_huesped;
		this.Habilidades_natacion=Habilidades_natacion;
		this.sex_huesped=sex_huesped;
		this.reporte_datacredito = reporte_datacredito;
		this.capacidad_economica = capacidad_economica;
		this.enfermedades_huesped = enfermedades_huesped;
	}
}
