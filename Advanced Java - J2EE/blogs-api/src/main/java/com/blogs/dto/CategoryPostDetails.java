package com.blogs.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class CategoryPostDetails extends BaseDTO{
//	@JsonProperty(access = Access.READ_ONLY)
//	private Long id;//category id
	private String description;
	private List<BlogPostDTO> posts; 
}
