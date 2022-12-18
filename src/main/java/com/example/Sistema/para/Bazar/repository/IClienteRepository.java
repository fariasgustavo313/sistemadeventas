package com.example.Sistema.para.Bazar.repository;
import com.example.Sistema.para.Bazar.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IClienteRepository extends JpaRepository <Cliente, Long>{
    
}
