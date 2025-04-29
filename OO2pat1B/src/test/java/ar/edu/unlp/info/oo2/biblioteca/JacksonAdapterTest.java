package ar.edu.unlp.info.oo2.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

public class JacksonAdapterTest {

    @Test
    public void testExportarSociosJackson() {
        Biblioteca biblioteca = new Biblioteca(new JacksonAdapter());
        biblioteca.agregarSocio(new Socio("Lucía", "lucia@gmail.com", "123"));
        biblioteca.agregarSocio(new Socio("Marcos", "marcos@gmail.com", "456"));

        String json = biblioteca.exportarSocios();

        System.out.println(json); // solo para ver el resultado
        assertTrue(json.contains("Lucía"));
        assertTrue(json.contains("123"));
    }
    
    @Test
    public void testExportarJacksonVacio() {
    	JacksonAdapter jcksonAdapter = new JacksonAdapter();
		List<Socio> socios = new ArrayList<Socio>();
    	assertEquals(jcksonAdapter.exportar(socios), "[]");
    	
    }
}
