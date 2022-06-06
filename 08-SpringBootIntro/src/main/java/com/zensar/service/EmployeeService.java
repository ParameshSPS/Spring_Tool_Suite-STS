package com.zensar.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.zensar.bean.Employee;
import com.zensar.db.EmployeeDAO;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDAO dao;

	// Read All
	public List<Employee> getAllEmployees() {
		return dao.findAll();
	}

	// Read By Id
	public Employee getEmployeeById(int id) {
		Optional<Employee> optional = dao.findById(id);
		if (optional.isPresent())
			return optional.get();
		return null;
	}

	// Insert/Add Employee
	public Employee addEmployee(Employee employee) {
		return dao.save(employee);
	}

	// Update Employee
	public Employee updateEmployee(Employee employee) {
		return dao.save(employee);
	}

	// Remove/Delete Employee
	public boolean removeEmployee(Employee employee) {
		dao.delete(employee);
		return true;
	}
}