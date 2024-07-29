package com.admission.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admission.dto.CourseDto;
import com.admission.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseController {

	@Autowired
	private CourseService courseService;
	
	
	@PostMapping
	public ResponseEntity<?> launchCourse(@RequestBody CourseDto dto)
	{
		return ResponseEntity.status(HttpStatus.OK).body(courseService.addCourse(dto));
	}
	
	
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCourse(@PathVariable Long id,@RequestBody CourseDto dto)
	{
		return ResponseEntity.ok(courseService.updateCourse(id,dto));
	}
}
