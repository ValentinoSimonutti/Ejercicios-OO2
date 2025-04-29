package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BibliotecaTest {
	
	private Biblioteca b;
	private Adapter adaptador;
	
	
	@BeforeEach
	void setUp() {
		adaptador = new JsonAdapter();
		b = new Biblioteca(adaptador);
	}

	@Test
	void testExportarSocios() {
		Socio s = new Socio("juan", "123" , "jc@mail.com");
		b.agregarSocio(s);
		
		String sociosJson = b.exportarSocios();
        System.out.println(sociosJson); // solo para ver el resultado

		assertTrue(sociosJson.contains("juan"));
		assertTrue(sociosJson.contains("123"));
		assertTrue(sociosJson.contains("jc@mail.com"));
		assertTrue(sociosJson.contains("["));
		assertTrue(sociosJson.contains("]"));
		assertTrue(sociosJson.contains("nombre"));

	
	}
	
	@Test
	void testExportarSociosVacios() {
		assertEquals(b.exportarSocios(), "[]");
	}

}
