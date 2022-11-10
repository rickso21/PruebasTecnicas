/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas.security.controllers;
//rrr
import com.pruebas.security.entities.productos;
import com.pruebas.security.services.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Luis
 */
@RestController
public class ProductoController {
   @Autowired
    
    private ProductoService productoservice;
    @GetMapping@RequestMapping("/Lista_productos")

    public List<productos>Lista_productos(){
        return productoservice.Lista_productos();
    }
        @PreAuthorize("hasRole('ADMIN')")

    @PostMapping("/insertar_registro")
    public productos insertar_registro(@RequestBody productos prod){
        return productoservice.insertar_registro(prod);
    }
    @PutMapping("/Actualiza_registro")
    public productos Actualiza_registro(@RequestBody productos prod){
        return productoservice.Actualiza_registro(prod);
    }
    @DeleteMapping("/Elimina_registro")
    public void Elimina_registro(@RequestBody productos prod){
        productoservice.Elimina_registro(prod);
    }
}

