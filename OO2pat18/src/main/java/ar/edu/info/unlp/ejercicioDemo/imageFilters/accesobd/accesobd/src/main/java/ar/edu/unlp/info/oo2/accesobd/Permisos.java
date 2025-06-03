package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

public class Permisos extends DecoradorDeArchivo{

	public Permisos(ComponenteDeArchivo componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String prettyPrint() {
		return getComponent().prettyPrint()+ '-' + this.getPermisos();
	}
	
	

}
