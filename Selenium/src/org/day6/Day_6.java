package org.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_6 {
	//Drag and Drop Using Actions Class
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://omrbranch.com/seleniumtraininginchennaiomr");
		Actions actions = new Actions(driver);
		
//Task 1:
		
	WebElement slnkActions = driver.findElement(By.id("credit2"));
	WebElement dlnkActions = driver.findElement(By.id("java-class"));
	actions.dragAndDrop(slnkActions, dlnkActions).perform();
	
	WebElement sClsInterface = driver.findElement(By.id("fourth"));
	WebElement dClsInterface = driver.findElement(By.xpath("//ol[@id='java-interface']"));
	actions.dragAndDrop(sClsInterface, dClsInterface).perform();
	
	WebElement sAction = driver.findElement(By.id("fifth"));
	WebElement dAction = driver.findElement(By.xpath("//ol[@id='selenium-class']"));
	actions.dragAndDrop(sAction, dAction).perform();
	
	
	WebElement slnkWebdriver = driver.findElement(By.xpath("//li[@id='credit1']"));
	WebElement dlnkWebdriver = driver.findElement(By.xpath("//ol[@id='selenium-interface']"));
	actions.dragAndDrop(slnkWebdriver, dlnkWebdriver).perform();
	
	
	}

}
