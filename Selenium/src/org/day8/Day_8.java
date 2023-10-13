package org.day8;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_8 {
	// Keyboard Actions Using Actions Class
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Actions actions = new Actions(driver);
		
		WebElement txtemail = driver.findElement(By.id("email"));
		actions.keyDown(Keys.SHIFT).sendKeys(txtemail, "megala@gmailcom").keyUp(Keys.SHIFT).perform();
		
		actions.keyDown(Keys.TAB);
		actions.keyUp(Keys.TAB);
		Thread.sleep(3000);
		WebElement txtpass = driver.findElement(By.id("pass"));
		actions.keyDown(Keys.SHIFT).sendKeys(txtpass, "Hell@1243").keyUp(Keys.SHIFT).perform();
		actions.keyDown(Keys.TAB);
		actions.keyUp(Keys.TAB);
		
		//Double Click Using Action Class
		Thread.sleep(3000);
		actions.doubleClick(txtemail).perform();
		
		//login Button Click
		WebElement btnLogin = driver.findElement(By.xpath("//button[@name='login']"));
		btnLogin.click();
		
		
		

	}
	
	


}
