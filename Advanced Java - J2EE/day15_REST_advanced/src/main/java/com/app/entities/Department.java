package com.app.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departments")
@NoArgsConstructor
@Getter
@Setter
public class Department extends BaseEntity {
	@Column(length = 30, unique = true)
	private String name;
	@Column(length = 30)
	private String location;
	// Department 1--->* Employee
	@OneToMany(mappedBy = "dept", cascade = CascadeType.ALL, orphanRemoval = true)
	private List<Employee> employees = new ArrayList<>();

	// add required args constructor
	public Department(String name, String location) {
		super();
		this.name = name;
		this.location = location;
	}

	// helper method : to add emp
	public void addEmployee(Employee e) {
		this.employees.add(e);// can navigate from parent --> child
		e.setDept(this);// can navigate from child --> parent
	}

	// helper method : to remove emp
	public void removeEmployee(Employee e) {
		this.employees.remove(e);
		e.setDept(null);
	}
}
