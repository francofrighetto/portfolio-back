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
