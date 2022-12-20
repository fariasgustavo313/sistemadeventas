package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Venta;
import java.util.List;

public interface IVentaService {
    
    public void crearVenta(Venta venta);
    
    public void eliminarVenta(Long id);
    
    public void editarVenta(Venta venta);
    
    public Venta traerVenta(Long id);
    
    public List<Venta> traerVentas();
}
