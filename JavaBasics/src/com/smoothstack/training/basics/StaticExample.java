package com.smoothstack.training.basics;

public class StaticExample {
	
	public static int instanceCount = 0;
	
	public StaticExample(){
		instanceCount++;
	}
	
	public void printInstanceCount(){
		System.out.println("# of instances created are: " +instanceCount);
	}
}
