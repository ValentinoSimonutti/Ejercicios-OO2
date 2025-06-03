package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;


public class TemperaturaMinima extends ClimaDecorator {

    public TemperaturaMinima(WeatherData component) {
        super(component);
    }

    @Override
    public String displayData() {
        double min = this.getTemperaturas().stream()
            .mapToDouble(Double::doubleValue)
            .min()
            .orElse(0);
        return super.displayData() + " Temp Minima: " + (int) min;
    }

}

