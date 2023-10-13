package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_6_Task2 {
	// Mouse Move to Using Actions Class
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		driver.get("https://www.amazon.in/");
		
		WebElement lnkSignIn = driver.findElement(By.xpath("//span[text()='Hello, sign in']"));
		actions.moveToElement(lnkSignIn).perform();
		
		WebElement lnkStarHere = driver.findElement(By.xpath("(//a[text()='Start here.'])[1]"));
		Thread.sleep(3000);
		actions.moveToElement(lnkStarHere).perform();
		lnkStarHere.click();
		
		WebElement txt = driver.findElement(By.xpath("//a[text()='Conditions of Use']"));
		
		System.out.println(txt.getText());
		
	}

}
