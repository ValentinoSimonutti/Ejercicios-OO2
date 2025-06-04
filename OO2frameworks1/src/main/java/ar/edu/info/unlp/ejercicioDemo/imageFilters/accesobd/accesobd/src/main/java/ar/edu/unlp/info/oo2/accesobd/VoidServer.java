package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;

public class VoidServer extends SingleThreadTCPServer {

    public void handleMessage(String message, PrintWriter out) {

    }

    protected void displaySocketData(Socket clientSocket) {
        System.out.println("Client connected from: " + clientSocket.getInetAddress().getHostAddress() + ":"
                + clientSocket.getPort());
        displayWarning();
    }

    protected void displayUsage() {
        System.err.println("Usage: java" + this.getClass().getName() + "<port number>");
        displayWarning();
    }

    protected void displaySocketInformation(int portNumber) {
        System.out.println(this.getClass().getName() + " server listening on port: " + portNumber);
        displayWarning();
    }

    private void displayWarning() {
        System.err.println("--This is the VoidServer. It will do nothing for you--");
    }
    
    //hooks opcionales
    
    @Override
    protected void preProcessClient(Socket clientSocket) {
        System.out.println("VoidServer: preparando conexión");
    }

    @Override
    protected void postProcessClient(Socket clientSocket) {
        System.out.println("VoidServer: finalizando conexión");
    }

    @Override
    protected void handleClientCommunicationError(IOException e, Socket clientSocket) {
        System.err.println("VoidServer - Error: " + e.getMessage());
    } 
    
    //hasta aca I
    
    @Override
    protected String getCloseWord() { //esto es de II
	    return "cerrar";
	}
	
    
    public static void main(String[] args) {

        new VoidServer().startLoop(args);

    }
}