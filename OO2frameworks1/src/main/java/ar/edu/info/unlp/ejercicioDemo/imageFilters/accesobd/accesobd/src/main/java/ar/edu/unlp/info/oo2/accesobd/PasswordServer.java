package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;


public class PasswordServer extends SingleThreadTCPServer {
    
    private Random random = new Random();
    
    @Override
    public void handleMessage(String message, PrintWriter out) {
        System.out.println("Mensaje recibido: '" + message + "'");
        
        String[] parts = message.split(";");
        if (parts.length != 3) {
            out.println("Error: formato inválido. Debe enviar letras;números;especiales");
            return;
        }
        
        String letrasPermitidas = parts[0];
        String numerosPermitidos = parts[1];
        String especialesPermitidos = parts[2];
        
        if (letrasPermitidas.isEmpty() || numerosPermitidos.isEmpty() || especialesPermitidos.isEmpty()) {
            out.println("Error: ninguna cadena puede estar vacía");
            return;
        }
        
        String password = generarPassword(letrasPermitidas, numerosPermitidos, especialesPermitidos);
        
        if (password.length() != 8) {
            out.println("Error interno: la contraseña generada no tiene 8 caracteres.");
            System.err.println("Contraseña inválida generada: '" + password + "'");
            return;
        }
        
        out.println(password);
    }
    
    private String generarPassword(String letrasPermitidas, String numerosPermitidos, String especialesPermitidos) {
        List<Character> contraseña = new ArrayList<>();

        contraseña.add(especialesPermitidos.charAt(random.nextInt(especialesPermitidos.length())));
        contraseña.add(numerosPermitidos.charAt(random.nextInt(numerosPermitidos.length())));

        for (int i = 0; i < 6; i++) {
            contraseña.add(letrasPermitidas.charAt(random.nextInt(letrasPermitidas.length())));
        }

        Collections.shuffle(contraseña);

        StringBuilder sb = new StringBuilder();
        for (char c : contraseña) {
            sb.append(c);
        }

        return sb.toString();
    }
    
    @Override
    protected String getCloseWord() {
        return "exit";
    }
    
    public static void main(String[] args) {
        PasswordServer server = new PasswordServer();
        server.startLoop(args);
    }
}
