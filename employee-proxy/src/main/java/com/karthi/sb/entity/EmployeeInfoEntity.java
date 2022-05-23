package com.karthi.sb.entity;

public class EmployeeInfoEntity {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private long contactNo;
	private long emergencyContactNo;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
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
	
}
