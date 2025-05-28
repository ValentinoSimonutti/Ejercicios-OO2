package ar.edu.info.unlp.ejercicioDemo;

public class Director {
	
	
	public void construirPc(PcBuilder builder) {
		
		builder.buildProcesador();
		builder.buildRAM();
		builder.buildDisco();
		builder.buildTarjetaGrafica();
		builder.buildGabineteYFuente();
		
	}
	
	

}
