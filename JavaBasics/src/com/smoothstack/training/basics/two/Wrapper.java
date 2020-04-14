package com.smoothstack.training.basics.two;

public class Wrapper {

	public static void main(String[] args) {
		Integer someNumber = 10;
		int someOtherNum = 11;
		
		Character chara = 'a';
		char ch = 'b';

		//Autoboxing
		someNumber = someOtherNum;
		
		//unboxing
		someOtherNum = someNumber;
		
		
		//java.util does not work with primitives
		//DataStructures - List, Vector - objects
	}

}
