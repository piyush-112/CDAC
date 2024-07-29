package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.VehicleDto;
import com.app.entities.*;
import com.app.exception.UserNotFoundException;
import com.app.repository.UserRepository;
import com.app.service.VehicleService;

@RestController
@RequestMapping("/api/vehicles")
public class VehicleController {
    @Autowired
    private VehicleService vehicleService;

    @Autowired
    private UserRepository userRepository;

    @PostMapping
    public ResponseEntity<?> addVehicle(@Valid @RequestBody VehicleDto vehicleDto) {
        User user = userRepository.findById(vehicleDto.getUid())
                .orElseThrow(() -> new UserNotFoundException("User not found"));
        
        Vehicle vehicle = new Vehicle();
        vehicle.setVname(vehicleDto.getVname());
        vehicle.setCompany(vehicleDto.getCompany());
        vehicle.setVnumber(vehicleDto.getVnumber());
        vehicle.setVtype(vehicleDto.getVtype());
        vehicle.setUser(user);
        
        return new ResponseEntity<>(vehicleService.addVehicle(vehicle), HttpStatus.CREATED);
    }

    @GetMapping("/user/{uname}")
    public ResponseEntity<List<Vehicle>> getVehiclesByUser(@PathVariable String uname) {
        return new ResponseEntity<>(vehicleService.getVehiclesByUserName(uname), HttpStatus.OK);
    }

    @DeleteMapping("/user/{uname}")
    public ResponseEntity<Void> deleteVehiclesByUser(@PathVariable String uname) {
        vehicleService.deleteVehiclesByUserName(uname);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
