package Clases;

import BD.IserAdicionalesRepositorio;

public class ServicioAdicional {
	private IserAdicionalesRepositorio ServicioAdicional;
	public ServicioAdicional(IserAdicionalesRepositorio ServicioAdicional ){
		this.ServicioAdicional=ServicioAdicional;
	}
	private String nombre;
	private String FechaServicio;	
	
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaServicio() {
		return FechaServicio;
	}

	public void setFechaServicio(String fechaServicio) {
		FechaServicio = fechaServicio;
	}

	public ServicioAdicional (IserAdicionalesRepositorio ServicioAdicional, String nombre, String FechaServicio){
		this.nombre=nombre;
		this.FechaServicio=FechaServicio;
	}
	public void agregar(){
		ServicioAdicional.agregar(this);
	}
}
