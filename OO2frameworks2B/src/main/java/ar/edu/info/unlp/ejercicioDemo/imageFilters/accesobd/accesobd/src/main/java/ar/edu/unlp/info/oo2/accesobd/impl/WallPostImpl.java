package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.impl;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/**
 * Completar esta clase de acuerdo a lo especificado en el cuadernillo
 *
 */
public class WallPostImpl implements WallPost {

	private String text;
	private int likes;
	private boolean isFeatured;
	private static final Logger modeloLogger = Logger.getLogger(WallPostImpl.class.getName());

	static {
	    try {
	        FileHandler handler = new FileHandler("modelo.log", true);
	        handler.setFormatter(new JsonFormatter());
	        modeloLogger.addHandler(handler);
	        modeloLogger.setUseParentHandlers(false);
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public WallPostImpl() {
		this.text = "Undefined post";

	}

	public WallPostImpl(String text, int likes, boolean isFeaured) {
		this.text = text;
		this.likes = likes;
		this.isFeatured = isFeaured;
	}

	@Override
	public String getText() {
		return text;
	}

	@Override
	public void setText(String text) {
		this.text = text;

	}

	@Override
	public int getLikes() {
		return likes;
	}

	@Override
	public void like() {
		this.likes = this.likes + 1;
		if(likes==10) {
			modeloLogger.warning("Los likes llegaron a 10");
		}

	}

	@Override
	public void dislike() {
		if(likes == 1) {
			modeloLogger.warning("Los likes llegaron a 0");
		}
		if (likes > 0) {
			this.likes = this.likes - 1;
		}

	}

	@Override
	public boolean isFeatured() {
		return this.isFeatured;
	}

	@Override
	public void toggleFeatured() {
		this.isFeatured = !this.isFeatured;

	}

	/*
	 * Este mensaje se utiliza para que una instancia de Wallpost se muestre de
	 * forma adecuada
	 */

	@Override
	public String toString() {
		return "WallPost {" + "text: " + getText() + ", likes: '" + getLikes() + "'" + ", featured: '" + isFeatured()
				+ "'" + "}";
	}

}
