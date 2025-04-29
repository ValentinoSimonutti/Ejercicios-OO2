package ar.edu.info.unlp.ejercicioDemo;

public class FourGAdapter implements Connection {
	
	private FourGConnection adaptee;
	
	public FourGAdapter(FourGConnection adaptee) {
	        this.adaptee = adaptee;
	}
	
	public String sendData(String data , long crc) {
		return this.adaptee.transmit(data, crc);
	}
	
	public String pict() {	
		return this.adaptee.symb();
	}

}
