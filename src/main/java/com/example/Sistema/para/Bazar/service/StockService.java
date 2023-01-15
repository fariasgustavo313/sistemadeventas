package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Stock;
import com.example.Sistema.para.Bazar.repository.IStockRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StockService implements IStockService {

    @Autowired
    private IStockRepository stockRepo;
    
    @Override
    public void crearStock(Stock stock) {
        stockRepo.saveAndFlush(stock);
    }

    @Override
    public void eliminarStock(Long id) {
        stockRepo.deleteById(id);
    }

    @Override
    public void editarStock(Stock stock) {
        stockRepo.saveAndFlush(stock);
    }

    @Override
    public Stock traerStock(Long id) {
        return stockRepo.findById(id).orElse(null);
    }

    @Override
    public List<Stock> traerTodoStock() {
        return stockRepo.findAll();
    }
    
}
