package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Tweet extends Post {

	private String texto;
	private ArrayList<Retweet> retweets;
	
	public Tweet (String texto, Usuario u ) {
		super(u);
		this.texto=texto;
		this.retweets= new ArrayList<Retweet>();
	}
	
	public String leer() {
		return this.texto;
	}
	
	public boolean agregarRetweet(Retweet r) {
		return this.retweets.add(r);
	}
	
	public boolean eliminarPublicacion() {
		return this.retweets.removeAll(retweets);
	}
	
	public boolean eliminarRetweet(Retweet r) {
		return this.retweets.remove(r);
	}
	
}
