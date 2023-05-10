/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.habilidades;
import com.portfolioback.habilidades.Habilidad;


import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Franco
 */
public interface HabilidadRepositorio extends Repository<Habilidad,Integer>{
    List<Habilidad>findAll();
    Habilidad findById(int id_header);
    void save(Habilidad h);
    void deleteById(int h);
    
    /*
    @Query(value="SELECT id_habilidades, habilidades.nombre as 'habilidad', imagen, categoria.nombre as 'categoriaNombre' FROM habilidades\n" +
"inner join categoria on habilidades.categoria = categoria.id_categoria",nativeQuery=true)
     List<Habilidad> getCompleto();
*/
}