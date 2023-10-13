package org.day3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Cls {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.click();
		search.sendKeys("iphone");
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		//day 4
		//partial text to match
		WebElement txtMakeMoney = driver.findElement(By.xpath("//div[contains(text(),'Make Money')]"));
		System.out.println(txtMakeMoney.getText());
		
		//exact Text to Match
		 WebElement txtSellOnAmazon = driver.findElement(By.xpath("//a[text()='Sell on Amazon']"));
		 System.out.println(txtSellOnAmazon.getText());
		 // get Tag Name
		 System.out.println(txtSellOnAmazon.getTagName());
	}

}
