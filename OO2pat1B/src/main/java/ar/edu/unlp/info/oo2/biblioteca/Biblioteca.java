package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Socio> socios;
	private Adapter exporter;

	public Biblioteca(Adapter a) {
		socios = new ArrayList<>();
		exporter = a;
	}

	public void agregarSocio(Socio socio) {
		socios.add(socio);
	}

	/**
	 * Retorna la representación JSON de la colección de socios.
	 */
	public String exportarSocios() {
		return exporter.exportar(socios);
	}

	public Adapter getExporter() {
		return exporter;
	}

	public void setExporter(Adapter exporter) {
		this.exporter = exporter;
	}
}
