package com.sagarp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping(method = RequestMethod.GET, value = "/test")
	public String test() {
		return "Oh! hello";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/employee")
	public List<Employee> getAllEmployees() {
		System.out.println("inside employee controller get");
		List<Employee> allEmployees = employeeService.getAllEmployees();
		System.out.println("size: " + allEmployees.size());
		return allEmployees;
	}

	@RequestMapping(method = RequestMethod.POST, value = "/employee")
	public String addEmployee(@RequestBody Employee employee) {
		System.out.println("inside employee controller");
		employeeService.addEmployee(employee);
		return "added";
	}

	@RequestMapping(method = RequestMethod.PUT, value = "/employee")
	public String updateEmployee(@RequestBody Employee employee) {
		System.out.println("trying to update");
		employeeService.updateEmployee(employee);
		return "updated";
	}

	@RequestMapping(method = RequestMethod.DELETE, value = "/employee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		System.out.println("trying to delete");
		employeeService.deleteEmployee(id);
		return "deleted";
	}
}
