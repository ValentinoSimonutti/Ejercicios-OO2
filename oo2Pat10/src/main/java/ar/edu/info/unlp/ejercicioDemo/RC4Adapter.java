package ar.edu.info.unlp.ejercicioDemo;

public class RC4Adapter implements Cifrador {
	
	private RC4 adaptado;
	private String clave;
	
	public RC4Adapter(String clave) {
		this.adaptado= new RC4();
		this.clave= clave;
	}

	public String cifrar(String mensaje) {
		return this.adaptado.encriptar(mensaje, clave);
	}

	public String descifrar(String mensaje) {
		return this.adaptado.desencriptar(mensaje, clave);
	}
	
	

}
