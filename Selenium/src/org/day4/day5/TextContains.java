package org.day4.day5;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextContains {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement textElement = driver.findElement(By.xpath("//li[text()='English (UK)']"));
		System.out.println(textElement.getText());
		WebElement e = driver.findElement(By.xpath("//h2[contains(text(),'')]"));
		System.out.println("Element with Text:"+e.getText());

	}
	
}
