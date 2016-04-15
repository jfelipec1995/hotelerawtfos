package Clases;

public class DatosHuesped extends DocumentoHuespedes {
	public String nombre_huesped;
	public String apellido_huesped;
	public int telefono_huesped;
	public String correo_huesped;
	public String Est_civil_huesped;
	public int num_habitacion_huesped;
	
	public int getNum_habitacion_huesped() {
		return num_habitacion_huesped;
	}
	public void setNum_habitacion_huesped(int num_habitacion_huesped) {
		this.num_habitacion_huesped = num_habitacion_huesped;
	}
	public String getNombre_huesped() {
		return nombre_huesped;
	}
	public void setNombre_huesped(String nombre_huesped) {
		this.nombre_huesped = nombre_huesped;
	}
	public String getApellido_huesped() {
		return apellido_huesped;
	}
	public void setApellido_huesped(String apellido_huesped) {
		this.apellido_huesped = apellido_huesped;
	}
	public int getTelefono_huesped() {
		return telefono_huesped;
	}
	public void setTelefono_huesped(int telefono_huesped) {
		this.telefono_huesped = telefono_huesped;
	}
	public String getCorreo_huesped() {
		return correo_huesped;
	}
	public void setCorreo_huesped(String correo_huesped) {
		this.correo_huesped = correo_huesped;
	}
	public String getEst_civil_huesped() {
		return Est_civil_huesped;
	}
	public void setEst_civil_huesped(String est_civil_huesped) {
		Est_civil_huesped = est_civil_huesped;
	}	
	public DatosHuesped(int documento_huesped, String nombre_huesped,String apellido_huesped, int telefono_huesped, String correo_huesped, String est_civil_huesped, int num_habitacion_huesped) {
		super(documento_huesped);
		this.nombre_huesped = nombre_huesped;
		this.apellido_huesped = apellido_huesped;
		this.telefono_huesped = telefono_huesped;
		this.correo_huesped = correo_huesped;
		Est_civil_huesped = est_civil_huesped;
		this.num_habitacion_huesped = num_habitacion_huesped;
	}
	
}