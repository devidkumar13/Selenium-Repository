package com.icicibank.loans.personalloans;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxLaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers//geckodriver.exe");
		FirefoxDriver obj = new FirefoxDriver();
		
		obj.get("https://www.Amazon.com");

	}

}
