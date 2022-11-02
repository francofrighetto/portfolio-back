/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.habilidades;

import javax.persistence.*;


/**
 *
 * @author Franco
 */
@Entity
@Table(name="habiliades")
public class Habilidad {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_habilidades;
    
    @Column
    private String nombre;
    
    @Column
    private int categoria;
    
    @Column
    private String imagen;
    
    @Column
    private int persona;

    public int getId_habilidades() {
        return id_habilidades;
    }

    public void setId_habilidades(int id_habilidades) {
        this.id_habilidades = id_habilidades;
    }



    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
    
    
}
    
