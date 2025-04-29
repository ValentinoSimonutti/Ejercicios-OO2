package ar.edu.info.unlp.ejercicioDemo;

public class EstadoSumando extends EstadoOperando {
	
	public void setValor(double unValor, Calculadora c) {
		c.setAcumulado(c.getAcumulado() + unValor);
		c.setEstado(new EstadoInicial());
	}
		

}
