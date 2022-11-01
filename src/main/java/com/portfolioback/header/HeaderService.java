/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.header;

import java.util.List;

/**
 *
 * @author Franco
 */
public interface HeaderService {
    List<Header> listar();
    Header add(Header p);
    Header listarId(int id);
    Header delete(int id);
    Header edit(Header p);
}
