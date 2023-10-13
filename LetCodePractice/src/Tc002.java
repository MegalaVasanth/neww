import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tc002 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://dev168275.service-now.com/navpage.do");
		driver.manage().window().maximize();
		Navigation navigate = driver.navigate();
		
		String title = driver.getTitle();
		if(Tc001.title1.equals(title))
		{
			WebElement lnkforget = driver.findElement(By.xpath("//a[text()='Forgot Password ?']"));
			System.out.println(lnkforget.getText());
			lnkforget.click();
		}
	}

}
