package com.smoothstack.training.basics.two;

public class InterfaceTest implements TestInterfaceOne, TestInterfaceTwo{

	@Override
	public void run() {
		// TODO Auto-generated method stub
	}

	@Override
	public Integer add(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean compare(Integer a, Integer b) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void utilityMethod() {
		// TODO Auto-generated method stub
		TestInterfaceOne.super.utilityMethod();
		TestInterfaceOne.utilityStaticMethod();
	}

}
