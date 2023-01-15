package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.dto.ProductoDTO;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.model.Stock;
import com.example.Sistema.para.Bazar.repository.IProductoRepository;
import com.example.Sistema.para.Bazar.repository.IStockRepository;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService implements IProductoService {

    @Autowired
    private IProductoRepository productoRepo;
    
    @Autowired
    private IStockRepository stockRepo;
    
    @Override
    public void crearProducto(Producto producto) {
        productoRepo.saveAndFlush(producto);
    }

    @Override
    public void eliminarProducto(Long id) {
        productoRepo.deleteById(id);
    }

    @Override
    public void editarProducto(Long id_producto, String nombre, String marca, double costo) {
        Producto producto = new Producto();
        
        producto.setNombre(nombre);
        producto.setMarca(marca);
        producto.setCosto(0);
        
        this.crearProducto(producto);
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
    public List<ProductoDTO> traerProdPocoStock() {
        
        List<Stock> listaStock = new ArrayList<Stock>();
        listaStock = stockRepo.findAll();
        
        List<ProductoDTO> listaProductos = new ArrayList<ProductoDTO>();
        ProductoDTO prodDTO = new ProductoDTO();
        int st = 0;
        
        for(Stock stock : listaStock) {
            if(stock.getCantidad_disponible() <= st) {
                prodDTO.setId_producto(stock.getUnProducto().getId_producto());
                prodDTO.setNombre(stock.getUnProducto().getNombre());
                prodDTO.setMarca(stock.getUnProducto().getMarca());
                prodDTO.setCosto(stock.getUnProducto().getCosto());
                prodDTO.setCantidad_disponible(stock.getCantidad_disponible());
                
                listaProductos.add(prodDTO);
            }
        }
        return listaProductos;
    }

}
