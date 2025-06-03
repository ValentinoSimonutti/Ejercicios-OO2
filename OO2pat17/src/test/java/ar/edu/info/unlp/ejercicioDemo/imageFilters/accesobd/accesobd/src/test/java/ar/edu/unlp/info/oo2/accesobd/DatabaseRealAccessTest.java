package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.test.java.ar.edu.unlp.info.oo2.accesobd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.DatabaseAccess;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.DatabaseRealAccess;

public class DatabaseRealAccessTest {
    private DatabaseAccess database;

    @BeforeEach
    void setUp() throws Exception {
        this.database = new DatabaseRealAccess();
    }

    @Test
    void testGetSearchResults() {
        assertEquals(Arrays.asList("Spiderman", "Marvel"), this.database.getSearchResults("select * from comics where id=1"));
        assertEquals(Collections.emptyList(), this.database.getSearchResults("select * from comics where id=10"));
    }

    @Test
    void testInsertNewRow() {
        assertEquals(3, this.database.insertNewRow(Arrays.asList("Patoruzú", "La flor")));
        assertEquals(Arrays.asList("Patoruzú", "La flor"), this.database.getSearchResults("select * from comics where id=3"));
    }
}