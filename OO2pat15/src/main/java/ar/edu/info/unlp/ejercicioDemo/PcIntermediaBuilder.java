package ar.edu.info.unlp.ejercicioDemo;

public class PcIntermediaBuilder implements PcBuilder {
	
	private ConfiguracionPc pc;
	private Catalogo catalogo;

	public PcIntermediaBuilder(Catalogo catalogo) {
		this.catalogo = catalogo;
		this.pc = new ConfiguracionPc();
	}

	public void buildProcesador() {
		pc.agregarComponente(catalogo.getComponente("procesador intermedio"));
	}

	public void buildRAM() {
		pc.agregarComponente(catalogo.getComponente("16 gb"));
	}

	public void buildDisco() {
		pc.agregarComponente(catalogo.getComponente("ssd 500 gb"));
	}

	public void buildTarjetaGrafica() {
		pc.agregarComponente(catalogo.getComponente("gtx 1650"));
	}

	public void buildGabineteYFuente() {
		pc.agregarComponente(catalogo.getComponente("gabinete intermedio"));
		pc.agregarComponente(catalogo.getComponente("fuente 800 w"));
	}

	public ConfiguracionPc getResultado() {
		return this.pc;
	}
}
