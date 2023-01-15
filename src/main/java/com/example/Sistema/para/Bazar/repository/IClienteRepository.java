package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClienteRepository extends JpaRepository <Cliente, Long>{
    
}
