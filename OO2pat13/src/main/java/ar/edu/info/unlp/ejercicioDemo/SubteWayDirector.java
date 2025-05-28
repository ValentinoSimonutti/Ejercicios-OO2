package ar.edu.info.unlp.ejercicioDemo;

public class SubteWayDirector { //SubteWay
	
	private SandwichBuilder builder;
	
	public SubteWayDirector(SandwichBuilder b) {
		this.builder= b;
	}

	public void setBuilder(SandwichBuilder b) {
		this.builder=b;
	}
	
	public Sandwich armarSandwich() {
		
		this.builder.construirPan();
		this.builder.construirAderezo();
		this.builder.construirPrincipal();
		this.builder.construirAdicional();
		return this.builder.getSandwich();
		
	}
}
