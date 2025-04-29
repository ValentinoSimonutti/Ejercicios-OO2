package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class Novedad extends Sugerencia {

	
	public List<Pelicula> sugerirPeliculasIndividual(List<Pelicula> noVistas , Pelicula p){
		
		return this.obtenerMasRecientes(noVistas);			
	}
}
