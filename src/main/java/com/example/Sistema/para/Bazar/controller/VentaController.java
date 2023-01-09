package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Producto;
import com.example.Sistema.para.Bazar.model.Venta;
import com.example.Sistema.para.Bazar.service.IVentaService;
import java.time.LocalDate;
import java.util.ArrayList;
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
public class VentaController {
    
    @Autowired
    private IVentaService ventaServ;
    
    //Crea una venta
    @PostMapping("/ventas/crear")
    public String crearVenta(@RequestBody Venta venta) {
        ventaServ.crearVenta(venta);
        return "Venta creada correctamente";
    }
    
    //Elimina una venta
    @DeleteMapping("/ventas/eliminar/{id}")
    public String eliminarVenta(@PathVariable Long id) {
        ventaServ.eliminarVenta(id);
        return "Venta eliminada correctamente";
    }
    
    //Edita una venta
    @PutMapping("/ventas/editar")
    public String editarVenta(@RequestBody Venta venta) {
        ventaServ.crearVenta(venta);
        return "Venta editada correctamente";
    }
    
    //Trae una determinada venta
    @GetMapping("/ventas/{id}")
    public Venta traerVenta(@PathVariable Long id) {
        return ventaServ.traerVenta(id);
    }
    
    //Trae todas las ventas
    @GetMapping("/ventas")
    public List<Venta> traerVentas() {
        return ventaServ.traerVentas();
    }
    
    //Trae todos los productos vendidos en una determinada venta
    @GetMapping("/ventas/productos/{id}")
    public List<Producto> traerlistaProductosVenta(@PathVariable Long id) {
        List<Producto> listaProdVenta = new ArrayList<Producto>();
        listaProdVenta = ventaServ.traerVenta(id).getListaProductos();
        return listaProdVenta;
    }
    
    //Trae todas las ventas de un determinado dia
    @GetMapping("/ventas/{fecha_venta}")
    public List<Venta> traerVentaDia(@PathVariable LocalDate fecha_venta) {
        return ventaServ.traerVentaDia(fecha_venta);
    }
}
