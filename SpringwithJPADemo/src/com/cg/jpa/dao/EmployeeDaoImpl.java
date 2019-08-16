package com.cg.jpa.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.jpa.entity.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@PersistenceContext
	EntityManager entityManager;

	public Employee save(Employee employee) {
		entityManager.persist(employee);
		return employee;

	}

	public List<Employee> loadAll() {
		return null;

	}
}
