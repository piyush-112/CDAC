package com.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hotel.entities.Reservation;

@Repository
public interface ReservationRepo extends JpaRepository<Reservation, Long> {

}
