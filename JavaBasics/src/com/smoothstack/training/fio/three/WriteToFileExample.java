package com.smoothstack.training.fio.three;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * This is a class which writes data into files. SS April 2020
 * @author ppradhan
 */
public class WriteToFileExample {

	/**
	 * Method to demonstrate Write File.
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter what you want to write into file.");
		Scanner scan = new Scanner(System.in);
		String data = scan.nextLine();
		writeWithOutputStream(data);
		writeWithFileWriter(data);
		writeWithFiles(data);
	}
	
	public static void writeWithOutputStream(String data){
		try(FileOutputStream fos = new FileOutputStream(new File("resources/outputfiles/outputFile.txt"))){
			fos.write(data.getBytes());
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Failed to write data to File");
		}
	}
	
	public static void writeWithFileWriter(String data){
		try(FileWriter fileWriter= new FileWriter(new File("resources/outputfiles/outputFileII.txt"))){
			fileWriter.write(data);
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Failed to write data to File");
		}
	}
	
	public static void writeWithFiles(String data){
		try{
			Files.write(Paths.get("resources/outputfiles/outputFileIII.txt"), data.getBytes());
		}catch (Exception e){
			e.printStackTrace();
			System.out.println("Failed to write data to File");
		}
	}
}
