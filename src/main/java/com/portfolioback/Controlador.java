/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback;

import com.portfolioback.categoria.Categoria;
import com.portfolioback.categoria.CategoriaService;
import com.portfolioback.habilidades.Habilidad;
import com.portfolioback.habilidades.HabilidadService;
import com.portfolioback.header.Header;
import com.portfolioback.header.HeaderService;
import com.portfolioback.persona.PersonaService;
import com.portfolioback.persona.Persona;
import com.portfolioback.proyecto.Proyecto;
import com.portfolioback.proyecto.ProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controlador {
    
    @Autowired
    HeaderService serviceHeader;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/header")
    public List<Header> listarHeader(){
        return serviceHeader.listar();
    }
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/header/titulo")
    public List<Header> buscarTitulo(){
        return serviceHeader.buscarTitulo("Contacto");
    }
    
    @Autowired
    PersonaService servicePersona;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/personas")
    public List<Persona> listarPersonas(){
        return servicePersona.listar();
    }
    
    @Autowired
    CategoriaService serviceCategoria;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/categoria")
    public List<Categoria> listarCategorias(){
        return serviceCategoria.listar();
    }
    
    @Autowired
    HabilidadService serviceHabilidad;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/habilidades")
    public List<Habilidad> listar(){
        return serviceHabilidad.listar();
    }

    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @PostMapping("/nueva/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad h){
        serviceHabilidad.save(h);
    }
    
    @Autowired
    ProyectoService serviceProyecto;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @GetMapping("/proyectos")
    public List<Proyecto> listarProyecto(){
        return serviceProyecto.listar();
    }
    
    
    @GetMapping("/titulossrp")
    public List<Proyecto> listarTitulosProyectoDistintos(){
        return serviceProyecto.listarTitulosProyectoDistintos();
    }
      
    
    
}
