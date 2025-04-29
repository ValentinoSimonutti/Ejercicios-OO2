package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;

public class Pelicula {
	
	private String titulo;
	private int añoDeEstreno;
	private List<Pelicula> peliculasSimilares;
	private double puntaje;
	
	public Pelicula(String titulo, int añoDeEstreno, double puntaje) {
		this.titulo = titulo;
		this.añoDeEstreno = añoDeEstreno;
		this.puntaje = puntaje;
		this.peliculasSimilares= new ArrayList<Pelicula>();
	}
	
	public int getAñoDeEstreno() {
		return this.añoDeEstreno;
	}
	
	public double getPuntaje() {
		return this.puntaje;
	}
	
	public void agregarPeliculaSimilar(Pelicula p) {
		 this.agregarPelicula(p);
		 p.agregarPelicula(this);
	}
	
	public void agregarPelicula(Pelicula p) {
		 this.peliculasSimilares.add(p);
	}
	
	public boolean esSimilar(Pelicula p2) {
		
		return this.peliculasSimilares.contains(p2);
	}
	

}
