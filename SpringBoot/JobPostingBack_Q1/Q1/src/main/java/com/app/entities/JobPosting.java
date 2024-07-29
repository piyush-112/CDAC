package com.app.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="jobpostings")
public class JobPosting extends BaseEntity{
	//like Job title, company name, location, description, requirements, salary, and posting date.
	
@Column(name="job_title",length=50,nullable = false)	
private String jobTitle;

@Column(name="company_name",length=20,nullable = false)
private String companyName;

@Column(name="location",length=20,nullable = false)
private String location;

@Column(name="description",length=50,nullable = false)
private String description;


private int requirements;

private double salary;
@Column(name="posting_date",nullable = false)
private LocalDate postingDate;
public JobPosting() {
	super();
}
public JobPosting(String jobTitle, String companyName, String location, String description, int requirements,
		double salary, LocalDate postingDate) {
	super();
	this.jobTitle = jobTitle;
	this.companyName = companyName;
	this.location = location;
	this.description = description;
	this.requirements = requirements;
	this.salary = salary;
	this.postingDate = postingDate;
}
public String getJobTitle() {
	return jobTitle;
}
public void setJobTitle(String jobTitle) {
	this.jobTitle = jobTitle;
}
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public int getRequirements() {
	return requirements;
}
public void setRequirements(int requirements) {
	this.requirements = requirements;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}
public LocalDate getPostingDate() {
	return postingDate;
}
public void setPostingDate(LocalDate postingDate) {
	this.postingDate = postingDate;
}
@Override
public String toString() {
	return "JobPosting [jobTitle=" + jobTitle + ", companyName=" + companyName + ", location=" + location
			+ ", description=" + description + ", requirements=" + requirements + ", salary=" + salary
			+ ", postingDate=" + postingDate + "]";
}



}
