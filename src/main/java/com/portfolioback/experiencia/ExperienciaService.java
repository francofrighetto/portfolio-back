/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.experiencia;

import java.util.List;

/**
 *
 * @author Franco
 */
public interface ExperienciaService {
    List<Experiencia> listar();
    Experiencia add(Experiencia p);
    Experiencia listarId(int id);
    Experiencia delete(int id);
    Experiencia edit(Experiencia p);
}
