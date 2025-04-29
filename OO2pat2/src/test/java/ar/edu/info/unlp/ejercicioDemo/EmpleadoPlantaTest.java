package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EmpleadoPlantaTest {
	
	private EmpleadoPlanta e;
	
	@Test
	void testCacularAdicional() {
		EmpleadoPlanta e = new EmpleadoPlanta(1, true , 2);
		assertEquals(e.calcularAdicional(), 2000 + 5000 + 4000  );
	}
	
	@Test
	void testCacularAdicionalCero() {
		EmpleadoPlanta e = new EmpleadoPlanta(0, false , 0);
		assertEquals(e.calcularAdicional(), 0  );
	}
	
	@Test
	void testCacularBasico() {
		EmpleadoPlanta e = new EmpleadoPlanta(1, true , 2);
		assertEquals(e.calcularBasico(), 50_000  );
	}
	
	@Test
	void testCacularDescuento() {
		EmpleadoPlanta e = new EmpleadoPlanta(1, true , 2);
		double res =  e.calcularBasico() * 0.13 + e.calcularAdicional() * 0.05;
		assertEquals(e.calcularDescuento(),res);
	}
	
	
	@Test
	void testCalcularSueldo() {
		EmpleadoPlanta e = new EmpleadoPlanta(1, true , 2);
		assertEquals(e.sueldo(), 2000 + 5000 + 4000 +50000 - (e.calcularBasico()*0.13 + e.calcularAdicional() *0.05) );

	}
	
	
	
	

}
