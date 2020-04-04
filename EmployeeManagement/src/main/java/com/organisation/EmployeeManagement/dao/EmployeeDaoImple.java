package com.organisation.EmployeeManagement.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.organisation.EmployeeManagement.entity.Employee;

@Repository
public class EmployeeDaoImple implements EmployeeDao {

	@Autowired
	private SessionFactory factory;
	
	@Override
	public List<Employee> getAllEmployee() {
	   Session session=factory.getCurrentSession();
	   Query<Employee>query=session.createQuery("from Employee",Employee.class);
	   List<Employee>emplist=query.getResultList();
		return emplist;
	}

	@Override
	public void saveEmployee(Employee theEmployee) {
		Session session=factory.getCurrentSession();
		session.saveOrUpdate(theEmployee);
		
	}

	@Override
	public Employee getEmployee(int theId) {
		Session session=factory.getCurrentSession();
		Employee employee=session.get(Employee.class,theId);
		return employee;
	}

	@Override
	public void deleteEmployee(int theId) {
		Session session=factory.getCurrentSession();
		Query query=session.createQuery("delete from Employee where id=:theEmployeeId");
	    query.setParameter("theEmployeeId",theId);
	    query.executeUpdate();
	}
	@Override
	public List<Employee> findEmployee(int theId) {

		Session session= factory.getCurrentSession();
		Query<Employee> query= session.createQuery("from Employee where id=:theEmployeeId",Employee.class);
		query.setParameter("theEmployeeId", theId);
		List<Employee> list= query.getResultList();
		return list;
	}

	
}
