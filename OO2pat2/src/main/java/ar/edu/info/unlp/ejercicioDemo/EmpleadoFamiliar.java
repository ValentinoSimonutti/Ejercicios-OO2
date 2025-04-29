package ar.edu.info.unlp.ejercicioDemo;

public abstract class EmpleadoFamiliar extends Empleado {
	
	private boolean esCasado;
	private int cantHijos;
	
	public EmpleadoFamiliar( boolean esCasado , int cantH) {
		
		this.cantHijos=cantH;
		this.esCasado= esCasado;
	}
	
	public double calcularAdicional() {
		
		double monto = 2000 * this.cantHijos;
		if(esCasado) {
			monto = monto + 5000;
		}
		return monto;
	}
	
	

}
