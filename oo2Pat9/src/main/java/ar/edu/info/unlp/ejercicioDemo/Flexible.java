package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Flexible implements PoliticaDeCancelacion {
	
	public double montoAReembolsar(Reserva r , LocalDate fechaTentativa) {
		
		if(fechaTentativa.isBefore(r.getFechaDeInicio())) {
			return r.montoAPagar();
		}
		return 0.0;
	}
	
	


}
