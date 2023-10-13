package org.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {
	private static WebElement findElement;

	public static void main(String[] args) throws InterruptedException {
// QUESTION 1
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.get("https://www.facebook.com/ ");
//		
//		Thread.sleep(1000);
//		driver.findElement(By.id("email")).sendKeys("megala@gmail.com");
//		driver.findElement(By.id("pass")).sendKeys("megala@1234");
//		//driver.close();

// QUESTION 2
//		driver.get("https://www.redbus.in/");
//		Thread.sleep(1000);
//		driver.findElement(By.id("src")).sendKeys("Salem");
//		driver.findElement(By.id("dest")).sendKeys("Chennai");

// QUESTION 3
//		driver.get("https://www.google.com/");
//		driver.findElement(By.id("APjFqb")).sendKeys("GreensTechnology");

// QUESTION 4
//		driver.get("https://infinity.icicibank.com/corp/Login.jsp");
//		driver.findElement(By.id("DUMMY1")).click();
//		WebElement txtUserId = driver.findElement(By.id("AuthenticationFG.USER_PRINCIPAL"));
//		txtUserId.sendKeys("asdfghjk");
//		
//		WebElement txtPassword = driver.findElement(By.xpath("//input[@id='AuthenticationFG.ACCESS_CODE']"));
//		txtPassword.sendKeys("sdfg@12345");
//		
//		driver.findElement(By.xpath("//input[@name='Action.VALIDATE_CREDENTIALS']")).click();

// QUESTION 5 
		 driver.get("https://netbanking.hdfcbank.com/");
		 
		 WebElement felement =driver.findElement(By.xpath("//frame[@name='login_page']"));
		 driver.switchTo().frame(felement);
		 WebElement txthdfcUserID = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
		 Thread.sleep(4000);
		 txthdfcUserID.sendKeys("678345678");
		 driver.findElement(By.xpath("//a[text()='CONTINUE']")).click();

// QUESTION 6
//		driver.get("https://www.swiggy.com/");
//		driver.findElement(By.id("location")).sendKeys("chennai");

// QUESTION 7
//		driver.get("https://www.snapdeal.com/login");
//		driver.findElement(By.id("userName")).sendKeys("9876543212");
		
// QUESTION 8 
		//driver.get("https://www.instagram.com/accounts/login/?hl=en) login page");
		//
		//Thread.sleep(3000);
		//WebElement txtUserName = driver.findElement(By.xpath("//input[@name='username']"));
		//
		//txtUserName.sendKeys("9876543212");
		//String attribute = txtUserName.getAttribute("value");
		//System.out.println(attribute);
		//
		//driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Hell@1234");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
			
		

// QUESTION 9

//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("megala");
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
//		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("No:2,Gandhi Salai,chennai.");
//
//		findElement = driver.findElement(By.xpath(
//				"//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
//		findElement.sendKeys("megala@gmail.com");
//
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
//		WebElement rdoMale = driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));
//		rdoMale.click();
//
//		driver.findElement(By.id("firstpassword")).sendKeys("password@1234");
//		driver.findElement(By.id("secondpassword")).sendKeys("password@1234");
//
//		driver.findElement(By.id("password")).sendKeys("west@1234");
//		

//QUESTION 10		
//		driver.get("http://adactinhotelapp.com/");
//		driver.findElement(By.id("username")).sendKeys("megala");
//		driver.findElement(By.id("password")).sendKeys("west@1234");


	}

}
