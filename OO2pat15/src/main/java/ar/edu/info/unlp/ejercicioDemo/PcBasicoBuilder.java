package ar.edu.info.unlp.ejercicioDemo;

public class PcBasicoBuilder implements PcBuilder {
	
	private ConfiguracionPc pc;
	private Catalogo catalogo;

	public PcBasicoBuilder(Catalogo catalogo) {
		this.catalogo = catalogo;
		this.pc = new ConfiguracionPc();
	}

	public void buildProcesador() {
		pc.agregarComponente(catalogo.getComponente("procesador básico"));
	}

	public void buildRAM() {
		pc.agregarComponente(catalogo.getComponente("8 gb"));
	}

	public void buildDisco() {
		pc.agregarComponente(catalogo.getComponente("hdd 500 gb"));
	}

	public void buildTarjetaGrafica() {
		pc.agregarComponente(catalogo.getComponente("grafica integrada"));
	}

	public void buildGabineteYFuente() {
		pc.agregarComponente(catalogo.getComponente("gabinete estándar"));
		// La fuente ya viene con el gabinete
	}

	public ConfiguracionPc getResultado() {
		return this.pc;
	}
}
