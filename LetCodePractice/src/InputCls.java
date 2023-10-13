import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InputCls {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		driver.manage().window().maximize();
		driver.findElement(By.id("fullName")).sendKeys("MegalaVasanth");
		driver.findElement(By.id("join")).sendKeys(" person",Keys.TAB);
		String txtInside = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(txtInside);
		driver.findElement(By.id("clearMe")).clear();
		boolean enabled = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(enabled);
		String txtReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(txtReadonly);
		
	}
	
	

}
