package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.JobPostingDto;
import com.app.service.JobPostingService;

@RestController
@RequestMapping("/jobposting")
public class JobPostingController {

	@Autowired
	private JobPostingService jobPostingService;

	@PostMapping // request uri : /jobposting/
	public ResponseEntity<?> createJobPosting(@RequestBody JobPostingDto jobPostingDto) {

		jobPostingDto = jobPostingService.createJobPost(jobPostingDto);

		return new ResponseEntity(jobPostingDto, HttpStatus.OK);

	}

	@GetMapping("/{jobId}") // /jobposting/2
	public ResponseEntity<?> getJobPostById(@PathVariable Long jobId) {

		JobPostingDto postDetails = jobPostingService.getPostDetails(jobId);

		return new ResponseEntity(postDetails, HttpStatus.OK);
	}
	
	//@Putmapping
	
	
	//deteleById
	
	//getAllData
	

}
