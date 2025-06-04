package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.impl;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class JsonFormatter extends Formatter {

	
	@Override
    public String format(LogRecord record) {
        return "{" + "message : " + record.getMessage()  + " , Level : " + record.getLevel();
	}
	
}
