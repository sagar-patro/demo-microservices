package com.sagarp.employee;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao empDao; // interface

	public EmployeeDao getEmpDao() {
		return empDao;
	}

	public void setEmpDao(EmployeeDao empDao) {
		this.empDao = empDao;
	}

	public List<Employee> getAllEmployees() {
		return empDao.list();
	}

	public void addEmployee(Employee employee) {
		empDao.save(employee);
		System.out.println("inside employee service");
	}

	public void updateEmployee(Employee employee) {
		empDao.update(employee);
	}

	public void deleteEmployee(int id) {
		empDao.delete(id);
	}

}
