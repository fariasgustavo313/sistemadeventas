package com.example.Sistema.para.Bazar.model;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Stock {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_stock;
    private int cantidad_disponible;
    private LocalDate fecha_edicion;
    private int stock_minimo;
    private Producto unProducto;

    public Stock() {
    }

    public Stock(Long id_stock, int cantidad_disponible, LocalDate fecha_edicion, int stock_minimo, Producto unProducto) {
        this.id_stock = id_stock;
        this.cantidad_disponible = cantidad_disponible;
        this.fecha_edicion = fecha_edicion;
        this.stock_minimo = stock_minimo;
        this.unProducto = unProducto;
    }
    
}
