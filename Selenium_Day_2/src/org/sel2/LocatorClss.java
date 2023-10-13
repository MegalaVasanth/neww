package org.sel2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorClss {
	public static void main(String[] args) throws InterruptedException {
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			
			driver.get("https://www.facebook.com/");
			WebElement txtemail = driver.findElement(By.id("email"));
			txtemail.sendKeys("megala@gmail.com");
			
			Thread.sleep(3000);
			
			WebElement findElement = driver.findElement(By.id("pass"));
			findElement.sendKeys("megaa@1234");
			driver.close();
	}
}
