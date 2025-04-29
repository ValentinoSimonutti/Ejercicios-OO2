package ar.edu.info.unlp.ejercicioDemo;

public class EstadoInicial implements Estado {
	
	public void setValor(double unValor, Calculadora c) {
		c.setAcumulado(unValor);
	}
	
	public String getResultado(Calculadora c) {
		return String.valueOf(c.getAcumulado());
	}
	
	public void borrar(Calculadora c) {
		c.setAcumulado(0);
	}
	
	public void mas(Calculadora c) {
		c.setEstado(new EstadoSumando());	
	}
	
	public void menos(Calculadora c) {
		c.setEstado(new EstadoRestando());	
	}
	
	public void por(Calculadora c) {
		c.setEstado(new EstadoMultiplicando());	
	}
	
	public void dividido(Calculadora c) {
		c.setEstado(new EstadoDividiendo());	

	}
	
	

}
