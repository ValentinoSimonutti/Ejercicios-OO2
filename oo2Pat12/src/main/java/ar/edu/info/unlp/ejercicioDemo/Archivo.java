package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Archivo extends FileSystemComponent{

	public Archivo(String nombre, LocalDate fechaDeCreacion, int tamano) {
		super(nombre, fechaDeCreacion, tamano);
	}

	@Override
	public int calcularTamanoOcupado() {
		return this.getTamano();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	@Override
	public FileSystemComponent buscarComponente(String nombre) {
		if (tieneMismoNombre(nombre)) {
			return this;
		}
		else return null;
	}

	@Override
	public List<FileSystemComponent> buscarComponentes(String nombre) {
		List<FileSystemComponent> lista = new ArrayList<FileSystemComponent>();
		if (this.tieneMismoNombre(nombre)) {
			lista.add(this);
		}
		return lista;
	}
	
	@Override
	public String listadoDeContenidoRec(String pathPadre) {
	    String pathCompleto = pathPadre + "/" + this.getNombre();
	    return pathCompleto + "\n";
	}


}
