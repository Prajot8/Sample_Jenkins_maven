package com.nissan.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbldepartment")
public class Department {
	
	//instance fields				In database names will be like
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Integer  deptId;		//dept_id
	@Column(nullable = false)
	private String deptName;		//dept_name
	
	//default constructor
	public Department() {
		
	}
	
	//Parameterized constructor
	public Department(int deptId, String deptName) {
		
		this.deptId = deptId;			
		this.deptName = deptName;		
	}
	
	//getters & setters
	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	
	//override toString()
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", deptName=" + deptName + "]";
	}
	
	
	
}
