package com.karthik.aws.service;

import java.util.Comparator;

import com.karthik.aws.entity.Employee;

public class ComparatorSort implements Comparator<Employee> {
	 
	@Override
	public int compare(Employee o1, Employee o2) {
		if(o1.getSalary()>o2.getSalary()) {
			return -1;
		}
		else if(o1.getSalary()<o2.getSalary()) {
			return +1;
		}
		else {
			return o1.getName().compareTo(o2.getName());
		}
	}
	

}

