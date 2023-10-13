package org.day4.day5;
import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class Day_4 {
//Task 1
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
//		driver.get("https://www.amazon.in/");
//		WebElement e = driver.findElement(By.xpath("//a[contains(text(),'Conditions of Use & Sale')]"));
//		System.out.println("Element value:" + e.getText());
	
		
//Task 2
		//print all hieraricle order
		driver.get("http://greenstech.in/selenium-course-content.html");
		driver.findElement(By.xpath("//a[@id='overview-tab']")).click();
		//driver.findElement(By.xpath("//h3[@id='heading661']")).click();
		driver.findElement(By.xpath("(//div[@class='collapse show'])[1]")).click();
		
		 WebElement textPrint = driver.findElement(By.xpath("//p[contains(text(),'expert in Selenium')]"));
		 String text = textPrint.getText();
		
		System.out.println("Paragraph:"+text);
		
	}
}
