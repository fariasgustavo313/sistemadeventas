package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.dto.VentasDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IVentasDTORepository extends JpaRepository <VentasDTO, Long>{
    
}
