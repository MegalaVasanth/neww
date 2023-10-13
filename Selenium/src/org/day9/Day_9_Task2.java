package org.day9;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.day7.Day_7_task2;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_9_Task2 {
	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/api/documentation");
		Robot robot = new Robot();

		// input UserName
		Day_7_task2.inputData(robot);
		Day_7_task2.tabMethod(robot);
		Day_7_task2.inputData(robot);
		Day_7_task2.tabMethod(robot);

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
