package ar.edu.info.unlp.ejercicioDemo;

public class Piedra implements Arma{
	
	public Piedra() {
		
	}
	
	public String enfrentarPapel() {
		return "pierde";
	}
	
	public String enfrentarPiedra() {
		return "empate";
	}
	
	public String enfrentarTijera() {
		return "gana";
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
