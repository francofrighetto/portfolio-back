/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.proyecto;

/**
 *
 * @author Franco
 */
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Franco
 */
// metodos que recomienda crud
public interface ProyectoRepositorio extends Repository<Proyecto, Integer> {
    
    List<Proyecto>findAll();
    Proyecto findById(int id_persona);
    Proyecto save(Proyecto p);
    void delete(Proyecto p);
    @Query(value = "SELECT distinct(categoria.nombre) FROM proyecto\n" +
"left join categoria on categoria.id_categoria=proyecto.categoria;", nativeQuery=true)
    List<Proyecto> buscarTitulosProyectosDistintios();

}