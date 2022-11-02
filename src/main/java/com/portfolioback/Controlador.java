/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback;


import com.portfolioback.header.Header;
import com.portfolioback.header.HeaderService;
import com.portfolioback.persona.PersonaService;
import com.portfolioback.persona.Persona;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//@RequestMapping({"/personas"})
public class Controlador {
    
    @Autowired
    HeaderService serviceHeader;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @RequestMapping("/header")
    public List<Header> listarHeader(){
        return serviceHeader.listar();
    }
    
    @Autowired
    PersonaService servicePersona;
    
    @CrossOrigin(origins = {"http://localhost:4200", "https://angular-portfolio14.web.app/"}, maxAge=3600)
    @RequestMapping("/personas")
    public List<Persona> listarPersonas(){
        return servicePersona.listar();
    }
    
    
}
