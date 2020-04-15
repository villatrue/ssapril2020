package com.smoothstack.training.basics.two;

public class PolyDemo extends PolyParent {
	
	public static void main(String[] args){
		PolyDemo pd = new PolyDemo();
		pd.printMe();
	}
	
	//Overloading
	public void add(String str1, String str2){
		
	}
	
	public void add(String str1, Integer int1){
		
	}
	
	public void add(Integer str1, Integer str2){
		
	}
	
//	//Overriding
//	public void printMe(){
//		System.out.println("Printing in child");
//	}

}
