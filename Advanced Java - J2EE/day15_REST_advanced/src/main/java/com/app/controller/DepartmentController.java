package com.app.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.dto.ApiResponse;
import com.app.dto.AuthRequestDTO;
import com.app.dto.DepartmentRespDTO;
import com.app.dto.EmployeeRespDTO;
import com.app.entities.Department;
import com.app.entities.Employee;
import com.app.service.DepartmentService;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/departments")
@CrossOrigin(origins = "http://localhost:3000")
public class DepartmentController {
	// dep :
	@Autowired // (required = true)
	private DepartmentService deptService;

	public DepartmentController() {
		System.out.println("in ctor of " + getClass());
	}

	// REST API end point
	// URL : http://localhost:8080/departments
	// Method : POST
	// resp : Department
	@PostMapping
	public Department addNewDepartment(@RequestBody Department dept) {
		System.out.println("in add new dept");
		return deptService.addNewDepartment(dept);
	}

	// REST API end point
	// URL : http://localhost:8080/departments
	// Method : GET
	// resp : List<Department>
	@GetMapping
	public List<DepartmentRespDTO> listAllDepartments() {
		System.out.println("in list all  depts");
		return deptService.getAllDepartments();
	}

}
