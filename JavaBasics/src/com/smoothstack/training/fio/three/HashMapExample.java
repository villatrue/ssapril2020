package com.smoothstack.training.fio.three;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		Map<Author, Integer> myMap = new HashMap<>();
		Author john = new Author(1, "John");
		Author david = new Author(1, "John");
		System.out.println("Class of Author: "+john.getClass());
		if(john.equals(david)){
			System.out.println("Authors are same");
		}else{
			System.out.println("Authors are different");
		}
		myMap.put(john, 123);
		myMap.put(david, 345);
		myMap.put(john, 99);
		myMap.put(david, 88);
		myMap.put(john, 0);
		
		System.out.println("Value of map object: "+myMap.get(john));
		System.out.println("Value of map object: "+myMap.get(david));
		
		System.out.println("HashCode of Author - John - "+john.hashCode());
		System.out.println("HashCode of Author - David - "+david.hashCode());
		
		System.out.println("Size of my Map: "+myMap.size());
		
//		List<String> myList = new ArrayList<>();
//		myList.add("Test");
//		String testValue = myList.get(0);
//		
//		List myListTwo = new ArrayList();
//		myListTwo.add("Test");
//		String testValueTwo = (String) myListTwo.get(0);

	}

}
