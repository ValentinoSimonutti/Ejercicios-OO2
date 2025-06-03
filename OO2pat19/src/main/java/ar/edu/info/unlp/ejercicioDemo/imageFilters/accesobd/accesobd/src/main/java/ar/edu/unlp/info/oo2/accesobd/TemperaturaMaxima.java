package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

public class TemperaturaMaxima extends ClimaDecorator {

    public TemperaturaMaxima(WeatherData component) {
        super(component);
    }

    @Override
    public String displayData() {
        double max = this.getTemperaturas().stream()
            .mapToDouble(Double::doubleValue)
            .max()
            .orElse(0);
        return super.displayData() + " Temp Maxima: " + (int) max;
    }


}
