package ar.edu.info.unlp.ejercicioDemo;

public class Mensajero {
	
	private Cifrador cifrador;
	
	public String enviar(String mensaje) {
		String msjCifrado = cifrador.cifrar(mensaje);
		return msjCifrado;
	}
	
	public String recibir(String mensajeCifrado) {
		String msjDescifrado = cifrador.descifrar(mensajeCifrado);
		return msjDescifrado;
		
	}
	
	public void setCifrador(Cifrador unCifrado) {
		this.cifrador=unCifrado;
	}
	

}
