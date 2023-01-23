package com.nissan.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Table(name="tblemployee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer empId;
	
	@Column(nullable = false)
	private String empName;
	private String designation;
	
	private LocalDate dateOfJoining;
	private Double salary;
	
	@Column(nullable = false)
	private String empPhoneNumber;
	
	private Boolean isActive;
	
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime createdAt;
	@Type(type = "org.jadira.usertype.dateandtime.joda.PersistentDateTime")
	private DateTime updateAt;
	
	
	private Integer deptId;	//FK
	
	//Object -Oriented Class Model
	@ManyToOne	//many employee one dept
	@JoinColumn(name="deptId",insertable = false,updatable = false)
	// "deptId" name should be same as in dept class
	private Department department;
	
	//default contructor
	public Employee() {
		
	}
	
	//parameterized contructor
	public Employee(Integer empId, String empName, String designation, LocalDate dateOfJoining, Double salary,
			String empPhoneNumber, Boolean isActive, DateTime createdAt, DateTime updateAt, Integer deptId) {
		
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.empPhoneNumber = empPhoneNumber;
		this.isActive = isActive;
		this.createdAt = createdAt;
		this.updateAt = updateAt;
		this.deptId = deptId;
	}
	
	//customized parameterised constructor
	public Employee(Integer empId, String empName, String designation, LocalDate dateOfJoining, Double salary,
			String empPhoneNumber, Boolean isActive, Department department) {
		
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.dateOfJoining = dateOfJoining;
		this.salary = salary;
		this.empPhoneNumber = empPhoneNumber;
		this.isActive = isActive;
		this.department = department;
	}
	
	//constr for testing
	public Employee(Integer empId, String empName, String designation, String empPhoneNumber) {
		
		this.empId = empId;
		this.empName = empName;
		this.designation = designation;
		this.empPhoneNumber = empPhoneNumber;
	}

	
	//getters and setters
	public Integer getEmpId() {
		return empId;
	}

	
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}

	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getEmpPhoneNumber() {
		return empPhoneNumber;
	}

	public void setEmpPhoneNumber(String empPhoneNumber) {
		this.empPhoneNumber = empPhoneNumber;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public DateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(DateTime createdAt) {
		this.createdAt = createdAt;
	}

	public DateTime getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(DateTime updateAt) {
		this.updateAt = updateAt;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}
	
	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
	
	//override toString
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", designation=" + designation + ", dateOfJoining="
				+ dateOfJoining + ", salary=" + salary + ", empPhoneNumber=" + empPhoneNumber + ", isActive=" + isActive
				+ ", createdAt=" + createdAt + ", updateAt=" + updateAt + ", deptId=" + deptId + "]";
	}
	
	
	
	
}
