package com.example.Sistema.para.Bazar.service;
import com.example.Sistema.para.Bazar.model.Cliente;
import com.example.Sistema.para.Bazar.repository.IClienteRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService implements IClienteService {

    @Autowired
    private IClienteRepository clienteRepo;
    
    @Override
    public void crearCliente(Cliente cliente) {
        clienteRepo.saveAndFlush(cliente);
    }

    @Override
    public void eliminarCliente(Long id) {
        clienteRepo.deleteById(id);
    }

    @Override
    public void editarCliente(Cliente cliente) {
        clienteRepo.saveAndFlush(cliente);
    }

    @Override
    public Cliente traerCliente(Long id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public List<Cliente> traerClientes() {
        return clienteRepo.findAll();
    }
    
}
