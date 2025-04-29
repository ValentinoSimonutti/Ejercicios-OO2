package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public abstract class Sugerencia {
	
	public List<Pelicula> sugerirPeliculas(Decodificador d, Pelicula p){
		List<Pelicula> noVistas = d.getPeliculasNoVistas();
		return this.sugerirPeliculasIndividual(noVistas, p);

	}
	
	public abstract List<Pelicula> sugerirPeliculasIndividual(List<Pelicula> noVistas, Pelicula p);
	
	public List<Pelicula> obtenerMasRecientes(List<Pelicula> pelis){
		return pelis.stream()
				.sorted((p1, p2) -> Integer.compare(p2.getAñoDeEstreno(), p1.getAñoDeEstreno()))
				.limit(3).toList();
	}
}
