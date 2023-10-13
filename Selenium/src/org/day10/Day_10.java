package org.day10;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_10 {
	// Screenshot
	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();

		// TypeCasting Driver to TakeScreenShot
		TakesScreenshot screenShot = (TakesScreenshot) driver;
		Thread.sleep(3000);
		File screenshotAs = screenShot.getScreenshotAs(OutputType.FILE);
		System.out.println(screenshotAs);
		File destination = new File("C:\\Users\\Luna\\Pictures\\Screenshots\\driverScreenShot.png");
		FileUtils.copyFile(screenshotAs, destination);

		//Task
		
//		driver.findElement(By.id("email")).sendKeys("megala@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("Hell@1234");
//
//		WebElement element = driver.findElement(By.xpath("//div[@class='tab loginBox']"));
//		File srcFile = element.getScreenshotAs(OutputType.FILE);
//		File destFile = new File("C:\\Users\\Luna\\Pictures\\Screenshots\\LoginOmr.png");
//
//		FileUtils.copyFile(srcFile, destFile);

	}

}
