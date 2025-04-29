package ar.edu.info.unlp.ejercicioDemo;

public class Papel implements Arma {
	
	public Papel() {
		
	}
	
	public String enfrentarPapel() {
		return "empate";
	}
	
	public String enfrentarPiedra() {
		return "gana";
	}
	
	public String enfrentarTijera() {
		return "pierde";
	}

	public String enfrentarSpock() {
		return "gana";
	}

	public String enfrentarLagarto() {
		return "pierde";
	}

}
