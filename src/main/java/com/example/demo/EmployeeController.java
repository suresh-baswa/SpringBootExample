package com.example.demo;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@RequestMapping("/getEmployee")
	public Employee getEmployee() {
		Employee employee = null;
		try {
			employee = new Employee("101", "suresh", "Hyderabad");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employee;
	}

	@RequestMapping("/getEmployees")
	public List<Employee> getEmployees() {
		Stream<Employee> employeeStream = null;
		try {
			employeeStream = Stream.of(new Employee("101", "Suresh", "Hyderabad"),
					new Employee("102", "Ramesh", "Banglore"));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return employeeStream.collect(Collectors.toList());
	}

}
