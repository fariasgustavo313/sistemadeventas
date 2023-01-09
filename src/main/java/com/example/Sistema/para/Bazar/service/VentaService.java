package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.model.Venta;
import com.example.Sistema.para.Bazar.repository.IVentaRepository;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService {

    @Autowired
    private IVentaRepository ventaRepo;
    
    @Autowired
    private IProductoService productoServ;;
    
    @Override
    public void crearVenta(Venta venta) {
        List<Producto> listaProdVendidos = new ArrayList<Producto>();
        for(Producto prod : venta.getListaProductos()) {
            listaProdVendidos.add(productoServ.traerProducto(prod.getCodigo_producto()));
        }
        double total = 0;
        for(Producto prod : listaProdVendidos) {
            total += prod.getCosto();
        }
        venta.setTotal(total);
        ventaRepo.saveAndFlush(venta);
    }

    @Override
    public void eliminarVenta(Long id) {
        ventaRepo.deleteById(id);
    }

    @Override
    public void editarVenta(Venta venta) {
        ventaRepo.saveAndFlush(venta);
    }

    @Override
    public Venta traerVenta(Long id) {
        return ventaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Venta> traerVentas() {
        return ventaRepo.findAll();
    }

    @Override
    public Venta traerlistaProductosVenta(Long id) {
        return ventaRepo.findById(id).orElse(null);
    }

    @Override
    public List<Venta> traerVentaDia(LocalDate fecha_venta) {
        List<Venta> listaVentas = new ArrayList<Venta>();
        double ventaTotal = 0;
        int cantidadVentas = 0;
        for(Venta venta : this.traerVentas()) {
            if(venta.getFecha_venta() == fecha_venta) {
                listaVentas.add(venta);
                ventaTotal += venta.getTotal();
                cantidadVentas++;
                System.out.println("Total venta: " + ventaTotal + " del dia: " + fecha_venta);
                System.out.println("Cantidad de ventas de un dia: " + cantidadVentas);
            }
        }
        return listaVentas;
    }
    
}
