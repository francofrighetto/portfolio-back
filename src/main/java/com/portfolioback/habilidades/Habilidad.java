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
    private int id_habilidad;
    
    @Column
    private String nombre;
    
    @Column
    private int categoria;
    
    @Column
    private String imagen;
    
    @Column
    private int persona;
}
    
