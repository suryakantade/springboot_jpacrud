package com.expamle.service;

import java.util.Collection;

import org.springframework.stereotype.Component;

import com.example.pojo.Employee;
import com.example.util.CustomValidationException;

@Component
public interface UserService {
	
	/**
	 * 
	 * @param id
	 * @return
	 * @throws CustomValidationException
	 */
	public com.example.Entity.Employee finduser(Integer id) throws CustomValidationException;
	/**
	 * 
	 * @param emp
	 * @return
	 * @throws CustomValidationException
	 */
	public Employee createUser(Employee emp) throws CustomValidationException;
	/**
	 * 
	 * @param fname
	 * @param lname
	 * @return
	 * @throws CustomValidationException
	 */
	public Collection<com.example.Entity.Employee> finduserwithfname(String fname, String lname) throws CustomValidationException;

}
