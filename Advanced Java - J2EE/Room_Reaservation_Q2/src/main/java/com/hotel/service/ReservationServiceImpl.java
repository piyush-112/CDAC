package com.hotel.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.custom_exception.ResourceNotFoundException;
import com.hotel.dto.ApiResponse;
import com.hotel.dto.ReservationDto;
import com.hotel.entities.Reservation;
import com.hotel.entities.Room;
import com.hotel.repository.ReservationRepo;
import com.hotel.repository.RoomRepo;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {
	
	@Autowired
	private ReservationRepo repo;
	
	@Autowired
	private RoomRepo repo2;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ApiResponse addReservation(ReservationDto dto) {
	
		//Room room=repo2.findById(dto.getRid()).orElseThrow(()->new ResourceNotFoundException("Room is Not Available"));
		
		Room room=repo2.findByRidAndAvailability(dto.getRid(),"Yes");
		
		Reservation reservation=mapper.map(dto, Reservation.class);
		
		reservation.setRoom(room);
		
		repo.save(reservation);
		
		return new ApiResponse("Reservation is Successful");
	}

	@Override
	public ApiResponse deleteReservation(Long rid) {
		
		Reservation reservation= repo.findById(rid).orElseThrow(()->new ResourceNotFoundException("Reservation is not done"));
		
		repo.delete(reservation);
		
		return new ApiResponse("Reservation is Deleted");
	}

}
