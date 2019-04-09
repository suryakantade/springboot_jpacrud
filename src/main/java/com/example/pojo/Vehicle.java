package com.example.pojo;

public class Vehicle {
	private int id;

	private String vehicleno;

	private String registrationstate;
	private int emp_id;

	public Vehicle(int id, String vehicleno, String registrationstate, int emp_id) {
		super();
		this.id = id;
		this.vehicleno = vehicleno;
		this.registrationstate = registrationstate;
		this.emp_id = emp_id;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVehicleno() {
		return vehicleno;
	}

	public void setVehicleno(String vehicleno) {
		this.vehicleno = vehicleno;
	}

	public String getRegistrationstate() {
		return registrationstate;
	}

	public void setRegistrationstate(String registrationstate) {
		this.registrationstate = registrationstate;
	}

	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Vehicle(int id, String vehicleno, String registrationstate) {
		super();
		this.id = id;
		this.vehicleno = vehicleno;
		this.registrationstate = registrationstate;
	}

	@Override
	public String toString() {
		return "Vehicle [id=" + id + ", vehicleno=" + vehicleno + ", registrationstate=" + registrationstate
				+ ", emp_id=" + emp_id + "]";
	}
}
