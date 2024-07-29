package com.admission.service;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.custom_Exception.ResourceNotFoundException;
import com.admission.dto.ApiResponse;
import com.admission.dto.CourseDto;
import com.admission.entities.Course;
import com.admission.repository.CourseRepo;

@Service
@Transactional
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	private CourseRepo courseRepo;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ApiResponse addCourse(CourseDto dto) {
		
		Course course=mapper.map(dto, Course.class);
		
		courseRepo.save(course);
		
		return new ApiResponse("Course Added Successful");
	}

	@Override
	public ApiResponse updateCourse(Long id, CourseDto dto) {
		
		Course course=courseRepo.findById(id).orElseThrow(()->new ResourceNotFoundException("Update Failed"));
		
		mapper.map(dto,course);
		
		return new ApiResponse("Update Successfully");
	}

}
