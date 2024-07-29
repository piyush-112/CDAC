package com.hotel.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.dto.ReservationDto;
import com.hotel.service.ReservationService;

@RestController
@RequestMapping("/reservations")
public class ReservationController {


	@Autowired
	private ReservationService reservationService;

	@PostMapping
	public ResponseEntity<?> addReservation(@RequestBody ReservationDto dto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(reservationService.addReservation(dto));
	}
	
	@DeleteMapping("/{rid}")
	public ResponseEntity<?> deleteReservation(@PathVariable Long rid)
	{
		return ResponseEntity.status(HttpStatus.OK).body(reservationService.deleteReservation(rid));
	}
	
}
