package ar.edu.info.unlp.ejercicioDemo;

public abstract class EstadoOperando implements Estado {
	
	public String getResultado(Calculadora c) {
		return String.valueOf(c.getAcumulado());	
		
	}
	
	public void borrar(Calculadora c) {
		c.setEstado(new EstadoInicial());
	}
	
	public void mas(Calculadora c) {
		c.setEstado(new EstadoError());
	}
	
	public void menos(Calculadora c) {
		c.setEstado(new EstadoError());
	}
	
	public void por(Calculadora c) {
		c.setEstado(new EstadoError());
	}
	
	public void dividido(Calculadora c) {
		c.setEstado(new EstadoError());
	}

}
