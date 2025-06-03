package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

public class Extension extends DecoradorDeArchivo {

	public Extension(ComponenteDeArchivo componente) {
		super(componente);
	}

	@Override
	public String prettyPrint() {
		return getComponent().prettyPrint() + '-' + this.getExtension();
	}
	

}
