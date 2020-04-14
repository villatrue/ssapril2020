package com.smoothstack.training.basics.two;

public class StringsDemo {

	public static void main(String[] args) {
		String name = "JohnDoe";  //name - #xbec = JohnDoe
		//
		//
		name = "JohnDoe II"; //name - #$%^&* = newValue
		//
		//
		name = "JohnDoe III";
		//
		//
		name = "JohnDoe II";
		
		StringBuffer strBuf = new StringBuffer();
		strBuf.append("John");
		
		System.out.println(strBuf.toString());
		strBuf.replace(0, strBuf.length(), "David");
		
		
		System.out.println(strBuf.toString());
	}

}
