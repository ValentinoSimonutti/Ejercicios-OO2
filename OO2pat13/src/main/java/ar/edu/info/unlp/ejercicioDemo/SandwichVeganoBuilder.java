package ar.edu.info.unlp.ejercicioDemo;

public class SandwichVeganoBuilder implements SandwichBuilder{
	
	private Sandwich sandwich;
	
	public SandwichVeganoBuilder() {
		this.sandwich = new Sandwich();
	}

	@Override
	public void construirPan() { 
		this.sandwich.setPan("integral");
		this.sandwich.setPrecioPan(100);
	}

	@Override
	public void construirAderezo() {
		this.sandwich.setAderezo("criolla");
		this.sandwich.setPrecioAderezo(20);
	}

	@Override
	public void construirPrincipal() {
		this.sandwich.setPrincipal("milanesa de girgolas");
		this.sandwich.setPrecioPrincipal(500);
	}

	@Override
	public void construirAdicional() {
		this.sandwich.setAdicional("sin adicional");
		this.sandwich.setPrecioAdicional(0);
	}
	
	public Sandwich getSandwich() {
		return this.sandwich;
	}

}
