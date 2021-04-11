package com.innspiral.repository;

import com.innspiral.model.Repair;
import com.innspiral.model.Vehicle;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RepairRepository extends CrudRepository<Repair, Long> {
    List<Repair> findByVehicleId(Long vehicleId);
}
