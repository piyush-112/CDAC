package com.admission.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Setter
@Getter
@NoArgsConstructor
@ToString
public class CourseDto extends BaseEntityDto {
	
//	course title(unique) , start date , end date , fees , min score
	
	private String title;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private int minScore;
	
	private int fees;

	
	
	
	
}
