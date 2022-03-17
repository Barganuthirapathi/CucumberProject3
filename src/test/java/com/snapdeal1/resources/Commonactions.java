package com.snapdeal1.resources;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Commonactions {
	 public static WebDriver driver;
	//browser launch
	public void browser(String url) {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("start-maximized");
		options.addArguments("headless");
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
	    driver.get(url);
	}
	//sendkeys
	public void sendkey(WebElement element,String value) {
		element.sendKeys(value,Keys.ENTER);

	}
	//sendkey2
	public void sendkeys(WebElement element3,String value1) {
		element3.sendKeys(value1,Keys.ENTER);

	}
	//click
	public void clickbutton(WebElement element4) {
		element4.click();

	}


	

}
