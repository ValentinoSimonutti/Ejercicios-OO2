package ar.edu.info.unlp.ejercicioDemo;

public class Dispositivo {
	
	private Calculator estrategia;
	private Ringer ringer;
	private Display display;
	private Connection connection;
	
	
	public Dispositivo(Calculator estrategia, Connection connection, Ringer ringer, Display display) {
	    this.estrategia = estrategia;
	    this.connection = connection;
	    this.ringer = ringer;
	    this.display = display;
	}
	
	
	public String send(String data) {
		long crc= this.estrategia.crcFor(data);
		return this.connection.sendData(data, crc);
		
	}
	
	public void setConnection(Connection someConn) {
		this.connection = someConn;
		this.display.showBanner(someConn.pict());
		this.ringer.ring();
	}

	public void setEstrategia(Calculator unaEstrategia) {
		this.estrategia= unaEstrategia;
	}
	
	
}
