package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Excursion {
	
	private String nombre;
	private LocalDate fechaI;
	private LocalDate fechaF;
	private String puntoDeEncuentro;
	private double costo;
	private int cupoMin;
	private int cupoMax;
	private List<Usuario> inscriptos;
	private List<Usuario> inscriptosEnEspera;
	private Inscripcion estado;
	
	
	public Excursion(String nombre, LocalDate fechaI, LocalDate fechaF, String puntoDeEncuentro, double costo,
			int cupoMin, int cupoMax) {
		
		this.nombre = nombre;
		this.fechaI = fechaI;
		this.fechaF = fechaF;
		this.puntoDeEncuentro = puntoDeEncuentro;
		this.costo = costo;
		this.cupoMin = cupoMin;
		this.cupoMax = cupoMax;
		this.estado = new Provisoria();
		this.inscriptos= new ArrayList<Usuario>();
		this.inscriptosEnEspera= new ArrayList<Usuario>();

	
	}

	public void inscribir(Usuario unUsuario) {
		 this.estado.inscribir(unUsuario, this);
	}
	
	public String obtenerInformacion() {
		return estado.obtenerInformacion(this);
	}
	
	public int cantidadParaElMin() {
		int cantInscriptos = this.inscriptos.size();
		if(cantInscriptos >= this.cupoMin) {
			return 0;
		}
		else return this.cupoMin - cantInscriptos;
	}
	
	public int cantidadParaElMax() {
		int cantInscriptos = this.inscriptos.size();
		if(cantInscriptos >= cupoMax) {
			return 0;
		}
		else return this.cupoMax - cantInscriptos;
	}
	
	public String getMainInfo() {
		return "Nombre: " + getNombre() +
			       ", Costo: " + getCosto() +
			       ", Inicio: " + getFechaI() +
			       ", Fin: " + getFechaF() +
			       ", Punto de Encuentro: " + getPuntoDeEncuentro();
	}

	public String getMails() {
		
		return this.inscriptos.stream()
		           .map(u-> u.getEmail())
		           .collect(Collectors.joining(", "));
		
	}
	
	public void setEstado(Inscripcion estado) {
		this.estado = estado;
	}
	
	public void agregarUsuario(Usuario u) {
		this.inscriptos.add(u);
	}
	
	public void agregarUsuarioAEspera(Usuario u) {
		this.inscriptosEnEspera.add(u);
	}
	
	public boolean alcanzoElMinimo() {
		return this.cantidadParaElMin()==0;
	}
	
	public boolean alcanzoElMaximo() {
		return this.cantidadParaElMax()==0;
	}
	
	public String getNombre() {
		return nombre;
	}

	public LocalDate getFechaI() {
		return fechaI;
	}

	public LocalDate getFechaF() {
		return fechaF;
	}

	public String getPuntoDeEncuentro() {
		return puntoDeEncuentro;
	}


	public double getCosto() {
		return costo;
	}

	public int getCupoMin() {
		return cupoMin;
	}

	public int getCupoMax() {
		return cupoMax;
	}


}
