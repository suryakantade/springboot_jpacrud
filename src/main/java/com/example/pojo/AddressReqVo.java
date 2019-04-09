package com.example.pojo;

public class AddressReqVo {

	public Integer Id;
	private String district;

	private String state;

	private Long pincode;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Long getPincode() {
		return pincode;
	}

	public void setPincode(Long pincode) {
		this.pincode = pincode;
	}

	public AddressReqVo(Integer id, String district, String state, Long pincode) {
		super();
		Id = id;
		this.district = district;
		this.state = state;
		this.pincode = pincode;
	}

	public AddressReqVo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Address [Id=" + Id + ", district=" + district + ", state=" + state + ", pincode=" + pincode + "]";
	}
}
