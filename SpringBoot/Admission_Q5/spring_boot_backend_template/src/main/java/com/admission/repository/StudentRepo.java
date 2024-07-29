package com.admission.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admission.entities.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	List<Student> findByCourseTitle( String course_title);

	//void deleteStudent(Long sid, Long pid);

	//void deleteByIdAndCourseId(Long sid, Long pid);

	Student findByIdAndCourseId(Long sid, Long pid);

	
}
