package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class TopografiaCompuesta implements TipoDeTopografia {
	
	private List<TipoDeTopografia> topografias;
	
	public TopografiaCompuesta () {
		this.topografias=new ArrayList<TipoDeTopografia>(); // para usar una top compuest hay que agregarle 4 elemntos primero
	}
	
	public List<TipoDeTopografia> getTopografias(){
		return this.topografias;
	}
	
	public void añadirTopografia(TipoDeTopografia unaTop) {
		if(this.topografias.size() < 4 ) {
			this.topografias.add(unaTop);	
		}
	}

	public void eliminarTopografia(TipoDeTopografia unaTop) {
		this.topografias.remove(unaTop);	
	}

	@Override
	public double proporcionDeAgua() {
	    return topografias.stream().mapToDouble(t -> t.proporcionDeAgua()).sum() / topografias.size();
	}

	@Override
	public double proporcionDeTierra() {
	    return topografias.stream().mapToDouble(t -> t.proporcionDeTierra()).sum() / topografias.size();
	}
	
	@Override
	public boolean esIgual(TipoDeTopografia otra) {
		return otra.esIgualCompuesta(this.topografias);
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
	public boolean esIgualCompuesta(List<TipoDeTopografia> otra) {
		
		if(this.topografias.size() != otra.size()) {
			return false;
		}
		else return IntStream.range(0, this.topografias.size())
							.allMatch(i -> this.topografias.get(i).esIgual(otra.get(i)));
	}

	@Override
	public boolean esIgualPantano() {
		return false;
	}
	
}

