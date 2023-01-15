package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockRepository extends JpaRepository<Stock, Long> {
    
}
