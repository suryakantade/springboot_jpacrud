package com.example.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.example.Entity.Employee;


@Component
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer>{
	
	@Query(value = "select * from employee e where e.fname like %?% ", nativeQuery = true)
	public Collection<Employee> findUserByFname(String fname,String lname);
	
}
