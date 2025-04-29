package ar.edu.info.unlp.ejercicioDemo;

public class Provisoria implements Inscripcion {

	public String obtenerInformacion(Excursion e) {
		
		return  e.getMainInfo() + e.cantidadParaElMin();
	}
	
	public void inscribir(Usuario unUsuario, Excursion e ) {
		
		e.agregarUsuario(unUsuario);
		if( e.alcanzoElMinimo()) {
			e.setEstado(new Definitiva());
		}
		
	}
	
}
