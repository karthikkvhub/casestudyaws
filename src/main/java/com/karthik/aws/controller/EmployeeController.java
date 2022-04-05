package com.karthik.aws.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.aws.Execption.Employeeexists;
import com.karthik.aws.entity.Employee;
import com.karthik.aws.service.ComparatorSort;
import com.karthik.aws.service.EmployeeService;

import java.util.Collections;
import java.util.List;

@RestController


public class EmployeeController {
 
    
    @Autowired 
    private EmployeeService EmployeeService;
 
    @PostMapping("/saveEmployees")
    public Employee saveemployee(@RequestBody Employee Employee)
    {
        return EmployeeService.saveEmployee(Employee);
    }
 
    
    @GetMapping("/Employees")
    public List<Employee> fetchEmployeeList()
    {
        return EmployeeService.fetchemployeeList();
    }
 
    @GetMapping("Employeessort")
    public List<Employee> fetchemployeeList1() {
    	List<Employee> Employeelist = EmployeeService.fetchemployeeList();
    	Collections.sort(Employeelist, new ComparatorSort());
    	return Employeelist;
    }
    @PutMapping("/Employees/{id}")
    public Employee
    updateemployee(@RequestBody Employee Employee,
                     @PathVariable("id") Integer Id, @PathVariable double salary)
    {
        return EmployeeService.updateEmployee(
            Id , salary);
    }
 
    
    @DeleteMapping("/Employees/{id}")
    public String deleteEmployeeById(@PathVariable("id") Integer Id)
    {
        EmployeeService.deleteemployeeById(Id);
        return "Deleted Successfully";
    }
}
