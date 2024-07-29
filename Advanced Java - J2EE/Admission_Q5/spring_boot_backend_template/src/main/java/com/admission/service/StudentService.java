package com.admission.service;

import java.util.List;

import com.admission.dto.ApiResponse;
import com.admission.dto.StudentDto;



public interface StudentService {

	ApiResponse addStudent(StudentDto dto);

	List<StudentDto> getStudent(String course_title);

	ApiResponse removeStudent(Long sid, Long pid);

}
