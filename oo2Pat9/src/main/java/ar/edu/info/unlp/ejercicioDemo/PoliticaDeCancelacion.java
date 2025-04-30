package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public interface PoliticaDeCancelacion {
	
	public double montoAReembolsar(Reserva r , LocalDate fechaTentativa);

}
