/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.categoria;

import com.portfolioback.categoria.Categoria;
import java.util.List;

/**
 *
 * @author Franco
 */
public interface CategoriaService {
    List<Categoria> listar();
    Categoria add(Categoria c);
    Categoria listarId(int id);
    Categoria delete(int id);
    Categoria edit(Categoria cs);
}