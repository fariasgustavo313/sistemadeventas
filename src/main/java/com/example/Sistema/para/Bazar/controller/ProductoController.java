package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.service.IProductoService;
import java.util.List;
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
    
    @PostMapping("/productos/crear")
    public String crearProducto(@RequestBody Producto producto) {
        productoServ.crearProducto(producto);
        return "Producto creado correctamente";
    }
    
    @DeleteMapping("/productos/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoServ.eliminarProducto(id);
        return "Producto eliminado correctamente";
    }
    
    @PutMapping("/productos/editar")
    public String editarProducto(@RequestBody Producto producto) {
        productoServ.crearProducto(producto);
        return "Producto editado correctamente";
    }
    
    @GetMapping("/productos/{id}")
    public Producto traerProducto(@PathVariable Long id) {
        return productoServ.traerProducto(id);
    }
    
    @GetMapping("/productos")
    public List<Producto> traerProductos() {
        return productoServ.traerProductos();
    }
    
    @GetMapping("/productos/falta_stock")
    public List<Producto> traerProdPocoStock() {
        return productoServ.traerProdPocoStock();
    }
}
