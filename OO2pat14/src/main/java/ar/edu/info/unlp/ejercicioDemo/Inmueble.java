package ar.edu.info.unlp.ejercicioDemo;

public class Inmueble extends Prenda {

	private String direccion;
	private double superficie;
	private double costoPorMetro;
	
	public Inmueble(double liquidez, String direccion, double superficie, double costoPorMetro) {
		super(liquidez);
		this.direccion = direccion;
		this.superficie = superficie;
		this.costoPorMetro = costoPorMetro;
	}

	public double calcularValor() {
		return this.superficie * this.costoPorMetro;
	}
	
	
}
