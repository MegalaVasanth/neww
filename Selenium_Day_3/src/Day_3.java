import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Day_3 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//QUESTION 1
//		driver.get("https://www.amazon.in/");
//		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
//		search.click();
//		search.sendKeys("iphone");
//
//		driver.findElement(By.id("nav-search-submit-button")).click();

//QUESTION 2
//		driver.get("https://www.facebook.com/");
//		driver.findElement(By.id("email")).sendKeys("987654323");
//		driver.findElement(By.id("pass")).sendKeys("password@1344");
//		
//		driver.findElement(By.xpath("//button[@name='login']")).click();

//QUESTION 3
//		driver.get("http://demo.automationtesting.in/Register.html");
//		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("megala");
//		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("K");
//
//		WebElement txtemail = driver.findElement(By.xpath(
//				"//input[@class='form-control ng-pristine ng-untouched ng-valid-email ng-invalid ng-invalid-required']"));
//		txtemail.sendKeys("megala@gmail.com");
//
//		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("9876543210");
//		WebElement rdoMale = driver.findElement(By.xpath("//input[@name='radiooptions'][1]"));
//		rdoMale.click();
//
//		driver.findElement(By.id("firstpassword")).sendKeys("password@1234");
//		driver.findElement(By.id("secondpassword")).sendKeys("password@1234");
//		
//		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();

//QUESTION 4 -NW (404)
		// driver.get("http://toolsqa.com/automation-practice-form/");

//QUESTION 5 
//				driver.get("http://greenstech.in/selenium-course-content.html");
//				driver.findElement(By.xpath("//div[@id='heading20']")).click();
//				Thread.sleep(3000);
//				driver.findElement(By.xpath("//a[text()='CTS Interview Question ']")).click();

//QUESTION 6
//		driver.get("https://www.redbus.in/");
//		driver.findElement(By.xpath("//span[@class='name_rb_secondary_item']//[2]")).click();
//		driver.findElement(By.xpath("//li[@id='user_sign_in_sign_up']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='mobileNoInp'][2]")).sendKeys("8765463458");
//		driver.findElement(By.xpath("//span[@id='recaptcha-anchor'][4]")).click();
//		driver.findElement(By.xpath("//div[@id='otp-container'][2]")).click();

//QUESTION 7
// driver.get("https://www.cleartrip.com/trains");
// driver.findElement(By.xpath("//input[@id='from_station']")).sendKeys("salem");
// driver.findElement(By.xpath("//input[@id='to_station']")).sendKeys("Chennai");
//
// driver.findElement(By.xpath("//button[@id='trainFormButton']")).click();

		// QUESTION 8
//		driver.get("http://greenstech.in/selenium-course-content.html");
//		driver.findElement(By.xpath("//div[@id='heading201']")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("//a[text()='Resume Model-1 ']")).click();

// QUESTION 9
//		driver.get("https://www.flipkart.com/");
//		
//		driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']")).sendKeys("megaa@gmail.com");
//		driver.findElement(By.xpath("//button[text()='Request OTP']")).click();

//QUESTION 10
//		driver.get("https://www.amazon.in/");
//		driver.findElement(By.xpath("//img[@alt='Clothing']")).click();
//		
//		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();

//QUESTION 11 -NW
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		

//QUESTION 12 - NW
		driver.get("https://www.snapdeal.com/");
		driver.findElement(By.xpath("//div[@class='accountInner']")).click();
		driver.findElement(By.xpath("//span[@class='newUserRegister']")).click();
		Thread.sleep(3000);
		WebElement txtUserName = driver.findElement(By.xpath("//input[@placeholder='Mobile Number/ Email']"));
		txtUserName.sendKeys("98654323");
		driver.findElement(By.xpath("//button[@id='checkUser']")).click();

//QUESTION 13
//		driver.get("https://www.myntra.com/register?referer=https://www.myntra.com/");
//		driver.findElement(By.xpath("//input[@class='form-control mobileNumberInput']")).sendKeys("9988776655");
//		driver.findElement(By.xpath("//div[@class='submitBottomOption']")).click();

//QUESTION 14

//		driver.get("https://www.swiggy.com/");
//		driver.findElement(By.xpath("//a[@class='r2iyh']")).click();
//		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9896690210");
//		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Meegaa");
//		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("ravaa@gmail.com");
//		driver.findElement(By.xpath("//a[@class='a-ayg']")).click();

//11,12

	}

}
