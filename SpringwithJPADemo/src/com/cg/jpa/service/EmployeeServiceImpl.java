package com.cg.jpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cg.jpa.dao.EmployeeDao;
import com.cg.jpa.entity.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	EmployeeDao employeeDao;
	public Employee save(Employee employee) {
		employeeDao.save(employee);
		return employee;
		
	}
	 public  List<Employee> loadAll(){
		return null;
		 
	 }
}
