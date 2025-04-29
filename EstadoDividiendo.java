package ar.edu.info.unlp.ejercicioDemo;

public class EstadoDividiendo extends EstadoOperando {
	
	public void setValor(double unValor, Calculadora c) {
		
		if(unValor == 0) {
			c.setEstado(new EstadoError());
		}
		else
			{
				c.setAcumulado(c.getAcumulado() / unValor);
				c.setEstado(new EstadoInicial());
			}
	}

}
