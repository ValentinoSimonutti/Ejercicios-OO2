package ar.edu.info.unlp.ejercicioDemo;

public class MediaPlayer {
	
	public Media dispositivo;
	
	public MediaPlayer(Media unDispositivo) {
		dispositivo = unDispositivo; 
	}
	
	public void play() {
		dispositivo.play();
	}

}
