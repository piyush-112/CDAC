package com.app.service;

import java.util.List;

import com.app.dto.JobPostingDto;

public interface JobPostingService {

	JobPostingDto createJobPost(JobPostingDto newJob);

	JobPostingDto getPostDetails(Long id);

	void deleteById(Long jobId);

	String updateJobPost(JobPostingDto dto);

	List<JobPostingDto> getAllJobPost();

}
