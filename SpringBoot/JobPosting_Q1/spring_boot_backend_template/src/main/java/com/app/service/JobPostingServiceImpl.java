package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.dto.JobPostingDto;
import com.app.entities.JobPosting;
import com.app.exception.ResourceNotFound;
import com.app.repository.JobPostingRepository;

@Service
public class JobPostingServiceImpl implements JobPostingService {

	// here we want dao/repo layer dedepndcy
	@Autowired
	private JobPostingRepository jobPostingRepository;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public JobPostingDto createJobPost(JobPostingDto jobPostingDto) {

		// convert from JobPostingDto to JobPosting
		JobPosting jobPosting = modelMapper.map(jobPostingDto, JobPosting.class);

		JobPosting savedJob = jobPostingRepository.save(jobPosting);

		// convert from JobPosting to JobPostingDto
		return modelMapper.map(savedJob, JobPostingDto.class);

	}

	@Override
	public JobPostingDto getPostDetails(Long id) {

		JobPosting jobPosting = jobPostingRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFound("Job Post " + id + " not found"));

		return modelMapper.map(jobPosting, JobPostingDto.class);
	}

	@Override
	public void deleteById(Long jobId) {

	}

	@Override
	public String updateJobPost(JobPostingDto dto) {

		return null;
	}

	@Override
	public List<JobPostingDto> getAllJobPost() {

		List<JobPosting> all = jobPostingRepository.findAll();

		return null;
	}
}
