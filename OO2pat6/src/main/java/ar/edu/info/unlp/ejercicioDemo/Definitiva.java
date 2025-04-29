package ar.edu.info.unlp.ejercicioDemo;

public class Definitiva implements Inscripcion{

	public String obtenerInformacion(Excursion e) {
		
		return  e.getMainInfo() + e.getMails() + e.cantidadParaElMax();
	}
	
	public void inscribir(Usuario unUsuario, Excursion e ) {
		
		e.agregarUsuario(unUsuario);
		if(e.alcanzoElMaximo()) {
			e.setEstado(new EnListaDeEspera());
		}
	}
	
}
