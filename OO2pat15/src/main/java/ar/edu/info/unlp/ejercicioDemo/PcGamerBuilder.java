package ar.edu.info.unlp.ejercicioDemo;

public class PcGamerBuilder implements PcBuilder {
	private ConfiguracionPc pc;
	private Catalogo catalogo;

	public PcGamerBuilder(Catalogo catalogo) {
		this.catalogo = catalogo;
		this.pc = new ConfiguracionPc();
	}

	public void buildProcesador() {
		pc.agregarComponente(catalogo.getComponente("procesador gamer"));
		pc.agregarComponente(catalogo.getComponente("pad térmico"));
		pc.agregarComponente(catalogo.getComponente("cooler"));
	}

	public void buildRAM() {
		pc.agregarComponente(catalogo.getComponente("32 gb"));
		pc.agregarComponente(catalogo.getComponente("32 gb"));
	}

	public void buildDisco() {
		pc.agregarComponente(catalogo.getComponente("ssd 500 gb"));
		pc.agregarComponente(catalogo.getComponente("ssd 1 tb"));
	}

	public void buildTarjetaGrafica() {
		pc.agregarComponente(catalogo.getComponente("rtx 4090"));
	}

	public void buildGabineteYFuente() {
		pc.agregarComponente(catalogo.getComponente("gabinete gamer"));

		// Calcular el consumo total hasta ahora
		double consumo = pc.calcularConsumo();
		double fuenteWatts = consumo * 1.5;
		int fuenteWattsRedondeado = (int) fuenteWatts;

		// Buscar e incluir fuente según consumo
		pc.agregarComponente(catalogo.getComponente("fuente " + fuenteWattsRedondeado + " w"));
	}

	public ConfiguracionPc getResultado() {
		return this.pc;
	}
}

