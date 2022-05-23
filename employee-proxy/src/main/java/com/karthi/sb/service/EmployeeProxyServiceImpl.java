package com.karthi.sb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.karthi.sb.bindings.EmployeeInfoForm;
import com.karthi.sb.dto.EmployeeDTO;
import com.karthi.sb.entity.EmployeeInfoEntity;

@Service
public class EmployeeProxyServiceImpl implements EmployeeProxyService{
	
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<EmployeeDTO> getDistrictWiseEmployeesCount() {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/empcountbasedondistrict";
		ResponseEntity<List<EmployeeDTO>> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<List<EmployeeDTO>>() {}
				  );
		List<EmployeeDTO> employeesInfo = responseEntity.getBody();
		return employeesInfo;
	}

	@Override
	public List<EmployeeDTO> getMaxSalaryForAMonth(String month) {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/employeesalaryinfo";
		ResponseEntity<List<EmployeeDTO>> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl+"?month="+month,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<List<EmployeeDTO>>() {}
				  );
		List<EmployeeDTO> employeesInfo = responseEntity.getBody();
		return employeesInfo;
	}

	@Override
	public List<EmployeeInfoEntity> findByAge(String operator, int age1, int age2) {
		String resourceUrl;
		if("BETWEEN".equalsIgnoreCase(operator)) {
			 resourceUrl
			  = "http://localhost:8081/employeedbmanager/empidwithage?"
			  		+ "operator="+operator+"&age1="+age1+"&age2="+age2;
		} else {
			 resourceUrl
			  = "http://localhost:8081/employeedbmanager/empidwithage?"
			  		+ "operator="+operator+"&age1="+age1;
		}
		ResponseEntity<List<EmployeeInfoEntity>> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<List<EmployeeInfoEntity>>() {}
				  );
		List<EmployeeInfoEntity> employeesInfo = responseEntity.getBody();
		return employeesInfo;
	}

	@Override
	public int getEmployeesCountBasedOnPincode(int pincode) {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/empresidinginpincode/";
		ResponseEntity<Integer> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl+pincode,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<Integer>() {}
				  );
		int employeesCount = responseEntity.getBody();
		return employeesCount;
	}

	@Override
	public List<EmployeeDTO> getMaxSalaryForAYear(int year) {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/empyearlymaxsalary/";
		ResponseEntity<List<EmployeeDTO>> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl+year,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<List<EmployeeDTO>>() {}
				  );
		List<EmployeeDTO> employeesInfo = responseEntity.getBody();
		return employeesInfo;
	}

	@Override
	public List<EmployeeDTO> getLeastLeavesTakenByEmpForCurrentYear() {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/leastleavestakenbyempforcurrentyear";
		ResponseEntity<List<EmployeeDTO>> responseEntity = 
				  restTemplate.exchange(
						  resourceUrl,
						  HttpMethod.GET,
						  null,
						  new ParameterizedTypeReference<List<EmployeeDTO>>() {}
				  );
		List<EmployeeDTO> employeesInfo = responseEntity.getBody();
		return employeesInfo;
	}

	@Override
	public String addEmployee(EmployeeInfoForm employeeInfo) {
		String resourceUrl
		  = "http://localhost:8081/employeedbmanager/addemployee";
		HttpEntity<EmployeeInfoForm> request = new HttpEntity<>(employeeInfo);
		ResponseEntity<String> responseEntity = restTemplate
		  .exchange(resourceUrl, HttpMethod.POST, request, String.class);
		String status = responseEntity.getBody();
		return status;
	}

}
