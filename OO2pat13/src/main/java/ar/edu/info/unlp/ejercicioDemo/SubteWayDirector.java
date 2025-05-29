package ar.edu.info.unlp.ejercicioDemo;

public class SubteWayDirector { //SubteWay
	
	public Sandwich armarSandwich(SandwichBuilder builder) {
		this.builder.construirPan();
		this.builder.construirAderezo();
		this.builder.construirPrincipal();
		this.builder.construirAdicional();
		return this.builder.getSandwich();
	}
}
