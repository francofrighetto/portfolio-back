/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.proyecto;

/**
 *
 * @author Franco
 */
import javax.persistence.*;

@Entity
@Table(name="proyecto")
public class Proyecto {
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_proyecto;
    
    @Column
    private String titulo;
    
    @Column
    private int categoria;
    
    @Column
    private String descripcion;

    public int getId_proyecto() {
        return id_proyecto;
    }

    public void setId_proyecto(int id_proyecto) {
        this.id_proyecto = id_proyecto;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTecnologias() {
        return tecnologias;
    }

    public void setTecnologias(String tecnologias) {
        this.tecnologias = tecnologias;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTexto_link() {
        return texto_link;
    }

    public void setTexto_link(String texto_link) {
        this.texto_link = texto_link;
    }

    public String getLink2() {
        return link2;
    }

    public void setLink2(String link2) {
        this.link2 = link2;
    }

    public String getTexto_link2() {
        return texto_link2;
    }

    public void setTexto_link2(String texto_link2) {
        this.texto_link2 = texto_link2;
    }

    public String getSvg() {
        return svg;
    }

    public void setSvg(String svg) {
        this.svg = svg;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
    
    @Column
    private String tecnologias;
    
    @Column
    private String link;
    
    @Column
    private String texto_link;
    
    @Column
    private String link2;
    
    @Column
    private String texto_link2;
    
    @Column
    private String svg;
    
    @Column
    private int persona;
}
