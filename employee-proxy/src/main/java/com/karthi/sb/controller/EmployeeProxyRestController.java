package com.karthi.sb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.karthi.sb.bindings.EmployeeInfoForm;
import com.karthi.sb.dto.EmployeeDTO;
import com.karthi.sb.entity.EmployeeInfoEntity;
import com.karthi.sb.service.EmployeeProxyService;

@RestController
@RequestMapping("/employeeproxy")
public class EmployeeProxyRestController {
	
	@Autowired
	private EmployeeProxyService employeeProxyService;
	
	/* Get total number of employees against each district */
	@RequestMapping(value = "/empcountbasedondistrict", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<EmployeeDTO>> getDistrictWiseEmployeesCount() {
		List<EmployeeDTO> employeesInfo = employeeProxyService.getDistrictWiseEmployeesCount();
		if (employeesInfo != null) {
            return new ResponseEntity<>(employeesInfo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	/* Get employee with maximum salary in a given month */
	@RequestMapping(value = "/employeesalaryinfo", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<EmployeeDTO>> getMaxSalaryForAMonth(@RequestParam(value="month") String month) {
		List<EmployeeDTO> employeesInfo = employeeProxyService.getMaxSalaryForAMonth(month);
		if (employeesInfo != null) {
            return new ResponseEntity<>(employeesInfo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	/* Get list of ids of employees falling within a specific age group */
	@RequestMapping(value = "/empidwithage", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<EmployeeInfoEntity>> findByAge(@RequestParam(value="operator") String operator,
			@RequestParam(value="age1") int age1,@RequestParam(value="age2",required=false,defaultValue="0") int age2) {
		List<EmployeeInfoEntity> employeesInfo = employeeProxyService.findByAge(operator, age1, age2);
		if (employeesInfo != null) {
            return new ResponseEntity<>(employeesInfo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	/* Get total number of employees residing at a specific pincode */
	@RequestMapping(value = "/empresidinginpincode/{pincode}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<Integer> getEmployeesCountBasedOnPincode(@PathVariable("pincode") int pincode) {
		return new ResponseEntity<>(employeeProxyService.getEmployeesCountBasedOnPincode(pincode), HttpStatus.OK);
	}
	
	/* Get employee with maximum salary over a year */
	@RequestMapping(value = "/empyearlymaxsalary/{year}", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<EmployeeDTO>> getMaxSalaryForAYear(@PathVariable("year") int year) {
		List<EmployeeDTO> employeesInfo = employeeProxyService.getMaxSalaryForAYear(year);
		if (employeesInfo != null) {
            return new ResponseEntity<>(employeesInfo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	/* Get employee who has taken least number of leaves in the current year */
	@RequestMapping(value = "/leastleavestakenbyempforcurrentyear", method = RequestMethod.GET, produces="application/json")
	public ResponseEntity<List<EmployeeDTO>> getLeastLeavesTakenByEmpForCurrentYear() {
		List<EmployeeDTO> employeesInfo = employeeProxyService.getLeastLeavesTakenByEmpForCurrentYear();
		if (employeesInfo != null) {
            return new ResponseEntity<>(employeesInfo, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	/* Add an employee */
	@RequestMapping(value = "/addemployee", method = RequestMethod.POST, consumes="application/json")
	public ResponseEntity<String> addEmployeeInfo(@RequestBody EmployeeInfoForm employeeInfo){
		return new ResponseEntity<>(employeeProxyService.addEmployee(employeeInfo), HttpStatus.CREATED);
	}

}
