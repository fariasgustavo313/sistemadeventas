package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IProductoRepository extends JpaRepository <Producto, Long>{
    
}
