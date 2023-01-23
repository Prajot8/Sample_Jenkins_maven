package com.nissan.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nissan.dao.IDepartmentDAO;
import com.nissan.dao.IEmployeeDAO;
import com.nissan.model.Department;
import com.nissan.model.Employee;
@Service
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	IEmployeeDAO employeeDao; 
	
	
	
	public List<Employee> listAllEmployees() {
				
		return employeeDao.findAll();
	}

	
	public Employee searchByPhoneNumber(String _phoneNumber) {
		Employee employee=employeeDao.searchByPhoneNumber(_phoneNumber);
		//check condition
		if(_phoneNumber.equals(employee.getEmpPhoneNumber()) && employee.getIsActive()) {
			return employee;
		}else {
			return null;
		}
		 
	}


	@Override
	public Employee addPatient(Employee _newEmployee) {
		
		
		return employeeDao.save(_newEmployee);
	}


	
}
