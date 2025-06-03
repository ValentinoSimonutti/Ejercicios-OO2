package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

public class Nombre extends DecoradorDeArchivo{

	public Nombre(ComponenteDeArchivo componente) {
		super(componente);
	}
	
	@Override
	public String prettyPrint() {
		return getComponent().prettyPrint()+ '-' + this.getNombre();
	}

}
