package com.snapdeal1.stepdefinition;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.lang.model.element.Element;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.snapdeal1.objectrepository.Shirtpurchasepage;
import com.snapdeal1.resources.Commonactions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class ShirtPurchasesteps1 extends Commonactions{
	
	Commonactions common =new Commonactions();
	Shirtpurchasepage shop =new Shirtpurchasepage();
	
	public  String cloth="Shirt";
	public String code="614625";
	@Given("user login into snapdeal website")
	public void user_login_into_snapdeal_website() {
		System.out.println("login page method");
		//common.browser("https://www.snapdeal.com/");
	}	
	

	@Given("user enter the valid credentials")
	public void user_enter_the_valid_credentials() {
		WebElement searchfields = shop.getSearchfield();
		common.sendkey(searchfields, cloth);
	}

	@When("user searches the shirt in searchfield")
	public void user_searches_the_shirt_in_searchfield() {
		//WebElement pincode = driver.findElement(By.xpath("//input[@placeholder='Enter your pincode']"));
	    WebElement pincode = shop.getPincode();
		common.sendkeys(pincode,code);
	    //WebElement checkbutton = driver.findElement(By.xpath("//button[text()='Check']"));
	   WebElement checkbox = shop.getCheckbox();
		common.clickbutton(checkbox);
	}

	@When("user click on the shirt name")
	public void user_click_on_the_shirt_name() throws Exception {
		//excel write 
		File f=new File(".//Excel//excel1.xlsx");
		FileOutputStream f1=new FileOutputStream(f);
		Workbook w=new XSSFWorkbook();
		Sheet sheet = w.createSheet("data");
	List<WebElement> shritname = driver.findElements(By.xpath("//p[contains(text(),'"+cloth+"')]"));
	for (int i=0;i<shritname.size();i++) {
		WebElement exceldata = shritname.get(i);
		String text = exceldata.getText();
		System.out.println(text);
		
		Row row = sheet.createRow(i);
		Cell cell = row.createCell(0);
		cell.setCellValue(text);
	}
	w.write(f1);
	   
	}

	@Then("user validate the shirt name")
	public void user_validate_the_shirt_name() throws Exception {
		//
		WebElement particularshirt = driver.findElement(By.xpath("(//p[contains(text(),'"+cloth+"')])[2]"));
		common.clickbutton(particularshirt);
		String texts = particularshirt.getText();
		System.out.println("compare:"+texts);
		//windows handling
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> l=new ArrayList<String>();
		boolean addAll = l.addAll(windowHandles);
		WebDriver window = driver.switchTo().window(l.get(1));
		System.out.println("handled window:"+window);
		
		//WebElement cartbutton = driver.findElement(By.xpath("//span[text()='add to cart']"));
		WebElement cart = shop.getCart();
		common.clickbutton(cart);
		
		//WebElement viewcart = driver.findElement(By.xpath("//div[text()='View Cart']"));
		WebElement view = shop.getView();
		common.clickbutton(view);
		Thread.sleep(3000);
	    //WebElement crossbutton = driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[2]"));
	    WebElement cross = shop.getCross();
		common.clickbutton(cross);
	    
	    WebElement finaltexts = driver.findElement(By.xpath("(//span[contains(text(),'"+cloth+"')])[8]"));
	    String text4 = finaltexts.getText();
	    System.out.println(text4);
	    if (texts.equals(text4)) {
	    	System.out.println("pass");
	    }else {
	    	System.out.println("fail");
	    }
	    driver.quit();
	
	}
	

	

}
