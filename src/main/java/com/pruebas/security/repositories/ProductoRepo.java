/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas.security.repositories;

import com.pruebas.security.entities.productos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Luis
 */
public interface ProductoRepo extends JpaRepository<productos, Integer>  {
    
}
