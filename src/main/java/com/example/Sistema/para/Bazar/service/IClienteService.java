package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Cliente;
import java.util.List;

public interface IClienteService {
    
    public void crearCliente(Cliente cliente);
    
    public void eliminarCliente(Long id);
    
    public void editarCliente(Long id_original, String nombre, String apellido, String dni);
    
    public Cliente traerCliente(Long id);
    
    public List<Cliente> traerClientes();
    
}
