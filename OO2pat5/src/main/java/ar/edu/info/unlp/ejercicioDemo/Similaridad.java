package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Similaridad extends Sugerencia {

	
	public List<Pelicula> sugerirPeliculasIndividual(List<Pelicula> noVistas, Pelicula p){
		
		List<Pelicula> similaresNoVistas= noVistas.stream()
												.filter((p1) -> p.esSimilar(p1)).toList();
		
		return this.obtenerMasRecientes(similaresNoVistas);
				
	}
}
