package ar.edu.info.unlp.ejercicioDemo;

public abstract class Post {
	
	private Usuario dueño;
	
	public Post (Usuario unDueño) {
		this.dueño=unDueño;
	}
	
	public abstract String leer();

	public abstract boolean eliminarPublicacion();
	

}
