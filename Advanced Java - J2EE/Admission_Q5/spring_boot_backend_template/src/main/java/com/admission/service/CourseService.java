package com.admission.service;

import com.admission.dto.ApiResponse;
import com.admission.dto.CourseDto;

public interface CourseService {

	ApiResponse addCourse(CourseDto dto);

	ApiResponse updateCourse(Long id, CourseDto dto);
		

}
