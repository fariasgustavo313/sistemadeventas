package com.example.Sistema.para.Bazar.model;
import java.time.LocalDate;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
    @OneToOne
    @JoinColumn(name = "un_producto_id_producto", referencedColumnName = "id_producto")
    private Producto unProducto;

    public Stock() {
    }

    public Stock(Long id_stock, int cantidad_disponible, LocalDate fecha_edicion, Producto unProducto) {
        this.id_stock = id_stock;
        this.cantidad_disponible = cantidad_disponible;
        this.fecha_edicion = fecha_edicion;
        this.unProducto = unProducto;
    }

}
