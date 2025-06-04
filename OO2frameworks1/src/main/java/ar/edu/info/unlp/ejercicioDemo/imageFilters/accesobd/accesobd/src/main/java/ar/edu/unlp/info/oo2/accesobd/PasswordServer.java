package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PasswordServer extends SingleThreadTCPServer{
	
    private int port;
	private String letrasPermitidas;
    private String numerosPermitidos;
    private String especialesPermitidos;
    private Random random = new Random();
	
    
    public PasswordServer() {
        // Constructor vacío
    }
    
    @Override
    public void handleMessage(String message, PrintWriter out) {
        String password = generarPassword();
        out.println(password);
    }
	
    private String generarPassword() {
        List<Character> contraseña = new ArrayList<>();

        contraseña.add(this.especialesPermitidos.charAt(this.random.nextInt(this.especialesPermitidos.length())));
        contraseña.add(this.numerosPermitidos.charAt(this.random.nextInt(this.numerosPermitidos.length())));

        for (int i = 0 ; i < 6 ; i++) {
            contraseña.add(this.letrasPermitidas.charAt(this.random.nextInt(this.letrasPermitidas.length())));
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

	@Override
    protected void checkArguments(String[] args) {
        if (args.length != 4) {
            System.err.println("Uso: java PasswordServer <puerto> <letras> <números> <especiales>");
            System.exit(1);
        }

        try {
            this.port = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.err.println("El puerto debe ser un número.");
            System.exit(1);
        }

        this.letrasPermitidas = args[1];
        this.numerosPermitidos = args[2];
        this.especialesPermitidos = args[3];

        if (letrasPermitidas.isEmpty() || numerosPermitidos.isEmpty() || especialesPermitidos.isEmpty()) {
            System.err.println("Ninguna de las cadenas de caracteres permitidos puede estar vacía.");
            System.exit(1);
        }
    }
	
	@Override
    protected void displayUsage() {
        System.err.println("Uso: java " + this.getClass().getName() + " <letras> <números> <especiales>");
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PasswordServer p = new PasswordServer();
	    p.startLoop(args);

	}
	
	
}
