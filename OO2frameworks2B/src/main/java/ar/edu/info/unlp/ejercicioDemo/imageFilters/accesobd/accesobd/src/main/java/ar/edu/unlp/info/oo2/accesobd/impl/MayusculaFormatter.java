package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.impl;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class MayusculaFormatter extends Formatter {

	  @Override
	    public String format(LogRecord record) {
	        // Devuelve un string JSON simple con los campos "message" y "level"
	        return "{" +
	               "\"message\": \"" + record.getMessage() + "\"," +
	               "\"level\": \"" + record.getLevel() + "\"" +
	               "}\n";
	    }
}
