package com.karthik.aws.repo;

import org.springframework.data.repository.CrudRepository;

import com.karthik.aws.entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

