package com.example.Sistema.para.Bazar.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Producto {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_producto;
    private String nombre;
    private String marca;
    private double costo;

    public Producto() {
    }

    public Producto(Long id_producto, String nombre, String marca, double costo) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
    }
    
}
