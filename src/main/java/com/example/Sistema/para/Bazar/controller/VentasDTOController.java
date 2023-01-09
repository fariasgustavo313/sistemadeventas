package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.dto.VentasDTO;
import com.example.Sistema.para.Bazar.service.IVentasDTOService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class VentasDTOController {
    
    @Autowired
    private IVentasDTOService ventaDTOServ;
    
    @GetMapping("/ventas/mayor_venta")
    @ResponseBody
    public VentasDTO traerDatosVenta() {
        return null;
    }
}
