package ar.edu.info.unlp.ejercicioDemo;

import java.util.List;

public class TopografiaAgua implements TipoDeTopografia {
	
	public TopografiaAgua() {
	
	}
	
	@Override
	public double proporcionDeAgua() {
		return 1;
	}
	
	@Override
	public double proporcionDeTierra() {
		return 0;
	}

	@Override
	public boolean esIgual(TipoDeTopografia otra) {
		return otra.esIgualAgua();
	}

	@Override
	public boolean esIgualAgua() {
		return true;
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
		return false;
	}
	
	

}
