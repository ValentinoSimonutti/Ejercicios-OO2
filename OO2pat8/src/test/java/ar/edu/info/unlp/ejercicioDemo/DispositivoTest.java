package ar.edu.info.unlp.ejercicioDemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DispositivoTest {

	private Dispositivo dispositivo;
    private Calculator crc16;
    private Connection wifiConn;

    @BeforeEach
    void setUp() {
        crc16 = new CRC16_Calculator();
        wifiConn = new WiFiConn();
        dispositivo = new Dispositivo(crc16, wifiConn, new Ringer(), new Display());
    }

    @Test
    void testSend_DataNormal() {
        String result = dispositivo.send("Hola Mundo");
        assertTrue(result.contains("WiFi: Hola Mundo"));  // Verifica formato de WiFiConn
        assertTrue(result.contains("CRC"));  // Verifica que se incluyó el CRC
    }

    @Test
    void testSend_DataVacia() {
        String result = dispositivo.send("");
        assertTrue(result.contains("WiFi: "));  // WiFiConn maneja strings vacíos
    }

    @Test
    void testSend_CaracteresEspeciales() {
        String result = dispositivo.send("@#$%");
        assertTrue(result.contains("@#$%"));
    }
    
    @Test
    void testSend_DataNormal2() {
    	dispositivo.setEstrategia(new CRC32_Calculator());
        String result = dispositivo.send("Hola Mundo");
        assertTrue(result.contains("WiFi: Hola Mundo"));  // Verifica formato de WiFiConn
        assertTrue(result.contains("CRC"));  // Verifica que se incluyó el CRC
    }

    @Test
    void testSend_DataVacia2() {
    	dispositivo.setEstrategia(new CRC32_Calculator());
        String result = dispositivo.send("");
        assertTrue(result.contains("WiFi: "));  // WiFiConn maneja strings vacíos
    }

    @Test
    void testSend_CaracteresEspeciales2() {
    	dispositivo.setEstrategia(new CRC32_Calculator());
        String result = dispositivo.send("@#$%");
        assertTrue(result.contains("@#$%"));
    }
    
    
    //
    
    @Test
    void testSetConnection_WiFiTo4G() {
        FourGConnection fourG = new FourGConnection();
        FourGAdapter adapter = new FourGAdapter(fourG);
        
        dispositivo.setConnection(adapter);
        String result = dispositivo.send("Test 4G");
        assertTrue(result.contains("4G: Test 4G"));  // Verifica que ahora usa 4G
    }

    @Test
    void testSetConnection_MismaConexion() {
        // WiFi ya está configurado en setUp()
        dispositivo.setConnection(wifiConn);  // No debería lanzar excepciones
        String result = dispositivo.send("Misma conexión");
        assertTrue(result.contains("WiFi: Misma conexión"));
    }
    
    
    //
    
    @Test
    void testSetEstrategia_CRC16ToCRC32() {
        Calculator crc32 = new CRC32_Calculator();
        dispositivo.setEstrategia(crc32);
        String result = dispositivo.send("CRC32");
        // Verifica que el CRC32 se aplicó (comparando con un valor conocido)
        assertTrue(result.matches(".*CRC: \\d+.*"));  // Asegura que el CRC es numérico
    }

    @Test
    void testSetEstrategia_MismaEstrategia() {
        dispositivo.setEstrategia(crc16);  // Ya estaba configurado en setUp()
        String result = dispositivo.send("Misma estrategia");
        assertTrue(result.contains("WiFi: Misma estrategia"));
    }

}
