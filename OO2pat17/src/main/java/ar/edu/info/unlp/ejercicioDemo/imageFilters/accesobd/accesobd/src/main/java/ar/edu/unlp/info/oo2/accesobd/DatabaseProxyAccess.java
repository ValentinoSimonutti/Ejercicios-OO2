package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxyAccess implements DatabaseAccess {
	
	private DatabaseRealAccess acceso;
	private boolean loggedIn;
	
	public DatabaseProxyAccess(DatabaseRealAccess acceso) {
		this.acceso = acceso;
		this.loggedIn= false;
	}
	
	public void login(String user, String passwd) {
		    
		if (user.equals("administrador") && passwd.equals("123")) {
		        loggedIn = true;
		 } else {
		        throw new SecurityException("Credenciales incorrectas");
		 }
	}

	@Override
	public Collection<String> getSearchResults(String queryString) {
		
		if(this.loggedIn){
			return acceso.getSearchResults(queryString);
		}
		else throw new SecurityException("no tenes acceso para buscar");
		
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		if( this.loggedIn){
			return acceso.insertNewRow(rowData);
		}
		else throw new SecurityException("no tenes acceso para insertar");
	}



}
