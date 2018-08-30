package com.sagarp.employee;

import java.util.List;

public interface EmployeeDao {
	public void save(Employee emp);

	public List<Employee> list();

	public void update(Employee emp);

	public void delete(int id);
}
