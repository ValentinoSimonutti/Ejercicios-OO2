package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Directorio extends FileSystemComponent {

	private List<FileSystemComponent> componentes;

	public Directorio(String nombre, LocalDate fechaDeCreacion) {
		super(nombre, fechaDeCreacion, 32000);
		this.componentes= new ArrayList<FileSystemComponent>();
	}
	
	public void agregarComponente(FileSystemComponent f) {
		this.componentes.add(f);
		this.aumentarTamano(f);
	}
	
	public void quitarComponente(FileSystemComponent f) {
		this.componentes.remove(f);
		this.decrementarTamano(f);
	}
	
	public List<FileSystemComponent> getComponentes(){
		return this.componentes;
	}

	@Override
	public int calcularTamanoOcupado() {
		return 32000 + this.componentes.stream().mapToInt(c -> c.calcularTamanoOcupado()).sum();
	}

	@Override
	public Archivo archivoMasGrande() {
		return this.componentes.stream()
			.map(c -> c.archivoMasGrande())
			.max((a1, a2) -> Integer.compare(a1.getTamano(), a2.getTamano()))
			.orElse(null);
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this.componentes.stream()
			.map(c -> c.archivoMasNuevo())
			.max((a1, a2) -> a1.getFechaDeCreacion().compareTo(a2.getFechaDeCreacion()))
			.orElse(null);
	}


	@Override
	public FileSystemComponent buscarComponente(String nombre) {
	    // Primero verifico si este componente es el que buscamos:
	    if (this.tieneMismoNombre(nombre)) {
	        return this;
	    }

	    // Si no, busco recursivamente en los componentes hijos:
	    return this.componentes.stream()
	            .map(c -> c.buscarComponente(nombre)) // puede devolver null o componente
	            .filter(c -> c != null)                // descartamos null
	            .findFirst()                          // primer encontrado
	            .orElse(null);                        // si ninguno encontrado, null
	}


	@Override
	public List<FileSystemComponent> buscarComponentes(String nombre) {
	    
		List<FileSystemComponent> encontrados = new ArrayList<>();
	    if (this.tieneMismoNombre(nombre)) {
	        encontrados.add(this);
	    }

	    for (FileSystemComponent c : this.componentes) {
	        encontrados.addAll(c.buscarComponentes(nombre));  // Polimorfismo
	    }
	    return encontrados;
	}
	
	@Override
	public String listadoDeContenidoRec(String pathPadre) {
	    String pathCompleto = pathPadre + "/" + this.getNombre();
	    StringBuilder sb = new StringBuilder();
	    sb.append(pathCompleto).append("\n");
	    
	    for (FileSystemComponent c : this.componentes) {
	        sb.append(c.listadoDeContenidoRec(pathCompleto));
	    }
	    
	    return sb.toString();
	}


}
