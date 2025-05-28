package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
	
	private List<Componente> componentes;
	
	public Catalogo() {
		this.componentes= new ArrayList<Componente>();
	}
	
	public void addComponenete(Componente c) {
		this.componentes.add(c);
	}
	
	public Componente getComponente(String descripcion) {
		
		return this.componentes.stream()
				.filter(c -> c.getDescripcion().equalsIgnoreCase(descripcion))
				.findFirst()
				.orElse(null);
	}
}
