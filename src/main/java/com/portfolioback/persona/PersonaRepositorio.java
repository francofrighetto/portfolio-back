/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.persona;

import com.portfolioback.persona.Persona;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Franco
 */
// metodos que recomienda crud
public interface PersonaRepositorio extends Repository<Persona, Integer> {
    
    List<Persona>findAll();
    Persona findById(int id_persona);
    Persona save(Persona p);
    void delete(Persona p);


}
