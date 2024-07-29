package com.app.repository;

import com.app.entities.Vehicle;
import com.app.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    List<Vehicle> findByUser(User user);
    void deleteByUser(User user);
}
