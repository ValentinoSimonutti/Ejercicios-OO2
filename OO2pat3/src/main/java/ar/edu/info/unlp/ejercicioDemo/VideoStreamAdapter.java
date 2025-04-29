package ar.edu.info.unlp.ejercicioDemo;

public class VideoStreamAdapter implements Media {

	private VideoStream adaptado;
	
	public VideoStreamAdapter(VideoStream unAdaptado) {
		this.adaptado= unAdaptado;
	}
	
	public void play() {
		adaptado.reproduce();
	}
	
}
