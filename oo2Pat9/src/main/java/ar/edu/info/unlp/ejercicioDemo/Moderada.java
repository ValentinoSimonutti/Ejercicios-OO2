package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Moderada implements PoliticaDeCancelacion {
	
	public double montoAReembolsar(Reserva r , LocalDate fechaTentativa) {
		
		if(faltaUnaSemanaOMas(r.getFechaDeInicio(), fechaTentativa)) {
			return r.montoAPagar();
		}
		else if (faltanDosDiasOMas(r.getFechaDeInicio(),fechaTentativa)) {
			return r.montoAPagar() * 0.5;
		}
		else return 0.0;
		
	}
	
	private boolean faltaUnaSemanaOMas(LocalDate fechaI , LocalDate fechaF) {
		return ChronoUnit.DAYS.between(fechaF, fechaI ) >= 7;
	}
	
	private boolean faltanDosDiasOMas(LocalDate fechaI , LocalDate fechaF) {
		return ChronoUnit.DAYS.between(fechaF, fechaI ) >= 2;
	}
	
	


}
