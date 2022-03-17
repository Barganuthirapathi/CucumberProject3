package com.Package;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	 

	public static void main(String[] args) {
		String hp="https://www.snapdeal.com/";
		HttpURLConnection https=null;
		int responseCode =200;
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.get(hp);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		Iterator<WebElement> iterator = links.iterator();
		
		while(iterator.hasNext()) {
			WebElement urlLink = iterator.next();
			String finalurl = urlLink.getAttribute("href");
			
			if(finalurl==null || finalurl.isEmpty()) {
				System.out.println("url is not configured:"+finalurl);
				continue;
			}   
			if (!finalurl.startsWith(hp)) {
				System.out.println("url is not belonged to this website:"+finalurl);
				continue;
			}  
		
		try {
			https=(HttpURLConnection)(new URL(finalurl).openConnection());
			https.setRequestMethod("head");
			https.connect();
			 responseCode = https.getResponseCode(); 
			 
			 if(responseCode>=400) {
				 System.out.println("Broken link:"+finalurl);
			 }else {
				 System.out.println("valid link:"+finalurl);
			 }
			
		} catch (Exception e) {
			// TODO: handle exception
		 }
		}
	}

}
