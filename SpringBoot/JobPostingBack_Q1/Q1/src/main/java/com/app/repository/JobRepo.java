package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.entities.JobPosting;
@Repository
public interface JobRepo extends JpaRepository<JobPosting, Long>{

}
