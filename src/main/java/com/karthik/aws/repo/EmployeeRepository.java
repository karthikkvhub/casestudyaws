package com.karthik.aws.repo;

import org.springframework.data.repository.CrudRepository;

import com.karthik.aws.entity.Employee;
import java.util.Optional;
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}

