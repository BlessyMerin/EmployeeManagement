package com.organisation.EmployeeManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.organisation.EmployeeManagement.dao.EmployeeDao;
import com.organisation.EmployeeManagement.entity.Employee;

@Service
public class EmployeeServiceImple implements EmployeeService {

	@Autowired
	EmployeeDao employeedao;
	
	@Override
	@Transactional
	public List<Employee> getAllEmployee() {
		return employeedao.getAllEmployee();
	}

	@Override
	@Transactional
	public void saveEmployee(Employee theEmployee) {
		employeedao.saveEmployee(theEmployee);
		
	}

	@Override
	@Transactional
	public Employee getEmployee(int theId) {
		return employeedao.getEmployee(theId);
	}

	@Override
	@Transactional
	public void deleteEmployee(int theId) {
		employeedao.deleteEmployee(theId);
		
	}

	
	@Override
	@Transactional
	public List<Employee> findEmployee(int theId) {

		return employeedao.findEmployee(theId);
	}
}

