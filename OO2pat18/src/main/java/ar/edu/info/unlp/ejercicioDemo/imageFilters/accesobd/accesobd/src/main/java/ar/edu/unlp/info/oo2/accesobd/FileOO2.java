package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.time.LocalDate;

public class FileOO2 implements ComponenteDeArchivo {

	private String nombre;
	private double tamano;
	private LocalDate fechaDeCreacion;
	private LocalDate fechadeModificacion;
	private String permisos;
	private String extension;
	
	
	public FileOO2(String nombre, double tamano, LocalDate fechaDeCreacion, LocalDate fechadeModificacion,String permisos, String extension) {
		this.nombre = nombre;
		this.tamano = tamano;
		this.fechaDeCreacion = fechaDeCreacion;
		this.fechadeModificacion = fechadeModificacion;
		this.permisos = permisos;
		this.extension= extension;
	}


	public String getNombre() {
		return nombre;
	}

	public String getExtension() {
		return extension;
	}

	public double getTamano() {
		return tamano;
	}


	public LocalDate getFechaDeCreacion() {
		return fechaDeCreacion;
	}


	public LocalDate getFechadeModificacion() {
		return fechadeModificacion;
	}


	public String getPermisos() {
		return permisos;
	}

	@Override
	public String prettyPrint() {
		return "";
	}
	
	
}
