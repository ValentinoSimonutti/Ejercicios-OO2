package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public interface TipoDeTopografia {
	
	public double proporcionDeAgua();
	public double proporcionDeTierra();

	
	public boolean esIgual(TipoDeTopografia otra);
	
	public boolean esIgualAgua();
	public boolean esIgualTierra();
	public boolean esIgualCompuesta(List<TipoDeTopografia> componentes);
	public boolean esIgualPantano();

}
