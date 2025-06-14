package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.impl;

public interface WallPost {

	/**
	 * Retorna el texto descriptivo de la publicación
	 * 
	 * @return
	 */
	String getText();

	/**
	 * Setea el texto descriptivo de la publicación
	 * 
	 * @param text
	 */
	void setText(String text);

	/**
	 * Retorna la cantidad de “me gusta”
	 * 
	 * @return
	 */
	int getLikes();

	/**
	 * Incrementa la cantidad de likes en uno
	 */
	void like();

	/**
	 * Decrementa la cantidad de likes en uno. Si ya es 0, no hace nada
	 */
	void dislike();

	/**
	 * Retorna true si el post está marcado como destacado, false en caso contrario
	 * 
	 * @return
	 */
	boolean isFeatured();

	/**
	 * Cambia el post del estado destacado a no destacado y viceversa
	 */
	void toggleFeatured();

}
