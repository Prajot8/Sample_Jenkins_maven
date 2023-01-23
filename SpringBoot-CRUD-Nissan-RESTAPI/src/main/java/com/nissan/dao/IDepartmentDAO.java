package com.nissan.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nissan.model.Department;
@Repository
public interface IDepartmentDAO extends JpaRepository<Department, Integer> {

}
