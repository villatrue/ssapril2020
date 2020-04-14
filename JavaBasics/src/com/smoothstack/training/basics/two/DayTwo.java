package com.smoothstack.training.basics.two;

import java.util.ArrayList;
import java.util.List;

public class DayTwo {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>();
		
		myList.add(1);
		myList.add(2);
		myList.add(3);
		myList.add(4);
		
		for(int i=0; i<myList.size(); i++){
			//
		}
		
		//enhanced for loop
		for(Integer i: myList){
			
		}
		
		//java 8.
		myList.forEach(i ->{
			
		});
		
	}

}
