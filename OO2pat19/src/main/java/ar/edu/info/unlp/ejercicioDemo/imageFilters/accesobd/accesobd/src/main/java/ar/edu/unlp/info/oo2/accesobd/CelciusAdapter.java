package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class CelciusAdapter implements WeatherData{
	
	public HomeWeatherStation adaptado;

	public CelciusAdapter(HomeWeatherStation adaptado) {
		this.adaptado = adaptado;
	}

	@Override
	public double getTemperatura() {
		return (this.adaptado.getTemperatura() - 32) / 1.8;
	}

	@Override
	public double getPresion() {
		return this.adaptado.getPresion();
	}

	@Override
	public double getRadiacionSolar() {
		return this.adaptado.getRadiacionSolar();
	}

	@Override
	public List<Double> getTemperaturas() {
	    return this.adaptado.getTemperaturas().stream()
	        .map(t -> (t - 32) / 1.8)
	        .collect(Collectors.toList());
	}
	
	public String displayData(){
		return " Temperatura C: " + this.getTemperatura() + " Presión atmosf: " + this.getPresion() +
		   	  " Radiación solar: " + this.getRadiacionSolar();
	}
	
	
	public double cambiarACelsius() {
		return (this.adaptado.getTemperatura() - 32) / 1.8;
	}

}
