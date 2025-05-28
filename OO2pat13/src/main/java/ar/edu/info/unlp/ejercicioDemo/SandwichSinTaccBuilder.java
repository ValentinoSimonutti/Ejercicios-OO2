package ar.edu.info.unlp.ejercicioDemo;

public class SandwichSinTaccBuilder implements SandwichBuilder{
	
	private Sandwich sandwich;
	
	public SandwichSinTaccBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void construirPan() { 
		this.sandwich.setPan("chipa");
		this.sandwich.setPrecioPan(150);
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo("salsa tartara");
		this.sandwich.setPrecioAderezo(18);
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal("carnde de pollo");
		this.sandwich.setPrecioPrincipal(250);
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional("verduras grilladas");
		this.sandwich.setPrecioAdicional(200);
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}
	
}

