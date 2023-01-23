package com.nissan.service;

import java.util.List;

import com.nissan.model.Employee;

public interface IEmployeeService {
	//List all Employees
	List<Employee> listAllEmployees();
	
	//Get single Employee by id
	Employee searchByPhoneNumber(String _phoneNumber);

	Employee addPatient(Employee _newEmployee);
	
	//Add new Employee
	
	//Update an Employee
	
	//Delete an Employee
	
	
}
