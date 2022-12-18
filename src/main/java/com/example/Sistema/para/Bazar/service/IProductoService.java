package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Producto;

public interface IProductoService {
    
    public void crearProducto(Producto producto);
    
    public void eliminarProducto(Long id);
    
    public void editarProducto(Producto producto);
    
    public Producto traerProducto(Long id);
}
