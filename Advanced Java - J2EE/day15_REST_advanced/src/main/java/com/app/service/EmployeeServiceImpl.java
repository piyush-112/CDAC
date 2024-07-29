package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_exceptions.ResourceNotFoundException;
import com.app.dao.DepartmentDao;
import com.app.dao.EmployeeDao;
import com.app.dto.AddEmployee;
import com.app.dto.AuthRequestDTO;
import com.app.dto.EmployeeRespDTO;
import com.app.entities.Department;
import com.app.entities.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
//dep :
	@Autowired
	private EmployeeDao empDao;
	// dep : model mapper for mapping ent <---> dto
	@Autowired
	private ModelMapper mapper;

	@Autowired
	private DepartmentDao deptDao;

	@Override
	public List<Employee> getAllEmps() {
		// map List<Entity> --> List<DTO>
//		return empDao.findAll() // List<Emp>
//				.stream() // Stream<Emp>
//				.map(e -> mapper.map(e, EmployeeRespDTO.class)) // Stream<dto>
//				.collect(Collectors.toList());
		return empDao.findAll();

	}

	@Override
	public EmployeeRespDTO addEmpDetails(AddEmployee dto) {
		Department dept = deptDao.findById(dto.getDeptId()).orElseThrow();
		Employee employee = mapper.map(dto, Employee.class);
		dept.addEmployee(employee);
		return mapper.map(employee, EmployeeRespDTO.class);
	}

	@Override
	public String deleteEmpDetails(Long empId) {
		if (empDao.existsById(empId)) {
			empDao.deleteById(empId);
			return "Deleted emp details....";
		}
		// => invalid emp id
		throw new ResourceNotFoundException("Emp details can't be deleted : Invalid Emp Id!!!");
	}

	@Override
	public Employee getEmpDetails(Long empId) {

		return empDao.findById(empId).orElseThrow(() -> new ResourceNotFoundException("Invalid Emp ID !!!!"));
	}
	/*
	 * in case of success : method rets detached emp pojo in case failure : throws :
	 * ResourceNotFoundException
	 */

	@Override
	public Employee updateEmpDetails(Employee emp) {
		// TODO Auto-generated method stub
		return empDao.save(emp);
	}

	@Override
	public EmployeeRespDTO authenticateEmployee(AuthRequestDTO request) {
		// 1. invoke dao's method
		Employee emp = empDao.findByEmailAndPassword(request.getEmail(), request.getPassword())
				// Returns the value in case of non empty Optional
				// OR throws supplied exception
				.orElseThrow(() -> new ResourceNotFoundException("Invalid email or password!!!!"));
		// emp --> dto
		return mapper.map(emp, EmployeeRespDTO.class);
	}

	@Override
	public List<EmployeeRespDTO> getAllEmployees(int pageNumber, int pageSize) {
		// Creates a PageRequest(imple class of Pageable : i/f for pagination) based
		// upon page no n size
		Pageable pageable = PageRequest.of(pageNumber, pageSize);
		// fetches the Page of Emps --> getContent() --> List<Emp>
		List<Employee> empList = empDao.findAll(pageable).getContent();
		return empList.stream().map(emp -> mapper.map(emp, EmployeeRespDTO.class)).collect(Collectors.toList());
	}

}
