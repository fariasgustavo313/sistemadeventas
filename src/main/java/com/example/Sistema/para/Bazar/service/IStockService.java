package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Stock;
import java.util.List;

public interface IStockService {
    
    public void crearStock(Stock stock);
    
    public void eliminarStock(Long id);
    
    public void editarStock(Stock stock);
    
    public Stock traerStock(Long id);
    
    public List<Stock> traerTodoStock();
}
