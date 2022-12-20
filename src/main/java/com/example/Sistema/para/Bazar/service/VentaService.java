package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Venta;
import com.example.Sistema.para.Bazar.repository.IVentaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VentaService implements IVentaService {

    @Autowired IVentaRepository ventaRepo;
    
    @Override
    public void crearVenta(Venta venta) {
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
    
}
