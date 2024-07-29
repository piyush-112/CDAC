package com.admission.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "courses")
@Setter
@Getter
@NoArgsConstructor
@ToString
public class Course extends BaseEntity {
	
//	course title(unique) , start date , end date , fees , min score
	
	private String title;
	
	private LocalDate startDate;
	
	private LocalDate endDate;
	
	private int minScore;
	
	private int fees;

	public Course(String title, LocalDate startDate, LocalDate endDate, int minScore) {
		super();
		this.title = title;
		this.startDate = startDate;
		this.endDate = endDate;
		this.minScore = minScore;
	}
	
	
	
}
