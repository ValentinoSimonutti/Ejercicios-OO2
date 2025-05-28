package ar.edu.info.unlp.ejercicioDemo;

public class SandwichVegetarianoBuilder implements SandwichBuilder {
	private Sandwich sandwich;
	
	public SandwichVegetarianoBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void construirPan() { 
		this.sandwich.setPan("con semillas");
		this.sandwich.setPrecioPan(120);
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo("sin aderezo");
		this.sandwich.setPrecioAderezo(0);
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal("provoleta");
		this.sandwich.setPrecioPrincipal(200);
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional("berenjenas");
		this.sandwich.setPrecioAdicional(100);
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}

}
