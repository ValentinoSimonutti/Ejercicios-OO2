package ar.edu.unlp.info.oo2.biblioteca;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

public class JacksonAdapter implements Adapter {

    private ObjectMapper mapper;

    public JacksonAdapter() {
        this.mapper = new ObjectMapper();
    }

    @Override
    public String exportar(List<Socio> socios) {
        try {
            return mapper.writeValueAsString(socios);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            return "[]";
        }
    }
    
    
}
