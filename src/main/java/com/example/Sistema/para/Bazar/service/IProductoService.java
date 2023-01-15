package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Producto;
import java.util.List;

public interface IProductoService {
    
    public void crearProducto(Producto producto);
    
    public void eliminarProducto(Long id);
    
    public void editarProducto(Long id_producto, String nombre, String marca, double costo);
    
    public Producto traerProducto(Long id);
    
    public List<Producto> traerProductos();
    
    //public List<Producto> traerProdPocoStock();
    
}
