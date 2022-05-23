package com.karthi.sb.service;

import java.util.List;

import com.karthi.sb.bindings.EmployeeInfoForm;
import com.karthi.sb.dto.EmployeeDTO;
import com.karthi.sb.entity.EmployeeInfoEntity;

public interface EmployeeProxyService {
	
	public List<EmployeeDTO> getDistrictWiseEmployeesCount();
	
	public List<EmployeeDTO> getMaxSalaryForAMonth(String month);
	
	public List<EmployeeInfoEntity> findByAge(String operator, int age1, int age2);
	
	public int getEmployeesCountBasedOnPincode(int pincode);
	
	public List<EmployeeDTO> getMaxSalaryForAYear(int year);
	
	public List<EmployeeDTO> getLeastLeavesTakenByEmpForCurrentYear();

	public String addEmployee(EmployeeInfoForm employeeInfo);
	
}
