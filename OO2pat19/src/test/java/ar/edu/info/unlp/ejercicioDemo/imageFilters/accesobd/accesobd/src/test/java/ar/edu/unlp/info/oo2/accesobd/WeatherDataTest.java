package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.test.java.ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.HomeWeatherStation;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.Promedio;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.WeatherData;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.CelciusAdapter;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.TemperaturaMinima;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.TemperaturaMaxima;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class WeatherDataTest {

    private HomeWeatherStation estacion;

    @BeforeEach
    public void setUp() {
        estacion = new HomeWeatherStation(86.0, 1008, 200);
        // Añadimos las temperaturas históricas en °F
        estacion.addTemperatura(80.0);
        estacion.addTemperatura(86.0);
        estacion.addTemperatura(92.0);
    }

    @Test
    public void testEjemplo5_DisplayData() {
        WeatherData decorado = new CelciusAdapter(estacion);
        decorado = new Promedio(decorado);
        decorado = new TemperaturaMinima(decorado);
        decorado = new TemperaturaMaxima(decorado);

        String esperado = " Temperatura C: 30.0 Presión atmosf: 1008.0 Radiación solar: 200.0 Promedio: 30 Temp Minima: 26 Temp Maxima: 33";
        assertEquals(esperado, decorado.displayData());
    }

    @Test
    public void testEjemplo5_DisplayData_Fahrenheit() {
    	WeatherData data = new TemperaturaMaxima(new TemperaturaMinima(new Promedio(estacion)));
        String esperado = " Temperatura F: 86.0 Presión atmosf: 1008.0 Radiación solar: 200.0 Promedio: 86 Temp Minima: 80 Temp Maxima: 92";
        assertEquals(esperado, data.displayData());
    }



}
