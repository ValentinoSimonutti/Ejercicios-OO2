package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.time.LocalDate;

public abstract class DecoradorDeArchivo implements ComponenteDeArchivo{

	private ComponenteDeArchivo componente;
	
	public DecoradorDeArchivo(ComponenteDeArchivo componente) {
		this.componente= componente;
	}
	
	protected ComponenteDeArchivo getComponent() {
		return this.componente;
	}
	
	public abstract String prettyPrint();
	
	public String getNombre() {
		return componente.getNombre();
	}
	
	public String getExtension() {
		return componente.getExtension();
	}
	
	public double getTamano() {
		return componente.getTamano();
	}
	
	public LocalDate getFechaDeCreacion() {
		return componente.getFechaDeCreacion();
	}
	
	public LocalDate getFechadeModificacion() {
		return componente.getFechadeModificacion();
	}
	
	public String getPermisos() {
		return componente.getPermisos();
	}
	
	
}
