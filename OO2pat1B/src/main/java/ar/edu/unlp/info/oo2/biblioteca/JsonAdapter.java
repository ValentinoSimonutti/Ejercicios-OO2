package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonAdapter implements Adapter {
	

	public JsonAdapter() {
		
	}
	
	public String exportar(List<Socio> socios) {
		
		JSONArray sociosJSON = new JSONArray();
		socios.stream().forEach(s-> sociosJSON.add(convertir(s)));	
		return sociosJSON.toJSONString();
	
	}
	
	
	public JSONObject convertir(Socio s) {
		
		JSONObject socioJson = new JSONObject();
		socioJson.put("nombre", s.getNombre());
		socioJson.put("email", s.getEmail());
		socioJson.put("legajo", s.getLegajo());
		return socioJson;
	
	}

}
