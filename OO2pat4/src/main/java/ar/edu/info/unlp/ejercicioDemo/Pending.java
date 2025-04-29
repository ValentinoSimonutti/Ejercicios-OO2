package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;

public class Pending implements Estado {
	
	public Estado start() {
		return new InProgress();	
	}
	
	public Estado togglePause() {
		throw new RuntimeException("No se puede poner pausa en Estado Pending");	
	}
	
	public Estado finish() {
		throw new RuntimeException("No se puede poner finalizar en Estado Pending");	
	 }
	
	public Duration workedTime(ToDoItem t) {
		throw new RuntimeException("No se puede calcular el tiempo si no arranco");	
	}
	
	public void addComment(String c, ToDoItem t) {
		t.agregarComentario(c);
	}

}
