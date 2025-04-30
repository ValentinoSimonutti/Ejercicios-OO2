package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Reserva {
	
	private int cantidadDias;
	private LocalDate fechaDeInicio;
	private Usuario conductor;
	private AutoEnAlquiler auto;
	
	public Reserva(int cantidadDias, LocalDate fecha, Usuario conductor, AutoEnAlquiler auto) {
		this.cantidadDias = cantidadDias;
		this.fechaDeInicio = fecha;
		this.conductor = conductor;
		this.auto = auto;
		conductor.agregarAutoEnAlquiler(auto);
	}
	
	public double montoAPagar() {
		
		return this.auto.montoAPagar(this);
	}
	
	public double montoAReembolsar(LocalDate fechaTentativa) {
		
		return this.auto.montoAReembolsar(this, fechaTentativa);
	}
	
	public int getCantidadDeDias() {
		
		return this.cantidadDias;
	}

	public LocalDate getFechaDeInicio() {
		return fechaDeInicio;
	}
	
	
	
	

}
