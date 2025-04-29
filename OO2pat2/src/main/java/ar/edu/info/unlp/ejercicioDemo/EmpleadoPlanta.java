package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoPlanta extends EmpleadoFamiliar {
	
	private int antiguedad;
	
	public EmpleadoPlanta(int ant , boolean esC , int cantH) {
		super(esC, cantH);
		this.antiguedad= ant;
	}
	
	public double calcularAdicional() {
		
		return super.calcularAdicional() + (2000 * antiguedad);
		
	}
	
	public double calcularBasico() {
		
		return 50_000;
	}

}
