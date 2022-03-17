package com.snapdeal1.stepdefinition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Properties;

import org.junit.BeforeClass;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.snapdeal1.resources.Commonactions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class Hooks extends Commonactions {
	 long startTime; 
	 Commonactions common =new Commonactions();
	
	@Before
	public void BeforeClass() throws Exception {
		System.out.println("before launch");
		Properties p=new Properties();
		FileReader file=new FileReader(".//Excel//creadentials.properties");
		p.load(file);
		
		common.browser(p.getProperty("web"));
		long startTime = System.currentTimeMillis();
		 System.out.println(startTime);
		 

	}
	@After
	public void Afterclass(Scenario scenario) {
		System.out.println("before launch");
		long endTime = System.currentTimeMillis();
		System.out.println("process Time:"+(endTime-startTime));
		if(scenario.isFailed()) {
			final byte[]Screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(Screenshot, "img/png");
		}	else {
			final byte[]Screenshot =((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(Screenshot, "img/png");
			
		}
		

	}
	public static void main(String[] args) throws Exception {
		System.out.println("before scenario");
		
		//FileReader file=new FileReader(".//Excel//creadentials.properties");
	//	Properties p1=new Properties();
	//	p1.load(file);
	//	System.out.println(p1.getProperty("username1"));
		//System.out.println(p1.getProperty("password"));
		
		  FileWriter f1=new  FileWriter(".//Excel//creadentials1.properties",true);
		  Properties p1=new Properties();
		 p1.setProperty("username1", "gouri");
		  p1.store(f1, "default");
		
		 
			
		
		
		
		
		
	}
	

}
