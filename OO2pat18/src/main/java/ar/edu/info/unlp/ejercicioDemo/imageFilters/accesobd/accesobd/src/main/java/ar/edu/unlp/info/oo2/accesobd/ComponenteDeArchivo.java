package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.time.LocalDate;

public interface ComponenteDeArchivo {
	
	public String prettyPrint();
	public String getNombre();
	public String getExtension();
	public double getTamano();
	public LocalDate getFechaDeCreacion();
	public LocalDate getFechadeModificacion();
	public String getPermisos();

}
