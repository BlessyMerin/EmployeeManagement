package com.organisation.EmployeeManagement.dao;

import java.util.List;

import com.organisation.EmployeeManagement.entity.Employee;

public interface EmployeeDao {

	List<Employee> getAllEmployee();

	void saveEmployee(Employee theEmployee);

	Employee getEmployee(int theId);

	void deleteEmployee(int theId);

	List<Employee> findEmployee(int theId);



}
