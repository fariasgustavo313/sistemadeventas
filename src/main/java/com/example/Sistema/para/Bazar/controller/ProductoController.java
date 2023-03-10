package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.dto.ProductoDTO;
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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductoController {
    
    @Autowired
    private IProductoService productoServ;
    
    //Alta a un producto
    @PostMapping("/productos/crear")
    public String crearProducto(@RequestBody Producto producto) {
        productoServ.crearProducto(producto);
        return "Producto creado correctamente";
    }
    
    //Baja a un producto
    @DeleteMapping("/productos/eliminar/{id}")
    public String eliminarProducto(@PathVariable Long id) {
        productoServ.eliminarProducto(id);
        return "Producto eliminado correctamente";
    }
    
    //Edicion de un producto
    @PutMapping("/productos/editar/{id}")
    public Producto editarProducto(@PathVariable Long id_producto,
            @RequestParam(required = false, name = "nombre") String nombre,
            @RequestParam(required = false, name = "marca") String marca,
            @RequestParam(required = false, name = "costo") double costo) {
        
        productoServ.editarProducto(id_producto, nombre, marca, 0);
        
        Producto producto = productoServ.traerProducto(id_producto);
        
        return producto;
    }
    
    //Traer a un producto
    @GetMapping("/productos/{id}")
    public Producto traerProducto(@PathVariable Long id) {
        return productoServ.traerProducto(id);
    }
    
    //Trae la lista de productos
    @GetMapping("/productos")
    public List<Producto> traerProductos() {
        return productoServ.traerProductos();
    }
        
    //Trae la lista de productos con stock menor o igual al ingresado
    @GetMapping("/productos/stockbajo{cant}")
    public List<ProductoDTO> traerProdPocoStock(@PathVariable int cant) {
        return productoServ.traerProdPocoStock();
    }
    
}
