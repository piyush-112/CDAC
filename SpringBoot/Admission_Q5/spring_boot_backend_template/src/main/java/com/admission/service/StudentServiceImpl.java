package com.admission.service;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.admission.custom_Exception.ResourceNotFoundException;
import com.admission.dto.ApiResponse;
import com.admission.dto.StudentDto;
import com.admission.entities.Course;
import com.admission.entities.Student;
import com.admission.repository.CourseRepo;
import com.admission.repository.StudentRepo;


@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	private StudentRepo studentrepo;
	
	@Autowired
	private CourseRepo courseRepo;

	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ApiResponse addStudent(StudentDto dto) {
		
		
		Course course=courseRepo.findById(dto.getCourseid()).orElseThrow(()->new ResourceNotFoundException("Name Is Blank !!!!"));
		
		Student student=mapper.map(dto, Student.class);
		
		student.setCourse(course);
		
		studentrepo.save(student);
		
		
		
		return new ApiResponse("Student Added Successfully");
		
		
	}

	@Override
	public List<StudentDto> getStudent(String course_title) {
		
		return studentrepo.findByCourseTitle(course_title).stream().map(s->mapper.map(s,StudentDto.class))
				.collect(Collectors.toList());
		
	}

	@Override
	public ApiResponse removeStudent(Long sid, Long pid) {
		
//		studentrepo.deleteStudent(sid,pid);
		
		Student student=studentrepo.findByIdAndCourseId(sid,pid);
		
		
		
		//student.setCourse(null);
		
		studentrepo.deleteById(sid);
		
	return  new ApiResponse("Delete Student");
		
	}

}
