package com.cg.jpa.dao;

import java.util.List;

import com.cg.jpa.entity.Employee;

public interface EmployeeDao {
	public abstract Employee save(Employee employee);
	 public abstract List<Employee> loadAll();
}
