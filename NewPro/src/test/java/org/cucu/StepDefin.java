package org.cucu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefin {
	
	WebDriver driver;
	@Given("user should be in the login page")
	public void user_should_be_in_the_login_page() {
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}

	@When("user should enter the username and password")
	public void user_should_enter_the_username_and_password() {
		driver.findElement(By.id("email")).sendKeys("Bala");
		driver.findElement(By.id("pass")).sendKeys("qwert1234");
		
	}

	@When("user should click the login button")
	public void user_should_click_the_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("user should verify the login page")
	public void user_should_verify_the_login_page() {
		System.out.println("Successfully Logged in");
	}



}
