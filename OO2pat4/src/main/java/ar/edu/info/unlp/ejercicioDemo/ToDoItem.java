package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

public class ToDoItem {
	
	private String nombre;
	private Estado estado;
	private Instant inicio;
	private Instant fin;
	private List<String> comentarios;

	
	/**
		* Instancia un ToDoItem nuevo en estado pending con <name> como nombre.
		*/
		public ToDoItem(String name) {
			this.nombre=name;
			this.estado= new Pending();
			this.inicio= Instant.now();
			this.comentarios= new ArrayList<String>();
			
		}

		   	/**
		* Pasa el ToDoItem a in-progress, siempre y cuando su estado actual sea
		* pending. Si se encuentra en otro estado, no hace nada.
		*/
		public void start() {
			estado = estado.start();	
		}

			/**
		* Pasa el ToDoItem a paused si su estado es in-progress, o a in-progress si su
		* estado es paused. Caso contrario (pending o finished) genera un error
		* informando la causa específica del mismo.
		*/
		
		 public void togglePause() {
			 
			 this.estado=estado.togglePause();
			 
		 }


			/**
		* Pasa el ToDoItem a finished, siempre y cuando su estado actual sea 
		* in-progress o paused. Si se encuentra en otro estado, no hace nada.
		*/
		 public void finish() {
			this.estado=estado.finish();
			this.fin= Instant.now();
		 }


			/**
		* Retorna el tiempo que transcurrió desde que se inició el ToDoItem (start)
		* hasta que se finalizó. En caso de que no esté finalizado, el tiempo que
		* haya transcurrido hasta el momento actual. Si el ToDoItem no se inició,
		* genera un error informando la causa específica del mismo.
		*/
		public Duration workedTime() {
			return this.estado.workedTime(this); // preguntar si seria interesante planter una jerarquia abstracta para abarcar los dos metodos iguales que tienen paused e inprogress 
		}


		/**
		* Agrega un comentario al ToDoItem siempre y cuando no haya finalizado. Caso
		* contrario no hace nada."
		*/
		public void addComment(String comment) {// preguntar si seria interesante planter una jerarquia abstracta para abarcar los tres metodos iguales que tienen paused, inprogress  y pending
			this.estado.addComment(comment,this);
		}
		
		public void agregarComentario(String comment) { //preguntar si este mtodo esta bien, es para que las otras clases no modifiquen la coleccion de esta y no violar esa heruistica
			this.comentarios.add(comment);
		}
		

		public Instant getInicio() {
			return inicio;
		}

		public Instant getFin() {
			return fin;
		}

		
		


}
