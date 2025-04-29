package ar.edu.info.unlp.ejercicioDemo;

public class Retweet extends Post {
	
	public Tweet origen;
	
	public Retweet( Tweet t,Usuario u ) {
		super(u);
		this.origen=t;
	}
	
	public String leer() {
		return this.origen.leer();
	}

	public boolean eliminarPublicacion() {
		return origen.eliminarRetweet(this);
	}

}
