package com.app.service;

import java.util.List;

import com.app.dto.ApiResponse;
import com.app.entities.JobPosting;

public interface JobServiceInt {
	public JobPosting addNewJob(JobPosting newJob);
	public ApiResponse updateJobPost(Long jid,JobPosting updatedJob);
	public ApiResponse deleteJobPost(Long jid);
	public List<JobPosting> getAllJobPost();
}
