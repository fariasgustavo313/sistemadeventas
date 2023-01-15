package com.example.Sistema.para.Bazar.controller;
import com.example.Sistema.para.Bazar.model.Cliente;
import com.example.Sistema.para.Bazar.service.IClienteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    
    @Autowired
    private IClienteService clienteServ;
    
    //Alta a un cliente
    @PostMapping("/clientes/crear")
    public String crearCliente(@RequestBody Cliente cliente) {
        clienteServ.crearCliente(cliente);
        return "Cliente creado correctamente";
    }
    
    //Baja a un cliente
    @DeleteMapping("/clientes/eliminar/{id}")
    public String eliminarcliente(@PathVariable Long id) {
        clienteServ.eliminarCliente(id);
        return "Cliente eliminado correctamente";
    }
    
    //Edicion de un cliente
    @PutMapping("/clientes/editar{id}")
    public Cliente editarCliente(@PathVariable Long id_cliente,
            @RequestParam(required = false, name = "nombre") String nombre,
            @RequestParam(required = false, name = "apellido") String apellido,
            @RequestParam(required = false, name = "dni") String dni) {
        
        //Busco al cliente y envio los datos a modificar
        clienteServ.editarCliente(id_cliente, nombre, apellido, dni);
        
        //busco al cliente editado para mostrarlo en la response
        Cliente cliente = clienteServ.traerCliente(id_cliente);
        
        return cliente;
    }
    
    //Trae a un solo cliente
    @GetMapping("/clientes/{id}")
    public Cliente traerCliente(@PathVariable Long id) {
        return clienteServ.traerCliente(id);
    }
    
    //Trae la lista de clientes
    @GetMapping("/clientes")
    public List<Cliente> traerClientes() {
        return clienteServ.traerClientes();
    }
}
