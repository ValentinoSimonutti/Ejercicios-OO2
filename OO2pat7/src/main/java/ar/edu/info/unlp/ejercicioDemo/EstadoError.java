package ar.edu.info.unlp.ejercicioDemo;

public class EstadoError implements Estado{
	
	public void setValor(double unValor, Calculadora c) {
		
	}
	
	public String getResultado(Calculadora c) {
		return "Error";
	}
	
	
	public void borrar(Calculadora c) {
		c.setEstado(new EstadoInicial());
	}
	
	public void mas(Calculadora c) {
		
	}
	
	public void menos(Calculadora c) {
		
	}
	
	public void por(Calculadora c) {
		
	}
	
	public void dividido(Calculadora c) {
		
	}

}
