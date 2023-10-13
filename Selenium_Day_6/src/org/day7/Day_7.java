package org.day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_7 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr");
		Actions actions = new Actions(driver);
		WebElement btnRightClick = driver.findElement(By.xpath("//button[text()='Right click to enter past date']"));
		
		actions.contextClick(btnRightClick).perform();
		
		
	}

}
