package com.admission.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.admission.dto.ApiResponse;
import com.admission.dto.StudentDto;
import com.admission.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService service;
	
	@PostMapping
	public ResponseEntity<?> addStudent(@RequestBody @Valid StudentDto dto)
	{	
		try {
		return ResponseEntity.ok(service.addStudent(dto));
		}
		catch(RuntimeException e)
		{
			return ResponseEntity.
					status(HttpStatus.NOT_FOUND).
					body(new ApiResponse(e.getMessage()));
		}
	}
	
	@GetMapping("/{course_title}")
	public ResponseEntity<?> getStudentCourse(@PathVariable String course_title)
	{
		return ResponseEntity.ok(service.getStudent(course_title));
	}
	
	@DeleteMapping("/{sid}/{pid}")
	public ResponseEntity<?> deleteStudent(@PathVariable Long sid,@PathVariable Long pid)
	{
		
		return ResponseEntity.status(HttpStatus.OK).body(service.removeStudent(sid,pid));
	}
	
}
