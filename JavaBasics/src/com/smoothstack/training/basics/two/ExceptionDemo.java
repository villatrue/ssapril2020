package com.smoothstack.training.basics.two;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		compareStrings(null);
	}
	
	public static void readFile(){
		Scanner scan = null;
		try {
			scan = new Scanner(new File("test.txt")); //checked execption
//			System.exit(0);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.exit(0);
			System.out.println("Sorry, something went wrong. Contact our admin");
		} finally {
			if(scan!=null){
				scan.close();
			}
		}
	}
	
	public static void readFileWithResource(){
		try(Scanner scan = new Scanner(new File("test.txt"))) {
//			System.exit(0);
			//biz logic
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
//			System.exit(0);
			System.out.println("Sorry, something went wrong. Contact our admin");
		}
	}
	
	//unchecked exceptions - caught at run time.
	public static void compareStrings(String str){
		if(str.equals("SS APRIL")){
			System.out.println("you got the magic word");
		}else{
			System.out.println(" oops ");
		}
	}
	
	
	
	public void test(String str, String strTwo){
		
		if(str!=null && str.equals(strTwo)){
			//
		}
		if(str.equals("SS APRIL")){
		
		}
		
		//#2.
		if("SS APRIL".equals(str)){
			
		}
	}
	
	
	
}
