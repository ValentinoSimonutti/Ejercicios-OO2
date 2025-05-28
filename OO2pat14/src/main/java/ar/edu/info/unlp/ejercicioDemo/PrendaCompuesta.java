package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class PrendaCompuesta extends Prenda{
	
	private List<Prenda> componentes;

	public PrendaCompuesta() {
		super(0.5);
		this.componentes = new ArrayList<Prenda>();
	}
	
	public void addComponent(Prenda p) {
		this.componentes.add(p);
	}
	
	public void removeComponent(Prenda p) {
		this.componentes.remove(p);
	}
	
	public Prenda obtenerComponente(int i) {
		
		if (i >= 0 && i<= this.componentes.size()) {
			return this.componentes.get(i);
		}
		else return null;
		
	}
	
	public double calcularValor() {
		return this.componentes.stream().mapToDouble(p -> p.calcularValor()).sum();
	}
	
	public double calcularValorPrendario() {
		return this.calcularValor() * 0.5;
	}
	
	
	
	
	

}
