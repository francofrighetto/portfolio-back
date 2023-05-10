/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.portfolioback.header;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
/**
 *
 * @author Franco
 */
public interface HeaderRepositorio extends Repository<Header, Integer> {
    
    List<Header>findAll();
    Header findById(int id_header);
    Header save(Header p);
    void delete(Header p);
    
    @Query(value="select * from header where titulo=:titulo",nativeQuery=true)
    List<Header> buscarPorTitulo(@Param("titulo") String titulo);
    

}
