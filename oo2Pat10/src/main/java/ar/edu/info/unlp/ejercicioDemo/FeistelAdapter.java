package ar.edu.info.unlp.ejercicioDemo;

public class FeistelAdapter implements Cifrador{

	private FeistelCipher adaptado;
	
	public FeistelAdapter(String clave) {
		this.adaptado= new FeistelCipher(clave);
	}

	public String cifrar(String mensaje) {
		return this.adaptado.encode(mensaje);
	}

	public String descifrar(String mensaje) {
		return this.adaptado.encode(mensaje); // el mismo sirve para las dos cosas
	}
	
	
	
	
}
