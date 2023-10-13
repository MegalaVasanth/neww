package org.day4.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.omrbranch.com/");
		WebElement txtMail = driver.findElement(By.id("email"));
		txtMail.sendKeys("Megala@gmail.com");
		
		WebElement txtPassword = driver.findElement(By.id("pass"));
		txtPassword.sendKeys("Hell@123");
		
		String conMail = txtMail.getAttribute("value");
		String conPassword = txtPassword.getAttribute("value");
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		
		//http://www.greenstechnologys.com/index.html
		
		System.out.println(conMail);
		System.out.println(conPassword);


	}

}
