/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pruebas.security.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Luis
 */
@Entity
@Table(name="tbl_productos")
public class productos {
   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id_producto;
    private String nombre_producto;
    @Column(unique= true,length=13)
    private Date Fecha_Vigencia;
    private Integer Cantidad;

    public Integer getId_producto() {
        return Id_producto;
    }

    public void setId_producto(Integer Id_producto) {
        this.Id_producto = Id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public Date getFecha_Vigencia() {
        return Fecha_Vigencia;
    }

    public void setFecha_Vigencia(Date Fecha_Vigencia) {
        this.Fecha_Vigencia = Fecha_Vigencia;
    }

    public Integer getCantidad() {
        return Cantidad;
    }

    public void setCantidad(Integer Cantidad) {
        this.Cantidad = Cantidad;
    }
    
}
