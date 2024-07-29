package com.hotel.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.dto.ApiResponse;
import com.hotel.dto.RoomDto;
import com.hotel.entities.Room;
import com.hotel.repository.RoomRepo;

@Service
@Transactional
public class RoomServiceImpl implements RoomService {
	
	@Autowired
	private RoomRepo repo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ApiResponse addRoom(RoomDto dto) {
	
		Room room=mapper.map(dto, Room.class);
		
		repo.save(room);
		
		return new ApiResponse("Room Added Successfully");
		
	}

	@Override
	public List<RoomDto> getRoom() {
		
		List<Room> rooms= repo.findByAvailability("Yes");
		
		return rooms.stream().map(r->mapper.map(r, RoomDto.class))
				.collect(Collectors.toList());
		
		
	}

}
