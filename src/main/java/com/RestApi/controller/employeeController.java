package com.RestApi.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.RestApi.model.Employee;

@RestController
public class employeeController {

	@GetMapping("/employees")
	public String getEmployee() {
		return "Displaying list of employee";
	}

//	localhost:8080/employee/id
	@GetMapping("/employees/{id}")
	public String getEmployee(@PathVariable long id) {
		return "Fetching Employee details for id : " + id;
	}

	@DeleteMapping("/employees")
	public String deletEmployee(@RequestParam long id) {
		return "Deleting  Employee details for id : " + id;
	}

	@PostMapping("/employees")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return  employee;
	}
	
	@PutMapping("/employees/{id}")
	public Employee updateEmployee(@PathVariable Long id ,@RequestBody Employee employee) {
		System.out.println("Updating the employee data for  id : "+id);
		return employee;
	}


}
