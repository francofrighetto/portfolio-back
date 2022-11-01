/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.experiencia;

import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author Franco
 */
public interface ExperienciaRepositorio extends Repository<Experiencia,Integer>{
    List<Experiencia>findAll();
    Experiencia findById(int id_header);
    Experiencia save(Experiencia p);
    void delete(Experiencia p);
}
