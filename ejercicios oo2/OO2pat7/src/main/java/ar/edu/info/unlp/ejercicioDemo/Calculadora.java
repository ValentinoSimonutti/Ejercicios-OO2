package ar.edu.info.unlp.ejercicioDemo;

public class Calculadora {
	
	private Estado estado;
	private double acumulado;
	
	
	public Calculadora() {
	    this.estado = new EstadoInicial();
	    this.acumulado = 0;
	}	
	
	/**
 	* Devuelve el resultado actual de la operación realizada.
* Si no se ha realizado ninguna operación, devuelve el valor acumulado.
* Si la calculadora se encuentra en error, devuelve “error”
     */
    public String getResultado() {
    	
    	return estado.getResultado(this);
    }


    /**
     * Pone en cero el valor acumulado y reinicia la calculadora
     */
    public void borrar() {
    	estado.borrar(this);
    }


    /**
     * Asigna un valor para operar. 
     * si hay una operación en curso, el valor será utilizado en la operación
     */
    public void setValor(double unValor) {
    	estado.setValor(unValor,this);
    }


     /**
      * Indica que la calculadora debe esperar un nuevo valor. 
      * Si a continuación se le envía el mensaje setValor(), la calculadora sumará
      * el valor recibido como parámetro, al valor actual y guardará el resultado 
	
	 */
    public void mas() {
    	estado.mas(this);
    }
    
    public void menos() {
    	estado.menos(this);
    }
    
    public void por() {
    	estado.por(this);
    }
    
    public void dividido () {
    	estado.dividido(this);
    }
    
    
    public void setEstado(Estado e) {
    	this.estado= e ;
    }
    
    public double getAcumulado() {
    	return this.acumulado;
    }
    
    public void setAcumulado(double valor) {
    	this.acumulado= valor;
    }
    
    

	

}
