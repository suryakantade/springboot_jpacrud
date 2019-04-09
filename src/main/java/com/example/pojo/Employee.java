package com.example.pojo;

import java.util.List;

public class Employee {

		public int id;
		public String fname;
		public String lname;
		public String dob;
		public AddressReqVo address;
		public List<Vehicle> vehicles;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public String getDob() {
			return dob;
		}
		public void setDob(String dob) {
			this.dob = dob;
		}
		public Employee() {
			super();
		}
		public Employee(int id, String fname, String lname, String dob, AddressReqVo address) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.dob = dob;
			this.address = address;
		}
		public AddressReqVo getAddress() {
			return address;
		}
		public void setAddress(AddressReqVo address) {
			this.address = address;
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", address="
					+ address + ", vehicles=" + vehicles + "]";
		}
		
		
		public Employee(int id, String fname, String lname, String dob, AddressReqVo address, List<Vehicle> vehicles) {
			super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.dob = dob;
			this.address = address;
			this.vehicles = vehicles;
		}
		public List<Vehicle> getVehicles() {
			return vehicles;
		}
		public void setVehicles(List<Vehicle> vehicles) {
			this.vehicles = vehicles;
		}
		
		
	}
