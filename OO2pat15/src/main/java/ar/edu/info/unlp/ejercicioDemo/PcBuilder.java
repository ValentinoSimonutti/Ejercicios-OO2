package ar.edu.info.unlp.ejercicioDemo;

public interface PcBuilder {
    
    void buildProcesador();
    void buildRAM();
    void buildDisco();
    void buildTarjetaGrafica();
    void buildGabineteYFuente();
    ConfiguracionPc getResultado();

}
