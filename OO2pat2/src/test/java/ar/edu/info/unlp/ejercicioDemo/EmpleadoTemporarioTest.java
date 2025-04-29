package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class EmpleadoTemporarioTest {

private EmpleadoTemporario e;
	
	@Test
	void testCacularAdicional() {
		EmpleadoTemporario e = new EmpleadoTemporario(2, true , 5);
		assertEquals(e.calcularAdicional(), 5000 + 5*2000  );
	}
	
	@Test
	void testCacularAdicionalCero() {
		EmpleadoTemporario e = new EmpleadoTemporario(0,false,0);
		assertEquals(e.calcularAdicional(), 0);
	}
	
	@Test
	void testCacularBasico() {
		EmpleadoTemporario e = new EmpleadoTemporario(2, true , 5);
		assertEquals(e.calcularBasico(), 20_000  +  (2 * 300));
	}
	
	@Test
	void testCacularDescuento() {
		EmpleadoTemporario e = new EmpleadoTemporario(2, true , 5);
		double res =  e.calcularBasico() * 0.13 + e.calcularAdicional() * 0.05;
		assertEquals(e.calcularDescuento(), res);
	}
	
	
	@Test
	void testCalcularSueldo() {
		EmpleadoPasante e = new EmpleadoPasante(5);
		assertEquals(e.sueldo(), e.calcularBasico() - e.calcularDescuento() + e.calcularAdicional() );

	}
}
