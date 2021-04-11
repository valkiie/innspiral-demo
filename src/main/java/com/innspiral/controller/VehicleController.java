package com.innspiral.controller;

import com.innspiral.model.Vehicle;
import com.innspiral.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/vehicle")
public class VehicleController {
    @Autowired
    VehicleRepository vehicleService;

    @PostMapping
    public ResponseEntity insert(@RequestBody Vehicle vehicle){
        vehicleService.save(vehicle);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value="/{clientId}")
    public List<Vehicle> get(@PathVariable("clientId") Long clientId){
        return vehicleService.findByClientId(clientId);
    }
}
