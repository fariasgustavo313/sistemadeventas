package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Stock;
import com.example.Sistema.para.Bazar.service.IStockService;
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
public class StockController {
    
    @Autowired
    private IStockService stockServ;
    
    @PostMapping("/stock/crear")
    public String crearStock(@RequestBody Stock stock) {
        stockServ.crearStock(stock);
        return "Stock creado con extito";
    }
    
    @DeleteMapping("/stock/eliminar/{id}")
    public String eliminarStock(@PathVariable Long id) {
        stockServ.eliminarStock(id);
        return "Stock eliminado con exito";
    }
    
    @PutMapping("/stock/editar")
    public String editarStock(@RequestBody Stock stock) {
        stockServ.editarStock(stock);
        return "Stock editado con exito";
    }
    
    @GetMapping("/stock/{id}")
    public Stock traerStock(Long id) {
        return stockServ.traerStock(id);
    }
    
    @GetMapping("/stock")
    public List<Stock> traerTodoStock() {
        return stockServ.traerTodoStock();
    }
}
