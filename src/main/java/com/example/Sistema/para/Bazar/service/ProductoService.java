package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.repository.IProductoRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired IProductoRepository productoRepo;
    
    @Override
    public void crearProducto(Producto producto) {
        productoRepo.saveAndFlush(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepo.deleteById(id);
    }

    @Override
    public void editarProducto(Producto producto) {
        productoRepo.saveAndFlush(producto);
    }

    @Override
    public Producto traerProducto(Long id) {
        return productoRepo.findById(id).orElse(null);
    }

    @Override
    public List<Producto> traerProductos() {
        return productoRepo.findAll();
    }

    @Override
    public List<Producto> traerProdPocoStock() {
        Producto producto = new Producto();
        List<Producto> listaProductos = new ArrayList<Producto>();
        listaProductos = productoRepo.findAll();
        
        List<Producto> listaProdStock = new ArrayList<Producto>();
        for(Producto prod : listaProductos) {
            if (prod.getCantidad_disponible() < 5) {
                listaProdStock.add(prod);
            }
        }
        return listaProdStock;
    }
}
