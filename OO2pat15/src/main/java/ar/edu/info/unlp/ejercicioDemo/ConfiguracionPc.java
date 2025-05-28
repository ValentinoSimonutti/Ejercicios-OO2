package ar.edu.info.unlp.ejercicioDemo;

import java.util.*;

public class ConfiguracionPc {
    
	private List<Componente> componentes;
	
	public ConfiguracionPc() {
		this.componentes= new ArrayList<Componente>();
	}

	public void agregarComponente(Componente c) {
        componentes.add(c);
    }

    public double calcularConsumo() {
        return componentes.stream().mapToDouble(c -> c.getConsumo()).sum();
    }

    public double calcularPrecio() {
        double precioBase = componentes.stream().mapToDouble(c -> c.getPrecio()).sum();
        return precioBase * 1.21;
    }

    public List<Componente> getComponentes() {
        return componentes;
    }
    
    
}
