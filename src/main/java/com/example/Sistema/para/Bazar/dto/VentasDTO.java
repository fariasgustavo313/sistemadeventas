package com.example.Sistema.para.Bazar.dto;

import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class VentasDTO implements Serializable {
    
    private Long codigoVenta;
    private double total;
    private int cantidadProductos;
    private String nombreCliente;
    private String apellidoCliente;

    public VentasDTO() {
    }

    public VentasDTO(Long codigoVenta, double total, int cantidadProductos, String nombreCliente, String apellidoCliente) {
        this.codigoVenta = codigoVenta;
        this.total = total;
        this.cantidadProductos = cantidadProductos;
        this.nombreCliente = nombreCliente;
        this.apellidoCliente = apellidoCliente;
    }
    
}
