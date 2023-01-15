package com.example.Sistema.para.Bazar.model;
import java.time.LocalDate;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Venta {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id_venta;
    private LocalDate fecha_venta;
    private double total;
    @OneToMany
    private List<Producto> listaProductos;
    @OneToOne
    @JoinColumn(name = "un_cliente_id_cliente", referencedColumnName = "id_cliente")
    private Cliente unCliente;

    public Venta() {
    }

    public Venta(Long id_venta, LocalDate fecha_venta, double total, List<Producto> listaProductos, Cliente unCliente) {
        this.id_venta = id_venta;
        this.fecha_venta = fecha_venta;
        this.total = total;
        this.listaProductos = listaProductos;
        this.unCliente = unCliente;
    }
    
}
