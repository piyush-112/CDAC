package com.hotel.service;

import com.hotel.dto.ApiResponse;
import com.hotel.dto.ReservationDto;

public interface ReservationService {

	public ApiResponse addReservation(ReservationDto dto) ;

	

	public ApiResponse deleteReservation(Long rid);

}
