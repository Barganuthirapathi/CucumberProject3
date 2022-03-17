package com.snapdeal1.objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.snapdeal1.resources.Commonactions;

public class Shirtpurchasepage  extends Commonactions{
	
	public Shirtpurchasepage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="(//input[@autocomplete='off'])[2]")
    private WebElement searchfield;
	
	@FindBy(xpath="//input[@placeholder='Enter your pincode']")
	private WebElement pincode;
	
	@FindBy(xpath="//button[text()='Check']")
	private WebElement checkbox;
	
	@FindBy(xpath="//span[text()='add to cart']")
	private WebElement cart;
	
	@FindBy(xpath="//div[text()='View Cart']")
	private WebElement view;
	
	@FindBy(xpath="(//i[@class='sd-icon sd-icon-delete-sign'])[2]")
	private WebElement cross;

	public WebElement getSearchfield() {
		return searchfield;
	}

	public WebElement getPincode() {
		return pincode;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}

	public WebElement getCart() {
		return cart;
	}

	public WebElement getView() {
		return view;
	}

	public WebElement getCross() {
		return cross;
	}
	
	
}

