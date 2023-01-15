package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductoRepository extends JpaRepository <Producto, Long>{
    
}
