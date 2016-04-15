package Clases;

public class TipoPlan {
	public String nombre_tipoplan;
	public int valor_tipoplan;
	public int cantidadhuesped_tipoplan;
	public String todoincluido_tipoplan;
	
	public String getNombre_tipoplan() {
		return nombre_tipoplan;
	}
	public void setNombre_tipoplan(String nombre_tipoplan) {
		this.nombre_tipoplan = nombre_tipoplan;
	}
	public int getValor_tipoplan() {
		return valor_tipoplan;
	}
	public void setValor_tipoplan(int valor_tipoplan) {
		this.valor_tipoplan = valor_tipoplan;
	}
	public int getCantidadhuesped_tipoplan() {
		return cantidadhuesped_tipoplan;
	}
	public void setCantidadhuesped_tipoplan(int cantidadhuesped_tipoplan) {
		this.cantidadhuesped_tipoplan = cantidadhuesped_tipoplan;
	}
	public String getTodoincluido_tipoplan() {
		return todoincluido_tipoplan;
	}
	public void setTodoincluido_tipoplan(String todoincluido_tipoplan) {
		this.todoincluido_tipoplan = todoincluido_tipoplan;
	}
	public TipoPlan(String nombre_tipoplan, int valor_tipoplan, int cantidadhuesped_tipoplan, String todoincluido_tipoplan){
		this.nombre_tipoplan=nombre_tipoplan;
		this.valor_tipoplan=valor_tipoplan;
		this.cantidadhuesped_tipoplan=cantidadhuesped_tipoplan;
		this.todoincluido_tipoplan=todoincluido_tipoplan;
	}
}
