package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Cliente;
import com.example.Sistema.para.Bazar.service.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private IClienteService clienteServ;
    
    @PostMapping("/cliente/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteServ.crearCliente(cliente);
        return "Cliente creado correctamente";
    }
    
    @DeleteMapping("/cliente/eliminar/{id}")
    public String eliminarcliente(@PathVariable Long id) {
        clienteServ.eliminarCliente(id);
        return "Cliente eliminado correctamente";
    }
    
    @PutMapping("/cliente/editar")
    public String editarCliente(@RequestBody Cliente cliente) {
        clienteServ.editarCliente(cliente);
        return "Cliente editado correctamente";
    }
    
    @GetMapping("/cliente/traer/{id}")
    public Cliente traerCliente(@PathVariable Long id) {
        return clienteServ.traerCliente(id);
    }
}
