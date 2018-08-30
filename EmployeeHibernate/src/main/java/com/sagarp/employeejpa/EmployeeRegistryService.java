package com.sagarp.employeejpa;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeRegistryService {

	@Autowired
	private EmployeeRegistryRepository repository;

	public List<EmployeeRegistry> getAllEmployees() {
		List<EmployeeRegistry> employees = new ArrayList<EmployeeRegistry>();
		repository.findAll().forEach(employees::add);
		return employees;
	}

	public EmployeeRegistry getEmployeeById(long id) {
		EmployeeRegistry employee;
		employee = repository.findById(id).filter(e -> e.getId() == id).get();
		return employee;
	}

	public boolean addEmployee(EmployeeRegistry emp) {
		try {
			repository.save(emp);
			return true;
		} catch (Exception e) {
			return false;
		}

	}

	public boolean updateEmployee(EmployeeRegistry emp) {
		try {
			repository.save(emp);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public boolean deleteEmployee(long id) {
		try {
			repository.deleteById(id);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

}
