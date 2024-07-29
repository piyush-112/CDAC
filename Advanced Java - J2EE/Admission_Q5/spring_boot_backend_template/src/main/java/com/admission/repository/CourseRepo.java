package com.admission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admission.entities.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course,Long> {

}
