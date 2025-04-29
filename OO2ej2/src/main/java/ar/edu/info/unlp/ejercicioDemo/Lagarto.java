package ar.edu.info.unlp.ejercicioDemo;

public class Lagarto implements Arma{
	
	public Lagarto() {
		
	}

	public String enfrentarPapel() {
		return "gana";
	}

	public String enfrentarPiedra() {
		return "pierde";
	}

	public String enfrentarTijera() {
		return "pierde";

	}

	public String enfrentarSpock() {
		return "gana";
	}

	public String enfrentarLagarto() {
		return "empate";
	}

}
