/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas.security.services;

import com.pruebas.security.entities.productos;
import com.pruebas.security.repositories.ProductoRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Luis
 */
@Service

public class ProductoService {
  @Autowired
    private ProductoRepo productorepo;
    
     public List<productos> Lista_productos(){
       return productorepo.findAll();
   }
     public void Elimina_registro (productos prod){
        productorepo.delete(prod);
    }
     public productos Actualiza_registro(productos prod){
        return productorepo.save(prod);
    }
    public productos insertar_registro(productos prod){
        return productorepo.save(prod);
    }
    
   
  
}
