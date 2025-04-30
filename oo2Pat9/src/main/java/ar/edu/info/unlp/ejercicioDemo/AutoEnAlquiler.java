package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class AutoEnAlquiler {
	
	private double precioPorDia;
	private int cantidadPlazas;
	private String marca;
	private PoliticaDeCancelacion politicaDeCancelacion;
	
	
	public AutoEnAlquiler(double precioPorDia, int cantidadPlazas, String marca,PoliticaDeCancelacion politicaDeCancelacion) {
		this.precioPorDia = precioPorDia;
		this.cantidadPlazas = cantidadPlazas;
		this.marca = marca;
		this.politicaDeCancelacion = politicaDeCancelacion;
	}

	public PoliticaDeCancelacion getPoliticaDeCancelacion() {
		return politicaDeCancelacion;
	}
	
	public void setPoliticaDeCancelacion(PoliticaDeCancelacion politicaDeCancelacion) {
		this.politicaDeCancelacion = politicaDeCancelacion;
	}
	
	public double montoAPagar(Reserva r) {
		
		return this.precioPorDia * r.getCantidadDeDias(); 
	}
	
	
	public double montoAReembolsar(Reserva r, LocalDate fechaTentativa) {
		
		return this.politicaDeCancelacion.montoAReembolsar(r, fechaTentativa);
	}
	
	
	

}
