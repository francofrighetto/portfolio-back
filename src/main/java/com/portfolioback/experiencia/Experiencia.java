/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.experiencia;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 *
 * @author Franco
 */
@Entity
@Table(name="experiencia")
public class Experiencia {
    
    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_experiencia;
    
    @Column
    private int ambito;
    
    @Column
    private int persona;
    
    @Column
    private int categoria;
    
    @Column
    private String lugar;
    
    @Column
    private String especializacion;
    
    @Column
    private String desde;
    
    @Column
    private String hasta;
    
    @Column
    private String extra;
}
