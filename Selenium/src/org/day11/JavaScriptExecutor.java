package org.day11;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutor {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		driver.findElement(By.id("email")).sendKeys("megaa@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Test@1213");
		WebElement btnLodin = driver.findElement(By.xpath("//button[@value='login']"));
		executor.executeScript("arguments[0].click()", btnLodin);
		Thread.sleep(3000);
		
		
		//SetAtrribute
		Navigation navigator = driver.navigate();
		navigator.refresh();
		
		WebElement txtEmail = driver.findElement(By.id("email"));
		executor.executeScript("arguments[0].setAttribute('value','asd-fghj')", txtEmail);
		Thread.sleep(5000);
		WebElement txtPassword = driver.findElement(By.id("pass"));
		//arguments[0] --> 'asd-fghj' is overwrite by 'tear@123'
		//executor.executeScript("arguments[0].setAttribute('value','tear@123')", txtEmail,txtPassword);
		
		// giving Value to Password Field
		executor.executeScript("arguments[1].setAttribute('value','tear@123')", txtEmail,txtPassword);
		
		
	}

}
