package com.portfolio.hef.Interface;

import com.portfolio.hef.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //Traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un objeto pero lo buscaremos por ID
    public void deletePersona(Long id);
    
    //buscar uina persona por ID
    public Persona findPersona(Long id);
}
