package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalculadora {

	@Test
	void testOperacionCorrecta() {
	    Calculadora c = new Calculadora();
	    c.setValor(5);
	    c.mas();
	    c.setValor(3);
	    assertEquals("8.0", c.getResultado());

	    c.por();
	    c.setValor(2);
	    assertEquals("16.0", c.getResultado());
	}

	@Test
	void testDivisionPorCero() {
	    Calculadora c = new Calculadora();
	    c.setValor(10);
	    c.dividido();
	    c.setValor(0);
	    assertEquals("Error", c.getResultado());
	}

	@Test
	void testErrorPorOperacionSinValor() {
	    Calculadora c = new Calculadora();
	    c.setValor(10);
	    c.mas();
	    c.menos(); // segunda operación sin setValor
	    assertEquals("Error", c.getResultado());
	}

	@Test
	void testBorrar() {
	    Calculadora c = new Calculadora();
	    c.setValor(5);
	    c.mas();
	    c.setValor(5);
	    c.borrar();
	    assertEquals("0.0", c.getResultado());
	}

}
