package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class VorheesExporterTest {
	
	private VoorheesExporter exporter;
	private ArrayList<Socio> socios;
	
	
	@BeforeEach
	void setUp() {
		exporter = new VoorheesExporter();
		socios = new ArrayList<Socio>();
		
	}
	

	@Test
	void testExportarVacio() {
		assertEquals(exporter.exportar(socios), "[]");
	}
	
	
	@Test
	void testExportarConElementos() {
		Socio juan = new Socio("juan carlos" , "123" , "juan@mail.com");
		socios.add(juan);
		System.out.println(exporter.exportar(socios));

	}
	
}
