package com.Package;

import java.lang.StackWalker.Option;

import org.apache.poi.hpsf.Array;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProgramNavigate {
	static WebDriver driver;
	

	public  void login() {
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions option=new ChromeOptions();
	  //  option.setExperimentalOption("excludeswitches",Array.asList("") );
	    driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		

	}

}
