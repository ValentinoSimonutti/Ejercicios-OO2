package ar.edu.info.unlp.ejercicioDemo.imageFilters.accesobd.accesobd.src.main.java.ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

public class DatabaseProxyAccess implements DatabaseAccess {
	
	private DatabaseRealAccess acceso;
	private boolean loggedIn;
	private static final Logger logger = Logger.getLogger(DatabaseProxyAccess.class.getName());
	
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
			logger.info("Acceso Valido");
			return acceso.getSearchResults(queryString);
		}
		else {
			logger.severe("Acceso Invalido");
			throw new SecurityException("no tenes acceso para buscar");
		}
		
	}

	@Override
	public int insertNewRow(List<String> rowData) {
		
		if( this.loggedIn){
			logger.warning("Acceso Valido");
			return acceso.insertNewRow(rowData);
		}
		else {
			logger.severe("Acceso Invalido");
			throw new SecurityException("no tenes acceso para insertar");
		}
	}



}
