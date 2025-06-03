package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

public class Promedio extends ClimaDecorator {

	public Promedio(WeatherData component) {
		super(component);
	}

	@Override
	public String displayData() {
	    double promedio = this.getTemperaturas().stream()
	        .mapToDouble(Double::doubleValue)
	        .average()
	        .orElse(0);
	    return super.displayData() + " Promedio: " + (int) promedio;
	}



}
