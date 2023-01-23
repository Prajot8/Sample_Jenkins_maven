package com.nissan;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.test.context.junit4.SpringRunner;

import com.nissan.dao.IEmployeeDAO;
import com.nissan.model.Employee;
import com.nissan.service.IEmployeeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringBootCrudNissanRestapiApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Autowired
	private IEmployeeService employeeService;
	
	@MockBean
	private IEmployeeDAO empDao;
	
	//find all employee
	@Test
	public void findAllEmployeesTest() {
		//data 
		when(empDao.findAll()).thenReturn(
				Stream.of(new Employee(101,"Sanjay","Manager","9089908990"),
						new Employee(102,"Abhinav","Tester","9090909090")).collect(Collectors.toList()));
		assertEquals(2, employeeService.listAllEmployees().size());
	}
	
	//save employee
	@Test
	public void saveTest() {
		Employee employee= new Employee(103,"Mark","IT Lead","218728172");
		//save Employee
		
		employeeService.addPatient(employee);
		verify(empDao,times(1)).save(employee);
	}
	
	
}
