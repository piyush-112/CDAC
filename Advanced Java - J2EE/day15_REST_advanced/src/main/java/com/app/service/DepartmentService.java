package com.app.service;

import java.util.List;

import com.app.dto.DepartmentRespDTO;
import com.app.entities.Department;

public interface DepartmentService {

	Department addNewDepartment(Department dept);

	List<DepartmentRespDTO> getAllDepartments();

}
