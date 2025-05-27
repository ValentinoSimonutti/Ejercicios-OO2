package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.List;

public abstract class FileSystemComponent {

	private String nombre;
	private LocalDate fechaDeCreacion;
	private int tamano;
	
	public FileSystemComponent(String nombre, LocalDate fechaDeCreacion, int tamano) {
		this.nombre = nombre;
		this.fechaDeCreacion = fechaDeCreacion;
		this.tamano = tamano;
	}
	
	public int getTamano() {
		return this.tamano;
	}
	
	public String getNombre() {
		return this.nombre;
	}

	public LocalDate getFechaDeCreacion() {
		return this.fechaDeCreacion;
	}
	
	public void aumentarTamano(FileSystemComponent f) {
	    this.tamano = this.tamano + f.calcularTamanoOcupado();
	}

	public void decrementarTamano(FileSystemComponent f) {
	    this.tamano = this.tamano - f.calcularTamanoOcupado();
	}
	
	public boolean tieneMismoNombre(String nombre) {
		return this.nombre.equals(nombre);
	}
	
	public abstract int calcularTamanoOcupado();
	public abstract Archivo archivoMasGrande();
	public abstract Archivo archivoMasNuevo();
	public abstract FileSystemComponent buscarComponente(String nombre);
	public abstract List<FileSystemComponent> buscarComponentes(String nombre);

	public String listadoDeContenido() {
	    return listadoDeContenidoRec("");
	}
	
	public abstract String listadoDeContenidoRec(String pathPadre);

	
}
