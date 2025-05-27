package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class TopografiaTierra implements TipoDeTopografia {

	public TopografiaTierra() {
	}

	@Override
	public double proporcionDeAgua() {
		return 0;
	}
	
	@Override
	public double proporcionDeTierra() {
		return 1;
	}
	
	@Override
	public boolean esIgual(TipoDeTopografia otra) {
		return otra.esIgualTierra();
	}

	@Override
	public boolean esIgualAgua() {
		return false;
	}

	@Override
	public boolean esIgualTierra() {
		return true;
	}

	@Override
	public boolean esIgualCompuesta(List<TipoDeTopografia> componentes) {
		return false;
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}

}
