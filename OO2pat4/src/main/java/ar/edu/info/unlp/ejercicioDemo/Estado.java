package ar.edu.info.unlp.ejercicioDemo;

import java.time.Duration;
import java.time.Instant;

public interface Estado {
	
	public Estado start();
	public Estado togglePause();
	public Estado finish();
	public Duration workedTime(ToDoItem t);
	public void addComment(String c, ToDoItem t);
	
}
