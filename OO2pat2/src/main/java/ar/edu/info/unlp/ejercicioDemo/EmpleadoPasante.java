package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPasante extends Empleado {
	
	private int cantExamenes;
	
	public EmpleadoPasante(int cant) {
		this.cantExamenes=cant;
	}
	
	public double calcularAdicional() {
		return 2000 * this.cantExamenes;
	}
	
	public double calcularBasico() {
		return 20_000;
	}

}
