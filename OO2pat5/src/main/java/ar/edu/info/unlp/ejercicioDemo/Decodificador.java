package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Decodificador {
	
	private List<Pelicula> peliculas;
	private List<Pelicula> peliculasVistas;
	private Sugerencia criteriosDeSugerencia;
	
	public Decodificador(List<Pelicula> peliculas, Sugerencia criteriosDeSugerencia) {
		this.peliculas = peliculas;
		this.peliculasVistas = new ArrayList<Pelicula>();
		this.criteriosDeSugerencia = criteriosDeSugerencia;
	}

	public void setCriteriosDeSugerencia(Sugerencia criteriosDeSugerencia) {
		this.criteriosDeSugerencia = criteriosDeSugerencia;
	}
	
	public List<Pelicula> getPeliculas(){
		return this.peliculas;
	}
	
	public List<Pelicula> getPeliculasVistas(){
		return this.peliculasVistas;
	}
	
	public List<Pelicula> getPeliculasNoVistas(){
		return this.peliculas.stream().filter(p -> !this.peliculasVistas.contains(p)).toList();
	}
	
	public void verPelicula(Pelicula p){
		
		if (this.peliculas.stream().anyMatch(peli -> peli.equals(p))) {
			this.peliculasVistas.add(p);
		}
	}
	
	public List<Pelicula> sugerirPeliculas(){
		Pelicula p = this.peliculasVistas.get(0);
		return this.criteriosDeSugerencia.sugerirPeliculas(this, p);
	}
	
	

}
