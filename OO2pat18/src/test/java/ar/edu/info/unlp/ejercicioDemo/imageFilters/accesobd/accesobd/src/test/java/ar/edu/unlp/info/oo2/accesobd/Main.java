package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.test.java.ar.edu.unlp.info.oo2.accesobd;

import java.time.LocalDate;

import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.FechaDeCreacion;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.FileOO2;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.Nombre;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.Permisos;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.ComponenteDeArchivo;
import ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd.Extension;


public class Main {

	public static void main(String[] args) {
		        
				ComponenteDeArchivo archivo = new FileOO2(
		            "foto", 2.5, LocalDate.of(2023, 1, 1),
		            LocalDate.of(2023, 1, 2), "rw-r--r--", "jpg"
		        );
				ComponenteDeArchivo nombre = new Nombre(archivo);
				ComponenteDeArchivo permisos = new Permisos(nombre);
				ComponenteDeArchivo extension = new Extension(permisos);


		        System.out.println(extension.prettyPrint());
		        //nombre - permisos - extension

	}

}
