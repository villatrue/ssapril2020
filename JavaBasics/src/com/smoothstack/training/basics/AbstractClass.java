package com.smoothstack.training.basics;

public abstract class AbstractClass {
	
	public abstract void abstractMethod();
	
	public void nonAbstractmethod(){
		System.out.println("Hello Git - develop");
	}

	//package names: all lowercase
	//class names: MUST begin with an uppercase Char. Ex MyTestClass/Mytestclass.
	// wrong naming for class: myTestClass x
	
	//variable names and methodnames
	// MUST being with lowercase Char - Good practice to have it in cameCase.
	//Good: addTwoNumbers, printMyStuff, ssn, firstName
	//Not good: addtwonumbers, printmystuff, firstname, first_name
	//BAD: AddTwoNumbers, Printmystuff etc
	
	//POJO - Plain Old Java Objects - getters/Setters
	// firstName - getFirstName, setFirstName
}
