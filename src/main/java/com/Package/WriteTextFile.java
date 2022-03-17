package com.Package;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteTextFile {

	public static void main(String[] args) throws Exception {
		// write 
		
		FileWriter f1=new FileWriter("C:\\Users\\barga\\OneDrive\\Desktop\\New folder (10).txt");
		BufferedWriter f2=new BufferedWriter(f1);
		f2.write("bargan uthirapathi");
		f2.close();
		System.out.println("printed");

	}

}
