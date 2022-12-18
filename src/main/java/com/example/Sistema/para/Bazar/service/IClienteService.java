package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Cliente;

public interface IClienteService {
    
    public void crearCliente(Cliente cliente);
    
    public void eliminarCliente(Long id);
    
    public void editarCliente(Cliente cliente);
    
    public Cliente traerCliente(Long id);
}
