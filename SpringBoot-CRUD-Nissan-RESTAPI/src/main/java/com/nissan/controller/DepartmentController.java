package com.nissan.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nissan.model.Department;
import com.nissan.service.IDepartmentService;

@CrossOrigin("*")
@RestController
@RequestMapping("api/")
public class DepartmentController {
	@Autowired
	IDepartmentService departmentService;
	
	//get list of department
		@GetMapping("departments")
		public List<Department> listOfAllDepartments() {
			return departmentService.listAllDepartments();
		}
	
}
