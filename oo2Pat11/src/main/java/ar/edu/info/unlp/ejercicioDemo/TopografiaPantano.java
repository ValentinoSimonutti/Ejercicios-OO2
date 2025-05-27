package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class TopografiaPantano implements TipoDeTopografia {

	@Override
	public double proporcionDeAgua() {
		return 0.7;
	}
	
	@Override
	public double proporcionDeTierra() {
		return 0.3;
	}

	@Override
	public boolean esIgual(TipoDeTopografia otra) {
		return otra.esIgualPantano();
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return false;
	}

	@Override
	public boolean esIgualCompuesta(List<TipoDeTopografia> componentes) {
		return false;
	}

	@Override
	public boolean esIgualPantano() {
		return true;
	}
	
	
	
	

}
