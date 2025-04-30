package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		        
				Usuario juan = new Usuario("Juan");

		        // Auto con política flexible
		        AutoEnAlquiler auto = new AutoEnAlquiler(100.0, 5, "Toyota", new Flexible());

		        // Reserva del 10 al 15 de abril (5 días)
		        Reserva reserva = new Reserva(5, LocalDate.of(2025, 4, 10), juan, auto);

		        // Cancelación el 5 de abril → antes del inicio
		        System.out.println("Reembolso con política flexible: $" + reserva.montoAReembolsar(LocalDate.of(2025, 4, 5)));

		        // Cambiar a política moderada
		        auto.setPoliticaDeCancelacion(new Moderada());

		        System.out.println("Reembolso con política moderada (5 días antes): $" +
		            reserva.montoAReembolsar(LocalDate.of(2025, 4, 5))); // 50%

		        System.out.println("Reembolso con política moderada (8 días antes): $" +
		            reserva.montoAReembolsar(LocalDate.of(2025, 4, 2))); // 100%

		        System.out.println("Reembolso con política moderada (1 día antes): $" +
		            reserva.montoAReembolsar(LocalDate.of(2025, 4, 9))); // 0%
		    }	
	}
