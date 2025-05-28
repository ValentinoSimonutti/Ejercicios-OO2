package ar.edu.info.unlp.ejercicioDemo;

public class SandwichClasicoBuilder implements SandwichBuilder {
	
	private Sandwich sandwich;
	
	public SandwichClasicoBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void construirPan() { 
		this.sandwich.setPan("brioche");
		this.sandwich.setPrecioPan(100);
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo("mayo");
		this.sandwich.setPrecioAderezo(20);
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal("carne de ternera");
		this.sandwich.setPrecioPrincipal(300);
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional("tomate");
		this.sandwich.setPrecioAdicional(80);
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	

}
