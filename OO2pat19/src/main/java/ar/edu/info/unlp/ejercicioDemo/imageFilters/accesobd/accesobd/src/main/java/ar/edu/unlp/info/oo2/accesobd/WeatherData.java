package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.util.List;

public interface WeatherData {
	
	public double getTemperatura();
	public double getPresion();
	public double getRadiacionSolar();
	public List<Double> getTemperaturas();
	public String displayData();

}
