package ar.edu.info.unlp.ejercicioDemo;

import java.util.ArrayList;

public class Twitter {
	
	private ArrayList<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios= new ArrayList<Usuario>();	
	}
	
	public boolean crearUsuario(String screenName) {
		if (!existe(screenName)) {
			Usuario u = new Usuario(screenName);
			this.usuarios.add(u);
			return true;
		}
		else return false;	
	}
	
	private boolean existe(String screenName) {
		return this.usuarios.stream().anyMatch(u -> u.getScreenName().equals(screenName));
	}
	
	public boolean eliminarUsuario(Usuario u) {	 // preguntar si usuario o screenname 
		
		if(existe(u.getScreenName())) {
			u.eliminarPosts();
			return this.usuarios.remove(u);
		}
		
		else return false;
		
	}

}
