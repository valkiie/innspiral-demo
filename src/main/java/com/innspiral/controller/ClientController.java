package com.innspiral.controller;

import com.innspiral.model.Client;
import com.innspiral.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
@RequestMapping(value="/client")
public class ClientController {

    @Autowired
    ClientRepository clientService;

    @PostMapping
    public ResponseEntity insert(@RequestBody Client client){
        clientService.save(client);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping
    public List<Client> get(){
        List<Client> result = new ArrayList<>();
        Iterable<Client> all = clientService.findAll();
        all.forEach(result::add);
        return result;
    }
}
