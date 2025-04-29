package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Usuario {
	
	private String screenName;
	private ArrayList<Post> publicaciones;
	
	public Usuario(String screenName) {
		this.screenName= screenName;
		this.publicaciones= new ArrayList<Post>();
	}

	public String getScreenName() {
		return screenName;
	}

	public boolean postear(String unTexto) {	
		if(unTexto.length() <= 280) {
			Tweet t = new Tweet(unTexto, this);
			this.publicaciones.add(t);
			return true;
		}	
		else return false;
	}
	
	public void repostear(Tweet unTweet) {
		Retweet r = new Retweet(unTweet , this);
		unTweet.agregarRetweet(r);
		this.publicaciones.add(unTweet);
	}
	
	public void leer(Post unPost) {
		unPost.leer();
	}
	
	public boolean eliminarPosts() {
		 this.publicaciones.stream().forEach(p -> p.eliminarPublicacion());
		 return this.publicaciones.removeAll(publicaciones);
	}

}
