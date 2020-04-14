package com.smoothstack.training.basics;

public class Employee {
	int ssn; //class level or global variables
	int salary; //instance variables 
	
	public Employee(int ssn, int salary){ //a & b are local variables
		this.ssn=ssn;
		this.salary=salary;
	}
	
	public Employee(){
		//business logic
	}
	
	public Employee(int y, int x, int z, String s){
		//business logic
	}
	
	protected void printVariables(){
		System.out.println("ssn is now "+ssn+" and salary is now "+salary);
	}

}
