package com.karthi.sb.bindings;

import java.util.List;

public class EmployeeInfoForm {
	
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private long contactNo;
	private long emergencyContactNo;
	private String isSameAddress;
	private List<AddressForm> addressList;
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public long getContactNo() {
		return contactNo;
	}
	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}
	public long getEmergencyContactNo() {
		return emergencyContactNo;
	}
	public void setEmergencyContactNo(long emergencyContactNo) {
		this.emergencyContactNo = emergencyContactNo;
	}
	public String getIsSameAddress() {
		return isSameAddress;
	}
	public void setIsSameAddress(String isSameAddress) {
		this.isSameAddress = isSameAddress;
	}
	public List<AddressForm> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<AddressForm> addressList) {
		this.addressList = addressList;
	}
	
	@Override
	public String toString() {
		return "EmployeeInfoForm [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", gender="
				+ gender + ", contactNo=" + contactNo + ", emergencyContactNo=" + emergencyContactNo
				+ ", isSameAddress=" + isSameAddress + ", addressList=" + addressList + "]";
	}
	
}
