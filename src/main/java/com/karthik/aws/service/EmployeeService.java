package com.karthik.aws.service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.karthik.aws.repo.EmployeeRepository;
import com.karthik.aws.entity.Employee;

@Service

public class EmployeeService {
	@Autowired
	private EmployeeRepository repo;
	
	public Employee saveEmployee(Employee s) {
		return repo.save(s);
	}
	public List<Employee> getAllEmployee() {
		return (List<Employee>) repo.findAll();
		
	}
	public Optional<Employee> getEmployeeById(Integer id) {
		return repo.findById(id);
	}
	public Employee updateEmployee(int id, double salary) {
    	Employee existingemployee = repo.findById(id).orElse(null);
    	existingemployee.setSalary(salary);
    	return repo.save(existingemployee);

    }
	public void deleteEmployee(Integer id) {
		repo.deleteById(id);
	}
	public List<Employee> sort() {
		List<Employee> l=(List<Employee>) repo.findAll();
		Collections.sort(l,new ComparatorSort());
		return l;
	}
	public void deleteemployeeById(Integer id) {
		repo.deleteById(id);
		
	}
	public List<Employee> fetchemployeeList() {
		return (List<Employee>) repo.findAll();
	
	}
	
	
	 
	
	}
