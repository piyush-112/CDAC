package com.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dto.ApiResponse;
import com.app.entities.JobPosting;
import com.app.repository.JobRepo;
@Service

@Transactional

public class JobService implements JobServiceInt {
	@Autowired
     private JobRepo jobRepo;
	
	public JobPosting addNewJob(JobPosting newJob) {
		return jobRepo.save(newJob);
		
	}

	public ApiResponse updateJobPost(Long jid,JobPosting updatedJob) {
		jobRepo.findById(jid).orElseThrow(()->new ResourceNotFoundException("Job with this id not exist!!!!!!!!!!!"));
		jobRepo.save(updatedJob);
		return new ApiResponse("Job Post updated succesfully.........");
	}

	public ApiResponse deleteJobPost(Long jid) {
		JobPosting job = jobRepo.findById(jid).orElseThrow(()->new ResourceNotFoundException("Job with this id not exist!!!!!!!!!!!"));
		jobRepo.delete(job);
		return new ApiResponse("Job Post deleted succesfully.........");
		
		
	}

	public List<JobPosting> getAllJobPost() {
		// TODO Auto-generated method stub
		return jobRepo.findAll();
	}
	
	

}
