package com.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.DepartmentDao;
import com.app.dto.DepartmentRespDTO;
import com.app.entities.Department;

@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService {
	// dep
	@Autowired
	private DepartmentDao deptDao;

	@Autowired
	private ModelMapper mapper;

	@Override
	public Department addNewDepartment(Department dept) {
		return deptDao.save(dept);
	}

	@Override
	public List<DepartmentRespDTO> getAllDepartments() {
		// TODO Auto-generated method stub
		return deptDao.findAll().stream()
				.map(dept -> mapper.map(dept,DepartmentRespDTO.class))
				.collect(Collectors.toList());
				
	}

}
