package com.smoothstack.training.inheritence;

import com.smoothstack.training.basics.Contractor;
import com.smoothstack.training.basics.Employee;
import com.smoothstack.training.basics.HelloWorld;

public class TestProtected extends HelloWorld{

	public static void main(String[] args) {
//		HelloWorld helloWorld = new HelloWorld();	
//		Employee emp1 = new Employee(1, 2);
//		
//		emp1.printVariables();
//		
		Contractor contractor1 = new Contractor(123, 50, 01);
		contractor1.printVariables();
	}

}
