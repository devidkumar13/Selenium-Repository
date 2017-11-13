package com.icicibank.loans.personalloans;

import org.openqa.selenium.chrome.ChromeDriver;



public class ChromeLaunch {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"//Drivers//chromedriver.exe" );
	     ChromeDriver driver = new ChromeDriver();
		 driver.get("https://www.Amazon.in");
		 driver.navigate().to("https://www.amazon.in");
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().deleteAllCookies();
		 
		 driver.navigate().back();
		 
		 Thread.sleep(4000);
		 
		 driver.navigate().forward();
		 
		 Thread.sleep(4000);
		 
		 driver.navigate().refresh();
		 
		 String title = driver.getTitle();
		 System.out.println(title);
		 
		 String url = driver.getCurrentUrl();
		 System.out.println(url);
		 
		 driver.close();
		 driver.quit();
		 
	}
	

}
