package com.sagarp.employee;

import java.util.List;

import javax.persistence.EntityManagerFactory;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public void save(Employee emp) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tx = session.beginTransaction();
		session.save(emp);
		tx.commit();
		session.close();
		System.out.println("inside employee save dao impl");
	}

	public List<Employee> list() {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		session.beginTransaction();
		List<Employee> employees = session.createQuery("from Employee").list();
		session.close();
		return employees;
	}

	public void update(Employee emp) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tx = session.beginTransaction();
		session.update(emp);
		tx.commit();
		session.close();
		System.out.println("updated the employee in dao impl");
	}

	public void delete(int id) {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();
		Transaction tx = session.beginTransaction();
		Employee emp = new Employee(id);
		emp = (Employee) session.merge(emp);
		session.remove(emp);
		tx.commit();
		session.close();
		System.out.println("deleted the employee in dao impl");
	}

}
