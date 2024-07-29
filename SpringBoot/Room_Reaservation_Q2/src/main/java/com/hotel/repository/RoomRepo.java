package com.hotel.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.entities.Room;

public interface RoomRepo extends JpaRepository<Room, Long> {

	Room findByRidAndAvailability(Long rid, String string);

	List<Room> findByAvailability(String string);

}
