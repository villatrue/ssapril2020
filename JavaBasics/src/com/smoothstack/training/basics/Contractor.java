package com.smoothstack.training.basics;

public class Contractor extends Employee{
	
	int contractorId;
	
	public Contractor(int ssn, int salary, int contractorId){
		super(ssn, salary);
		this.contractorId = contractorId;
	}
	
	public void printVariables(){
		System.out.println("ssn is now "+ssn+" and salary is now "+salary+" and contractor id is"+contractorId);
	}

}
