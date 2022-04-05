package com.karthik.aws.Execption;


public class Employeeexists  extends Exception {
	
	private static final long serialVersionUID = 1L;
	public Employeeexists() {
		System.out.println("The id already exits in the database");
	}
	
	public Employeeexists(String s) {
		super(s);
	}

}
