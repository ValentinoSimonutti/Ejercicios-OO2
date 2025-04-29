package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.Instant;

public class Finished implements Estado{
	
	public Estado start() {
		return this;	
	}
	
	public Estado togglePause() {
		throw new RuntimeException("No se puede poner pausa en Estado Finished");	
	}
	
	public Estado finish() {
		throw new RuntimeException("No se puede poner finalizar en Estado Finished");	
	 }

	public Duration workedTime(ToDoItem t) {
		return Duration.between(t.getInicio(), t.getFin());
	}
	
	public void addComment(String c, ToDoItem t) {

	}
}
