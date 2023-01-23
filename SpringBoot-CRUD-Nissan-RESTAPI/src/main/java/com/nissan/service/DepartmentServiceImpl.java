package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IDepartmentDAO;
import com.nissan.model.Department;
@Service
public class DepartmentServiceImpl implements IDepartmentService {

	@Autowired
	IDepartmentDAO deptDao;
	
	@Override
	public List<Department> listAllDepartments() {
		
		return deptDao.findAll();
	}

}
