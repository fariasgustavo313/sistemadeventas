package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentaRepository extends JpaRepository <Venta, Long>{
    
}
