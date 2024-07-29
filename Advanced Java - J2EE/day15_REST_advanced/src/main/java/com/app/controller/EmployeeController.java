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

import com.app.dto.AddEmployee;
import com.app.dto.ApiResponse;
import com.app.dto.AuthRequestDTO;
import com.app.dto.EmployeeRespDTO;
import com.app.entities.Employee;
import com.app.service.EmployeeService;

@RestController
@RequestMapping("/employees")
@CrossOrigin(origins = "http://localhost:3000")
public class EmployeeController {
	// dep :
	@Autowired//(required = true)
	private EmployeeService empService;
	
	public EmployeeController() {
		System.out.println("in ctor of " + getClass());
	}

	// REST API end point
	// URL : http://localhost:8080/employees/
	// Method : GET
	// resp : List<EmpDTO>
	@GetMapping
	public List<Employee> listAllEmps() {
		System.out.println("in list all emps");
		return empService.getAllEmps();
	}

	// URL : http://localhost:8080/employees/
	// Method : POST
	// resp : Detached Employee
	@PostMapping
	public EmployeeRespDTO addEmpDetails(@RequestBody AddEmployee dto)
	// @RequestBody : method arg level annotation for un marshalling
	// de-ser (json--> java obj) done by Jackson vendor
	{
		System.out.println("in add emp " + dto);
		return empService.addEmpDetails(dto);
	}

	// URL : http://localhost:8080/employees/empId
	// Method : DELETE
	// resp : mesg (string) or Better : DTO (mesg n timestamp)
	@DeleteMapping("/{empId}")
	// @PathVariable => Data binding from incoming URI variable
	// --> method arg
	public ResponseEntity<?> deleteEmpDetails(@PathVariable Long empId) {
		System.out.println("in del emp dtls " + empId);
		try {
			return ResponseEntity
					.status(HttpStatus.OK)
					.body(
							new ApiResponse
							(empService.deleteEmpDetails(empId)));
		} catch (Exception e) {
			System.out.println("err " + e);
			return new ResponseEntity<>
			(new ApiResponse(e.getMessage()), HttpStatus.NOT_FOUND);
		}
	}

	// URL : http://localhost:8080/employees/empId
	// Method : GET
	// resp : detached emp or exc
	@GetMapping("/{empId}")
	public Employee getEmpDetails(@PathVariable Long empId) {
		System.out.println("in get emp dtls " + empId);
		return empService.getEmpDetails(empId);
	}

	// URL : http://localhost:8080/employees
	// Method : PUT
	// payload : detached emp
	// resp : detached emp
	@PutMapping
	public Employee updateEmpDetails(@RequestBody Employee emp) {
		System.out.println("in update emp details");
		return empService.updateEmpDetails(emp);
	}

	// URL : http://localhost:8080/employees/signin
	// Method : POST
	// payload : emp req dto
	// resp in case of success : ResponseEntity<emp resp dto> , SC 200
	// resp in case of failure : ResponseEntity<api resp> SC 404
	@PostMapping("/signin")
	public ResponseEntity<?> autheticateEmployee(
			@RequestBody @Valid  AuthRequestDTO dto) {
		System.out.println("in auth emp " + dto);
		try {
		// invoke service layer method
		return ResponseEntity.ok
				(empService.authenticateEmployee(dto));
		} catch (Exception e) {
			System.out.println("err "+e);
			return ResponseEntity
					.status(HttpStatus.NOT_FOUND)
					.body(new ApiResponse(e.getMessage()));
					
		}
	}
	// 6. Pagination demo
	// Get all emps
	// http://host:port/employees/paginate , method=GET
	// req params : pageNumber , def val 0 , optional
	// pageSize : def val 3 , optional

	@GetMapping("/paginate")
	public ResponseEntity<?> getAllEmpsPaginated(
			@RequestParam(defaultValue = "0", required = false) int pageNumber,
			@RequestParam(defaultValue = "3", required = false) int pageSize) {
		System.out.println("in get all emps " + pageNumber + " " + pageSize);
		List<EmployeeRespDTO> list = empService.getAllEmployees(pageNumber, pageSize);
		if (list.isEmpty())
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		// emps found
		return ResponseEntity.ok(list);
	}


}
