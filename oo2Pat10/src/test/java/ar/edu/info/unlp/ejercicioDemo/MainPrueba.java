package ar.edu.info.unlp.ejercicioDemo;

public class MainPrueba {
	
		    public static void main(String[] args) {
		        Mensajero mensajero = new Mensajero();

		        // Usar FeistelCipher
		        mensajero.setCifrador(new FeistelAdapter("claveSecreta"));
		        String mensajeCifrado = mensajero.enviar("Hola mundo!");
		        System.out.println("Feistel Enviado: " + mensajeCifrado);
		        System.out.println("Feistel Recibido: " + mensajero.recibir(mensajeCifrado));

		        // Cambiar a RC4
		        mensajero.setCifrador(new RC4Adapter("miClaveRC4"));
		        String mensajeCifrado2 = mensajero.enviar("Hola mundo!");
		        System.out.println("RC4 Enviado: " + mensajeCifrado2);
		        System.out.println("RC4 Recibido: " + mensajero.recibir(mensajeCifrado2));
	}

}
