package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONObject;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class JsonAdapterTest {
	
	private JsonAdapter jsonAdapter;
	
	@BeforeEach
	void setUp() {
	     jsonAdapter = new JsonAdapter();
		
	}

	@Test
	public void testExportar() {

		Socio s1 = new Socio("Juan", "juan@example.com", "001");
	    Socio s2 = new Socio("Ana", "ana@example.com", "002");
	    List<Socio> socios = new ArrayList<Socio>();
		socios.add(s1);
		socios.add(s2);
	    
	    String json = jsonAdapter.exportar(socios);
        System.out.println(json); // solo para ver el resultado

	    assertTrue(json.contains("Juan"));
	    assertTrue(json.contains("ana@example.com"));
	    assertTrue(json.contains("001"));
	}
	
	@Test
	public void testExportarVacio() {
		List<Socio> socios = new ArrayList<Socio>();
		System.out.println(jsonAdapter.exportar(socios));
		assertEquals(jsonAdapter.exportar(socios), "[]");
	}
	
	@Test
	public void testConvertir(){
		Socio s1 = new Socio("Juan", "juan@example.com", "001");
		JSONObject socioJson = jsonAdapter.convertir(s1);
		assertTrue(socioJson.containsValue("Juan"));
		System.out.println(socioJson.toString());
		
	}


}
