package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.service.IProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    @PostMapping("/producto/crear")
    public String crearProducto(@RequestBody Producto producto) {
        productoServ.crearProducto(producto);
        return "Producto creado correctamente";
    }
    
    @DeleteMapping("/producto/elimina/{id}")
    public String eliminarProducto(@PathVariable Long id_producto) {
        productoServ.eliminarProducto(id_producto);
        return "Producto eliminado correctamente";
    }
    
    @PutMapping("/producto/editar")
    public String editarProducto(@RequestBody Producto producto) {
        productoServ.crearProducto(producto);
        return "Producto editado correctamente";
    }
    
    @GetMapping("/producto/traer/{id}")
    public Producto traerProducto(@PathVariable Long id) {
        return productoServ.traerProducto(id);
    }
}
