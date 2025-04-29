package ar.edu.info.unlp.ejercicioDemo;

public class EmpleadoTemporario extends EmpleadoFamiliar {
	
	private int horasTrabajadas;
	
	public EmpleadoTemporario (int horasT , boolean esC , int cantH) {
		super(esC, cantH);
		this.horasTrabajadas=horasT;
	}
	
	public double calcularBasico() {
		return 20_000 + (horasTrabajadas * 300);
	}

}
