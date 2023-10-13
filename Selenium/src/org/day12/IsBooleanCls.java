package org.day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsBooleanCls {
	public static void main(String[] args) throws InterruptedException {
		//isEnabled--> TextBox and Button
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		driver.manage().window().maximize();

		// input[@id='inlineFormInputGroup']
		WebElement txtContactNumber = driver.findElement(By.id("inlineFormInputGroup"));
		if (txtContactNumber.isEnabled()) {
			System.out.println(txtContactNumber.getTagName());
		} else {
			System.out.println(txtContactNumber.getTagName());

		}
		
		driver.get("https://www.facebook.com/");
		WebElement findElement = driver.findElement(By.id("email"));
		if (findElement.isDisplayed()&&findElement.isEnabled()) {
			System.out.println("true");
			findElement.sendKeys("vels");
			
		} else {

		}
		
		//driver.close();
	}

}
