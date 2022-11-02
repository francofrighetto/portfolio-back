/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.habilidades;

import java.util.List;

/**
 *
 * @author Franco
 */
public interface HabilidadService {
    List<Habilidad> listar();
    Habilidad add(Habilidad p);
    Habilidad listarId(int id);
    Habilidad delete(int id);
    Habilidad edit(Habilidad p);
}