package ar.edu.info.unlp.ejercicioDemo;

import java.time.LocalDate;

public class Presupuesto {
	private String cliente;
	private LocalDate fecha;
	private ConfiguracionPc pc;

	public Presupuesto(String cliente, LocalDate fecha, ConfiguracionPc pc) {
		this.cliente = cliente;
		this.fecha = fecha;
		this.pc = pc;
	}

	public double obtenerPrecioFinal() {
		return this.pc.calcularPrecio();
	}

	public double obtenerConsumoTotal() {
		return this.pc.calcularConsumo();
	}
}
