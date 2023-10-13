package org.day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigatorCls {
	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.youtube.com/");
		driver.get("https://www.facebook.com/");
		Navigation navigate = driver.navigate();
		navigate.back();

		driver.get("https://www.amazon.com/");

		navigate.forward();
		navigate.refresh();
	}

}
