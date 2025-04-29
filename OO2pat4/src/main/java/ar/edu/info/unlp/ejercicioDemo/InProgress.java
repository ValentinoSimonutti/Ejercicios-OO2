package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.Instant;

public class InProgress implements Estado {
	
	public Estado start() {
		return this;	
	}
	
	public Estado togglePause() {
		return new Paused();	
	}
	
	public Estado finish() {
		return new Finished(); 
	 }
	
	public Duration workedTime(ToDoItem t) {
		
		return Duration.between(t.getInicio(),Instant.now());
	}
	
	public void addComment(String c, ToDoItem t) {
		t.agregarComentario(c);
	}

}
