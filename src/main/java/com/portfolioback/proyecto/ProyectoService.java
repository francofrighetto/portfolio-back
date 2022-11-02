/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.proyecto;

import java.util.List;

/**
 *
 * @author Franco
 */
public interface ProyectoService {
    List<Proyecto> listar();
    Proyecto add(Proyecto p);
    Proyecto listarId(int id);
    Proyecto delete(int id);
    Proyecto edit(Proyecto p);
    List<Proyecto> listarTitulosProyectoDistintos();

    
}
