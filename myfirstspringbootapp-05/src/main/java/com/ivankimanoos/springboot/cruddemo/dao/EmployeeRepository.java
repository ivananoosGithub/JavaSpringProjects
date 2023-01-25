package com.ivankimanoos.springboot.cruddemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.ivankimanoos.springboot.cruddemo.entity.Employee;


@RepositoryRestResource(path="ivan")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	
	// that's it no need to write any code anymore.
}
