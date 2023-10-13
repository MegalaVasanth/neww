package org.day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Day_9 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/softwaretestingtraininginchennaiomr/");
		Actions actions = new Actions(driver);
		Robot robot = new Robot();

		WebElement bntDoubbleClick = driver.findElement(By.xpath("//button[text()='Double click to see future date']"));
		actions.doubleClick(bntDoubbleClick).perform();
// Handling Alert Interface
//			Alert al = driver.switchTo().alert();
//			al.dismiss();
		
//Handling Alert Using Robot Class
		Alert al = driver.switchTo().alert();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//h6[@id='display1']"));
		System.out.println(element.getText());
	}

}
