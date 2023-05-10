/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.portfolioback.habilidades;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
/**
 *
 * @author Franco
 */
@Service
public class HabilidadServiceImp implements HabilidadService {

    @Autowired
    private HabilidadRepositorio repositorio;
    @Override
    public List<Habilidad> listar() {
        return repositorio.findAll();
       }

    @Override
    public void save(Habilidad h) {
        repositorio.save(h);
    }

    @Override
    public Habilidad listarId(int id) {
        return repositorio.findById(id);
    }

    @Override
    public void deleteId(int id) {
        repositorio.deleteById(id);
    }
}
