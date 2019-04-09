package com.example.service.Impl;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.Entity.Address;
import com.example.Entity.Vehicle;
import com.example.controller.DemoController;
import com.example.pojo.Employee;
import com.example.repository.EmployeeRepository;
import com.example.util.CustomValidationException;
import com.expamle.service.UserService;

@Component
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	public EmployeeRepository employeeRepository;
	
	Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@Override
	public com.example.Entity.Employee finduser(Integer id) {
		// TODO Auto-generated method stub
		Optional<com.example.Entity.Employee> fetchedEmployee = employeeRepository.findById(id);
		return fetchedEmployee.get();
	}

	
	@Override
	public Employee createUser(Employee emp) throws CustomValidationException{
		// TODO Auto-generated method stub
		com.example.Entity.Employee e = new com.example.Entity.Employee();
		try {
		try {
			e.setDob(new SimpleDateFormat("dd-MM-yyyy").parse(emp.getDob()));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			
		}
		e.setFname(emp.getFname());
		e.setLname(emp.getLname());
		//setting address
		Address address = new Address();
		address.setDistrict(emp.getAddress().getDistrict());
		address.setPincode(emp.address.getPincode());
		address.setState(emp.getAddress().getState());
		e.setAddress(address);
		//vehicle
		emp.getVehicles().forEach(vehicle->{
			Vehicle v = new Vehicle();
			v.setRegistrationstate(vehicle.getRegistrationstate());
			v.setVehicleno(vehicle.getVehicleno());
			v.setEmp_id(vehicle.getEmp_id());
			if(null == e.getVehicleList()) {
				e.setVehicleList(new ArrayList<Vehicle>());
			}
			e.getVehicleList().add(v);
		});
		
		com.example.Entity.Employee finalEmployee = employeeRepository.save(e);
		emp.setId(finalEmployee.getId());
		emp.getAddress().setId(finalEmployee.getAddress().getId());
		return emp;
		
		} catch (Exception ex) {
			// TODO: handle exception
			logger.error("error occured : {}", ex.getMessage());
			throw new CustomValidationException("503", ex.getMessage());
		}
	}

	@Override
	public Collection<com.example.Entity.Employee> finduserwithfname(String fname, String lname) throws CustomValidationException {
		// TODO Auto-generated method stub
		try {
		Collection<com.example.Entity.Employee> employeeCollection =  employeeRepository.findUserByFname(fname, lname);
		/*
		 * employeeCollection.forEach(e->{ System.err.println(e.getAddress()); });
		 */
		return employeeCollection;
		} catch (Exception ex) {
			// TODO: handle exception
			logger.error("error occured : {}", ex.getMessage());
			throw new CustomValidationException("505", ex.getMessage());
		}
	}

}
