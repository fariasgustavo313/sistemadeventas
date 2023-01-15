package com.example.Sistema.para.Bazar.dto;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ProductoDTO implements Serializable {
    
    private Long id_producto;
    private String nombre;
    private String marca;
    private double costo;
    private int cantidad_disponible;

    public ProductoDTO() {
    }

    public ProductoDTO(Long id_producto, String nombre, String marca, double costo, int cantidad_disponible) {
        this.id_producto = id_producto;
        this.nombre = nombre;
        this.marca = marca;
        this.costo = costo;
        this.cantidad_disponible = cantidad_disponible;
    }
       
}
