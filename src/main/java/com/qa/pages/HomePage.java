package com.qa.pages;

import org.openqa.selenium.WebDriver;

public class HomePage {

	public void homePage() {
		System.out.println("Inside home page");
	}
	
	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		
	}
}
