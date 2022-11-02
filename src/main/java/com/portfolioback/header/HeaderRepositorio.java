/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.header;
import java.util.List;
import org.springframework.data.repository.Repository;
/**
 *
 * @author Franco
 */
public interface HeaderRepositorio extends Repository<Header, Integer> {
    
    List<Header>findAll();
    Header findById(int id_header);
    Header save(Header p);
    void delete(Header p);
    

}
