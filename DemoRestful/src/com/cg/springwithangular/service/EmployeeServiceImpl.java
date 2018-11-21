package com.cg.springwithangular.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.springwithangular.beans.Employee;
import com.cg.springwithangular.dao.IEmployeeDao;

@Service("empservice")
public class EmployeeServiceImpl implements IEmployeeService {
	@Autowired
	private IEmployeeDao dao;

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return dao.getAllEmployee();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.addEmployee(emp);
		
	}

	@Override
	public void deleteEmployee(int id) {
       dao.deleteEmployee(id);
	}

	@Override
	public Employee searchEmployee(int id) {
		return dao.searchEmployee(id);
	}

	@Override
	public void updateEmployee(Employee emp) {
	     dao.updateEmployee(emp);
		
	}

	
}
