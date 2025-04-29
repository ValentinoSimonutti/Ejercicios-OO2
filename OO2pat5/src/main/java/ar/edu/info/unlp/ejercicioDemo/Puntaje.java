package ar.edu.info.unlp.ejercicioDemo;

import java.util.Comparator;
import java.util.List;

public class Puntaje extends Sugerencia {

	public List<Pelicula> sugerirPeliculasIndividual(List<Pelicula> noVistas, Pelicula p){
		
		List<Pelicula> mayorPuntajeNoVistas =  noVistas.stream()
		        								.sorted(Comparator
		        								.comparingDouble((Pelicula p1) -> p1.getPuntaje()).reversed()
		        								.thenComparing((Pelicula p1) -> p1.getAñoDeEstreno(), Comparator.reverseOrder()))
		        								.toList();	
		return this.obtenerMasRecientes(mayorPuntajeNoVistas);
				
	}
}
