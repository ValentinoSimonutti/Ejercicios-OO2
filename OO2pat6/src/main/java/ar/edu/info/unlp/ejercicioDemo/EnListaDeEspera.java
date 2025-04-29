package ar.edu.info.unlp.ejercicioDemo;

public class EnListaDeEspera implements Inscripcion {
	
	
	public String obtenerInformacion(Excursion e) {
		
		return  e.getMainInfo();
	}
	
	public void inscribir(Usuario unUsuario, Excursion e ) {
		e.agregarUsuarioAEspera(unUsuario);
	}
	

}
