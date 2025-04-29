package ar.edu.info.unlp.ejercicioDemo;

public class FourGConnection {
	
	private String symb;
	
	public FourGConnection() {
		symb = "4g symbol";
	}
	
	
	public String transmit(String data, long crc) {
	    return "4G: " + data + " (CRC: " + crc + ")";  // Ejemplo
	}
	
	public String symb() {
		return this.symb;
	}

}
