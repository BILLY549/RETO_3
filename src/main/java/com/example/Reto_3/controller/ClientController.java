package com.example.Reto_3.controller;

import com.example.Reto_3.entities.Client;
import com.example.Reto_3.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(faltaapi"/api/Client")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping(faltaapi"/all")
    public List<Client> getAll(){
        return clientService.getAll();
    }
    @PostMapping(faltaapi"/save")
    public Client save(@RequestBody Client p){
        return clientService.save(p);
    }
}
