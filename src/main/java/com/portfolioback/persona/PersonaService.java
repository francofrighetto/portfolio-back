/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.persona;

import java.util.List;

/**
 *
 * @author Franco
 */
public interface PersonaService {
    List<Persona> listar();
    Persona add(Persona p);
    Persona listarId(int id);
    Persona delete(int id);
    Persona edit(Persona p);
}
