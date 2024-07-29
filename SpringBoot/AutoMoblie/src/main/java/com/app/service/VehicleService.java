package com.app.service;


import com.app.entities.*;
import com.app.exception.UserNotFoundException;
import com.app.repository.UserRepository;
import com.app.repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehicleService {
    @Autowired
    private VehicleRepository vehicleRepository;

    @Autowired
    private UserRepository userRepository;

    public Vehicle addVehicle(Vehicle vehicle) {
        return vehicleRepository.save(vehicle);
    }

    public List<Vehicle> getVehiclesByUserName(String uname) {
        User user = userRepository.findByUname(uname);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        return vehicleRepository.findByUser(user);
    }

    public void deleteVehiclesByUserName(String uname) {
        User user = userRepository.findByUname(uname);
        if (user == null) {
            throw new UserNotFoundException("User not found");
        }
        vehicleRepository.deleteByUser(user);
    }
}
