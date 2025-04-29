package ar.edu.info.unlp.ejercicioDemo;

public class Spock implements Arma{
	
	public Spock() {
		
	}
	
	public String enfrentarPapel() {
		return "pierde";
	}
	
	public String enfrentarPiedra() {
		return "gana";
	}
	
	public String enfrentarTijera() {
		return "gana";
	}

	public String enfrentarSpock() {
		return "empate";
	}

	public String enfrentarLagarto() {
		return "pierde";
	}


}
