package com.nissan.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nissan.model.Employee;

@Repository
public interface IEmployeeDAO extends JpaRepository<Employee, Integer> {
	//FindAll()	
	//save()
	//deleteById()
	
	//custom method ---JPQL
	@Query("from Employee where empPhoneNumber=?1 ")
	public Employee searchByPhoneNumber(String _empPhoneNumber);
	
	//@Query("from Employee where empPhoneNumber=?1 and isActive=?2")
	//public Employee searchByPhoneNumberAndIsActive(String _empPhoneNumber, Boolean isActive);
	
	//it is not mandatory to implement above methods with Query:
	//for instance fields JpaRepo is providing all find methods for individual fields 
	//as well as combination of fields
	
}
