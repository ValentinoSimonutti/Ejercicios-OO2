package ar.edu.info.unlp.ejercicioDemo;

public class WiFiConn implements Connection {
	
	private String pict;

	public WiFiConn() {
		pict= "wifi symbol";
	}
	
	
	public String sendData(String data, long crc) {
	    return "WiFi: " + data + " (CRC: " + crc + ")";  // Ejemplo
	}

	public String pict() {
		return this.pict;
	}
	

}
