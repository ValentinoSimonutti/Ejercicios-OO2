package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.util.List;

public abstract class ClimaDecorator implements WeatherData{

	private WeatherData component;

	public ClimaDecorator(WeatherData component) {
		this.component = component;
	}
	
	public double getTemperatura(){
		return this.component.getTemperatura();
	}

	//retorna la presión atmosférica en hPa
	public double getPresion() {
		return this.component.getPresion();
	}

	//retorna la radiación solar
	public double getRadiacionSolar() {
		return this.component.getRadiacionSolar();
	}

	//retorna una lista con todas las temperaturas sensadas hasta el momento, en grados Fahrenheit
	public List<Double> getTemperaturas(){
		return this.component.getTemperaturas();
	}

	//retorna  un reporte de todos los datos: temperatura, presión, y radiación solar.
	public String displayData() {
		return this.component.displayData();
	}
	
	
}
