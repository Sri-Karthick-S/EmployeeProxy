package com.karthi.sb.dto;

import java.math.BigDecimal;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_DEFAULT)
public class EmployeeDTO {
	
	private int employeeId;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;
	private BigInteger contactNo;
	private String district;
	private BigInteger employeeCount;
	private BigDecimal totalSalary;
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
	public BigInteger getContactNo() {
		return contactNo;
	}
	public void setContactNo(BigInteger contactNo) {
		this.contactNo = contactNo;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public BigInteger getEmployeeCount() {
		return employeeCount;
	}
	public void setEmployeeCount(BigInteger employeeCount) {
		this.employeeCount = employeeCount;
	}
	public BigDecimal getTotalSalary() {
		return totalSalary;
	}
	public void setTotalSalary(BigDecimal totalSalary) {
		this.totalSalary = totalSalary;
	}

}
