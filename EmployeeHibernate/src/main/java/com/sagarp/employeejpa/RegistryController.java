package com.sagarp.employeejpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistryController {
	@Autowired
	private EmployeeRegistryService service;

	@RequestMapping(value = "/jpa/employee", method = RequestMethod.GET)
	public List<EmployeeRegistry> getAllEmployees() {
		List<EmployeeRegistry> employees;
		employees = service.getAllEmployees();
		return employees;
	}

	@RequestMapping(value = "/jpa/employee/{id}", method = RequestMethod.GET)
	public EmployeeRegistry getEmployeeById(@PathVariable int id) {
		return service.getEmployeeById(id);
	}

	@RequestMapping(value = "/jpa/employee", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeeRegistry emp) {

		if (service.addEmployee(emp))
			return "added";
		else
			return "failed to add";
	}

	@RequestMapping(value = "/jpa/employee", method = RequestMethod.PUT)
	public String updateEmployee(@RequestBody EmployeeRegistry emp) {
		if (service.updateEmployee(emp))
			return "updated";
		else
			return "Could not update";
	}

	@RequestMapping(value = "/jpa/employee/{id}", method = RequestMethod.DELETE)
	public String deleteEmployee(@PathVariable long id) {
		if (service.deleteEmployee(id))
			return "deleted";
		else
			return "Could not delete";
	}
}
