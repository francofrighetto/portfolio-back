/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.habilidades;
import com.portfolioback.habilidades.Habilidad;


import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Franco
 */
public interface HabilidadRepositorio extends Repository<Habilidad,Integer>{
    List<Habilidad>findAll();
    Habilidad findById(int id_header);
    Habilidad save(Habilidad p);
    void delete(Habilidad p);
}