package com.smoothstack.training.basics.two;

public interface TestInterfaceTwo {
	
	public void run();
	
	public Integer add(Integer a, Integer b);
	
	public Boolean compare(Integer a, Integer b);
	
	default void utilityMethod(){
		System.out.println("Default Method in Interface One");
	}
	
	static void utilityStaticMethod(){
		System.out.println("Static Method in Interface One");
	}

}
