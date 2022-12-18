package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Venta;
import com.example.Sistema.para.Bazar.service.IVentaService;
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
    
    @PostMapping("/venta/crear")
    public String crearVenta(@RequestBody Venta venta) {
        ventaServ.crearVenta(venta);
        return "Venta creada correctamente";
    }
    
    @DeleteMapping("/venta/eliminar/{id}")
    public String eliminarVenta(@PathVariable Long id) {
        ventaServ.eliminarVenta(id);
        return "Venta eliminada correctamente";
    }
    
    @PutMapping("/venta/editar")
    public String editarVenta(@RequestBody Venta venta) {
        ventaServ.crearVenta(venta);
        return "Venta editada correctamente";
    }
    
    @GetMapping("/venta/traer/{id}")
    public Venta traerVenta(@PathVariable Long id) {
        return ventaServ.traerVenta(id);
    }
}