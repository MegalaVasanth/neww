package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Day_1 {
	public static void main(String[] args) throws InterruptedException {
		// QUESTION 1
//		WebDriver driver = new FirefoxDriver();
//		
//		driver.get("http://www.greenstechnologys.com/");
//		driver.get("https://www.facebook.com/");
//		driver.get("https://www.amazon.in");
//		driver.get("http://greenstech.in/selenium-course-content.html");
//
//		driver.close();

		// QUESTION 2
//		WebDriver driverchrome = new ChromeDriver();
//		
//		driverchrome.get("http://www.greenstechnologys.com/");
//		driverchrome.get("http://gmail.com/");
//		driverchrome.get("http://www.flipkart.com/");
//		driverchrome.get("http://greenstech.in/selenium-course-content.html");
//
//		driverchrome.close();
		
		// QUESTION 3
		WebDriver driverIe = new InternetExplorerDriver();
		driverIe.manage().window().maximize();
		driverIe.get("https://www.facebook.com/");
		driverIe.get("https://www.amazon.in");
	//	driverIe.get("http://demo.automationtesting.in/Register.html");
		driverIe.get("http://www.greenstechnologys.com/");
		driverIe.close();
	}

}
