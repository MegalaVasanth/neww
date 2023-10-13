import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tc001 {
	public static String title1="Log in | ServiceNow";

	public static String title2="Unified Navigation App | ServiceNow";
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev168275.service-now.com/navpage.do");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		Navigation navigate = driver.navigate();
		

		// Positive Case : Login
		
//		if (title.equals("Log in | ServiceNow")) {
//
//			WebElement txtemail = driver.findElement(By.id("user_name"));
//			WebElement txtpassword = driver.findElement(By.id("user_password"));
//			WebElement btnlogin = driver.findElement(By.xpath("//button[@id='sysverb_login']"));
//			if (txtemail.isEnabled() && txtpassword.isEnabled() && btnlogin.isEnabled()) {
//
//				txtemail.sendKeys("admin");
//				txtpassword.sendKeys("T-u6u6jHBu+Z");
//				btnlogin.click();
//
//			}
//
//		}
//		String loginTitle2 = driver.getTitle();
//		System.out.println(loginTitle2);
//		if(loginTitle2.equals(title2)) {
//			
//			System.out.println("Successfully Loged In....."+loginTitle2);
			
			//*************************ShadowRoot*************************************************
			//WebElement btnProfile = driver.findElement(By.xpath("//img[@class='now-avatar-img']"));
			
//			WebElement shadowHost = driver.findElement(By.cssSelector("#shadow-root"));
//			JavascriptExecutor executor = (JavascriptExecutor) driver;
//			executor.executeScript("return arguments[0].shadowRoot", shadowHost);
			
//		}
		Thread.sleep(3000);
		navigate.refresh();
		
		//Negative Case 1 : Login
				if (title.equals(title1)) {

					WebElement btnlogin = driver.findElement(By.xpath("//button[@id='sysverb_login']"));
					btnlogin.click();

				}
				Thread.sleep(3000);
				navigate.refresh();	

		//Negative Case 2 : Login
		if (title.equals(title1)) {

			WebElement txtemail = driver.findElement(By.id("user_name"));
			WebElement btnlogin = driver.findElement(By.xpath("//button[@id='sysverb_login']"));
			if(txtemail.isEnabled()&&btnlogin.isEnabled())
			{
				txtemail.sendKeys("admin");
				btnlogin.click();
			}
			

		}
		Thread.sleep(3000);
		navigate.refresh();
		
		//Negative Case 3 : Login
			if (title.equals(title1)) {

				WebElement txtemail = driver.findElement(By.id("user_name"));
				WebElement txtpassword = driver.findElement(By.id("user_password"));
				
				WebElement btnlogin = driver.findElement(By.xpath("//button[@id='sysverb_login']"));
				if(txtemail.isEnabled()&&btnlogin.isEnabled())
				{
					txtemail.sendKeys("admin");
					txtpassword.sendKeys("sfjadklfjheh");
					btnlogin.click();
				}
				

			}

	
	}

}
