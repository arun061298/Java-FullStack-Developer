package com.simplilearn.filehandling;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;


public class ReadWriteAppend {
	public static void main(String[] args) {
//		Create and write to a file
		PrintWriter writer;
		try {
			writer = new PrintWriter(new File("E:\\mphasis\\java simli\\Implement OOPS using JAVA with Data Structures and Beyond\\code\\text2.txt"));
			writer.println(" Welcome My World ");
			
			writer.flush();
			writer.close();
		} catch (FileNotFoundException e) {
			System.out.println("E:\\mphasis\\java simli\\Implement OOPS using JAVA with Data Structures and Beyond\\code issues : " + e.getMessage());
		}
		
		
//		File reading logic
		
		
		StringBuilder builder = new StringBuilder("");

		try {
			String data = "";
			
			BufferedReader reader = new BufferedReader(new FileReader(new File("E:\\mphasis\\java simli\\Implement OOPS using JAVA with Data Structures and Beyond\\code\\testfile2.txt")));
			
			while((data = reader.readLine())!= null) {
				builder.append(data + "\n");
			}
		} catch (FileNotFoundException e) {
			System.out.println("E:\\mphasis\\java simli\\Implement OOPS using JAVA with Data Structures and Beyond\\code issues : " + e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Data in the file :");
		
		System.out.println(builder);
		
		//rreader.close();

		
		
	}


}
