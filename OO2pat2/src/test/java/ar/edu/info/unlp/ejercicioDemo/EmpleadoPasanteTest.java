package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoPasanteTest {

private EmpleadoPasante e;
	
	@Test
	void testCacularAdicional() {
		EmpleadoPasante e = new EmpleadoPasante(5);
		assertEquals(e.calcularAdicional(), 10000  );
	}
	
	@Test
	void testCacularAdicionalCero() {
		EmpleadoPasante e = new EmpleadoPasante(0);
		assertEquals(e.calcularAdicional(), 0  );
	}
	
	@Test
	void testCacularBasico() {
		EmpleadoPasante e = new EmpleadoPasante(5);
		assertEquals(e.calcularBasico(), 20_000  );
	}
	
	@Test
	void testCacularDescuento() {
		EmpleadoPasante e = new EmpleadoPasante(5);
		double res =  e.calcularBasico() * 0.13 + e.calcularAdicional() * 0.05;
		assertEquals(e.calcularDescuento(), res);
	}
	
	
	@Test
	void testCalcularSueldo() {
		EmpleadoPasante e = new EmpleadoPasante(5);
		assertEquals(e.sueldo(), e.calcularBasico() - e.calcularDescuento() + e.calcularAdicional() );

	}
}
