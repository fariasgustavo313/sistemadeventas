package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Venta;
import java.time.LocalDate;
import java.util.List;

public interface IVentaService {
    
    public void crearVenta(Venta venta);
    
    public void eliminarVenta(Long id);
    
    public void editarVenta(Long id, LocalDate fecha_venta, double total);
    
    public Venta traerVenta(Long id);
    
    public List<Venta> traerVentas();
    
    public Venta traerlistaProductosVenta(Long id);
    
    public List<Venta> traerVentaDia(LocalDate fecha_venta);
    
}
