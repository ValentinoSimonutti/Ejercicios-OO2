package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class FileSystem {
	
		private FileSystemComponent component;
		
		public FileSystem(FileSystemComponent f) {
			this.component=f;
		}
	
		/**
	   * Retorna el espacio total ocupado, incluyendo todo su contenido.
	   */
		public int tamanoTotalOcupado() {
			return this.component.calcularTamanoOcupado();
		}

	  /**
	   * Retorna el archivo con mayor cantidad de bytes en cualquier nivel del 
	   * filesystem 
	   */
		public Archivo archivoMasGrande() {
			return this.component.archivoMasGrande();
		}

	  /**
	   * Retorna el archivo con fecha de creación más reciente en cualquier nivel 
	   * del filesystem
	   */
		public Archivo archivoMasNuevo() {
			return this.component.archivoMasNuevo();
		}

	  /**
	   * Retorna el primer elemento con el nombre solicitado contenido en cualquier
	   * nivel del filesystem
	   */
		public FileSystemComponent buscar(String nombre){
			return this.component.buscarComponente(nombre);
		}

	  /**
	   * Retorna la lista con los elementos que coinciden con el nombre solicitado 
	   * contenido en cualquier nivel del filesystem
	   */
		public List<FileSystemComponent> buscarTodos(String nombre){
			return this.component.buscarComponentes(nombre);
		}
	
	  /**
	   * Retorna un String con los nombres de los elementos contenidos en todos los 
	   * niveles del filesystem. De cada elemento debe retornar el path completo
	   * (similar al comando pwd de linux) siguiendo el modelo presentado a
	   * continuación
	/Directorio A
	/Directorio A/Directorio A.1
	/Directorio A/Directorio A.1/Directorio A.1.1
	/Directorio A/Directorio A.1/Directorio A.1.2 	
	/Directorio A/Directorio A.2
	/Directorio B
	   */
	  public String listadoDeContenido() {
		  return this.component.listadoDeContenido();
	  }

}
