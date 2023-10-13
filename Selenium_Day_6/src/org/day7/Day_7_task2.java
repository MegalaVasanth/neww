package org.day7;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_7_task2 {

	private static void inputData(Robot robot) throws AWTException {
		for (int i = KeyEvent.VK_A; i < 75; i++) {
			robot.keyPress(i);
			robot.keyRelease(i);
		}
	}
	private static void tabMethod(Robot robot) {
		// TAB
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		Robot robot = new Robot();

		// TAB
		tabMethod(robot);

		// email input calling
		inputData(robot);

		// @gmail.com

		robot.keyPress(KeyEvent.VK_SHIFT);
		robot.keyPress(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_2);
		robot.keyRelease(KeyEvent.VK_SHIFT);

		robot.keyPress(KeyEvent.VK_G);
		robot.keyRelease(KeyEvent.VK_G);

		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

		robot.keyPress(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_A);

		robot.keyPress(KeyEvent.VK_I);
		robot.keyRelease(KeyEvent.VK_I);

		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);

		robot.keyPress(KeyEvent.VK_DECIMAL);
		robot.keyRelease(KeyEvent.VK_DECIMAL);

		robot.keyPress(KeyEvent.VK_C);
		robot.keyRelease(KeyEvent.VK_C);

		robot.keyPress(KeyEvent.VK_O);
		robot.keyRelease(KeyEvent.VK_O);

		robot.keyPress(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_M);

		// TAB
		tabMethod(robot);

		// password
		inputData(robot);

		// TAB
		tabMethod(robot);

		// Enter Button
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
