package ar.edu.info.unlp.ejercicioDemo;

public class Tijera implements Arma {
	
	public Tijera() {
		
	}
	
	public String enfrentarPapel() {
		return "gana";
	}
	
	public String enfrentarPiedra() {
		return "pierde";
	}
	
	public String enfrentarTijera() {
		return "empate";
	}

	@Override
	public String enfrentarSpock() {
		return "pierde";
	}

	@Override
	public String enfrentarLagarto() {
		return "gana";
	}

}
