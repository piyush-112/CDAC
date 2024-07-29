package com.hotel.service;

import java.util.List;

import com.hotel.dto.ApiResponse;
import com.hotel.dto.RoomDto;

public interface RoomService {

	public ApiResponse addRoom(RoomDto dto) ;

	public List<RoomDto> getRoom();
}
