/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.habilidades;

import com.portfolioback.categoria.Categoria;
import com.portfolioback.persona.Persona;
import javax.persistence.*;


/**
 *
 * @author Franco
 */
@Entity
@Table(name="habilidades")

public class Habilidad {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_habilidades;
    
    @Column
    private String nombre;
   
    /*
    @Column
    private int categoria;
    */
    
    @Column
    private String imagen;
    
    @Column
    private int habilitado;
    
    
    @ManyToOne
    @JoinColumn(name="categoria",referencedColumnName="id_categoria")
    private Categoria categoria;

    /*
    public Habilidad(int id_habilidades, String nombre, String imagen, Categoria categoria) {
        this.id_habilidades = id_habilidades;
        this.nombre = nombre;
        this.imagen = imagen;
        this.categoria = categoria;
    }
    */

    
    
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


    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getHabilitado() {
        return habilitado;
    }

    public void setHabilitado(int habilitado) {
        this.habilitado = habilitado;
    }
  
    
    
}
    
