package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.RoomDto;
import com.hotel.service.RoomService;

@RestController
@RequestMapping("/rooms")
public class RoomController {
	
	@Autowired
	private RoomService roomService;

	@PostMapping
	public ResponseEntity<?> addRoom(@RequestBody RoomDto dto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(roomService.addRoom(dto));
	}
	
	@GetMapping
	public ResponseEntity<?> getRoom()
	{
		return ResponseEntity.status(HttpStatus.OK).body(roomService.getRoom());
	}
}
