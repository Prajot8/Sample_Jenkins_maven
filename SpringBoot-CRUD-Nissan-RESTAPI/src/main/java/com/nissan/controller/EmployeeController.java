package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;
@CrossOrigin
@RestController
@RequestMapping("api/")
public class EmployeeController {
	@Autowired
	IEmployeeService employeeService;
	
	

	// List all Employees
	@GetMapping("employees")
	public List<Employee> listOfAllEmployees() {
		return employeeService.listAllEmployees();
	}

	// get Employee by phone number
	//http://localhost:9091/api/employees/9878776790
	@GetMapping("employees/{_phoneNumber}")
	public Employee getEmployeeByPhoneNumber(@PathVariable String _phoneNumber) {
		return employeeService.searchByPhoneNumber(_phoneNumber);
	}
	
	@PostMapping("employees")
	public Employee addNewPatient(@RequestBody Employee _newEmployee) {
		return employeeService.addPatient(_newEmployee);
	}
	
	
}
