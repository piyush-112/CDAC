package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.entities.JobPosting;
import com.app.service.JobService;



@RestController
@RequestMapping("/jobpostings")
public class jobPostController {
	@Autowired
	private JobService jobService;
@PostMapping
public ResponseEntity<?> addNewJobPosting(@RequestBody JobPosting newJob)
{
	
	return ResponseEntity.status(HttpStatus.CREATED).body(jobService.addNewJob(newJob));
}
@PutMapping("/{jid}")
public ResponseEntity<?> updateJobPosting(@PathVariable Long jid,@RequestBody JobPosting updatedJob){
	return ResponseEntity.status(HttpStatus.OK).body(jobService.updateJobPost(jid,updatedJob));
	
}
@DeleteMapping("/{jid}")
public ResponseEntity<?> deleteJobPosting(@PathVariable Long jid){
	return ResponseEntity.status(HttpStatus.OK).body(jobService.deleteJobPost(jid));
}

@GetMapping
 public ResponseEntity<?> getAllJobPosting(){
	return ResponseEntity.status(HttpStatus.OK).body(jobService.getAllJobPost());
}
}
