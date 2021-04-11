package com.innspiral.controller;

import com.innspiral.model.Repair;
import com.innspiral.repository.RepairRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.Instant;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping(value="/repair")
public class RepairController {
    @Autowired
    RepairRepository repairService;

    @PostMapping
    public ResponseEntity insert(@RequestBody Repair repair){
        repair.setDate(Instant.now());
        repairService.save(repair);
        return new ResponseEntity(HttpStatus.CREATED);
    }

    @GetMapping(value="/{vehicleId}")
    public List<Repair> get(@PathVariable("vehicleId") Long vehicleId){
        List<Repair> repairs = repairService.findByVehicleId(vehicleId);
        Collections.sort(repairs);
        return repairs;
    }
}
