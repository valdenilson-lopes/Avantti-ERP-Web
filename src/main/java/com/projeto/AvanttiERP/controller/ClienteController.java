package com.projeto.AvanttiERP.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.projeto.AvanttiERP.entity.Cliente;
import com.projeto.AvanttiERP.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    // LISTAR TODOS
    @GetMapping
    public List<Cliente> listar() {
        return service.listar();
    }

    // BUSCAR POR ID
    @GetMapping("/{id}")
    public Cliente buscar(@PathVariable Long id) {
        return service.buscar(id);
    }

    // CADASTRAR
    @PostMapping
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    // ATUALIZAR
    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente) {

        cliente.setId(id);

        return service.salvar(cliente);
    }

    // EXCLUIR
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable Long id) {

        service.excluir(id);
    }

}